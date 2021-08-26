package com.company;




import com.toedter.calendar.JCalendar;

import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Creating JFrame
        MyFrame <JFrame> obj= new MyFrame<JFrame> (new JFrame());
        obj.getTheObject().setSize(new Dimension(1280, 768));
        obj.getTheObject().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.getTheObject().setVisible(true);
        obj.getTheObject().setTitle("Glavni panel");

        MyFrame <JFrame> popUpFrame= new MyFrame<JFrame> (new JFrame());
        popUpFrame.getTheObject().setSize(new Dimension(1280, 768));
        popUpFrame.getTheObject().setTitle("Školska godina i datum upisa");
        popUpFrame.getTheObject().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        MyFrame <JFrame> popUpFrameTwo= new MyFrame<JFrame> (new JFrame());
        popUpFrameTwo.getTheObject().setSize(new Dimension(1280, 768));
        popUpFrameTwo.getTheObject().setTitle("Opšti podaci");
        popUpFrameTwo.getTheObject().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Creating layouts
        BorderLayout borderLayout=new BorderLayout();
        GridLayout gridLayout= new GridLayout(0,3,10,10);
        Box verticalBox=Box.createVerticalBox();
        verticalBox.setSize(new Dimension(100,50));
        GridBagConstraints constraints= new GridBagConstraints();



        // Set main JPanel
        MyFrame <JPanel> mainPanelObj= new <JPanel> MyFrame(new JPanel());
        mainPanelObj.getTheObject().setSize(new Dimension(1280,768));
        mainPanelObj.getTheObject().setBackground(Color.DARK_GRAY);
        mainPanelObj.getTheObject().setLayout(borderLayout);

        // Set JPanels
        MyFrame<JPanel> sidePanel= new MyFrame <JPanel>(new JPanel());
        sidePanel.getTheObject().setSize(new Dimension(180, 768));
        sidePanel.getTheObject().setBackground(Color.black);
        sidePanel.getTheObject().setLayout(new GridLayout(6,1,10, 10));

        MyFrame<JPanel> plusPanel= new MyFrame <JPanel>(new JPanel());
        plusPanel.getTheObject().setSize(new Dimension(1280, 768));
        plusPanel.getTheObject().setBackground(Color.darkGray);
        plusPanel.getTheObject().setLayout(new GridBagLayout() );

        MyFrame<JPanel> plusPanelTwo= new MyFrame <JPanel>(new JPanel());
        plusPanelTwo.getTheObject().setSize(new Dimension(1280, 768));
        plusPanelTwo.getTheObject().setBackground(Color.darkGray);
        plusPanelTwo.getTheObject().setLayout(new GridBagLayout() );


        // Creating icons
        // all icons wil be attributed in Credit page when the project is over
        ImageIcon iconPlus= new ImageIcon("/home/emir/IdeaProjects/D/src/com/company/plus(1).png");
        //<div>Icons made by <a href="https://www.flaticon.com/authors/pixel-perfect" title="Pixel perfect">Pixel perfect</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        //"Icon made by Pixel perfect from www.flaticon.com"
        MyFrame<JLabel> labelIconOne= new MyFrame<JLabel>(new JLabel(iconPlus));
        labelIconOne.getTheObject().setSize(new Dimension(32,32));
        labelIconOne.getTheObject().setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        labelIconOne.getTheObject().setToolTipText("Unos novih podataka");

        ImageIcon iconList=new ImageIcon("/home/emir/IdeaProjects/D/src/com/company/list(1).png");
        //<div>Icons made by <a href="https://icon54.com/" title="Pixel perfect">Pixel perfect</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        //"Icon made by Pixel perfect from www.flaticon.com"
        MyFrame<JLabel> labelIconTwo= new MyFrame<JLabel>(new JLabel(iconList));
        labelIconTwo.getTheObject().setSize(new Dimension(32,32));
        labelIconTwo.getTheObject().setToolTipText("Pregled unešenih podataka");

        ImageIcon iconDelete=new ImageIcon("/home/emir/IdeaProjects/D/src/com/company/delete(1).png");
        //<div>Icons made by <a href="https://www.flaticon.com/authors/pixelmeetup" title="Pixelmeetup">Pixelmeetup</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        //"Icon made by Pixelmeetup from www.flaticon.com"
        MyFrame<JLabel> labelIconThree= new MyFrame<JLabel>(new JLabel(iconDelete));
        labelIconThree.getTheObject().setSize(new Dimension(32,32));
        labelIconThree.getTheObject().setToolTipText("Brisanje podataka");

        ImageIcon iconShutDown=new ImageIcon("/home/emir/IdeaProjects/D/src/com/company/power-button(1).png");
        //<div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        //"Icon made by Freepik from www.flaticon.com"
        MyFrame<JLabel> labelIconFour= new MyFrame<JLabel>(new JLabel(iconShutDown));
        labelIconFour.getTheObject().setSize(new Dimension(32,32));
        labelIconFour.getTheObject().setToolTipText("Odjava");

        ImageIcon iconBigPlus=new ImageIcon("/home/emir/IdeaProjects/D/src/com/company/bigPlus.png");
        //<div>Icons made by <a href="https://www.flaticon.com/authors/pixel-perfect" title="Pixel perfect">Pixel perfect</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        //"Icon made by Pixel perfect from www.flaticon.com"
        MyFrame<JLabel> labelBigPlus= new MyFrame<JLabel>(new JLabel(iconBigPlus));
        labelBigPlus.getTheObject().setSize(new Dimension(64,64));
        labelBigPlus.getTheObject().setToolTipText("Za unos novog podatka pritisnite na oznaku + ili bilo gdje na sivom pravougaoniku");


        // All other components
        MyFrame<JLabel> schoolYearLabel= new MyFrame<JLabel>(new JLabel("Školska godina"));
        schoolYearLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        schoolYearLabel.getTheObject().setForeground(Color.gray);
        schoolYearLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);

        MyFrame<JLabel> currentDateLabel= new MyFrame<JLabel>(new JLabel("Datum upisa"));
        currentDateLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        currentDateLabel.getTheObject().setForeground(Color.gray);
        currentDateLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);

        MyFrame<JButton> nextButton= new MyFrame<JButton>(new JButton("Dalje"));
        nextButton.getTheObject().setForeground(Color.decode("#66d9ff"));
        nextButton.getTheObject().setPreferredSize(new Dimension(200,50));
        nextButton.getTheObject().setBackground(Color.darkGray);

        String [] schoolYears= {"2022/2023","2023/2024", "2024/2025", "2025/2026", "2026/2027" };
        MyFrame<JComboBox> schoolYearsListData= new MyFrame<JComboBox>(new JComboBox(schoolYears));
        schoolYearsListData.getTheObject().setPreferredSize(new Dimension(400,50));
        schoolYearsListData.getTheObject().setBackground(Color.darkGray);
        schoolYearsListData.getTheObject().setForeground(Color.white);
        schoolYearsListData.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));


        MyFrame <JCalendar> jCalendar= new MyFrame<>(new JCalendar());
        jCalendar.getTheObject().setBackground(Color.darkGray);
        jCalendar.getTheObject().setPreferredSize(new Dimension(400,200));
        jCalendar.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2, 0,Color.decode("#66d9ff")));


        // Components for plusPanelTwo
        MyFrame<JTextField> studentName=new MyFrame<JTextField>(new JTextField());
        studentName.getTheObject().setPreferredSize(new Dimension(400,50));
        studentName.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        studentName.getTheObject().setBackground(Color.darkGray);
        studentName.getTheObject().setForeground(Color.lightGray);
        studentName.getTheObject().setHorizontalAlignment(JTextField.CENTER);

        MyFrame<JLabel> studentNameLabel= new MyFrame<JLabel>(new JLabel("Ime"));
        studentNameLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        studentNameLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        studentNameLabel.getTheObject().setBackground(Color.DARK_GRAY);
        studentNameLabel.getTheObject().setForeground(Color.gray);

        MyFrame<JTextField> studentFatherName=new MyFrame<JTextField>(new JTextField());
        studentFatherName.getTheObject().setPreferredSize(new Dimension(400,50));
        studentFatherName.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        studentFatherName.getTheObject().setBackground(Color.darkGray);
        studentFatherName.getTheObject().setForeground(Color.lightGray);
        studentFatherName.getTheObject().setHorizontalAlignment(JTextField.CENTER);

        MyFrame<JLabel> studentFatherNameLabel= new MyFrame<JLabel>(new JLabel("Ime oca"));
        studentFatherNameLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        studentFatherNameLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        studentFatherNameLabel.getTheObject().setBackground(Color.DARK_GRAY);
        studentFatherNameLabel.getTheObject().setForeground(Color.gray);

        MyFrame<JTextField> studentSurname=new MyFrame<JTextField>(new JTextField());
        studentSurname.getTheObject().setPreferredSize(new Dimension(400,50));
        studentSurname.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        studentSurname.getTheObject().setBackground(Color.darkGray);
        studentSurname.getTheObject().setForeground(Color.lightGray);
        studentSurname.getTheObject().setHorizontalAlignment(JTextField.CENTER);


        MyFrame<JLabel> studentSurnameLabel= new MyFrame<JLabel>(new JLabel("Prezime"));
        studentSurnameLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        studentSurnameLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        studentSurnameLabel.getTheObject().setBackground(Color.DARK_GRAY);
        studentSurnameLabel.getTheObject().setForeground(Color.gray);

        MyFrame <JCalendar> dob= new MyFrame<>(new JCalendar());
        dob.getTheObject().setBackground(Color.darkGray);
        dob.getTheObject().setPreferredSize(new Dimension(400,200));
        dob.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2, 0,Color.decode("#66d9ff")));

        MyFrame<JLabel> dobLabel= new MyFrame<JLabel>(new JLabel("Datum rođenja"));
        dobLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        dobLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        dobLabel.getTheObject().setBackground(Color.DARK_GRAY);
        dobLabel.getTheObject().setForeground(Color.gray);

        MyFrame<JButton> nextButtonPPT= new MyFrame<JButton>(new JButton("Dalje"));
        nextButtonPPT.getTheObject().setForeground(Color.decode("#66d9ff"));
        nextButtonPPT.getTheObject().setPreferredSize(new Dimension(200,50));
        nextButtonPPT.getTheObject().setBackground(Color.darkGray);

        MyFrame<JButton> previousButtonPPT= new MyFrame<JButton>(new JButton("Nazad"));
        previousButtonPPT.getTheObject().setForeground(Color.decode("#66d9ff"));
        previousButtonPPT.getTheObject().setPreferredSize(new Dimension(200,50));
        previousButtonPPT.getTheObject().setBackground(Color.darkGray);



        // Add to plusPanel
        constraints.gridx=0;
        constraints.gridy=0;
        plusPanel.getTheObject().add(schoolYearsListData.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=1;
        //constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(schoolYearLabel.getTheObject(), constraints);


        constraints.gridx=0;
        constraints.gridy=3;
        //constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(jCalendar.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=4;
       // constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(currentDateLabel.getTheObject(), constraints);

        constraints.gridx=1;
        constraints.gridy=5;
       // constraints.insets=new Insets(10,50,0,0);
        plusPanel.getTheObject().add(nextButton.getTheObject(), constraints);

        // Add to plusPanelTwo

        constraints.gridx=0;
        constraints.gridy=0;
        constraints.insets= new Insets(10,0,0,0);
        plusPanelTwo.getTheObject().add(studentName.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=1;
        plusPanelTwo.getTheObject().add(studentNameLabel.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=2;
        plusPanelTwo.getTheObject().add(studentFatherName.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=3;
        plusPanelTwo.getTheObject().add(studentFatherNameLabel.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=4;
        plusPanelTwo.getTheObject().add(studentSurname.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=5;
        plusPanelTwo.getTheObject().add(studentSurnameLabel.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=6;
        plusPanelTwo.getTheObject().add(dob.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=7;
        plusPanelTwo.getTheObject().add(dobLabel.getTheObject(), constraints);

        constraints.gridx=1;
        constraints.gridy=8;
        plusPanelTwo.getTheObject().add(nextButtonPPT.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=8;
        plusPanelTwo.getTheObject().add(previousButtonPPT.getTheObject(), constraints);



        // Add to main JPanel
        mainPanelObj.getTheObject().add(sidePanel.getTheObject(), BorderLayout.WEST);
        mainPanelObj.getTheObject().add(labelBigPlus.getTheObject(),BorderLayout.CENTER);


        // Adding icons to panelOne
        sidePanel.getTheObject().add(labelIconOne.getTheObject());
        sidePanel.getTheObject().add(labelIconThree.getTheObject());
        sidePanel.getTheObject().add(labelIconTwo.getTheObject());
        sidePanel.getTheObject().add(labelIconFour.getTheObject());



        // Add to JFrame
        obj.getTheObject().add(mainPanelObj.getTheObject());
        popUpFrame.getTheObject().add(plusPanel.getTheObject());
        popUpFrameTwo.getTheObject().add(plusPanelTwo.getTheObject());

        // Event handlers
        labelIconOne.getTheObject().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("New entry");
                popUpFrame.getTheObject().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        labelBigPlus.getTheObject().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popUpFrame.getTheObject().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        nextButton.getTheObject().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popUpFrameTwo.getTheObject().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        previousButtonPPT.getTheObject().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popUpFrameTwo.getTheObject().setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });




    }

}
