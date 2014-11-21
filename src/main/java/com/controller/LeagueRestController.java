package com.controller;

import com.service.FootyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonas on 2014-11-14.
 */
@RestController
public class LeagueRestController {

    @Autowired
    private FootyService footyService;

    @RequestMapping("/league/injured/players")
    public String getInjuredPlayers(@RequestParam final int leagueId){
             return footyService.getLeagueInjuredPlayers(leagueId);
    }

    @RequestMapping("/league/badges")
    public String getLeagueBadge(@RequestParam final int leagueId){
         return footyService.getLeagueBadge(leagueId);
    }

    @RequestMapping("/league/blogs")
    public String getLeagueBlog(){
         return footyService.getLeagueBlogs();
    }


    @RequestMapping("/league/result")
    public String getLeagueResults(@RequestParam final int leagueId){
         return footyService.getLeagueResults(leagueId);
    }

    @RequestMapping("/league/comments")
    public String getLeagueComments(@RequestParam final int leagueId){
         return footyService.getLeagueComments(leagueId);
    }

    @RequestMapping("/league/fixtures")
    public String getLeagueFixtures(@RequestParam final int leagueId){
         return footyService.getLeagueFixtures(leagueId);
    }

    @RequestMapping("/league/idents")
    public String getLeagueIdents(){
         return footyService.getLeagueIdents();
    }

    @RequestMapping("/league/photos")
    public String getLeaguePhotos(@RequestParam final int leagueId){
         return footyService.getLeaguePhotos(leagueId);
    }

    @RequestMapping("/league/players/stats")
    public String getLeaguePlayerStats(@RequestParam final int leagueId){
         return footyService.getLeaguePlayerStats(leagueId);
    }

    @RequestMapping("/league/table")
    public String getLeagueTable(@RequestParam final int leagueId){
         return footyService.getLeagueTable(leagueId);
    }

    @RequestMapping("/league/teams")
    public String getLeagueTeams(@RequestParam final int leagueId){
         return footyService.getLeagueTeams(leagueId);
    }

    @RequestMapping("/league/news")
    public String getLeagueNews(){
         return footyService.getLeagueNews();
    }

    @RequestMapping("/league")
    public String getLeagues(){
         return footyService.getLeagues();
    }
}
