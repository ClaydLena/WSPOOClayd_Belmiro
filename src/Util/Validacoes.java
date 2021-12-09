
package Util;

/**
 * Esta classe e composta  por metodos que validam os dados de entrada do sistema.
 * 
 * @author Clayd Nandza
 */
public class Validacoes {
    public static boolean validarNomes(String nome){
        return nome.matches("[8]");
    }
    
    public static boolean validarEmail(String email){
        return email.matches("[@gmail.com]{10}$");
    }
    
    public static boolean validarContacto(String contacto){
        return contacto.matches("^[8]$");
    }
    
    public static boolean validarBi(String bi){
        return bi.matches("\\d{12}+[A-Z]");
    }
    
}
