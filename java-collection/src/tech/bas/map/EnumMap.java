package tech.bas.map;

import java.util.Map;

public class EnumMap {
    //implementasi dari MAP dengan kenya adalah enum;
    //karena data enum sudah pasti unik, cocok untuk dijadikan key pada MAP
    //pendistribusiannya di maksimalkan untuk enum, sehingga lebih optimal dibanding hashCode();

    public static enum Level {
        FREE, STANDART, PEMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new java.util.EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Ini FREE");
        map.put(Level.STANDART, "Ini STANDART");
        map.put(Level.PEMIUM, "Ini PREMIUM");
        map.put(Level.VIP, "Ini VIP");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
