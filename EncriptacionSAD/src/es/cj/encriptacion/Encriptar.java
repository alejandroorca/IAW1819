package es.cj.encriptacion;

import java.security.Key;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;



public class Encriptar {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		// Generación de una clave en 128 bits
		
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	      keyGenerator.init(128);
	      Key clave = keyGenerator.generateKey();

	      // Texto a encriptar
	      
	      System.out.println("Introduce el texto a encriptar: ");
          String texto = sc.next();
          
          // Cifrador AES
          
          Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
          
          // Proceso de encriptación
          
          aes.init(Cipher.ENCRYPT_MODE, clave);
          byte[] encriptado = aes.doFinal(texto.getBytes());
          
          for (byte b : encriptado) {
              System.out.print(Integer.toHexString(0xFF & b));
           }
          
       // Se iniciliza el cifrador para desencriptar, con la clave generada, desencripta y muestra los textos, uno cifrado y el otro no
          
          System.out.println();
    
          aes.init(Cipher.DECRYPT_MODE, clave);
          byte[] desencriptar = aes.doFinal(encriptado);
          System.out.println(new String(desencriptar));
	}

}
