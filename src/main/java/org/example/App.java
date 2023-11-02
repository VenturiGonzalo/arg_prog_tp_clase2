package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        TransformaTexto transformaTexto = texto -> texto.toUpperCase();
        List<String> listaLower = new ArrayList<>(Arrays.asList("mesa", "silla", "tele", "compu"));

        System.out.println(convierteLista(listaLower,transformaTexto));
    }

    private static List<String> convierteLista(List<String> lista, TransformaTexto transformaTexto){
        List<String> newList = new ArrayList<String>();
        for(String i : lista){
            newList.add(transformaTexto.transformador(i));
        }
        return newList;
    }
}
