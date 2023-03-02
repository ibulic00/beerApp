package com.ivanTest.lombok.controller;


import com.ivanTest.lombok.model.Beer;
import com.ivanTest.lombok.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
// REST returning Json and not HTML
@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeers(){
        log.debug("List Beers");
        return beerService.listBeers();
    }
    @RequestMapping(value = "/{beerId}", method = RequestMethod.GET)
    //@Path Variable kaze da uzme variablu beerId iz requesta

    public Beer getBeerById(@PathVariable("beerId") UUID beerId){

       log.debug("Get Beer by Id - in controller -1234");

        return beerService.getBeerById(beerId);
    }

   // @RequestMapping(method = RequestMethod.POST);
    @PostMapping
    public ResponseEntity handlePost(@RequestBody Beer beer){

        Beer savedBeer = beerService.saveNewBeer(beer);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
