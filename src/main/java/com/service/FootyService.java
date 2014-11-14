package com.service;

import com.bean.RestTemplateBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * Created by jonas on 2014-11-14.
 */
@Service
public class FootyService {

    @Autowired
    private RestTemplateBean restTemplateBean;

    private String requestUrl= "http://api.openfooty.org/1.0/league.getResults?api_key=56766b4eba61f002fb7a09dcea173f83&league_id=1&format=json";

    public String test(){
        try {
            return restTemplateBean.getObject().exchange(requestUrl, HttpMethod.GET, null, String.class).getBody();
        } catch (Exception e) {

        }
        return "";
    }
}
