package main;

import model.MyData;

public class InvariantMain {
  
  MyData<String> stringData = new MyData<String>("Basrizal");
  //MyData<Object> objectData = stringData; //INI AKAN ERROR KARENA TIDAK DAPAT DI SUB KE CHILD OR PARENT

  MyData<Object> objectData = new MyData<Object>(1000);//NILAI INTEGER TERMASUK DALAM OBJECT
  //MyData<Integer> integerData = objectData;//INI JUGA AKAN ERROR WALAUPUN 1000 ADALAH INTEGER
}
