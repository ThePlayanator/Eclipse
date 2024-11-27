package com.workshop.annotation.basics;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.workshop.annotation.Exercise;

//@Component
@Controller
public class CyclingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Cycling is cool !");
  }


}
