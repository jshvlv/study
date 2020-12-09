package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("prototype")
public class ClassicalMusic  implements Music{


    private String[] songs = {"Mozart - To Elize", "Bah - 9 son", " Glinka - Otropsody"};
    @Override
    public String[] getSong() {
        return songs;
    }

    @PostConstruct
    public void doSome(){
        System.out.println("post construct method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }

}
