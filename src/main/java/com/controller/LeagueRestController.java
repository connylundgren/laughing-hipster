package com.controller;

import com.service.FootyLeagueService;
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
    private FootyLeagueService footyLeagueService;

    @RequestMapping("/league/injured/players")
    public String getInjuredPlayers(@RequestParam final int leagueId){
             return footyLeagueService.getLeagueInjuredPlayers(leagueId);
    }

    @RequestMapping("/league/badges")
    public String getLeagueBadge(@RequestParam final int leagueId){
         return footyLeagueService.getLeagueBadge(leagueId);
    }

    @RequestMapping("/league/blogs")
    public String getLeagueBlog(){
         return footyLeagueService.getLeagueBlogs();
    }


    @RequestMapping("/league/result")
    public String getLeagueResults(@RequestParam final int leagueId){
         return footyLeagueService.getLeagueResults(leagueId);
    }

    @RequestMapping("/league/comments")
    public String getLeagueComments(@RequestParam final int leagueId){
         return footyLeagueService.getLeagueComments(leagueId);
    }

    @RequestMapping("/league/fixtures")
    public String getLeagueFixtures(@RequestParam final int leagueId){
         return footyLeagueService.getLeagueFixtures(leagueId);
    }

    @RequestMapping("/league/idents")
    public String getLeagueIdents(){
         return footyLeagueService.getLeagueIdents();
    }

    @RequestMapping("/league/photos")
    public String getLeaguePhotos(@RequestParam final int leagueId){
         return footyLeagueService.getLeaguePhotos(leagueId);
    }

    @RequestMapping("/league/players/stats")
    public String getLeaguePlayerStats(@RequestParam final int leagueId){
         return footyLeagueService.getLeaguePlayerStats(leagueId);
    }

    @RequestMapping("/league/table")
    public String getLeagueTable(@RequestParam final int leagueId){
         return footyLeagueService.getLeagueTable(leagueId);
    }

    @RequestMapping("/league/teams")
    public String getLeagueTeams(@RequestParam final int leagueId){
         return footyLeagueService.getLeagueTeams(leagueId);
    }

    @RequestMapping("/league/news")
    public String getLeagueNews(){
         return footyLeagueService.getLeagueNews();
    }

    @RequestMapping("/league")
    public String getLeagues(){
         return footyLeagueService.getLeagues();
    }
}
