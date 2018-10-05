/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author AnX
 */
public class Entradas {
    
    public static boolean validarRut(String rut) {
 
        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
        char dv = rut.charAt(rut.length() - 1);
    
        if(!(rutAux>9 && rutAux<99999999)) return false;
        else if(!(Character.isDigit(dv)|| dv=='k')) return false;
        else return true;
    }
    
    public boolean Nombre(String Nom){
    char[] chars = Nom.toCharArray();
        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }

    return true;
    }
    
    public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
}
