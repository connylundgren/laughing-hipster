package com.controller;

import com.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonas on 2014-11-26.
 */
@RestController
@RequestMapping("/player")
public class PlayerRestController {
    @Autowired
    PlayerService service;

    @RequestMapping("/footy/dream/stats")
    public String getDreamFootyStats(@RequestParam int playerId){
        return service.getDreamFootyStats(playerId);
    }
    @RequestMapping("/footy/profile/photo")
    public String getProfilePhoto(@RequestParam int playerId){
        return service.getProfilePhoto(playerId);
    }
    @RequestMapping("/footy/quotes")
    public String getQuotes(@RequestParam int playerId){
        return service.getQuotes(playerId);
    }
    @RequestMapping("/footy/stats")
    public String getStats(@RequestParam int playerId, @RequestParam int leagueId) {
        return service.getStats(playerId, leagueId);
    }
}
