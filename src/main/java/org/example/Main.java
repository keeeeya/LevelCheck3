package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    NumberChecker numberChecker = new NumberChecker();
    Scanner scanner = new Scanner(System.in);
    System.out.println("携帯電話番号を入力してください：");
    String number = scanner.next();
    numberChecker.checkNumber(number);

  }
}