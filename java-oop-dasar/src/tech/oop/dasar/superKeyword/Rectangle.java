package tech.oop.dasar.superKeyword;

public class Rectangle extends Shape {
  //METHOD yang sama pada class Shape (METHOD OVERRIDING)
  public int getCorner(){
    return 4;
  }


  //untuk menggunakan METHOD yang sama dengan parentClass digunakan kata kunci super
  public int getParentCorner(){
    return super.getCorner();//super digunakan untuk mengambil method dari parentClass -> Shape
  }
}
