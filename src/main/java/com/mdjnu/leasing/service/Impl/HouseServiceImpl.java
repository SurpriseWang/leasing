package com.mdjnu.leasing.service.Impl;

import com.mdjnu.leasing.mapper.HouseMapper;
import com.mdjnu.leasing.pojo.House;
import com.mdjnu.leasing.pojo.HouseExample;
import com.mdjnu.leasing.pojo.UserExample;
import com.mdjnu.leasing.service.HouseService;
import com.mdjnu.leasing.utils.EsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired(required = false)
    HouseMapper houseMapper;

    public List<House> selectHomeSpacesHouse() throws Exception {
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdIsNotNull();
        List<House> houses = houseMapper.selectByExample(houseExample);
        System.out.println(houses);
        EsUtils es = new EsUtils();
        for (House house : houses
        ) {
            if (es.createHouseEs(house.getHouseId().toString())) {
                es.createHouseEs(house);
            }
        }
        return houses;
    }

    @Override
    public List<House> searchHouse(String address, String houseAreaMin, String houseAreaMax, String use, String houseMoneyMin, String houseMoneyMax) {
        HouseExample houseExample = new HouseExample();
        if (use.equals("seel")) {
            houseExample.createCriteria().andHouseAddressEqualTo(address).andHouseSellEqualTo(1)
                    .andHouseAreaBetween(Float.valueOf(houseAreaMin), Float.valueOf(houseAreaMax))
                    .andHouseSellMoneyBetween(Float.valueOf(houseMoneyMin), Float.valueOf(houseMoneyMax));
        } else {
            houseExample.createCriteria().andHouseAddressEqualTo(address)
                    .andHouseLeaseEqualTo(1)
                    .andHouseAreaBetween(Float.valueOf(houseAreaMin), Float.valueOf(houseAreaMax))
                    .andHouseLeaseMoneyBetween(Float.valueOf(houseMoneyMin), Float.valueOf(houseMoneyMax))
            ;
        }
        System.out.println(houseMapper.selectByExample(houseExample));
        return houseMapper.selectByExample(houseExample);
    }

    @Override
    public List<House> searchESHouse(String search) throws Exception {
        EsUtils es = new EsUtils();
        List<Integer> esId = es.searchHouseEs(search);
        if (esId.size() != 0) {
            HouseExample houseExample = new HouseExample();
            houseExample.createCriteria().andHouseIdIn(esId);
            List<House> houses = houseMapper.selectByExample(houseExample);
            return houses;
        } else {
            return null;
        }
    }

    @Override
    public List<House> searchHouseBySearch(String search, String address, String houseAreaMin, String houseAreaMax, String use, String houseMoneyMin, String houseMoneyMax) throws Exception {
        EsUtils es = new EsUtils();
        List<Integer> esId = es.searchHouseEs(search);
        if (esId.size() != 0) {
            HouseExample houseExample = new HouseExample();
            if (use.equals("seel")) {
                houseExample.createCriteria().andHouseIdIn(esId).andHouseAddressEqualTo(address).andHouseSellEqualTo(1)
                        .andHouseAreaBetween(Float.valueOf(houseAreaMin), Float.valueOf(houseAreaMax))
                        .andHouseSellMoneyBetween(Float.valueOf(houseMoneyMin), Float.valueOf(houseMoneyMax));
            } else {
                houseExample.createCriteria().andHouseIdIn(esId).andHouseAddressEqualTo(address)
                        .andHouseLeaseEqualTo(1)
                        .andHouseAreaBetween(Float.valueOf(houseAreaMin), Float.valueOf(houseAreaMax))
                        .andHouseLeaseMoneyBetween(Float.valueOf(houseMoneyMin), Float.valueOf(houseMoneyMax))
                ;
            }
            List<House> houses = houseMapper.selectByExample(houseExample);
            return houses;
        } else {
            return null;
        }
    }

    @Override
    public List<House> searchHouseById(Integer houseId) {
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdEqualTo(houseId);
        return houseMapper.selectByExample(houseExample);
    }

    @Override
    public List<House> selectUserHouse(Integer userId) {
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andUserIdEqualTo(userId);
        return houseMapper.selectByExample(houseExample);
    }

    @Override
    public Boolean deleteHouseById(Integer houseId) {
        houseMapper.deleteByPrimaryKey(houseId);
        return null;
    }

    @Override
    public Boolean insertHouse(House house) {
        houseMapper.insert(house);
        return null;
    }

    @Override
    public List<House> queryAllHouse() {
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andHouseIdIsNotNull();
        return houseMapper.selectByExample(houseExample);
    }

}
