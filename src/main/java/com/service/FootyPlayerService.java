package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonas on 2014-11-26.
 */
@Service
public class FootyPlayerService {

    @Autowired
    private SpringClient springClient;

    private String baseUrl = "http://api.openfooty.org/1.0/player.";
    private String apiKeyPara = "?api_key=56766b4eba61f002fb7a09dcea173f83&format=json";

    public String getStats(int playerId, int leagueId) {
        return springClient.exchange(baseUrl + "getStats" + apiKeyPara + "&league_id=" + leagueId + "&player_id=" + playerId, String.class);
    }

    public String getQuotes(int playerId) {
        return springClient.exchange(baseUrl + "getQuotes" + apiKeyPara + "&player_id=" + playerId, String.class);
    }

    public String getProfilePhoto(int playerId) {
        return springClient.exchange(baseUrl + "getProfilePhoto" + apiKeyPara + "&player_id=" + playerId, String.class);
    }

    public String getDreamFootyStats(int playerId) {
        return springClient.exchange(baseUrl + "getDreamFootyStats" + apiKeyPara + "&player_id=" + playerId, String.class);
    }
}
