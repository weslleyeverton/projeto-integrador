package Tela;

import java.util.Scanner;

public class TelaVoluntario {
	
	Scanner teclado = new Scanner(System.in);
    int dig;
    
    	public void executar(){
    		    		
    	/* VOLUNTARIO TER� APENAS UM BOT�O PARA CHAT COM O USUARIO EM SUA TELA INICIAL - HIST�RICO SEGUNDO ORIENTADO PELO PROFESSOR */
  		  System.out.println("1- Chat Usuario");  		  
  		  dig = teclado.nextInt();
  		  
  		  if (dig==1) {
  			System.out.println("CHAT EM BREVE"); 
  		  }
  		  
}

}
