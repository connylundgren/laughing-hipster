package com.service;

import com.bean.RestTemplateBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by jonas on 2014-11-21.
 */
@Component
public class SpringClient {
    @Autowired
    private RestTemplateBean restTemplateBean;

    public <T> T exchange(final String requestUrl, final Class<T> clazz){
        try{
            ResponseEntity<T> responseEntity = restTemplateBean.getObject().exchange(requestUrl, HttpMethod.GET, null, clazz);
            if(null == responseEntity || null == responseEntity.getBody()){
                System.out.println("Error calling url : "+requestUrl+", Http code : {} " + responseEntity != null ? (responseEntity.getStatusCode() != null ? responseEntity.getStatusCode() : null):null);
                return clazz.newInstance();
            }
            return responseEntity.getBody();
        }
        catch (Exception e){
            try {
                return clazz.newInstance();
            } catch (Exception e1) {
            }
        }
        return null;
    }
}
