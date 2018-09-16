package com.savio;

import java.util.Scanner;

/**
 *
 * @author savio
 */
public class Test2  {
    public static void main(String[] args) {
        
        String caminhoPdf = "";
        String nomeTxt = "";
        
        LerPdf lerPdf = new LerPdf();
        CriarTxt criarTxt = new CriarTxt();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("passe o caminho do pdf e nome~> ");
        caminhoPdf = scan.nextLine();
        System.out.print("agora o caminho e nome do txt~> ");
        nomeTxt = scan.nextLine();
        
        try {
            lerPdf.getPdf(caminhoPdf);
            criarTxt.criarTxt(lerPdf.getPdf(caminhoPdf), nomeTxt);
        } catch (Exception e) {
            System.err.println(e);
        } finally{
            System.out.println("Pronto, salvo em: "+nomeTxt);
        }    
        
    }
}
