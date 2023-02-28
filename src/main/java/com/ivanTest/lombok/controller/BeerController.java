package com.ivanTest.lombok.controller;


import com.ivanTest.lombok.model.Beer;
import com.ivanTest.lombok.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
// REST returning Json and not HTML
@RestController
@AllArgsConstructor
@Slf4j
public class BeerController {

    private final BeerService beerService;

    @RequestMapping("/api/v1/beer")
    public List<Beer> listBeers(){
        log.debug("List Beers");
        return beerService.listBeers();
    }

    public Beer getBeerById(UUID id){

       log.debug("Get Beer by Id - in controller");

        return beerService.getBeerById(id);
    }

}
