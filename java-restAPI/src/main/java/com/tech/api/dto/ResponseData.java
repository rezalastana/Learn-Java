package com.tech.api.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> { //tipe generic
    //berguna untuk meng-encapsulati informasi yang dikirimkan dari server(controller) ke client

    //field
    private boolean status; //menampung apakah statusnya berhasil/tidak
    private List<String> message = new ArrayList<>(); //tampung pesan error dalam array of String. lalu dikirim balik ke client yang manggil
    private T payload;



    //Setter and Getter
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
