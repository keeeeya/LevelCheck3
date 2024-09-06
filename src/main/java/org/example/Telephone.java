package org.example;

import java.util.ArrayList;
import java.util.List;

public class Telephone {

  String number;

  Telephone(String number) {
    this.number = number;
  }

  public List<Telephone> numbers;

  public Telephone() {
    this.numbers = new ArrayList<>();
  }

}
