/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;

/**
 *
 * @author Usuario
 */
public class Student extends Person {

    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX = 20;

    public Student(String name, String address) { 
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX];
        this.grades = new int[MAX];
    }

    // todo FILTRAR QUE NO PONGANS MAS CURSOS DE LOS POSIBLES     courses[21]  >>>>     ArrayOutOfBoundException
    public void addCourseGrade(String course, int grade) {
        
        if (numCourses > MAX){
            System.out.println("No se pueden añadir más cursos");
        }
        else{
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
        }
    }

    public void printGrades() {
        System.out.print(this); 
        for (int i = 0; i < numCourses; ++i) {
            System.out.print(" " + courses[i] + " : " + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int suma = 0;
        for (int i = 0; i < numCourses; i++) {
            suma += grades[i];
        }
        return suma/numCourses;
    }
}
