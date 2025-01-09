package com.example;

import java.util.Random;

public class Student {
    private String studentName;    //Implements specification 2
    private int studentID;          //Implements specification 2
    private double guilfordCredits;  //Implements specification 2
    private double transferCredits;  //Implements specification 2
    private double totalCredits;     //Implements specification 2
    private double examCredits;     //Implements specification 2
    private boolean studyingAway;    //Implements specification 2
    private double studentGpa;         //Implements specification 2
    private boolean studentAthlete;        //Implements specification 2
    private boolean onSeason;              //Implements specification 2
    private String kindOfSport;              //Implements specification 2
    private boolean workStudy;                  //Implements specification 2
    private boolean commService;              //Implements specification 2

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(String studentName, int studentID, double guilfordCredits, double transferCredits,
            double examCredits,
            boolean studyingAway, double totalCredits) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.guilfordCredits = guilfordCredits;
        this.transferCredits = transferCredits;
        this.examCredits = examCredits;
        this.studyingAway = studyingAway;
        this.totalCredits = totalCredits;
    }
         // implements specification 4
    public Student(String studentName, int studentID, double guilfordCredits, double transferCredits,
            double examCredits, double studentGpa, boolean studyingAway, boolean studentAthlete, boolean onSeason,
            String kindOfSport, double totalCredits, boolean workStudy, boolean commService) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.guilfordCredits = guilfordCredits;
        this.transferCredits = transferCredits;
        this.totalCredits = totalCredits;
        this.examCredits = examCredits;
        this.studyingAway = studyingAway;
        this.studentGpa = studentGpa;
        this.studentAthlete = studentAthlete;
        this.onSeason = onSeason;
        this.kindOfSport = kindOfSport;
        this.workStudy = workStudy;
        this.commService = commService;
    }

    private Random rand = new Random();

    public Student() {
        this.studentName = "Deon Sanches RandomFace";
        this.studentID = rand.nextInt(1000000);
        this.guilfordCredits = rand.nextDouble() * 100.;
        this.transferCredits = rand.nextDouble(0, 92);
        this.examCredits = rand.nextDouble() * 100.;
        this.studyingAway = rand.nextBoolean();
        this.studentGpa = rand.nextDouble(1, 4);
        this.studentAthlete = rand.nextBoolean();
        if (!studentAthlete) {
            this.onSeason = false;
            this.kindOfSport = "None";
        } else {
            this.onSeason = rand.nextBoolean();
            int sportChoice = rand.nextInt(3);
            if (sportChoice == 0) {
                this.kindOfSport = "Volleyball";
            } else if (sportChoice == 1) {
                this.kindOfSport = "Basketball";
            } else {
                this.kindOfSport = "Lacrosse";
            }
        }
        this.workStudy = rand.nextBoolean();
        this.commService = rand.nextBoolean();
    }

    public String getStudentName() {  // Implements specification 3
        return studentName;
    }

    public void setStudentName(String studentName) {  // Implements specification 3
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGuilfordCredits() {
        return guilfordCredits;
    }

    public void setGuilfordCredits(double guilfordCredits) {
        this.guilfordCredits = guilfordCredits;
    }

    public double getTransferCredits() {
        return transferCredits;
    }

    public void setTransferCredits(double transferCredits) {
        this.transferCredits = transferCredits;
    }

    public double getTotalCredits() {
        return totalCredits;

    }

    public void setTotalCredits(double totalCredits) {
        this.totalCredits = totalCredits;

    }

    public double getExamCredits() {
        return examCredits;
    }

    public void setExamCredits(int examCredits) {
        this.examCredits = examCredits;
    }

    public boolean getStudyingAway() {
        return studyingAway;
    }

    public void setStudyingAway(boolean studyingAway) {
        this.studyingAway = studyingAway;
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    public boolean getStudentAthlete() {
        return studentAthlete;
    }

    public void setStudentAthlete(boolean studentAthlete) {
        this.studentAthlete = studentAthlete;
    }

    public boolean getOnSeason() {
        return onSeason;
    }

    public void setOnSeason(boolean onSeason) {
        this.onSeason = onSeason;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public boolean getWorkStudy() {
        return workStudy;
    }

    public void setWorkStudy(boolean workStudy) {
        this.workStudy = workStudy;
    }

    public boolean getCommService() {
        return commService;
    }

    public void setCommService(boolean commService) {
        this.commService = commService;
    }

    public double calcTotalCredits() {
        double totalCredits;
        totalCredits = guilfordCredits + transferCredits + examCredits;
        return totalCredits;
    }

    public String toString() {
        String output;

        output = "Student Name: " + studentName + "\n" +
                "Student ID: " + studentID + "\n" +
                "Guilford Credits: " + String.format("%.2f", guilfordCredits) + "\n" +
                "Transfer Credits: " + String.format("%.2f", transferCredits) + "\n" +
                "Exam Credits: " + String.format("%.2f", examCredits) + "\n" +
                "Total Credits: " + String.format("%.2f", calcTotalCredits()) + "\n" +
                "Studying Away: " + studyingAway + "\n" +
                "GPA: " + String.format("%.2f", studentGpa) + "\n" +
                "Athlete: " + studentAthlete + "\n" +
                "In Season: " + onSeason + "\n" +
                "Sport: " + kindOfSport + "\n" +
                "Work Study: " + workStudy + "\n" +
                "Community Service: " + commService + "\n" + "\n";
        return output;
    }

    public double calculateGradePoints() {

        double gradePoints;
        gradePoints = guilfordCredits / studentGpa;
        return gradePoints;
    }

    // State whether the number of Guilford credits the student has is greater than
    // 88
    public boolean analyzeGuilfordCredits() {
        boolean highCredits;
        highCredits = guilfordCredits > 88;
        return highCredits;
    }

    // Evaluate whether the student has completed more than 88 Guilford credits and
    // is an athlete
    public boolean analyzeGuilfordCreditsAthlete() {
        boolean analyzeGuilfordCreditsAthlete;
        analyzeGuilfordCreditsAthlete = (guilfordCredits > 88) && (studentAthlete);
        return analyzeGuilfordCreditsAthlete;
    }

    // Evaluate whether the overall GPA is greater than 3.5 or the student is on a
    // study away program.
    public boolean analyzeGPAStudyAway() {
        boolean analyzeGPAStudyAway;
        analyzeGPAStudyAway = (studentGpa > 3.5) || (studyingAway == true);
        return analyzeGPAStudyAway;
    }

    public double calculatePoints() {  // Implements specification 5
        double totalPoints = 0;

        double totalCredits = calcTotalCredits();
        if (totalCredits >= 82) {
            totalPoints = totalPoints + 4;
        } else if (totalCredits >= 50) {
            totalPoints = totalPoints + 3;
        } else if (totalCredits >= 24) {
            totalPoints = totalPoints + 2;
        } else if (totalCredits < 24) {
            totalPoints = totalPoints + 1;
        }
        if ((workStudy) || (studentAthlete) || (commService)) {
            totalPoints = totalPoints + 1;
        }
        if (totalCredits >= 82) {
            totalPoints = totalPoints + 2;
        } else if (totalCredits >= 50) {
            totalPoints = totalPoints + 1;
        }
        if (studentGpa < 2.8) {
            totalPoints = totalPoints - 1;
        }
        if ((studyingAway) && (studentGpa > 3.0)) {
            totalPoints = 5;
        }
        return totalPoints;
    }

    // 82 or more credits: 4 points
    // 50 or more credits: 3 points
    // 24 or more credits: 2 points
    // Fewer than 24 credits: 1 point
    // If a student has completed 82 or more credits they get an additional 2
    // points.
    // If a student has 50 or more credits they get an additional 1 point. The
    // student can only get the extra points for one of the two situations.
    // If student work, or volunteer, or play sports you get 1 point added to your
    // total points.
    // That does not mean if one does all 3 they get 3 points. Just a standard of 1
    // point added if someone does at least 1 of these extracurricular activities.
    // If student are studying away from campus through a Guilford program, the
    // above points assignment is ignored, and you are assigned 5 points.
    // Some rules that I have in my code are not pert of my original lab01 but I had
    // to do it
    // For lab10.

}
