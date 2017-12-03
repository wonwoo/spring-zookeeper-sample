package me.wonwoo.personservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

  @GetMapping("/")
  public List<Person> persons() {
    return Arrays.asList(new Person("wonwoo", "wonwoo@test.com"),
        new Person("kevin", "kevin@test.com"));
  }
}
