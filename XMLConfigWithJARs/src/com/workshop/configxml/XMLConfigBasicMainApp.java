package com.workshop.configxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigBasicMainApp {
  
  public static void main(String[] args) {

    // load from XML configuration file to initialize IoC container
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beansDefinition.xml");
        
    // retrieve bean from IoC container
    Exercise myExercise = context.getBean("favouriteExercise", Exercise.class);
    Exercise myNewExercise = context.getBean("newFavouriteExercise", Exercise.class);
    // call methods on the bean
    myExercise.doExercise();
    myNewExercise.doExercise();    
    // close the context
    context.close();
  
  }


}
