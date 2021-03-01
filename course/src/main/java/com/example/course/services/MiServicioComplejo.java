package com.example.course.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
public class MiServicioComplejo implements IService{
    @Override
    public String operacion(){
        return "QWERTY";
    }
}
