package me.wonwoo.edgeservice.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("person-service")
public interface PersonClient {

  @GetMapping("/")
  List<Person> persons();

}
