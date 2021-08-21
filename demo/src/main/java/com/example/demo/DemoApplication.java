
              package com.example.demo;
              import org.springframework.boot.SpringApplication;
              import org.springframework.boot.autoconfigure.SpringBootApplication;
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              
              @SpringBootApplication
              @RestController  //to inform the spring that the code describes an end point to be made available over the web
              public class DemoApplication {
                
                  
                  public static void main(String[] args) {
                  SpringApplication.run(DemoApplication.class, args);
                  }
                  
                  @GetMapping("/hello")  //Spring to use the Hello() method to answer requests that are sent to host
                  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) //Request param is to tell the spring to expect a name like value request
                  {
                  return String.format("Hello %s!", name);
                  }
                
              }
            