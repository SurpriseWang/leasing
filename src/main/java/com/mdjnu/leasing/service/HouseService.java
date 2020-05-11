package com.mdjnu.leasing.service;

import com.mdjnu.leasing.pojo.House;

import java.util.List;

public interface HouseService {
    List<House> selectHomeSpacesHouse() throws Exception;

    List<House> searchHouse(String address, String houseAreaMin, String houseAreaMax, String use,
                            String houseMoneyMin, String houseMoneyMax);

    List<House> searchESHouse(String search) throws Exception;

    List<House> searchHouseBySearch(String search, String address, String houseAreaMin, String houseAreaMax,
                                    String use, String houseMoneyMin, String houseMoneyMax) throws Exception;

    List<House> searchHouseById(Integer houseId);

    List<House> selectUserHouse(Integer userId);

    Boolean deleteHouseById(Integer houseId);

    Boolean insertHouse(House house);

    List<House> queryAllHouse();
}
