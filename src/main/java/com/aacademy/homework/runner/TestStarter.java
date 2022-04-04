package com.aacademy.homework.runner;

import com.aacademy.homework.entity.Car;
import com.aacademy.homework.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestStarter implements CommandLineRunner {

    @Autowired
    private CarsRepository carsRepository;
    @Override
    public void run(String... args) throws Exception {
        Car myCar = new Car();
        myCar.setBrand("Audi");
        myCar.setYear(2007);
        myCar.setPrice(7.999);

        carsRepository.save(myCar);
    }
}
