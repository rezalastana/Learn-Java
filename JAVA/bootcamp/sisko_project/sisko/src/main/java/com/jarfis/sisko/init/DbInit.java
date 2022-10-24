package com.jarfis.sisko.init;

import com.jarfis.sisko.model.master.Lookup;
import com.jarfis.sisko.repository.LookupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbInit implements CommandLineRunner {
    @Autowired
    private LookupRepo lookupRepo;

    public void iniLookup(){
        this.lookupRepo.saveAll(Arrays.asList(
                new Lookup("P", "Pria","JNS_KELAMIN",1),
                new Lookup("W", "Wanita","JNS_KELAMIN",2),
                new Lookup("A", "Golongan Darah A","GOLONGAN_DARAH",1),
                new Lookup("B", "Golongan Darah B","GOLONGAN_DARAH",2),
                new Lookup("AB", "Golongan Darah AB","GOLONGAN_DARAH",3),
                new Lookup("O", "Golongan Darah O","GOLONGAN_DARAH",4),
                new Lookup("ISLAM", "Islam","AGAMA",1),
                new Lookup("KRISTEN", "Kristen","AGAMA",2),
                new Lookup("KATHOLIK", "Katholik","AGAMA",3),
                new Lookup("HINDU", "Hindu","AGAMA",4),
                new Lookup("BUDHA", "Budha","AGAMA",5),
                new Lookup("KHONGUCHU", "Khonghuchu","AGAMA",6),
                new Lookup("LAINNYA", "Lainnya","AGAMA",7)
                )
        );
    }

    @Override
    public void run(String... args) throws Exception {
        iniLookup();
    }
}
