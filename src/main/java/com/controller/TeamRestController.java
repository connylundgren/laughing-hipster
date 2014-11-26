package com.controller;

import com.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonas on 2014-11-25.
 */
@RestController
@RequestMapping("/team")
public class TeamRestController {

    @Autowired
    TeamService service;
    
    @RequestMapping("/badge")
    public String getBadge(@RequestParam int teamId){
        return service.getBadge(teamId);
    }
    @RequestMapping("/blog")
    public String getBlogs(@RequestParam int teamId){
        return service.getBlogs(teamId);
    }
    @RequestMapping("/comments")
    public String getComments(@RequestParam int teamId){
        return service.getComments(teamId);
    }
    @RequestMapping("/fans")
    public String getFans(@RequestParam int teamId){
        return service.getFans(teamId);
    }
    @RequestMapping("/fixture")
    public String getFixtures(@RequestParam int teamId){
        return service.getFixtures(teamId);
    }
    @RequestMapping("/guardian")
    public String getGuardianEditorial(@RequestParam int teamId){
        return service.getGuardianEditorial(teamId);
    }
    @RequestMapping("/injured/players")
    public String getInjuredPlayers(@RequestParam int teamId){
        return service.getInjuredPlayers(teamId);
    }
    @RequestMapping("/news")
    public String getNews(@RequestParam int teamId){
        return service.getNews(teamId);
    }
    @RequestMapping("/photos")
    public String getPhotos(@RequestParam int teamId){
        return service.getPhotos(teamId);
    }
    @RequestMapping("/podcast")
    public String getPodcasts(@RequestParam int teamId){
        return service.getPodcasts(teamId);
    }
    @RequestMapping("/qoutes")
    public String getQuotes(@RequestParam int teamId){
        return service.getQuotes(teamId);
    }
    @RequestMapping("/results")
    public String getResults(@RequestParam int teamId){
        return service.getResults(teamId);
    }
    @RequestMapping("/squad")
    public String getSquad(@RequestParam int teamId){
        return service.getSquad(teamId);
    }
    @RequestMapping("/stats")
    public String getStats(@RequestParam int teamId){
        return service.getStats(teamId);
    }
    @RequestMapping("/wiki")
    public String getWiki(@RequestParam int teamId){
        return service.getWiki(teamId);
    }
}
