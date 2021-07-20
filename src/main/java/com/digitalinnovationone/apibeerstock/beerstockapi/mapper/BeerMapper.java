package com.digitalinnovationone.apibeerstock.beerstockapi.mapper;

import com.digitalinnovationone.apibeerstock.beerstockapi.dto.BeerDTO;
import com.digitalinnovationone.apibeerstock.beerstockapi.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
