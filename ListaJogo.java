/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import javax.swing.ImageIcon;

/**
 *
 * @author Endryo
 * Lista ImageIcon usada no projeto do jogo da memoria. Todos os métodos para para consultar, adicionar e excluir estão aqui.
 */
public class ListaJogo {
    private ImageIcon[] valores; //vetor de inteiros com os valores da lista

    public ListaJogo(int tam) {
        if (tam > 0) {
            this.valores = new ImageIcon[tam];
        }
    }
    public void consultaElemento() {
        for (int i = 0; i < this.valores.length; i++) {
            System.out.println("O valor da posição [" + i + "] é: " + this.valores[i]);
        }
        System.out.println();
    }
    
    public boolean consultaElemento(ImageIcon valor) {
        for (int i = 0; i < this.valores.length; i++) {
            return true;
        }
        return false;
    }
    
    public ImageIcon getValores(int pos){
        return this.valores[pos];
    }
    
    public void limpar(){
        for (int i = 0; i < this.valores.length; i++) {
                this.valores[i] = null;
        }
    }
    
    public void insereValor(ImageIcon valor) {
        for (int i = 0; i < this.valores.length; i++) {
            if (this.valores[i] == null) {
                this.valores[i] = valor;
                break;
            }
        }
    }
    
//    public int retornaPos(){
//        for (int i = 0; i < this.valores.length; i++) {
//            if (this.valores[i] == null) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
