package com.controller;

import com.service.LeagueService;
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
    private LeagueService leagueService;

    @RequestMapping("/league/injured/players")
    public String getInjuredPlayers(@RequestParam final int leagueId){
             return leagueService.getLeagueInjuredPlayers(leagueId);
    }

    @RequestMapping("/league/badges")
    public String getLeagueBadge(@RequestParam final int leagueId){
         return leagueService.getLeagueBadge(leagueId);
    }

    @RequestMapping("/league/blogs")
    public String getLeagueBlog(){
         return leagueService.getLeagueBlogs();
    }


    @RequestMapping("/league/result")
    public String getLeagueResults(@RequestParam final int leagueId){
         return leagueService.getLeagueResults(leagueId);
    }

    @RequestMapping("/league/comments")
    public String getLeagueComments(@RequestParam final int leagueId){
         return leagueService.getLeagueComments(leagueId);
    }

    @RequestMapping("/league/fixtures")
    public String getLeagueFixtures(@RequestParam final int leagueId){
         return leagueService.getLeagueFixtures(leagueId);
    }

    @RequestMapping("/league/idents")
    public String getLeagueIdents(){
         return leagueService.getLeagueIdents();
    }

    @RequestMapping("/league/photos")
    public String getLeaguePhotos(@RequestParam final int leagueId){
         return leagueService.getLeaguePhotos(leagueId);
    }

    @RequestMapping("/league/players/stats")
    public String getLeaguePlayerStats(@RequestParam final int leagueId){
         return leagueService.getLeaguePlayerStats(leagueId);
    }

    @RequestMapping("/league/table")
    public String getLeagueTable(@RequestParam final int leagueId){
         return leagueService.getLeagueTable(leagueId);
    }

    @RequestMapping("/league/teams")
    public String getLeagueTeams(@RequestParam final int leagueId){
         return leagueService.getLeagueTeams(leagueId);
    }

    @RequestMapping("/league/news")
    public String getLeagueNews(){
         return leagueService.getLeagueNews();
    }

    @RequestMapping("/league")
    public String getLeagues(){
         return leagueService.getLeagues();
    }
}
