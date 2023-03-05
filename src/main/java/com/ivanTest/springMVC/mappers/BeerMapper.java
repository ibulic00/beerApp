package com.ivanTest.springMVC.mappers;


import com.ivanTest.springMVC.entities.Beer;
import com.ivanTest.springMVC.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
