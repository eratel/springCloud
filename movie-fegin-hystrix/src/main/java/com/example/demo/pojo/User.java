package com.example.demo.pojo;

import java.math.BigDecimal;

public class User
{

  public User(Long id, String username) {
    super();
    this.id = id;
    this.username = username;
  }

  public User() {
    super();
  }

  private Long id;

  private String username;

  private String name;

  private Short age;

  private BigDecimal balance;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Short getAge() {
    return this.age;
  }

  public void setAge(Short age) {
    this.age = age;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
