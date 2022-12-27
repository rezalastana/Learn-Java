package tech;
class Shape {

    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }
    int getParentCorner(){
        return super.getCorner();//Mengambil nilai dari parent class
    }
}
