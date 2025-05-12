package com.Saiyajin.Saiyajin.service;

import com.Saiyajin.Saiyajin.model.Saiyajin;
import com.Saiyajin.Saiyajin.repository.SaiyajinRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaiyajinService {
    
    @Autowired
    private SaiyajinRepository saiyajinRepository;

    /* Nos devuelve la lista completa de Saiyajins */
    public List<Saiyajin> getSaiyajins() { /* Cambie lo de "ObtenerSaiyajin" por "getSaiyajins" */
        return saiyajinRepository.obtenerSaiyajins();
    }

    /* Guarda un nuevo Saiyajin en la lista */
    public Saiyajin saveSaiyajin(Saiyajin saiyajin) { /* Cambie lo de "guardarSaiyajin" por "saveSaiyajin" */
        return saiyajinRepository.guardar(saiyajin);
    }

    /* Busca un Saiyajin por su ID */
    public Saiyajin getSaiyajin(int id) { /* Cambie lo de "getSaiyajinId" por "getSaiyajin" */
        return saiyajinRepository.buscarPorId(id); 
    }

    /* Actualiza un Saiyajin existente usando su ID */
    public Saiyajin updateSaiyajin(int id, Saiyajin saiyajin) { /* Aqui no cambie nada, ya que estaba bien" */
        saiyajin.setId(id); /* Agrege esto de para que se asegure de que los datos se asocien al ID correcto*/
        return saiyajinRepository.actualizar(saiyajin);
    }    

    /* Actualiza solo los campos enviados del Saiyajin sin modificar los demas */
    public Saiyajin updateSaiyajinParcial(int id, Saiyajin saiyajinParcial) {
        Saiyajin actual = saiyajinRepository.buscarPorId(id);
    
        if (actual != null) {
            if (saiyajinParcial.getNombre() != null) actual.setNombre(saiyajinParcial.getNombre());
            if (saiyajinParcial.getBando() != null) actual.setBando(saiyajinParcial.getBando());
            if (saiyajinParcial.getRaza() != null) actual.setRaza(saiyajinParcial.getRaza());
            if (saiyajinParcial.getNivel() != 0) actual.setNivel(saiyajinParcial.getNivel());
    
            return saiyajinRepository.actualizar(actual);
        }
    
        return null;
    }
    
    /* Elimina un Saiyajin por su ID y devuelve un mensaje */
    public String deleteSaiyajin(int id) { /* Aqui no cambie nada, ya que estaba bien" */
        saiyajinRepository.eliminar(id);
        /* Mensaje mas especifico con el ID del Saiyajin eliminado */
        return "El Saiyajin " + id + " ha sido eliminado";
    }
}