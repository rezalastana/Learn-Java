package tech;
public class ManagerApp {
    public static void main(String[] args) {

        Manager manager = new Manager("Astana");
        //manager.name = "Rizal";
        manager.sayHello("Refanda");

        VicePresident vp = new VicePresident("Asta", 19);
        //vp.name = "Santoso";
        vp.sayHello("Refanda");
    }
}
