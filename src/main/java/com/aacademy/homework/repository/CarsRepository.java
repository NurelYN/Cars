package com.aacademy.homework.repository;

import com.aacademy.homework.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Car, Long> {
}
