package com.javastudio.tutorial.mapper;

import com.javastudio.tutorial.dto.CarDto;
import com.javastudio.tutorial.to.Car;
import com.javastudio.tutorial.to.Engine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CarMapperImpl.class, EngineMapperImpl.class})
class CarMapperTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarMapperTest.class);

    @Autowired
    CarMapper carMapper;

    @BeforeEach
    void setUp() {
    }

    @Test
    void whenConvertCar_thenAllPropertiesShoulbBeTheSame() {
        Car car = new Car();
        car.setName("Benz");
        car.setEngine(new Engine());
        car.getEngine().setName("EN8");
        CarDto carDto = carMapper.fromCar(car);
        assertThat(carDto.getName()).isEqualTo("Benz");
        assertThat(carDto.getEngine().getName()).isEqualTo("EN8");
    }
}