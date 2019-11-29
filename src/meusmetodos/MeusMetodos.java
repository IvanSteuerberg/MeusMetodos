package meusmetodos;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class MeusMetodos {

public static float validarFloatPositivo(){
Scanner sc = new Scanner(System.in);    
float valor;
do {
 valor = sc.nextFloat();
} while(valor<=0);
return valor;
}
    
}
