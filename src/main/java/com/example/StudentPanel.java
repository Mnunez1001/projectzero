package com.example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StudentPanel extends JPanel { // Implements specification 6
 private ArrayList<Student> students;
 private JLabel guilfordCreditsLabel;
 private JTextField studentIndexField;
 private int studentIndex = 0;
 private JButton forwardStudents;
 private JLabel transferCreditsLabel;
 private JButton backwardButton;
 private JLabel studentPointsLabel;
 private JCheckBox displayColor;
 private JRadioButton analyze1Choice;
 private JRadioButton analyze2Choice;
 private JRadioButton analyze3Choice;
 private ButtonGroup analyzeButtonGroup;
 private JLabel analyzeStudentLabel;
 private JRadioButton selectedButton;
 private JSlider studentSlider;
 private JLabel studentNumberLabel;
 private JLabel studentIdLabel;
 private JLabel studentTotalCreditsLabel;
 private JLabel studentExamLabel;
 private JLabel studentStudyAwayLabel;
 private JLabel studentGpaLabel;
 private JLabel studentAthleteLabel;
 private JLabel onSeasonLabel;
 private JLabel kindOfSportLabel;
 private JLabel workStudyLabel;
 private JLabel commServiceLabel;

     public StudentPanel(){ // Implements specification 7
        super();
        initPanel();
    }
    

    public StudentPanel(ArrayList<Student> students) {
        super();
        this.students = students;
        initPanel();                            // Implements specification 8

        guilfordCreditsLabel.setText("Guilford Credits: " + String.format("%.2f", students.get(0).getGuilfordCredits()));
        transferCreditsLabel.setText("Transfer Credits: " + String.format("%.2f", students.get(0).getTransferCredits()));
        studentPointsLabel.setText("Student Priority Points: " + students.get(0).calculatePoints());
        analyzeStudentLabel.setText("High Guilford Credits: " + students.get(0).analyzeGuilfordCredits());
        studentNumberLabel.setText("Selected Student: " + studentIndex);
        studentIdLabel.setText("Student ID: " +  students.get(0).getStudentID());
        studentTotalCreditsLabel.setText("Student Total Credits: " + String.format("%.2f", students.get(0).calcTotalCredits()));
        studentExamLabel.setText("Student Exam Credits: " + String.format("%.2f", students.get(0).getExamCredits()));
        studentStudyAwayLabel.setText("Studying Away: " + students.get(0).getStudyingAway());
        studentGpaLabel.setText("Student GPA: " + String.format("%.2f", students.get(0).getStudentGpa()));
        studentAthleteLabel.setText("Student Athlete: " + students.get(0).getStudentAthlete());
        onSeasonLabel.setText("In Season: " + students.get(0).getOnSeason());
        kindOfSportLabel.setText("Sport: " + students.get(0).getKindOfSport());
        workStudyLabel.setText("Work Study: " + students.get(0).getWorkStudy());
        commServiceLabel.setText("Community Service: " + students.get(0).getCommService());


    }

    public void initPanel() {
        setPreferredSize(new Dimension(500, 300));
        setBackground(Color.LIGHT_GRAY);

        guilfordCreditsLabel = new JLabel("Guilford Credits: ");
        guilfordCreditsLabel.setOpaque(true);
        add(guilfordCreditsLabel);

        transferCreditsLabel = new JLabel("Transfer Credits: ");
        transferCreditsLabel.setOpaque(true);
        add(transferCreditsLabel);

        studentPointsLabel = new JLabel("Student Priority Points: ");
        studentPointsLabel.setOpaque(true);
        add(studentPointsLabel);

        analyzeStudentLabel = new JLabel("Analyze Student");
        analyzeStudentLabel.setOpaque(true);
        add(analyzeStudentLabel);

        studentIdLabel = new JLabel("Student ID: ");
        studentIdLabel.setOpaque(true);
        add(studentIdLabel);

        studentTotalCreditsLabel = new JLabel("Student Total Credits: ");
        studentTotalCreditsLabel.setOpaque(true);
        add(studentTotalCreditsLabel);

        studentExamLabel = new JLabel("Student Exam Credits: ");
        studentExamLabel.setOpaque(true);
        add(studentExamLabel);

        studentStudyAwayLabel = new JLabel("Student Studying Away: ");
        studentStudyAwayLabel.setOpaque(true);
        add(studentStudyAwayLabel);

        studentGpaLabel = new JLabel("Student GPA: ");
        studentGpaLabel.setOpaque(true);
        add(studentGpaLabel);

        studentAthleteLabel = new JLabel("Stuent Athlete: ");
        studentAthleteLabel.setOpaque(true);
        add(studentAthleteLabel);

        onSeasonLabel = new JLabel("In Season: ");
        onSeasonLabel.setOpaque(true);
        add(onSeasonLabel);

        kindOfSportLabel = new JLabel("Sport: ");
        kindOfSportLabel.setOpaque(true);
        add(kindOfSportLabel);

        workStudyLabel = new JLabel("Work Study: ");
        workStudyLabel.setOpaque(true);
        add(workStudyLabel);

        commServiceLabel = new JLabel("Community Service: ");
        commServiceLabel.setOpaque(true);
        add(commServiceLabel);


        studentIndexField = new JTextField("0");
        add(studentIndexField);
        
        studentIndexField.addActionListener(new StudentIndexListener());

        backwardButton = new JButton("<=");
        add(backwardButton);

        backwardButton.addActionListener(new ThirdStudentIndexListener());


        forwardStudents = new JButton("=>");
        add(forwardStudents);

        forwardStudents.addActionListener(new NextStudentIndexListener());

        displayColor = new JCheckBox("Dispaly Label Color");
        add(displayColor);

        displayColor.addActionListener(new DisplayColorListener());

        analyze1Choice = new JRadioButton("High Guilford Credits");
        add(analyze1Choice);

        analyze2Choice = new JRadioButton("High Guilford Credits and Athlete");
        add(analyze2Choice);

        analyze3Choice = new JRadioButton("High GPA or Study Away");
        add(analyze3Choice);

        analyzeButtonGroup = new ButtonGroup();

        analyzeButtonGroup.add(analyze1Choice);
        analyzeButtonGroup.add(analyze2Choice);
        analyzeButtonGroup.add(analyze3Choice);

        analyze1Choice.setSelected(true);

        RadioButtonListener rbListener = new RadioButtonListener();

        analyze1Choice.addActionListener(rbListener);
        analyze2Choice.addActionListener(rbListener);
        analyze3Choice.addActionListener(rbListener);

        studentSlider = new JSlider(0, students.size() - 1, 0);
        add(studentSlider);

        studentSlider.setPaintLabels(true);
        studentSlider.setPaintTicks(true);
        studentSlider.setMajorTickSpacing(4000);
        studentSlider.setMinorTickSpacing(1000);

        studentSlider.addChangeListener(new SliderListener());

        studentNumberLabel = new JLabel("Selected Student: ");
        studentNumberLabel.setOpaque(true);
        add(studentNumberLabel);


    }
      

      private void changeLabelColor() {
        if (displayColor.isSelected()) {
            int redGuilford = (int)(students.get(studentIndex).getGuilfordCredits() * 1.5 + 90);
            guilfordCreditsLabel.setBackground(new Color(redGuilford, 0, 0));

            int greenTransfer = (int)(students.get(studentIndex).getTransferCredits() * 1.5 + 90 );
            transferCreditsLabel.setBackground(new Color(0, greenTransfer, 0));


            int pointColor = (int)(students.get(studentIndex).calculatePoints() * 25 + 50);
            studentPointsLabel.setBackground(new Color(0, 0, pointColor));

            int grayTotalCredits = (int)(students.get(studentIndex).calcTotalCredits() * 1 - 20);
            studentTotalCreditsLabel.setBackground(new Color(20, 100, grayTotalCredits));

            int pinkExamCredits = (int)(students.get(studentIndex).getExamCredits()* 1.5 + 90);
            studentExamLabel.setBackground(new Color(pinkExamCredits, 50, 180));

            int whiteStudentGpa = (int)(students.get(studentIndex).getStudentGpa() * 2 + 100);
            studentGpaLabel.setBackground(new Color(120, whiteStudentGpa, 50));
        }
        else {
            guilfordCreditsLabel.setBackground(this.getBackground());
            transferCreditsLabel.setBackground(this.getBackground());
            studentPointsLabel.setBackground(this.getBackground());
            studentTotalCreditsLabel.setBackground(this.getBackground());
            studentExamLabel.setBackground(this.getBackground());
            studentGpaLabel.setBackground(this.getBackground());
        }

      }

      private void analyzeStudentLabelSet() {
        Student student = students.get(studentIndex);

        if (selectedButton == analyze1Choice) {
            analyzeStudentLabel.setText("High Guilford Credits: " + student.analyzeGuilfordCredits());
        } else if (selectedButton == analyze2Choice) {
            analyzeStudentLabel.setText("High Guilford Credits/Athlete: " + student.analyzeGuilfordCreditsAthlete());
        }else if (selectedButton == analyze3Choice) {
            analyzeStudentLabel.setText("High GPA or Study away: " + student.analyzeGPAStudyAway());
        }

      }

      private void updateIndex() {
                                        //implements specification 10
        if (studentIndex < 0) {
            studentIndex = 0;
         } else if (studentIndex >= students.size()){
             studentIndex = students.size() - 1;
         }

         guilfordCreditsLabel.setText("Guilford Credits: " + String.format("%.2f", students.get(studentIndex).getGuilfordCredits()));

         transferCreditsLabel.setText("Transfer Credits: " + String.format("%.2f", students.get(studentIndex).getTransferCredits()));

         studentPointsLabel.setText("Student Priority Points: " + students.get(studentIndex).calculatePoints());

         studentNumberLabel.setText("Selected Student: " + studentIndex);

         studentIdLabel.setText("Student ID: " + students.get(studentIndex).getStudentID());

         studentTotalCreditsLabel.setText("Student Total Credits: " + String.format("%.2f", students.get(studentIndex).calcTotalCredits()));

         studentExamLabel.setText("Student Exam Credits: " + String.format("%.2f", students.get(studentIndex).getExamCredits()));

         studentStudyAwayLabel.setText("Studying Away: " + students.get(studentIndex).getStudyingAway());

         studentGpaLabel.setText("Student GPA: " + String.format("%.2f", students.get(studentIndex).getStudentGpa()));

         studentAthleteLabel.setText("Student Athlete: " + students.get(studentIndex).getStudentAthlete());

         onSeasonLabel.setText("In Season: " + students.get(studentIndex).getOnSeason());

         kindOfSportLabel.setText("Sport: " + students.get(studentIndex).getKindOfSport());

         workStudyLabel.setText("Work Study: " + students.get(studentIndex).getWorkStudy());

         commServiceLabel.setText("Community Service: " + students.get(studentIndex).getCommService());

         studentIndexField.setText("" + studentIndex);

         changeLabelColor();
         analyzeStudentLabelSet();

         

      }
        
    
       //Implements specification 9
      private class StudentIndexListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                studentIndex = Integer.parseInt(studentIndexField.getText());

                updateIndex();
                
            }
            
        }
        
        private class NextStudentIndexListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
               
                studentIndex = studentIndex + 1;
                

                 updateIndex();


            }

           
            

        }
    
        private class ThirdStudentIndexListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                studentIndex = studentIndex - 1;

                updateIndex();
            }
            
        }

        private class DisplayColorListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
                changeLabelColor();
            }

            
        }

        private class RadioButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
                selectedButton = (JRadioButton) e.getSource();
                analyzeStudentLabelSet();
            }
            
        }

        private class SliderListener implements ChangeListener {

            @Override
            public void stateChanged(ChangeEvent e) {
                // TODO Auto-generated method stub
                
                studentIndex = studentSlider.getValue();
                updateIndex();

            }

            
        }

    




}
