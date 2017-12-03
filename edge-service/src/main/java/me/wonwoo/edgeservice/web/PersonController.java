package me.wonwoo.edgeservice.web;

import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

  private final PersonClient personClient;

  public PersonController(PersonClient personClient) {
    this.personClient = personClient;
  }

  @GetMapping("/persons")
  public List<Person> persons() {
    return personClient.persons();
  }

}
