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
    private String baseUrl = "http://api.openfooty.org/1.0/";
    private String apiKeyPara = "?api_key=56766b4eba61f002fb7a09dcea173f83&format=json";

    public String getInjuredPlayersByLeague(int leagueId){
        try {
            return restTemplateBean.getObject().exchange(baseUrl + "league.getInjuredPlayers" + apiKeyPara + "&league_id=" + leagueId, HttpMethod.GET, null, String.class).getBody();
        } catch (Exception e) {

        }
        return "";
    }

    public String getLeagues() {
        try {
            return restTemplateBean.getObject().exchange(baseUrl + "league.getIdents" + apiKeyPara, HttpMethod.GET, null, String.class).getBody();
        } catch (Exception e) {
        }
        return "";
    }
}
