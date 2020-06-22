package com.mike.example.springbootmongodbexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "grade")
@Data
public class Grade {

  @Id
  private Integer id;
  private String name;
  private String type;

  public Grade(Integer id, String name, String type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString() {
    return "Users{" + "id=" + id + ", name='" + name + '\'' + ", type='" + type + '\'' + '}';
  }


}
