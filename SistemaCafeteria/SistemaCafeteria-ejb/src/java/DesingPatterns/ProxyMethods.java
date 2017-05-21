/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesingPatterns;

import Classes.Foods;
import Classes.Users;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Ariel
 * Interfaz que define el comportamiento de la clase Foods y ProxyFoods
 */
public interface ProxyMethods {
    
    //Métodos abstractos
    public List<Foods> comidas();
    public List<Users> users();
}
