package com.techspring.spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<>(2);

    private Long counter = -1L;//dimulai dari angka -1

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        counter++;//buat pertambahan nilai counter

        if (objects.size() == 2){
            int index = (int) (counter % 2);//konversi nilai long ke int lalu di mod 2 untuk selalu mengembalikan nilai 1 dan 2 saja
            return objects.get(index);//sehingga counter ke 3 4 5 dst, akan kembali ke 1 2 1 2 1 2 1 2
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String s) {
        if (!objects.isEmpty()){ //jika objects tidak empty
            return objects.remove(0);
        }
        return null; //jika kosong kembalikan ke null
    }

    //lanjutkan pada scopeConfiguration, dibawahnya tidak perlu

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
