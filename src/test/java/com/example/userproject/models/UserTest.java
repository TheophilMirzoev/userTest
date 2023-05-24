package com.example.userproject.models;

import com.example.userproject.exceptions.IncorrectDataException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
  private User user = new User("fkgjfkgj", "ff@fff");
  private User user1 = new User();


  @Test
  public void checkingTheCreationOfAnObject() { //проверяет что объект не null, а значит создается
    Assertions.assertNotNull(user);
  }

  @Test
  public void checkingTheCreationOfAnObjectWhithoutParam() { //проверяет что объект ,без передачи параметров создается
    Assertions.assertNotNull(user1);
  }

  @Test
  public void checkingForIdenticalFieldValues() {
    Assertions.assertNotEquals(user.getEmail(), user.getLogin());
  }//проверяет что почта и логин не равны

  @Test
  public void shouldThrowExceptionWhenEmailIncorrect() {
    Assertions.assertThrows(IncorrectDataException.class, () -> new User("d", "f"));
  }

}