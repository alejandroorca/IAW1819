package es.cj.main;

import es.cj.clases.Alumno;
import es.cj.clases.Asignatura;
import es.cj.clases.Profesor;

public class main {

	public static void main(String[] args) {
		Asignatura a1 = new Asignatura(1234);
		Asignatura a2 = new Asignatura(5678);
		Asignatura a3 = new Asignatura(2244);

		Alumno al = new Alumno(a1, a2, a3);
		
		
		Profesor.ponerNotas(al);
		
		System.out.println("Media: "+Profesor.calcularMedia(al));
		
	}

}
