package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjerciciosIfJava {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	/*
	 * 1 Pedir dos números y decir si son iguales o no
       2 Pedir un número e indicar si es positivo o negativo
       3 Pedir dos números y decir si uno es múltiplo del otro
       4 Pedir dos números e indicar cual es el mayor o si son iguales
       5 Pedir dos números y mostrarlos ordenados de mayor a menor
       6 Pedir tres números y mostrarlos ordenados de mayor a menor
       7 Introduzca una nota de 0 a 10 y mostrarla de la forma: insuficiente, suficiente, bien...
       8 Pida al usuario día, mes y año y compruebe que la fecha es correcta
       9 Pedir día, mes y año y mostrar la fecha del día siguiente. Suponer que todos los meses son de 30 días
       10 Pedir el día, mes y año y mostrar la fecha del día siguiente. Con meses de 28, 30 y 31 días. Sin años bisiestos.
       11 Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
       12 Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.
       13 Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) 
       e indique el estado en el que se encuentra esa persona en función del valor de IMC: 
          Valor de IMC Diagnóstico < 16 Criterio de ingreso en hospital 
          de 16 a 17 infrapeso 
          de 17 a 18 bajo peso 
          de 18 a 25 peso normal (saludable) 
          de 25 a 30 sobrepeso (obesidad de grado I) 
          de 30 a 35 sobrepeso crónico (obesidad de grado II) 
          de 35 a 40 obesidad premórbida (obesidad de grado III) 
          >40 obesidad mórbida (obesidad de grado IV) 
          Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
          Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.

       14 Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado de coeficientes reales. 
       El programa debe diferenciar los diferentes casos que puedan surgir: la existencia de dos raíces reales distintas, 
       de dos raíces reales iguales y de dos raíces complejas. Nota: se recomienda el empleo de sentencias if–else anidadas.
	 */
	// 1
		System.out.println("Introduzca el Nº1: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduzca el Nº2: ");
		
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Son iguales los números.");
		} else {
			System.out.println("No son iguales.");
		}
		
		// 2
		
		System.out.println("Introduzca un número y sabrás si es positivo o negativo: ");
		
		int num3 = sc.nextInt();
		
		if (num3 > 0) {
			System.out.println("El número es positivo.");
		} else if (num3 < 0) {
			System.out.println("El número es negativo.");
		} else {
			System.out.println("El número es cero.");
		}
		
		// 3
		
		System.out.println("Introduzca dos números para saber si uno es múltiplo de otro: ");
		
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		
         if (num4 % num5 == 0) {
			
			System.out.println(num1 + " es multiplo de " + num2);
		} else {
			System.out.println("No son multiplos");
		}
         
         // 4
         
         System.out.println("Introduzca dos números para saber cual es el mayor y el menor: ");
         
         double num6 = sc.nextDouble();
         double num7 = sc.nextDouble();
         
		if (num6 > num7) {
			
			System.out.println(num6 + " es mayor que "+ num7);
		} else if (num7 > num6) {
			System.out.println(num7 + " es mayor que " + num6);
		} else {
			
			System.out.println("Son iguales.");
		}
		
		// 5
		
		System.out.println("Introduzca dos números para ver su orden de mayor a menor: ");
		
		double num8 = sc.nextDouble();
		double num9 = sc.nextDouble();
		
		if (num8 > num9) {
			System.out.println(num8 + "," + num9);
		} else {
			System.out.println(num9 + "," + num8);
		}
		
		// 6
		
		System.out.println("Introduce tres números para ver su orden: ");
		
		double num10 = sc.nextDouble();
		double num11 = sc.nextDouble();
		double num12 = sc.nextDouble();
		
