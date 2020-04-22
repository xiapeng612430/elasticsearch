package com.example.elasticsearch.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.elasticsearch.service.IndexService;
import java.io.IOException;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @date 2020/04/22
 * @time 11:02
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    RestHighLevelClient restHighLevelClient;

    @Override
    public IndexResponse index(String id, Object object) throws IOException {
        String jsonString = JSONObject.toJSONString(object);

        IndexRequest indexRequest = new IndexRequest();
        indexRequest.index("accounts");
        indexRequest.id(id);
        indexRequest.source(jsonString, XContentType.JSON);

        return restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
    }
}
