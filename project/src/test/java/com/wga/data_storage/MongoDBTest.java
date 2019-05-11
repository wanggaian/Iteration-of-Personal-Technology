package com.wga.data_storage;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * MongoDBTest
 *
 * @Author wanggaian
 * @Date 2019/5/11 18:04
 */
public class MongoDBTest {

    private static MongoClient client;

    private static MongoDatabase database;

    private static MongoCollection<Document> collection;

    @BeforeClass
    public static void init() {
        // 客户端连接
        client = new MongoClient("192.168.214.128");
        // 目标数据库
        database = client.getDatabase("spitdb");
        // 目标集合(即表格)
        collection = database.getCollection("spit");
    }

    @Test
    public void findTest() {
        FindIterable<Document> documents = collection.find();
        for (Document document : documents) {
            System.out.println("content:" + document.getString("content"));
            System.out.println("userid:" + document.getString("userid"));
            System.out.println("visits:" + document.getInteger("visits"));
        }
    }

    @Test
    public void updateTest() {
        BasicDBObject id1 = new BasicDBObject("_id", "1");
        BasicDBObject visits = new BasicDBObject("$set", new BasicDBObject("visits", 1080));
        collection.updateOne(id1, visits);
//        Document document = collection.find(id1).first();
//        System.out.print(document.toString());
    }

    @Test
    public void insertTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("content", "今天天气不错");
        map.put("userid", "999");
        map.put("_id", "5");
        map.put("visits", 500);
        collection.insertOne(new Document(map));
    }

    @AfterClass
    public static void closeClient() {
        client.close();
    }
}