if (num10 > num11 && num10 > num12) {
			
			if (num11 > num12) {
				System.out.println(num10+","+num11+","+num12);
			} else {
				System.out.println(num10+","+num12+","+num11);
			}
			} 
			else if (num11 > num10 && num11 > num12) {
				if (num10 > num12) {
					System.out.println(num11+","+num10+","+num12);
				} else { System.out.println(num11+","+num10+","+num12);
					
				}
				} else {
				System.out.println(num12+","+num11+","+num10);
				}

         // 7

        System.out.println("Introduzca una nota: ");
        
		double num13 = sc.nextDouble();
		
		if (num13 <= 4 && num13 >= 0) {
			System.out.println("Tienes suspenso");
		}  else if (num13 >= 5 && num13 < 6) {
			if (num13 < 6) {
				System.out.println("Tienes un suficiente.");
			} else { System.out.println("Tienes un bien.");}
		}else if (num13 > 6 && num13 < 7) {
			System.out.println("Tienes un bien");
		} else if (num13 >= 7 && num13 < 9) {
			System.out.println("Tienes un notable");
		} else if (num13 >= 9 && num13 <= 10) {
			System.out.println("Tienes un sobresaliente");
		} else {
			System.out.println("Valor no permitido");
		}
		
		// 8
		
		System.out.println("Introduzca una fecha para saber si es correcta: ");
		int day = sc.nextInt();
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		if (year > 0) {
		
			boolean bisiesto =((year % 4 == 0 && year %100 != 0) || (year % 400 ==0));
			if (month >=1 && month <=12) {
				switch (month) {
				case 2:
					if (day >=1 && day >=29 && bisiesto) {
						fechaCorrecta = true;}
					else if (day >= 1 && day <= 28 && !bisiesto) {
						fechaCorrecta = true;}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (day >= 1 && day <= 31) {
						fechaCorrecta = true;
						}
                  break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (day >=1 && day <= 30) {
						fechaCorrecta = true;
					}
					break;
				default:
					break;
				}
			}
		}
		
		if (fechaCorrecta) {
		System.out.println("Fecha correcta.");	
		} else {
			System.out.println("Fecha incorrecta.");
		}
		
		// 9
		 System.out.println("Introduzca una fecha para saber el día siguiente, vamos a tener en cuenta que tenemos 30 días por mes: ");
		 
		 int dia = sc.nextInt();
		 int mes = sc.nextInt();
		 int anyo = sc.nextInt();
		 
		 if (anyo >= 0 && mes >=1 && mes <= 12) {
			 
			 if (mes == 12 && dia == 30) {
				 
				 dia = 1;
				 mes = 1;
				 anyo = anyo + 1;
				 System.out.println(dia+"/"+mes+"/"+anyo);
				 
				
			 } else if (mes == 12) {
				 
				 dia = dia + 1;
				 mes = 12;
				 
				 System.out.println(dia+"/"+mes+"/"+anyo);
			 } else if (dia == 30){
				 dia = 1;
				 mes = mes + 1;
				 
				 System.out.println(dia+"/"+mes+"/"+anyo);
			 } else {
				 
				 dia = dia + 1;
				 System.out.println(dia+"/"+mes+"/"+anyo);
			 }
			 
			 
		 } else {
			 System.out.println("Valor erróneo.");
		 }
	
	// 10
		 
 System.out.println("Introduzca una fecha para saber el día siguiente, no existen bisiestos: ");
		 
		 int dia1 = sc.nextInt();
		 int mes1 = sc.nextInt();
		 int anyo1 = sc.nextInt();
		 
		 if (anyo1 >= 0 && mes1 >=1 && mes1 <= 12 && dia1 > 0 && dia1 <= 31) {
			 
			 switch (mes1) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				if (dia1 == 31 && mes1 == 12) {
					dia1 = 1;
					mes1 = 1;
					anyo1 = anyo1 + 1;
				} else if (dia1 == 31){
					dia1 = 1;
					mes1 = mes1 + 1;
				} else {
					dia1 = dia1 + 1; 
				}
				break;
				case 2:
				case 4:
				case 6:
				case 9:
				case 11:
                if (dia1 == 30) {
                	dia1 = 1;
                	mes1 = mes1 + 1;
                } else {
                	dia1 = dia1 + 1;
                }
			default:
				break;
				
			}
			 System.out.println(dia1+"/"+mes1+"/"+anyo1);
			 
		 } else {
			 System.out.println("Valor erróneo.");
		 }
		 
		 // 11
		 
		 System.out.println("Introduzca hora, minutos y segundos: ");
		 int hora = sc.nextInt();
		 int minutos = sc.nextInt();
		 int segundos = sc.nextInt();
		 
		 if (hora >= 0 && hora < 24 && minutos >=0 && minutos < 60 && segundos >= 0 && segundos < 60 ) {
			 
			 if (hora == 23 && minutos == 59 && segundos == 59) {
				 hora = 0;
				 minutos = 0;
				 segundos = 0;
			 } else if (minutos == 59 && segundos == 59) {
				 hora = hora + 1;
				 minutos = 0;
				 segundos = 0;
				 
			 } else if (segundos == 59) {
				 segundos = 0;
				 minutos = minutos + 1;
			 } else {
				 segundos = segundos + 1;
			 }
			 System.out.println(hora+":"+minutos+":"+segundos);
		 } else {
			 System.out.println("Los valores introducidos son erróneos.");
		 }
		 
		 // 12
		 
	 System.out.println("Introduzca dos fechas para saber cuantos días hay de por medio dd/mm/yyyy: ");
		 
		 int dia2 = sc.nextInt();
		 int mes2 = sc.nextInt();
		 int anyo2 = sc.nextInt();
		 int dia3 = sc.nextInt();
		 int mes3 = sc.nextInt();
		 int anyo3 = sc.nextInt();
		 int cont = 0;
		 
		 if (dia2 > 0 && dia2 <=30 && mes2 > 0 && mes2 <=12 && anyo2 >= 0) {
			 if (anyo2 == anyo3 && mes2 == mes3 && dia2 > dia3) {
				 
				 cont = (dia2 - dia3);
			 } else if (anyo2 == anyo3 && mes2 == mes3 && dia2 < dia3) {
				 cont = (dia3 - dia2);
			 } else if (dia2 == dia3 && anyo2 == anyo3 && mes2 > mes3) {
				 if (mes2 - mes3 == 1) {
				 cont = 30;
				 } else {
					 cont =(30 * (mes2 - mes3));
				 }
			 } else if (dia2 == dia3 && anyo2 == anyo3 && mes2 < mes3) {
				 if (mes3 - mes2 == 1) {
				 cont = 30;
				 } else {
					 cont =(30 * (mes3 - mes2));
				 }
	} else if (anyo2 > anyo3 && mes2 == mes3 && dia2 == dia3) {
		if (anyo2 - anyo3 == 1) {
			cont = 360;
		} else {
			cont =(360 * (anyo2 - anyo3));
		}
	} else if (anyo2 < anyo3 && mes2 == mes3 && dia2 == dia3) {
		if (anyo3 - anyo2 == 1) {
			cont = 360;
		} else {
			cont =(360 * (anyo3 - anyo2));
		}
		
	} else if (anyo2 < anyo3 && mes2 < mes3 && dia2 == dia3) {
		if (anyo3 - anyo2 == 1 && mes3 - mes2 == 1) {
			cont = 360 + 30;
		} else {
			cont =(360 * (anyo3 - anyo2) + (mes3 - mes2) * 30);
		}
	} else if (anyo2 < anyo3 && mes2 > mes3 && dia2 == dia3) {
		if (anyo3 - anyo2 == 1 && mes2 - mes3 == 1) {
			cont = 360 + 30;
		} else {
			cont =(360 * (anyo3 - anyo2) + (mes2 - mes3) * 30);
		}
	} else if (anyo2 > anyo3 && mes2 > mes3 && dia2 == dia3) {
		if (anyo2 - anyo3 == 1 && mes2 - mes3 == 1) {
			cont = 360 + 30;
		} else {
			cont =(360 * (anyo2 - anyo3) + (mes2 - mes3) * 30);
		}
	} else if (anyo2 > anyo3 && mes2 < mes3 && dia2 == dia3) {
		if (anyo2 - anyo3 == 1 && mes3 - mes2 == 1) {
			cont = 360 + 30;
		} else {
			cont =(360 * (anyo2 - anyo3) + (mes3 - mes2) * 30);
		}
}  else if (anyo2 > anyo3 && mes2 > mes3 && dia2 > dia3) {
	cont =(360 * (anyo2 - anyo3) + (mes2 - mes3) * 30 + (dia2 - dia3));
	
} else if (anyo2 > anyo3 && mes2 > mes3 && dia2 < dia3) {
	cont =(360 * (anyo2 - anyo3) + (mes2 - mes3) * 30 + (dia3 - dia2));
} else if (anyo2 > anyo3 && mes2 < mes3 && dia2 < dia3) {
	cont =(360 * (anyo2 - anyo3) + (mes3 - mes2) * 30 + (dia3 - dia2));
} else if (anyo2 > anyo3 && mes2 < mes3 && dia2 > dia3) {
	cont =(360 * (anyo2 - anyo3) + (mes3 - mes2) * 30 + (dia2 - dia3));
}  else if (anyo2 < anyo3 && mes2 > mes3 && dia2 > dia3) {
	cont =(360 * (anyo3 - anyo2) + (mes2 - mes3) * 30 + (dia2 - dia3));
	
} else if (anyo2 < anyo3 && mes2 > mes3 && dia2 < dia3) {
	cont =(360 * (anyo3 - anyo2) + (mes2 - mes3) * 30 + (dia3 - dia2));
} else if (anyo2 < anyo3 && mes2 < mes3 && dia2 < dia3) {
	cont =(360 * (anyo3 - anyo2) + (mes3 - mes2) * 30 + (dia3 - dia2));
} else if (anyo2 < anyo3 && mes2 < mes3 && dia2 > dia3) {
	cont =(360 * (anyo3 - anyo2) + (mes3 - mes2) * 30 + (dia2 - dia3));
}
		 
		 } else {
			 
			 System.out.println("Error, compruebe valores.");
		 }
		 System.out.println("Hay un total de: "+cont+" días." );
		 
		 
	}
	
	// 13
	

}
