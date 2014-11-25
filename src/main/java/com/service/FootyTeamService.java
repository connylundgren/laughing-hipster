package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jonas on 2014-11-25.
 */
@Component
public class FootyTeamService {


    @Autowired
    SpringClient client;

    private String baseUrl = "http://api.openfooty.org/1.0/team.";
    private String apiKeyPara = "?api_key=56766b4eba61f002fb7a09dcea173f83&format=json";

    public String getBadge(int teamId) {
        return client.exchange(baseUrl + "getBadge" + apiKeyPara + "&team_id=" + teamId, String.class);

    }

    public String getBlogs(int teamId) {
        return client.exchange(baseUrl + "getBlogs" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getComments(int teamId) {
        return client.exchange(baseUrl + "getComments" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getFans(int teamId) {
        return client.exchange(baseUrl + "getFans" + apiKeyPara + "&team_id=" + teamId, String.class);
    }


    public String getFixtures(int teamId) {
        return client.exchange(baseUrl + "getFixtures" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getGuardianEditorial(int teamId) {
        return client.exchange(baseUrl + "getGuardianEditorial" + apiKeyPara + "&team_id=" + teamId, String.class);

    }

    public String getInjuredPlayers(int teamId) {
        return client.exchange(baseUrl + "getInjuredPlayers" + apiKeyPara + "&team_id=" + teamId, String.class);

    }

    public String getNews(int teamId) {
        return client.exchange(baseUrl + "getNews" + apiKeyPara + "&team_id=" + teamId, String.class);

    }

    public String getPhotos(int teamId) {
        return client.exchange(baseUrl + "getPhotos" + apiKeyPara + "&team_id=" + teamId, String.class);

    }

    public String getPodcasts(int teamId) {
        return client.exchange(baseUrl + "getPodcasts" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getQuotes(int teamId) {
        return client.exchange(baseUrl + "getQuotes" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getResults(int teamId) {
        return client.exchange(baseUrl + "getResults" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getSquad(int teamId) {
        return client.exchange(baseUrl + "getSquad" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getStats(int teamId) {
        return client.exchange(baseUrl + "getStats" + apiKeyPara + "&team_id=" + teamId, String.class);
    }

    public String getWiki(int teamId) {
        return client.exchange(baseUrl + "getWiki" + apiKeyPara + "&team_id=" + teamId, String.class);
    }
}
