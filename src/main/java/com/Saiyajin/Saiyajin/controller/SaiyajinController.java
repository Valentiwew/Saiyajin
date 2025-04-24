package com.Saiyajin.Saiyajin.controller;

/* model - service */
import com.Saiyajin.Saiyajin.model.Saiyajin;
import com.Saiyajin.Saiyajin.service.SaiyajinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Saiyajin")
public class SaiyajinController {

    @Autowired
    private SaiyajinService SaiyajinService;

    @GetMapping
    public List<Saiyajin> listaSaiyajins(){
        return SaiyajinService.getSaiyajin();
    }

    @PostMapping
    public Saiyajin agregarSaiyajin(@RequestBody Saiyajin Saiyajin) {
        return SaiyajinService.saveSaiyajin(Saiyajin);
    }
    
    @GetMapping("{id}")
    public Saiyajin actualizarSaiyajin(@PathVariable int id) {
        return SaiyajinService.getSaiyajin(id);
    }

    @PutMapping("{id}")
    public Saiyajin actualizarSaiyajin(@PathVariable int id, @RequestBody Saiyajin saiyajin) {
        // el id lo usaremos mas adelante :p
        return SaiyajinService.updateSaiyajin(Saiyajin);
    }
    
    @DeleteMapping("{id}")
    public String eliminarSaiyajin(@PathVariable int id){
        return SaiyajinService.deleteSaiyajin(id);
    }
}
