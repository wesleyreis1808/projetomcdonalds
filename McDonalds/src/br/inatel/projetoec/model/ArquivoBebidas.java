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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WesleyReis
 */
public class ArquivoBebidas implements Arquivo{
    
    @Override
    public void salvarArquivo(ArrayList ing, boolean salva) {
        ArrayList<Bebida> bebidas = ing;
        try {
            OutputStream os = new FileOutputStream("bebidas.txt",salva);
            
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter buff = new BufferedWriter(osr);
            
            for (Bebida a : bebidas) {
                if (a instanceof Bebida) {
                    String info = a.getNome() + "%" + a.getTipo() + "%" + a.getTamanho() + "%" + a.getPreco();
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
        ArrayList<Bebida> bebidas = new ArrayList<>();

        try {
            InputStream is = new FileInputStream("bebidas.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader buff = new BufferedReader(isr);

            String linha = buff.readLine();
            while (linha != null) {
                Bebida i = new Bebida();

                String[] ing = linha.split("%");

                i.setNome(ing[0]);
                i.setTipo(ing[1]);
                i.setTamanho(ing[2]);
                i.setPreco(Float.parseFloat(ing[3]));

                bebidas.add(i);
                
                linha = buff.readLine();
            }
            buff.close();
            

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return bebidas;
    }

    public void escreverArray(ArrayList<Bebida> ing) {
        for (Bebida a : ing) {
            System.out.println(a.getNome());
            System.out.println(a.getTipo());
            System.out.println(a.getTamanho());
            System.out.println(a.getPreco());
            System.out.println("===============================================");
        }
    }
    
}
