package com.example.userproject.models;

import com.example.userproject.exceptions.IncorrectDataException;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
public class User {
  private String login;
  private String email;

  public User() {
    this.login = login;
    this.email= email;
  }
    public User(String login, String email) {
    if (login == null || login.isEmpty() || login.isBlank() ) {
      throw new IncorrectDataException("не верные данные");
    } else {
      this.login = login;
    }

    if ((!email.contains("@") & !email.contains(".")) || email.isEmpty() || email.isBlank() || email == null) {
      //this.email = email;
      throw new IncorrectDataException("не верные данные");
    } else if (email.equals(login)) {
      throw new IncorrectDataException("одинаковые login и email");
    } else {
      this.email = email;
    }
  }
}
