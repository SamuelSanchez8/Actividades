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
public class Teacher extends Person {

    private int numCourses;
    private String[] courses;
    private static final int Max = 20;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[Max];
    }

    /**
     *
     * @param course
     * @return Se añade un curso. Si el curso ya existe, retorna false y no
     * añade el curso. Si no existe, lo añade.
     */
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numCourses] = course; 
        numCourses++;
        return true;
    }

    // [curso1, curso3, curso4, null]
    
    public boolean removeCourse(String course) {
        boolean cursoencontrado = false;
        int curso = 0;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                curso = i;
                cursoencontrado = true;
                break;
            }
        }

        if (cursoencontrado) { 
            for (int i = curso; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1]; 
            }
            courses[numCourses-1]=null;
            numCourses--; 
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString();
    }
}
