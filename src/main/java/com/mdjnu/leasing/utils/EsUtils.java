package com.mdjnu.leasing.utils;

import com.mdjnu.leasing.pojo.Goods;
import com.mdjnu.leasing.pojo.House;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EsUtils {
    public Boolean createHouseEs(String id) throws Exception {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new
                        InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        XContentBuilder builder = XContentFactory.jsonBuilder().startObject().endObject();
        //3、建立文档对象
        client.prepareIndex("house", "article", "-1").setSource(builder).get();
        SearchResponse searchResponse = client.prepareSearch("house").setTypes("article")
                .setQuery(QueryBuilders.matchQuery("id", id)).get();
        SearchHits hits = searchResponse.getHits();
        Iterator<SearchHit> iterator = hits.iterator();
        if (iterator.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public void createHouseEs(House house) throws Exception {
        //1、创建es客户端连接对象
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new
                        InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //2、创建文档内容
        XContentBuilder builder = XContentFactory.jsonBuilder()
                .startObject()
                .field("id", house.getHouseId())
                .field("content", house.getHouseAddress() + "," + house.getHouseDescribe())
                .endObject();
        //3、建立文档对象
        IndexResponse indexResponse = client.prepareIndex("house", "article", house.getHouseId().toString()).setSource(builder).get();
        System.out.println(indexResponse);
        //4、释放资源
        client.close();
    }

    public List<Integer> searchHouseEs(String search) throws Exception {
        // 1、创建es客户端连接对象
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        // 2、设置搜索条件
        SearchResponse searchResponse = client.prepareSearch("house").setTypes("article")
                .setQuery(QueryBuilders.queryStringQuery(search)).get();
        // 3、遍历搜索结果数据
        SearchHits hits = searchResponse.getHits(); // 获取命中次数，查询结果有多少对象
        Iterator<SearchHit> iterator = hits.iterator();
        List<Integer> returnValues = new ArrayList<>();
        while (iterator.hasNext()) {
            SearchHit searchHit = iterator.next(); // 每个查询对象
            returnValues.add(Integer.valueOf(searchHit.getId()));
        }
        // 4、释放资源
        client.close();
        return returnValues;
    }

    public Boolean createGoodsEs(String id) throws Exception {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new
                        InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        XContentBuilder builder = XContentFactory.jsonBuilder().startObject().endObject();
        //3、建立文档对象
        client.prepareIndex("goods", "article", "-1").setSource(builder).get();
        SearchResponse searchResponse = client.prepareSearch("goods").setTypes("article")
                .setQuery(QueryBuilders.matchQuery("id", id)).get();
        SearchHits hits = searchResponse.getHits();
        Iterator<SearchHit> iterator = hits.iterator();
        if (iterator.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public void createGoodsEs(Goods goods) throws Exception {
        //1、创建es客户端连接对象
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new
                        InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        //2、创建文档内容
        XContentBuilder builder = XContentFactory.jsonBuilder()
                .startObject()
                .field("id", goods.getGoodsId())
                .field("content", goods.getGoodsDescribe())
                .endObject();
        //3、建立文档对象
        IndexResponse indexResponse = client.prepareIndex("goods", "article", goods.getGoodsId().toString()).setSource(builder).get();
        System.out.println(indexResponse);
        //4、释放资源
        client.close();
    }

    public List<Integer> searchGoodsEs(String search) throws Exception {
        // 1、创建es客户端连接对象
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        // 2、设置搜索条件
        SearchResponse searchResponse = client.prepareSearch("goods").setTypes("article")
                .setQuery(QueryBuilders.queryStringQuery(search)).get();
        // 3、遍历搜索结果数据
        SearchHits hits = searchResponse.getHits(); // 获取命中次数，查询结果有多少对象
        Iterator<SearchHit> iterator = hits.iterator();
        List<Integer> returnValues = new ArrayList<>();
        while (iterator.hasNext()) {
            SearchHit searchHit = iterator.next(); // 每个查询对象
            returnValues.add(Integer.valueOf(searchHit.getId()));
        }
        // 4、释放资源
        client.close();
        return returnValues;
    }
}
