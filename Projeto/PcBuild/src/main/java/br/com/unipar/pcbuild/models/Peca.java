package br.com.unipar.pcbuild.models;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peca {

    private String marca;
    private Double valor;
    private String nome;
    private int id;
    private String tipoPeca;
    /*static List<Peca> lista = new ArrayList<Peca>();

    public static void addlista(Peca cliente) {
        lista.add(cliente);
    }
    public static List<Peca> getlista() {
        return lista;
    }*/
    
    
}
