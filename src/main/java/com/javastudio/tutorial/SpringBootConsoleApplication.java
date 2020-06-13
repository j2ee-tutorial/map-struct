package com.javastudio.tutorial;

import com.javastudio.tutorial.dto.CarDto;
import com.javastudio.tutorial.mapper.CarMapper;
import com.javastudio.tutorial.to.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Car car = new Car();
        car.setName("Benz");
        CarDto carDto = CarMapper.MAPPER.fromCar(car);
        /*
        System.out.println(carDto.getName());

         */
    }
}
