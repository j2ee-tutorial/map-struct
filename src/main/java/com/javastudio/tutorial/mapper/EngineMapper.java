package com.javastudio.tutorial.mapper;

import com.javastudio.tutorial.dto.EngineDto;
import com.javastudio.tutorial.to.Engine;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EngineMapper {
    EngineMapper MAPPER = Mappers.getMapper(EngineMapper.class);

    EngineDto fromEngine(Engine engine);

    @InheritInverseConfiguration
    Engine toEngine(EngineDto engineDto);
}
