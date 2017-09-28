/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WesleyReis
 */
public class ArquivoVendas implements Arquivo {

    @Override
    public void salvarArquivo(ArrayList vend, boolean salva) {

        try {
            FileOutputStream os = new FileOutputStream("venda.txt");
            ObjectOutputStream out = new ObjectOutputStream(os);

            out.writeObject(vend);
            out.close();
            os.close();

            /*
            for (Venda a : vendas) {
                if (a instanceof Venda) {
                    String entregue = (a.isEntregue()) ? "Sim" : "Não";

                    String info = entregue + "%" + a.getCodigo() + "%" + a.getData() + "%" + a.getHora() + "%" + a.getTotal();
                    buff.write(info);
                    buff.newLine();

                    if (a.getEntrega() == null) {
                        String entrega = "Sem entrega";
                        buff.write(entrega);
                        buff.newLine();
                    } else {
                        Entrega ent = a.getEntrega();
                        String entrega = ent.getEndereco() + "%" + ent.getNum() + "%" + ent.getTelefone();
                        buff.write(entrega);
                        buff.newLine();
                    }

                    for (Produto prod : a.getProdutos()) {

                        if (prod instanceof Lanche) {
                            String produtos = prod.getTipo() + "%" + prod.getNome() + "%" + prod.getPreco() + "%" + ((Lanche) prod).getAdicional() + "%" + ((Lanche) prod).getObservacao();;
                            for (Ingrediente ing : ((Lanche) prod).getIngredientes()) {
                                produtos = produtos + "%" + ing.getNome() + "%" + ing.getPrecoAdicional();
                            }
                            buff.write(produtos);
                            buff.newLine();
                        } else if(prod instanceof Bebida) {
                            String produtos = prod.getTipo() + "%" + prod.getNome() + "%" + ((Bebida) prod).getTamanho();
                            
                            buff.write(produtos);
                            buff.newLine();
                        }
                        
                    }

                }
            }*/
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public ArrayList resgatarArquivo() {
        ArrayList<Venda> venda = new ArrayList<>();

        try {
            InputStream is = new FileInputStream("venda.txt");
            ObjectInputStream entrada = new ObjectInputStream(is);

            venda = (ArrayList<Venda>) entrada.readObject();

            is.close();
            entrada.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            if (ex.toString().contains("EOFException")) {
                JOptionPane.showMessageDialog(null, "Não existem pedidos a serem feitos", "Aviso!", JOptionPane.WARNING_MESSAGE);
                return null;
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArquivoVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return venda;

    }

}
