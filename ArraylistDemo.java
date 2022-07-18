package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo{


  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Swift");

    System.out.print("ArrayList: " + languages);
  }
}