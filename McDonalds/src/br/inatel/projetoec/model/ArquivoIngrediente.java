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
public class ArquivoIngrediente implements Arquivo{
    @Override
    public void salvarArquivo(ArrayList ing, boolean salva) {
        ArrayList<Ingrediente> ingrediente = ing;
        try {
            OutputStream os = new FileOutputStream("ingredientes.txt",salva);
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter buff = new BufferedWriter(osr);

            for (Ingrediente a : ingrediente) {
                if (a instanceof Ingrediente) {
                    String info = ((Ingrediente) a).getNome() + "%" + ((Ingrediente) a).getPrecoAdicional();
                    buff.write(info);
                    buff.newLine();
                }
            }
            buff.close();
            
            /*
            ObjectOutputStream out = new ObjectOutputStream(os);
            out.writeObject(ingrediente);
            os.close();
            out.close();*/

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public ArrayList resgatarArquivo() {
        ArrayList<Ingrediente> ingrediente = new ArrayList<>();
        
        try {
            InputStream is = new FileInputStream("ingredientes.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader buff = new BufferedReader(isr);

            String linha = buff.readLine();
            while (linha != null) {
                Ingrediente i = new Ingrediente();

                String[] ing = linha.split("%");

                i.setNome(ing[0]);
                i.setPrecoAdicional(Float.parseFloat(ing[1]));

                ingrediente.add(i);
                
                linha = buff.readLine();
            }
            buff.close();
            
            /*
            ObjectInputStream input = new ObjectInputStream(is);
            ingrediente = (ArrayList<Ingrediente>) input.readObject();
            is.close();
            input.close();*/
            

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return ingrediente;
    }

    public void escreverArray(ArrayList<Ingrediente> ing) {
        for (Ingrediente a : ing) {
            System.out.println(a.getNome());
            System.out.println(a.getPrecoAdicional());
            System.out.println("===============================================");
        }
    }
    
}
