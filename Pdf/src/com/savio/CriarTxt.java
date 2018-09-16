package com.savio;

import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.util.Scanner;

/**
 *
 * @author savio
 */
public class CriarTxt {
    
    public void criarTxt(String texto, String caminho){
        
        try {
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(caminho)); // criar arquivo e local 
            bfWriter.append(texto); // inserir texto no arquivo
            bfWriter.close(); // fechar aquivo
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
