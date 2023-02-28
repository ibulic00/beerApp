package com.ivanTest.lombok.services;

import com.ivanTest.lombok.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);

    List<Beer> listBeers();

}
