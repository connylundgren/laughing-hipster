package com.service;

import com.bean.RestTemplateBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Identifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jonas on 2014-11-21.
 */
//TODO Cache lager
@Component
public class SpringClient {
    @Autowired
    private RestTemplateBean restTemplateBean;
    private LinkedHashMap<String, String> lolCache = new LinkedHashMap<String, String>();
    public <T> String exchange(final String requestUrl, final Class<T> clazz){
        String fromCache = getFromCache(requestUrl);
        if(fromCache != null){
            System.out.println("Returning from lolcache");
          return fromCache;
      }
         try{
            ResponseEntity<T> responseEntity = restTemplateBean.getObject().exchange(requestUrl, HttpMethod.GET, null, clazz);
            if(null == responseEntity || null == responseEntity.getBody()){
                System.out.println("Error calling url : "+requestUrl+", Http code : {} " + responseEntity != null ? (responseEntity.getStatusCode() != null ? responseEntity.getStatusCode() : null):null);
                return clazz.newInstance().toString();
            }
            lolCache.put(requestUrl, responseEntity.getBody().toString());
            return responseEntity.getBody().toString();
        }
        catch (Exception e){
            try {
                return clazz.newInstance().toString();
            } catch (Exception e1) {
            }
        }
        return null;
    }

    public <T> String getFromCache(String identifier) {
       return lolCache.get(identifier);
    }
}
