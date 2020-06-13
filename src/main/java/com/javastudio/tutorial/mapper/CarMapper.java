package com.javastudio.tutorial.mapper;

import com.javastudio.tutorial.dto.CarDto;
import com.javastudio.tutorial.to.Car;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {EngineMapper.class})
public interface CarMapper {
    CarMapper MAPPER = Mappers.getMapper(CarMapper.class);

    CarDto fromCar(Car car);

    @InheritInverseConfiguration
    Car toCar(CarDto carDto);
}
