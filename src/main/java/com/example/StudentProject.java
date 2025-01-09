package com.example;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StudentProject {
    public static void newLine(){
        System.out.println();
    }
    public static void main(String[] args) {
        // Code for Lab 8 goes here

        ArrayList<Student> students = new ArrayList<Student>();


       Student theStudent = new Student("Ada Lovelace", 667788, 85.50, 12.00, 0.00, 3.50, false, false, false, null, 97.50, true, true);
       System.out.println("The student name is " + theStudent.getStudentName());
       
       theStudent.setStudentName("Grace Hopper");
       System.out.println("The new student name is " + theStudent.getStudentName());
       System.out.println("Student Name:\t\t" + theStudent.getStudentName());

       theStudent.setGuilfordCredits(85.5);
       System.out.println("Guilford Credits:\t" + String.format("%.2f", theStudent.getGuilfordCredits()));

       theStudent.setTransferCredits(12.0);
       System.out.println("Transfer Credits:\t" + String.format("%.2f", theStudent.getTransferCredits()));

       theStudent.setTotalCredits(theStudent.getGuilfordCredits() + theStudent.getTransferCredits());
       System.out.println("Total Credits:\t\t" + String.format("%.2f", theStudent.getTotalCredits()));

       newLine();

       Student theOtherStudent = new Student("Alan Turing", 773771, 85.5, 12.00, 4.00, 3.6, true, false, false, null, 101.50, true, false);

       System.out.println("Student Name:\t\t" + theOtherStudent.getStudentName());
       System.out.println("Student ID:\t\t" + theOtherStudent.getStudentID());
       System.out.println("Guilford Credits:\t" + String.format("%.2f", theOtherStudent.getGuilfordCredits()));
       System.out.println("Transfer Credits:\t" + String.format("%.2f", theOtherStudent.getTransferCredits()));
       System.out.println("Exam Credits:\t\t" + String.format("%.2f", theOtherStudent.getExamCredits()));
       System.out.println("Study Away:\t\t" + theOtherStudent.getStudyingAway());
       System.out.println("Total Credits:\t\t" + String.format("%.2f", theOtherStudent.getTotalCredits()));

       newLine();

       Student theThirdStudent = new Student("An Wang", 364134, 37.0, 0.0, 16.0, 3.75, false, true, false, "Baseball", 53.0, false, false);

       System.out.println("Student Name:\t" + theThirdStudent.getStudentName());
       System.out.println("Student ID:\t" + theThirdStudent.getStudentID());
       System.out.println("Guilford Credits: " + String.format("%.2f", theThirdStudent.getGuilfordCredits()));
       System.out.println("Transfer Credits: " + String.format("%.2f", theThirdStudent.getTransferCredits()));
       System.out.println("Exam Credits:\t" + String.format("%.2f", theThirdStudent.getExamCredits()));
       System.out.println("GPA:\t" + String.format("%.2f", theThirdStudent.getStudentGpa()));
       System.out.println("Studying Away:\t" + theOtherStudent.getStudyingAway());
       System.out.println("Athlete: " + theThirdStudent.getStudentAthlete());
       System.out.println("In Season: " + theThirdStudent.getOnSeason());
       System.out.println("Sport: " + theThirdStudent.getKindOfSport());
       System.out.println("Total Credits:\t" + String.format("%.2f", theThirdStudent.getTotalCredits()));
       System.out.println("Work Studying: " + theThirdStudent.getWorkStudy());
       System.out.println("Community Service: " + theThirdStudent.getCommService());

       newLine();
       
       System.out.println("Total credits: " + String.format("%.2f", theThirdStudent.calcTotalCredits()));
       System.out.println("Total credits: " + String.format("%.2f", theOtherStudent.calcTotalCredits()));
       System.out.println("Total credits: " + String.format("%.2f", theStudent.calcTotalCredits()));

       newLine();

       System.out.println(theThirdStudent.toString());

       newLine();

       System.out.println(theThirdStudent);

       newLine();

       System.out.println(theStudent);
       newLine();
       System.out.println(theOtherStudent);
       newLine();
       System.out.println(theThirdStudent);
       newLine();

       System.out.println("Before Change");
       System.out.println("Student Name:\t\t" + theThirdStudent.getStudentName());
       System.out.println("Guilford Credits:\t" + String.format("%.2f", theThirdStudent.getGuilfordCredits()));
 
       newLine();


       System.out.println("After change");
       System.out.println("Studnet Name\t\t" + theThirdStudent.getStudentName());
       theThirdStudent.setGuilfordCredits(73);
       System.out.println("Guilford Credits:\t" + String.format("%.2f", theThirdStudent.getGuilfordCredits()));
       newLine();

       System.out.println("The students Grade Point: " + String.format("%.2f", theThirdStudent.calculateGradePoints()));
       
       newLine();

       System.out.println("Checking number of Guilford credits");
       System.out.println("Student Name:\t\t" + theStudent.getStudentName());
       System.out.println("High Guilford Credits:\t\t" + theStudent.analyzeGuilfordCredits());
       System.out.println("Students Name:\t\t" + theOtherStudent.getStudentName());
       System.out.println("High Guilford Credits:\t\t" + theOtherStudent.analyzeGuilfordCredits());
       System.out.println("Students Name:\t\t" + theThirdStudent.getStudentName());
       System.out.println("High Guilford Credits:\t\t" + theThirdStudent.analyzeGuilfordCredits());

       newLine();
       System.out.println("Checking number of Guilford credits and is an athlete");
       System.out.println("Studnt Name:\t\t" + theStudent.getStudentName());
       System.out.println("High Guilford credits and athlete:\t\t" + theStudent.analyzeGuilfordCreditsAthlete());
       System.out.println("Student Name:\t\t" + theOtherStudent.getStudentName());
       System.out.println("High Guilford credits and athlete:\t\t" + theOtherStudent.analyzeGuilfordCreditsAthlete());
       System.out.println("Student Name:\t\t" + theThirdStudent.getStudentName());
       System.out.println("High Guilford credits and athlete:\t\t"  + theThirdStudent.analyzeGuilfordCreditsAthlete());

       newLine();
       System.out.println("Checking GPA or studying away");
       System.out.println("Student Name:\t\t" + theStudent.getStudentName());
       System.out.println("High GPA or studying away:\t\t" + theStudent.analyzeGPAStudyAway());
       System.out.println("Students Name:\t\t" + theOtherStudent.getStudentName());
       System.out.println("High GPA or studying away:\t\t" + theOtherStudent.analyzeGPAStudyAway());
       System.out.println("Student Name:\t\t" + theThirdStudent.getStudentName());
       System.out.println("High GPA or studying away:\t\t" + theThirdStudent.analyzeGPAStudyAway());

       newLine();
       System.out.println("Calculating total points");
       System.out.println("Students Name:\t\t" + theStudent.getStudentName());
       System.out.println("Total points:\t\t" + theStudent.calculatePoints());
       System.out.println("Studnet Name:\t\t" + theOtherStudent.getStudentName());
       System.out.println("Total points:\t\t" + theOtherStudent.calculatePoints());
       System.out.println("Student Name:\t\t" + theThirdStudent.getStudentName());
       System.out.println("Total Points:\t\t" + theThirdStudent.calculatePoints());

       newLine();
       Student randomStudent = new Student();
       System.out.println("Randomly generated student:\n" + randomStudent.toString());

       newLine();
       students.add(randomStudent);
       System.out.println("The size of the list is " + students.size());

       //String testString = "Will this work?";
       //student.add(testString);

       newLine();
       Student testItem = students.get(0);
       System.out.println(testItem);
       
       newLine();
       students.remove(0);
       System.out.println("The size of the list is now " + students.size());

       int studentCount = 18357;
       int index = 0;

       while (index < studentCount) {
        Student randomStudent2 = new Student();
        students.add(randomStudent2);
        index = index + 1;
       }

       
       //System.out.println("List of student objects:\n" + students);
       System.out.println("The number of students in the list is " + students.size());

       int countHighCredits = 0;
       for (Student student : students) {
           if(student.analyzeGuilfordCredits()) {
              countHighCredits = countHighCredits + 1;
           }
       }

       System.out.println("The number of high Guilford credits students is " + countHighCredits);
       System.out.println("The percentage of high Guilford credits students is " + String.format("%.2f", 100. * countHighCredits/students.size()));
       
       int countHighCreditsAthlete = 0;
       for (Student student : students) {
          if(student.analyzeGuilfordCreditsAthlete()) {
            countHighCreditsAthlete = countHighCreditsAthlete + 1;
          }
       }

       System.out.println("The number of high Guilford credits students who are athletes is " + countHighCreditsAthlete);
       System.out.println("The percentage of high Guilford credits students who are athletes is " + String.format("%.2f", 100. * countHighCreditsAthlete/students.size())); 

       int countHighGpaStudyAway = 0;
       for (Student student : students) {
           if(student.analyzeGPAStudyAway()) {
            countHighGpaStudyAway = countHighGpaStudyAway + 1;
           }
       }
    
       System.out.println("The number of high GPA students or who are studying away is " + countHighGpaStudyAway);
       System.out.println("The percentage of high GPA students or who are studying away is " + String.format("%.2f", 100. * countHighGpaStudyAway / students.size()));

       int pointStudents = 0;
       for (Student student :students) {
           if(student.calculatePoints() > 6) {
            pointStudents = pointStudents + 1;
           }
       }

       System.out.println("The number of students with more than 6 points is " + pointStudents);
       System.out.println("The percentage of students with more than 6 points is " + String.format("%.2f", 100. * pointStudents / students.size()));

       // According to my rules 7 is the highest number of points a stuednt can get so I want 
       // less than 20% of the student body to be able to achieve that score. 
       // I wanted the number of students who have more than 6 points to be below 20% of the student body
       // So I had to make one rule more complex and I had to add an extra rule that makes 
       // any students with a GPA lower of 2.8 to lose one point. I know that is kind of harsh but I had to
       // do what I had to do in order to achieve my goal of having less than 20% of the student body from
       // getting more than 6 points.
       // for lab11 all the people I have asked for a quick interview no body has told me that they have a GPA lower
       // than 3.00 so my rule of having a GPA lower of 2.8 (lose one point) doesn't seem too bad. I guess only students
       // who don't really work hard enough on their classes might get a GPA lower than 2.8. 


       Student mayaRivera = new Student("Maya Rivera", 727192, 16, 0, 0, 4.0, false, true, false, "soccer", 16, true, true);
       Student adrianMercedis = new Student("Adrian Mercedis", 716942, 60, 0, 0, 4.0, false, true, true, "Tennis", 60, true, false);
       Student angelAragon = new Student("Angel Aragon", 722640, 70, 0, 0, 3.5, false, true, false, "Soccer", 70, true, false);
       Student bryndonHermis = new Student("Bryndon Hermis", 723908, 16, 0, 0, 3.92, false, true, true, "Tennis", 16, false, false);
       Student brainGupta = new Student("Brain Gupta", 718870, 17, 0, 28, 4.0, false, false, false, "null", 45, false, true);
       Student alexNunez = new Student("Alexander Nunez", 726085, 16, 9, 0, 4.0, false, true, false, "Cross County", 25, true, false);
       Student deonMcFarland = new Student("Deon McFarland", 711824, 120, 0, 0, 3.5, false, false, false, "null", 120, true,false);
       Student meliekBryan = new Student("Meliek Bryan", 711837, 52, 0, 0, 4.0, false, true, false, "Futball", 52, false, false);

       newLine();

       System.out.println("Student ID\t" + "Points");
       System.out.println("G" + String.format("%08d", mayaRivera.getStudentID()) +"\t" +  mayaRivera.calculatePoints());
       System.out.println("G" + String.format("%08d", adrianMercedis.getStudentID()) +"\t" + adrianMercedis.calculatePoints());
       System.out.println("G" + String.format("%08d", angelAragon.getStudentID()) +"\t" + angelAragon.calculatePoints());
       System.out.println("G" + String.format("%08d", bryndonHermis.getStudentID()) +"\t" + bryndonHermis.calculatePoints());
       System.out.println("G" + String.format("%08d", brainGupta.getStudentID()) +"\t" + brainGupta.calculatePoints());
       System.out.println("G" + String.format("%08d", alexNunez.getStudentID()) +"\t" + alexNunez.calculatePoints());
       System.out.println("G" + String.format("%08d", deonMcFarland.getStudentID()) +"\t" + deonMcFarland.calculatePoints());
       System.out.println("G" + String.format("%08d", meliekBryan.getStudentID()) +"\t" + meliekBryan.calculatePoints());

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       newLine();
       Student tStudent = students.get(0);
       System.out.println("Student 0 is\n" + tStudent);

       newLine();
       Student hStudent = students.get(1);
       System.out.println("Student 1 is\n" + hStudent);

       newLine();
       Student eStudent = students.get(2);
       System.out.println("Student 2 is\n" + eStudent);

       int[] guilfordHistogram = new int[5];
       
       index = 0;

       for (Student student : students) {
        double value = student.getGuilfordCredits();
        if (value < 20) {
            index = 0;
        }else if (value < 40) {
            index = 1;
        }else if (value < 60) {
            index = 2;
        }else if (value < 80) {
            index = 3;
        }else {
            index = 4;
        }

        guilfordHistogram[index] = guilfordHistogram[index] + 1;

       }
       
    
       int[] transferHistogram = new int[5];

        for (Student student : students) {
            double valuee = student.getTransferCredits();
            if (valuee < 18) {
                index = 0;
            }else if (valuee < 36) {
                index = 1;
            }else if (valuee < 54) {
                index = 2;
            }else if (valuee < 72) {
                index = 3;
            }else {
                index = 4;
            }

            transferHistogram[index] = transferHistogram[index] + 1;

        }

       System.out.println("The Guilford credits histogram is " + Arrays.toString(guilfordHistogram));

       System.out.println("The Transfer credits histogram is " + Arrays.toString(transferHistogram));

       double total = 0;
       index = 0;
       while (index < guilfordHistogram.length) {
        total = total + guilfordHistogram[index];
        index = index + 1;
       }
       //System.out.println(guilfordHistogram.length);
       //System.out.println(guilfordHistogram[0]);
    
       System.out.println("the total number of students in guilfordHistogram is: " + total);

       //System.out.println(guilfordHistogram[-1]);
       //System.out.println(guilfordHistogram[5]);

       
       //First updated histogram updated 
       newLine();
       int [] guilfordHistogram20 = new int[20];
       for(Student student : students) {
         double value = student.getGuilfordCredits();
         int bin = (int) (value  / 5);

         guilfordHistogram20[bin] = guilfordHistogram20[bin] + 1;
       }
       
       System.out.println("guilfordHistogram20: " + Arrays.toString(guilfordHistogram20));

       total = 0;
       index = 0;
       while (index < guilfordHistogram20.length) {
        total = total + guilfordHistogram20[index];
        index = index + 1;
       }

       System.out.println("The total number of students in guilfordHistogram20 is : " + total);


       //second original histogram created 
       newLine();
       int [] transferHistogram23 = new int[23];
       for(Student student : students) {
        double valuee = student.getTransferCredits();
        int binn = (int)(valuee / 4);

        transferHistogram23[binn] = transferHistogram23[binn] + 1;
       }

       System.out.println("transferHistogram23: " + Arrays.toString(transferHistogram23));

       total = 0;
       index = 0;

       while (index < transferHistogram23.length) {
        total = total + transferHistogram23[index];
        index = index + 1;
       }

       System.out.println("The total number of students in transferHistogram is: " + total);

       // file code 
       File file = new File("guilfordCreditsHistogram.txt");
       try {
           FileWriter writer = new FileWriter(file);
           //We'll add the writing code here
           writer.write("Index\tCount\n");
           index = 0;
           while (index < guilfordHistogram20.length) {
                writer.write(index + "\t" + guilfordHistogram20[index] + "\n");
                index = index + 1;
           }

           //Close the file when we're done writing so that all the data gets to it
           writer.close();
       } catch (IOException e) {
        // What happens if there's something wrong with the file, like it can't be created

        e.printStackTrace();
       }

       try {
        Scanner scan = new Scanner(file);
        //Add fiel reading code here
        while (scan.hasNextLine()) {

            System.out.println(scan.nextLine());

        }
        //Close the Scanner when we're done
        scan.close();
       } catch (FileNotFoundException e) {
        //What happens if there's something wrong with the file , like if it doesn't exist
        e.printStackTrace();
       }


       


       
       
       //////////////////////////////////////////////////////////////////
       JFrame myFrame = new JFrame("Student testing");
       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel primary = new JPanel();
       primary.setPreferredSize(new Dimension(1500, 310));
       primary.setBackground(Color.black);
       myFrame.getContentPane().add(primary);

       
       //implements specification 11
       StudentPanel studentPanel = new StudentPanel(students);
       primary.add(studentPanel);

       StudentPanel studentPanel1 = new StudentPanel(students);
       primary.add(studentPanel1);
       studentPanel1.setBackground(Color.PINK);

       myFrame.pack();
       myFrame.setVisible(true);





    }
}