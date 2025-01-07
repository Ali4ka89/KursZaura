package zaur.lesson12;

import zaur.lesson11.Student;

import javax.swing.*;

public class StudentTest {
    public void sravnenieStudentov(Student st1, Student st2) {
        if (st1.name == st2.name && st1.course == st2.course && st1.zp == st2.zp) {
            System.out.println("Studenti pavni");

        } else {
            System.out.println("Studenti ne ravni");
        }

    }
    public void metod2 (Student st1, Student st2){
        if( st1.name.equals(st2.name)){
            if ( st1.course== st2.course){

        }
            if( st1.zp==st2.zp){
                System.out.println(" U studenta imya, kursi i zp odinakovie ");
            }
            else {
                System.out.println(" U studenta imya odinakovie, a kursi raznie");}
//            else{
//                System.out.println("");
            }


        }
    }


