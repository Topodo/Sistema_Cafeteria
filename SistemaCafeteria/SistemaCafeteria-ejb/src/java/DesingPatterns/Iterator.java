/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesingPatterns;

import java.util.List;

/**
 *
 * @author Ariel
 */
public class Iterator {
    
    //Atributos de la clase
    
    private List objeto;
    private int largoObjeto;
    private int posActual;
    
    /**Constructor de la clase.
     * @param objeto corresponde al objeto a iterar
     */
    
    public Iterator(List objeto){
        this.objeto = objeto;
        this.largoObjeto = objeto.size();
        this.posActual = 0;
    }
    
    /**Método hasNext
     * Método que verifica que exista un siguiente elemento
     */
    public boolean hasNext(){
        if(this.posActual < this.largoObjeto){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**Método next
     * Método que retorna el siguiente elemento en el arreglo
     */
    public Object next(){
        Object objeto = this.objeto.get(posActual);
        this.posActual++;
        return objeto;
    }
}
