package com.workshop.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class SwimmingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Swimming is great !");
  }

}

