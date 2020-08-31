package com.sp.exc.api;

import com.sp.exc.dto.Araba;
import com.sp.exc.exception.EntityNotFoundException;
import com.sp.exc.service.ArabaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class ArabaApi {
    @Autowired
    private ArabaService arabaService;


    @GetMapping
    public ResponseEntity<Araba> getAraba(@RequestParam String marka){
        return ResponseEntity.ok(arabaService.getAraba(marka));
    }

}
