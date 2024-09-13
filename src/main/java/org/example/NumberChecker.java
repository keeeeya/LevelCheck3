package org.example;

public class NumberChecker {


  public void checkNumber(String number) {

    if (number.matches("\\d{3}-\\d{4}-\\d{4}")) {
      System.out.println(number + "　は有効な携帯電話番号です。");
    } else {
      System.out.println(number + "　は無効な携帯電話番号です。");
    }
  }
}
