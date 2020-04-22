package com.example.elasticsearch.service;

import java.io.IOException;
import org.elasticsearch.action.index.IndexResponse;

/**
 * @date 2020/04/22
 * @time 11:01
 */
public interface IndexService {

    IndexResponse index(String index, String type, String id, Object object) throws IOException;
}
