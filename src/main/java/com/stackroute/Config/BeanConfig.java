package com.stackroute.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name="actor")
    public Actor getActorBean(){
        Actor actor=new Actor("Ntr","male",34);
        return actor;
    }
    @Bean(name="actorOne")
    public Actor getActorBeanOne(){
        Actor actor=new Actor("Sharuk","male",54);
        return actor;
    }
    @Bean(name="actorTwo")
    public Actor getActorBeanTwo(){
        Actor actor=new Actor("Vijay","male",47);
        return actor;
    }

    @Bean(name="movie")
    public Movie getMovieBean(){
        return new Movie(getActorBean());
    }
    @Bean(name="movieOne")
    public Movie getMovieBeanOne(){
        return new Movie(getActorBeanOne());
    }
    @Bean(name="movieTwo")
    public Movie getMovieBeanTwo(){
        return new Movie(getActorBeanTwo());
    }

}
