package com.Saiyajin.Saiyajin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.Saiyajin.Saiyajin.model.Saiyajin;

@Repository
public class SaiyajinRepository {

    private List<Saiyajin> listaSaiyajins = new ArrayList<>();

    public SaiyajinRepository() { /* Agrege mas Saiyajins */
        listaSaiyajins.add(new Saiyajin(1, "Goku", "Bueno", "Saiyajin", 9000));
        listaSaiyajins.add(new Saiyajin(2, "Vegeta", "Bueno", "Saiyajin", 8500));
        listaSaiyajins.add(new Saiyajin(3, "Gohan", "Bueno", "Saiyajin", 3200));
        listaSaiyajins.add(new Saiyajin(4, "Trunks", "Bueno", "Saiyajin", 5000));
        listaSaiyajins.add(new Saiyajin(5, "Bardock", "Malo", "Saiyajin", 7000));
        listaSaiyajins.add(new Saiyajin(6, "Broly", "Malo", "Saiyajin Legendario", 9500));
    }

    /* Esto devuelve todos los Saiyajins */
    public List<Saiyajin> obtenerSaiyajins() {
        return listaSaiyajins;
    }
    
    /*¨Busca un Saiyajin por su ID */
    public Saiyajin buscarPorId(int id) {
        for (Saiyajin s : listaSaiyajins) {
            if (s.getId() == id) return s;
        }
        return null; /* Esto es por si no lo encuentra */
    }

    /* Guarda un nuevo Saiyajin en la lista */
    public Saiyajin guardar(Saiyajin saiyajin) {
        listaSaiyajins.add(saiyajin);
        return saiyajin;
    }

    /*¨Actualiza un Saiyajin que ya exista */
    public Saiyajin actualizar(Saiyajin saiyajin) {
        for (int i = 0; i < listaSaiyajins.size(); i++) { /* Aqui solo modifique "ListaSaiyajin.size" por "listaSaiyajins.size" */
            if (listaSaiyajins.get(i).getId() == saiyajin.getId()) {
                listaSaiyajins.set(i, saiyajin);
                return saiyajin;
            }
        }
        return null; /* Si no lo encuentra, no lo actualiza */
    }

    /* Eliminar Saiyajin por su ID */
    public void eliminar(int id) {
        listaSaiyajins.removeIf(s -> s.getId() == id);
    }
    
    /* Esto nos devuelve el total de Saiyajins en la lista */
    public int totalSaiyajins() {
        return listaSaiyajins.size();
    }
}
