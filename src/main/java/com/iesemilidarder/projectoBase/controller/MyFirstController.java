package com.iesemilidarder.projectoBase.controller;

import com.iesemilidarder.projectoBase.data.Car;
import com.iesemilidarder.projectoBase.data.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    @RequestMapping ("/car")
    public Vehicle greeting(@RequestParam(value="name", defaultValue="BrumBrum") String name)
    {
        Car car = new Car();
        car.setName(name) ;
        return car;}
}
