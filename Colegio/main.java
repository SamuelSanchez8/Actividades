/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) {

        String nombre;
        String direccion;
        String curso;
        int nota;
        String nombreProfesor;
        String direccionProfesor;
        int numDireccion;

        Scanner entrada = new Scanner(System.in);
        Scanner entradaprof = new Scanner(System.in);
        Scanner direprof = new Scanner(System.in);

        System.out.print("Introduzca un nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Introduzca una direccion: ");
        direccion = entrada.nextLine();

        Student estudiante = new Student(nombre, direccion);

        System.out.print("Introduzca el nombre del curso: ");
        curso = entrada.next();
        System.out.print("Introduzca la nota: ");
        nota = entrada.nextInt();

        estudiante.addCourseGrade(curso, nota);
        estudiante.printGrades();

        System.out.println("La nota media es:  " + estudiante.getAverageGrade());

        System.out.print("Introduzca el nombre del profesor:");
        nombreProfesor = entradaprof.nextLine();

        System.out.print("Introduzca la dirección:");
        direccionProfesor = direprof.nextLine();


        Teacher profesor = new Teacher(nombreProfesor, direccionProfesor);
        System.out.println(profesor);

        String[] courses = {"Curso 1", "Curso 2", "curso3","curso 4"};
        for (int i = 0; i<courses.length; i++ ) {
            if (profesor.addCourse(courses[i])) {
                System.out.println("Curso " + i + " ha sido adjuntado");
            } else {
                System.out.println("Curso " + i + " No se puede adjuntar");
            }
        }

        for (int i = 0; i<courses.length; i++ ) {
            if (profesor.removeCourse(courses[i])) {
                System.out.println(i + " ha sido eliminado");
            } else {
                System.out.println(i + " no se puede eliminar");
            }
            
        }

    }
}
