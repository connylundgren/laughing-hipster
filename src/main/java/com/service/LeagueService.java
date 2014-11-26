package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonas on 2014-11-14.
 */
@Service
public class LeagueService {


    @Autowired
    private SpringService springService;

    private String baseUrl = "http://api.openfooty.org/1.0/league.";
    private String apiKeyPara = "?api_key=56766b4eba61f002fb7a09dcea173f83&format=json";

    public String getLeagueInjuredPlayers(int leagueId){
        return springService.exchange(baseUrl + "getInjuredPlayers" + apiKeyPara + "&league_id=" + leagueId, String.class);
    }

    public String getLeagues() {
        return springService.exchange(baseUrl + "getIdents" + apiKeyPara, String.class);
    }

    public String getLeagueBadge(int leagueId) {
        return springService.exchange(baseUrl + "getBadge" + apiKeyPara  + "&league_id=" + leagueId, String.class);
    }

    public String getLeagueBlogs() {
        return springService.exchange(baseUrl + "getBlogs" + apiKeyPara, String.class);
    }


    public String getLeagueComments(int leagueId) {
        return springService.exchange(baseUrl + "getComments" + apiKeyPara + "&league_id=" + leagueId, String.class);
    }

    public String getLeagueFixtures(int leagueId) {
        return springService.exchange(baseUrl + "getFixtures" + apiKeyPara + "&league_id=" + leagueId, String.class);
    }

    public String getLeagueIdents() {
        return springService.exchange(baseUrl + "getIdents" + apiKeyPara, String.class);
    }


    public String getLeagueNews() {
        return springService.exchange(baseUrl + "getIdents" + apiKeyPara, String.class);
    }

    public String getLeaguePhotos(int leagueId) {
        return springService.exchange(baseUrl + "getPhotos" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeaguePlayerStats(int leagueId) {
        return springService.exchange(baseUrl + "getPlayerStats" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeagueResults(int leagueId) {
        return springService.exchange(baseUrl + "getResults" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeagueTable(int leagueId) {
        return springService.exchange(baseUrl + "getTable" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }

    public String getLeagueTeams(int leagueId) {
        return springService.exchange(baseUrl + "getTeams" + apiKeyPara +"&league_id=" + leagueId, String.class);
    }




}
