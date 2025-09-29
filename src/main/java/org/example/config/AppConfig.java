package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


@Configuration  // source of definition for the spring beans
@ComponentScan("org.example")

public class AppConfig {
    /*
    @Bean
    // tells spring this method will create bean which you have to manage

     */
    // @Bean(name = {"beast","des","desktop"})

    /*
    @Bean
    //@Scope("prototype")
    public Desktop desktop(){

        return new Desktop();
    }
    @Bean
    public Alien alien(Computer com){     //  @Qualifier("desktop")  @Autowired Computer com
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }

     */

    // Stereotype annotations


}
