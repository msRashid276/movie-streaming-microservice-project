package com.microservice.movie_catalog_service.controller;

import com.microservice.movie_catalog_service.model.MovieInfo;
import com.microservice.movie_catalog_service.movieRepo.MovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieInfoController {

    @Autowired
    private MovieInfoRepository movieInfoRepository;

    @PostMapping("/movie-info/save")
    public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList){
        return movieInfoRepository.saveAll(movieInfoList);
    }

    @GetMapping("/movie-info/listMovie")
    public List<MovieInfo> getAllMovie(){
        return movieInfoRepository.findAll();
    }
}
