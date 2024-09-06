package org.example;

public class NumberChecker {

  Telephone telephone = new Telephone();

  public void checkNumber(String number) {
    telephone.numbers.add(new Telephone(number));
    if (number.matches("\\d{3}-\\d{4}-\\d{4}")) {
      System.out.println(number + "　は有効な携帯電話番号です。");
    } else {
      System.out.println(number + "　は無効な携帯電話番号です。");
    }
  }
}
