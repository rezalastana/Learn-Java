package main;

import model.MyData;

public class CovariantMain {
  //berbeda dengan invariant, covariant dapat men-subtitusi ke child dari parent nya
  public static void main(String[] args) {
    MyData<String> stringMyData = new MyData<String>("Basrizal")
    proses(stringMyData);
  }

  //kuncinya ada di ?extends Objet untuk covariant
  public static void proses(MyData<? extends Object> myData){
    System.out.println(myData.getData()); //ini boleh

    //namun untuk set tidak bisa karena akan merubah pada model nya
    // myData.setData(myData); //EROR
  }
}
