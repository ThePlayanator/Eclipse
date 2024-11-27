package com.workshop.second;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.workshop.annotation.Exercise;

//@Component
@Repository
public class JoggingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Jogging is fun !");
  }

}



