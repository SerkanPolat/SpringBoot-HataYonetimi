package com.sp.exc.service;

import com.sp.exc.dto.Araba;
import com.sp.exc.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArabaService {

    List<Araba> arabaList = new ArrayList<Araba>();

    @PostConstruct
    public void init(){

        arabaList.add(new Araba("Mavi","Mclaren",123454));
        arabaList.add(new Araba("Kirmizi","Ferrari",84965));
        arabaList.add(new Araba("Turuncu","Ford",894532));


    }

    public Araba getAraba(String marka) {

        return arabaList.stream().filter(item->item.getMarka().equals(marka)).findFirst()
                .orElseThrow(()-> new EntityNotFoundException(marka));
    }
}
