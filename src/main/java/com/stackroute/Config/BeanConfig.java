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
        return new Movie(getActorBean1());
    }
    @Bean(name="movieOne")
    public Movie getMovieBeanOne(){
        return new Movie(getActorBean2());
    }
    @Bean(name="movieTwo")
    public Movie getMovieBeanTwo(){
        return new Movie(getActorBeanTwo());
    }

    @Bean(name="actor1")
    public Actor getActorBean1() {
        Actor actor = new Actor();
        actor.setName("Arjun");
        actor.setGender("male");
        actor.setAge(36);
        return actor;
    }
    @Bean(name="actor2")
    public Actor getActorBean2() {
        Actor actor = new Actor();
        actor.setName("Vijay devarakonda");
        actor.setGender("male");
        actor.setAge(31);
        return actor;
    }

}
