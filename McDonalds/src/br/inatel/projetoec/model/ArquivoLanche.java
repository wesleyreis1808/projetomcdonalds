/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author WesleyReis
 */
public class ArquivoLanche implements Arquivo {
    
    @Override
    public void salvarArquivo(ArrayList lan, boolean salva) {
        ArrayList<Lanche> lanches = lan;
        
        try {
            OutputStream os = new FileOutputStream("lanche.txt",salva);
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter buff = new BufferedWriter(osr);

            for (Lanche a : lanches) {
                if (a instanceof Lanche) {
                    String info = ((Lanche) a).getNome() + "%" + ((Lanche) a).getTipo() + "%" + ((Lanche) a).getPreco() + "%" + ((Lanche) a).getObservacao();
                    for(Ingrediente ing:a.getIngredientes()){
                        info = info + "%" +ing.getNome() + "%" + ing.getPrecoAdicional();
                    }
                    buff.write(info);
                    buff.newLine();
                }
            }
            buff.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public ArrayList resgatarArquivo() {
        ArrayList<Lanche> lanches = new ArrayList<>();

        try {
            InputStream is = new FileInputStream("lanche.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader buff = new BufferedReader(isr);

            String linha = buff.readLine();
            while (linha != null) {                         // Precisa refazer esse método
                Lanche lanche = new Lanche();
                
                String[] lan = linha.split("%");

                lanche.setNome(lan[0]);
                lanche.setTipo(lan[1]);
                lanche.setPreco(Float.parseFloat(lan[2]));
                lanche.setObservacao(lan[3]);
                
                ArrayList<Ingrediente> ing = new ArrayList<>();
                for (int i = 4; i < lan.length; i+=2) {
                    Ingrediente i1 = new Ingrediente();
                    
                    i1.setNome(lan[i]);
                    i1.setPrecoAdicional(Float.parseFloat(lan[i+1]));
                    
                    ing.add(i1);
                }
                lanche.setIngredientes(ing);
                lanches.add(lanche);
                linha = buff.readLine();
            }
            buff.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return lanches;

    }
    public void escreverArray(ArrayList<Lanche> lan) {
        for (Lanche a : lan) {
            System.out.println(a.getNome());
            System.out.println(a.getPreco());
            System.out.println(a.getTipo());
            System.out.println(a.getObservacao());
            for(Ingrediente ing : a.getIngredientes()){
                System.out.println("\t" + ing.getNome());
                System.out.println("\t" + ing.getPrecoAdicional());
            }
            System.out.println("===============================================");
        }
    }
    
}
