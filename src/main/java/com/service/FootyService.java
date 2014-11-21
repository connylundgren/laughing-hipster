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
    private SpringClient springClient;

    private String baseUrl = "http://api.openfooty.org/1.0/";
    private String apiKeyPara = "?api_key=56766b4eba61f002fb7a09dcea173f83&format=json";

    public String getLeagueInjuredPlayers(int leagueId){
        return springClient.exchange(baseUrl + "league.getInjuredPlayers" + apiKeyPara + "&league_id=" + leagueId, String.class);
    }

    public String getLeagues() {
        return springClient.exchange(baseUrl + "league.getIdents" + apiKeyPara, String.class);
    }

    public String getLeagueBadge(int leagueId) {
        return springClient.exchange(baseUrl + "league.getBadge" + apiKeyPara  + "&league_id=" + leagueId, String.class);
    }

    public String getLeagueBlogs() {
        return springClient.exchange(baseUrl + "league.getBlogs" + apiKeyPara, String.class);
    }


    public String getLeagueComments(int leagueId) {
        return springClient.exchange(baseUrl + "league.getComments" + apiKeyPara + "&league_id=" + leagueId, String.class);
    }

    public String getLeagueFixtures(int leagueId) {
        return springClient.exchange(baseUrl + "league.getFixtures" + apiKeyPara + "&league_id=" + leagueId, String.class);
    }

    public String getLeagueIdents() {
        return springClient.exchange(baseUrl + "league.getIdents" + apiKeyPara, String.class);
    }


    public String getLeagueNews() {
        return springClient.exchange(baseUrl + "league.getIdents" + apiKeyPara, String.class);
    }

    public String getLeaguePhotos(int leagueId) {
        return springClient.exchange(baseUrl + "league.getPhotos" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeaguePlayerStats(int leagueId) {
        return springClient.exchange(baseUrl + "league.getPlayerStats" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeagueResults(int leagueId) {
        return springClient.exchange(baseUrl + "league.getResults" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeagueTable(int leagueId) {
        return springClient.exchange(baseUrl + "league.getTable" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeagueTeams(int leagueId) {
        return springClient.exchange(baseUrl + "league.getTeams" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }




}
