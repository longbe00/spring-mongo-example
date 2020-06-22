package com.mike.example.springbootmongodbexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "user")
@Data
public class User {

  @Id
  private Integer id;
  private String name;
  private String teamName;
  private Long salary;
  private Integer gradeId;

  public User(Integer id, String name, String teamName, Long salary, Integer gradeId) {
    this.id = id;
    this.name = name;
    this.teamName = teamName;
    this.salary = salary;
    this.gradeId = gradeId;
  }

  @Override
  public String toString() {
    return "Users{" + "id=" + id + ", name='" + name + '\'' + ", teamName='" + teamName + '\''
        + ", salary=" + salary + '}';
  }
}
