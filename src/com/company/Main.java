package com.company;




import com.toedter.calendar.JCalendar;

import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.*;
import java.util.List;

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

        MyFrame <JFrame> popUpFrameThree= new MyFrame<JFrame> (new JFrame());
        popUpFrameThree.getTheObject().setSize(new Dimension(1280, 768));
        popUpFrameThree.getTheObject().setTitle("Uspjeh");
        popUpFrameThree.getTheObject().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //ImageIcon jFrameIcon=new ImageIcon("/home/emir/IdeaProjects/JavaSwingApp/src/com/company/boat(1).png");
        //popUpFrameThree.getTheObject().setIconImage(jFrameIcon.getImage());

        //<div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        ////"Icon made by Freepik from www.flaticon.com"
        // Creating layouts
        BorderLayout borderLayout=new BorderLayout();
        GridLayout gridLayout= new GridLayout(0,3,10,10);
        Box verticalBox=Box.createVerticalBox();
        verticalBox.setSize(new Dimension(100,50));
        GridBagConstraints constraints= new GridBagConstraints();



        // Set main JPanel
        MyFrame <JPanel> mainPanelObj= new <JPanel> MyFrame(new JPanel());
        mainPanelObj.getTheObject().setSize(new Dimension(1280,768));
        mainPanelObj.getTheObject().setBackground(Color.darkGray);
        mainPanelObj.getTheObject().setLayout(borderLayout);

        // Set JPanels
        MyFrame<JPanel> sidePanel= new MyFrame <JPanel>(new JPanel());
        sidePanel.getTheObject().setSize(new Dimension(180, 768));
        sidePanel.getTheObject().setBackground(Color.decode("#1a1a1a"));
        sidePanel.getTheObject().setLayout(new GridLayout(6,1,10, 10));

        MyFrame<JPanel> plusPanel= new MyFrame <JPanel>(new JPanel());
        plusPanel.getTheObject().setSize(new Dimension(1280, 768));
        plusPanel.getTheObject().setBackground(Color.darkGray);
        plusPanel.getTheObject().setLayout(new GridBagLayout() );

        MyFrame<JPanel> plusPanelTwo= new MyFrame <JPanel>(new JPanel());
        plusPanelTwo.getTheObject().setSize(new Dimension(1280, 768));
        plusPanelTwo.getTheObject().setBackground(Color.darkGray);
        plusPanelTwo.getTheObject().setLayout(new GridBagLayout() );

        MyFrame<JPanel> plusPanelThree= new MyFrame <JPanel>(new JPanel());
        plusPanelThree.getTheObject().setSize(new Dimension(1280, 768));
        plusPanelThree.getTheObject().setBackground(Color.darkGray);
        plusPanelThree.getTheObject().setLayout(new GridBagLayout() );


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

        ImageIcon calendarIcon= new ImageIcon("/home/emir/IdeaProjects/JavaSwingApp/src/com/company/calendar.png");
        JLabel calendarIconLabel= new JLabel(calendarIcon);
        calendarIconLabel.setPreferredSize(new Dimension(32,32));
        // <div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
        // "Icon made by Freepik perfect from www.flaticon.com"


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

        // Components for plusPanelThree
        MyFrame<JLabel> sixthGradeLabel= new MyFrame<>(new JLabel("Opšti uspjeh 6. razred"));
        sixthGradeLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        sixthGradeLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        sixthGradeLabel.getTheObject().setBackground(Color.DARK_GRAY);
        sixthGradeLabel.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> gradesVi= new MyFrame<>(new Double[9]);
        gradesVi.getTheObject()[0]=5.0;
        gradesVi.getTheObject()[1]=4.9;
        gradesVi.getTheObject()[2]=4.8;
        gradesVi.getTheObject()[3]=4.7;
        gradesVi.getTheObject()[4]=4.6;
        gradesVi.getTheObject()[5]=4.5;
        gradesVi.getTheObject()[6]=4.0;
        gradesVi.getTheObject()[7]=3.0;
        gradesVi.getTheObject()[8]=2.0;

        MyFrame<JComboBox> gradesData= new MyFrame<JComboBox>(new JComboBox(gradesVi.getTheObject()));
        gradesData.getTheObject().setPreferredSize(new Dimension(200,50));
        gradesData.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> seventhGradeLabel= new MyFrame<>(new JLabel("Opšti uspjeh 7. razred"));
        seventhGradeLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        seventhGradeLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        seventhGradeLabel.getTheObject().setBackground(Color.DARK_GRAY);
        seventhGradeLabel.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> gradesVII= new MyFrame<>(new Double[9]);
        gradesVII.getTheObject()[0]=5.0;
        gradesVII.getTheObject()[1]=4.9;
        gradesVII.getTheObject()[2]=4.8;
        gradesVII.getTheObject()[3]=4.7;
        gradesVII.getTheObject()[4]=4.6;
        gradesVII.getTheObject()[5]=4.5;
        gradesVII.getTheObject()[6]=4.0;
        gradesVII.getTheObject()[7]=3.0;
        gradesVII.getTheObject()[8]=2.0;

        MyFrame<JComboBox> gradesDataVII= new MyFrame<JComboBox>(new JComboBox(gradesVII.getTheObject()));
        gradesDataVII.getTheObject().setPreferredSize(new Dimension(200,50));
        gradesDataVII.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> eightGradeLabel= new MyFrame<>(new JLabel("Opšti uspjeh 8. razred"));
        eightGradeLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        eightGradeLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        eightGradeLabel.getTheObject().setBackground(Color.DARK_GRAY);
        eightGradeLabel.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> gradesVIII= new MyFrame<>(new Double[9]);
        gradesVIII.getTheObject()[0]=5.0;
        gradesVIII.getTheObject()[1]=4.9;
        gradesVIII.getTheObject()[2]=4.8;
        gradesVIII.getTheObject()[3]=4.7;
        gradesVIII.getTheObject()[4]=4.6;
        gradesVIII.getTheObject()[5]=4.5;
        gradesVIII.getTheObject()[6]=4.0;
        gradesVIII.getTheObject()[7]=3.0;
        gradesVIII.getTheObject()[8]=2.0;

        MyFrame<JComboBox> gradesDataVIII= new MyFrame<JComboBox>(new JComboBox(gradesVIII.getTheObject()));
        gradesDataVIII.getTheObject().setPreferredSize(new Dimension(200,50));
        gradesDataVIII.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> ninthGradeLabel= new MyFrame<>(new JLabel("Opšti uspjeh 9. razred"));
        ninthGradeLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        ninthGradeLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        ninthGradeLabel.getTheObject().setBackground(Color.DARK_GRAY);
        ninthGradeLabel.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> gradesIX= new MyFrame<>(new Double[9]);
        gradesIX.getTheObject()[0]=5.0;
        gradesIX.getTheObject()[1]=4.9;
        gradesIX.getTheObject()[2]=4.8;
        gradesIX.getTheObject()[3]=4.7;
        gradesIX.getTheObject()[4]=4.6;
        gradesIX.getTheObject()[5]=4.5;
        gradesIX.getTheObject()[6]=4.0;
        gradesIX.getTheObject()[7]=3.0;
        gradesIX.getTheObject()[8]=2.0;

        MyFrame<JComboBox> gradesDataIX= new MyFrame<JComboBox>(new JComboBox(gradesVIII.getTheObject()));
        gradesDataIX.getTheObject().setPreferredSize(new Dimension(200,50));
        gradesDataIX.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<Double []> relSubjList= new MyFrame<>(new Double[4]);
        relSubjList.getTheObject()[0]=5.0;
        relSubjList.getTheObject()[1]=4.0;
        relSubjList.getTheObject()[2]=3.0;
        relSubjList.getTheObject()[3]=2.0;



        MyFrame<JComboBox> relSubj1= new MyFrame<JComboBox>(new JComboBox(relSubjList.getTheObject()));
        relSubj1.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj1.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> relSubj8Gr= new MyFrame<>(new JLabel("Relevantni predmet I (VIII)"));
        relSubj8Gr.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj8Gr.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        relSubj8Gr.getTheObject().setBackground(Color.DARK_GRAY);
        relSubj8Gr.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> relSubjList2= new MyFrame<>(new Double[4]);
        relSubjList2.getTheObject()[0]=5.0;
        relSubjList2.getTheObject()[1]=4.0;
        relSubjList2.getTheObject()[2]=3.0;
        relSubjList2.getTheObject()[3]=2.0;

        MyFrame<JComboBox> relSubj2= new MyFrame<JComboBox>(new JComboBox(relSubjList2.getTheObject()));
        relSubj2.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj2.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> relSubj8Gr2= new MyFrame<>(new JLabel("Relevantni predmet II (VIII)"));
        relSubj8Gr2.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj8Gr2.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        relSubj8Gr2.getTheObject().setBackground(Color.DARK_GRAY);
        relSubj8Gr2.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> relSubjList3= new MyFrame<>(new Double[4]);
        relSubjList3.getTheObject()[0]=5.0;
        relSubjList3.getTheObject()[1]=4.0;
        relSubjList3.getTheObject()[2]=3.0;
        relSubjList3.getTheObject()[3]=2.0;

        MyFrame<JComboBox> relSubj3= new MyFrame<JComboBox>(new JComboBox(relSubjList3.getTheObject()));
        relSubj3.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj3.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> relSubj8Gr3= new MyFrame<>(new JLabel("Relevantni predmet III (VIII)"));
        relSubj8Gr3.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj8Gr3.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        relSubj8Gr3.getTheObject().setBackground(Color.DARK_GRAY);
        relSubj8Gr3.getTheObject().setForeground(Color.gray);



        MyFrame<Double []> relSubjList4= new MyFrame<>(new Double[4]);
        relSubjList4.getTheObject()[0]=5.0;
        relSubjList4.getTheObject()[1]=4.0;
        relSubjList4.getTheObject()[2]=3.0;
        relSubjList4.getTheObject()[3]=2.0;

        MyFrame<JComboBox> relSubj4= new MyFrame<JComboBox>(new JComboBox(relSubjList4.getTheObject()));
        relSubj4.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj4.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> relSubj9Gr= new MyFrame<>(new JLabel("Relevantni predmet I (IX)"));
        relSubj9Gr.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj9Gr.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        relSubj9Gr.getTheObject().setBackground(Color.DARK_GRAY);
        relSubj9Gr.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> relSubjList5= new MyFrame<>(new Double[4]);
        relSubjList5.getTheObject()[0]=5.0;
        relSubjList5.getTheObject()[1]=4.0;
        relSubjList5.getTheObject()[2]=3.0;
        relSubjList5.getTheObject()[3]=2.0;

        MyFrame<JComboBox> relSubj5= new MyFrame<JComboBox>(new JComboBox(relSubjList5.getTheObject()));
        relSubj5.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj5.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> relSubj9Gr2= new MyFrame<>(new JLabel("Relevantni predmet II (IX)"));
        relSubj9Gr2.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj9Gr2.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        relSubj9Gr2.getTheObject().setBackground(Color.DARK_GRAY);
        relSubj9Gr2.getTheObject().setForeground(Color.gray);

        MyFrame<Double []> relSubjList6= new MyFrame<>(new Double[4]);
        relSubjList6.getTheObject()[0]=5.0;
        relSubjList6.getTheObject()[1]=4.0;
        relSubjList6.getTheObject()[2]=3.0;
        relSubjList6.getTheObject()[3]=2.0;

        MyFrame<JComboBox> relSubj6= new MyFrame<JComboBox>(new JComboBox(relSubjList6.getTheObject()));
        relSubj6.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj6.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));

        MyFrame<JLabel> relSubj9Gr3= new MyFrame<>(new JLabel("Relevantni predmet III (IX)"));
        relSubj9Gr3.getTheObject().setPreferredSize(new Dimension(200,50));
        relSubj9Gr3.getTheObject().setHorizontalAlignment(JLabel.CENTER);
        relSubj9Gr3.getTheObject().setBackground(Color.DARK_GRAY);
        relSubj9Gr3.getTheObject().setForeground(Color.gray);

        JCheckBox internationalComp= new JCheckBox("Međunarnodno takmičenje");
        internationalComp.setPreferredSize(new Dimension(250,50));
        internationalComp.setBackground(Color.darkGray);
        internationalComp.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        internationalComp.setForeground(Color.lightGray);

        JCheckBox federalComp= new JCheckBox("Federalno takmičenje");
        federalComp.setPreferredSize(new Dimension(250,50));
        federalComp.setBackground(Color.darkGray);
        federalComp.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        federalComp.setForeground(Color.lightGray);

        JCheckBox cantonalComp= new JCheckBox("Kantonalno takmičenje");
        cantonalComp.setPreferredSize(new Dimension(250,50));
        cantonalComp.setBackground(Color.darkGray);
        cantonalComp.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        cantonalComp.setForeground(Color.lightGray);

        JCheckBox specialDiplom= new JCheckBox("Posebna diploma");
        specialDiplom.setPreferredSize(new Dimension(250,50));
        specialDiplom.setBackground(Color.darkGray);
        specialDiplom.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        specialDiplom.setForeground(Color.lightGray);

        MyFrame<JButton> backButtonPoPThree= new MyFrame<JButton>(new JButton("Nazad"));
        backButtonPoPThree.getTheObject().setForeground(Color.decode("#66d9ff"));
        backButtonPoPThree.getTheObject().setPreferredSize(new Dimension(200,50));
        backButtonPoPThree.getTheObject().setBackground(Color.darkGray);

        MyFrame<JButton> finishButtonPoPThree= new MyFrame<JButton>(new JButton("Zavši unos"));
        finishButtonPoPThree.getTheObject().setForeground(Color.decode("#66d9ff"));
        finishButtonPoPThree.getTheObject().setPreferredSize(new Dimension(200,50));
        finishButtonPoPThree.getTheObject().setBackground(Color.darkGray);


       /* ImageIcon badgeIcon= new ImageIcon("/home/emir/IdeaProjects/JavaSwingApp/src/com/company/badge.png");
        JLabel badgeIconLabel= new JLabel(badgeIcon);
        badgeIconLabel.setPreferredSize(new Dimension(32,32));
        badgeIconLabel.setBounds(600,200, 32,32);

         <div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
         "Icon made by Freepik perfect from www.flaticon.com"

*/

        // Add to plusPanel
        constraints.gridx=0;
        constraints.gridy=0;
       // constraints.insets=new Insets(0,100,0, 0);
        plusPanel.getTheObject().add(schoolYearsListData.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=1;
        //constraints.insets=new Insets(0,200,0,0);
        plusPanel.getTheObject().add(schoolYearLabel.getTheObject(), constraints);


        constraints.gridx=0;
        constraints.gridy=2;
        //constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(jCalendar.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=3;
       // constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(currentDateLabel.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=4;
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

        // Add to plusPanelThree
        constraints.gridx=0;
        constraints.gridy=0;
        plusPanelThree.getTheObject().add(gradesData.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=0;
        plusPanelThree.getTheObject().add(sixthGradeLabel.getTheObject(),constraints);

        constraints.gridx=0;
        constraints.gridy=2;
        plusPanelThree.getTheObject().add(gradesDataVII.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=3;
        plusPanelThree.getTheObject().add(seventhGradeLabel.getTheObject(),constraints);

        constraints.gridx=0;
        constraints.gridy=4;
        plusPanelThree.getTheObject().add(gradesDataVIII.getTheObject(), constraints);


        constraints.gridx=0;
        constraints.gridy=5;
        plusPanelThree.getTheObject().add(eightGradeLabel.getTheObject(),constraints);

        constraints.gridx=1;
        constraints.gridy=0;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj1.getTheObject(),constraints);

        constraints.gridx=1;
        constraints.gridy=1;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj8Gr.getTheObject(),constraints);

        constraints.gridx=1;
        constraints.gridy=2;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj2.getTheObject(),constraints);

        constraints.gridx=1;
        constraints.gridy=3;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj8Gr2.getTheObject(),constraints);

        constraints.gridx=1;
        constraints.gridy=4;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj3.getTheObject(),constraints);

        constraints.gridx=1;
        constraints.gridy=5;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj8Gr3.getTheObject(),constraints);

        constraints.gridx=2;
        constraints.gridy=0;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj4.getTheObject(),constraints);

        constraints.gridx=2;
        constraints.gridy=1;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj9Gr.getTheObject(),constraints);

        constraints.gridx=2;
        constraints.gridy=2;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj5.getTheObject(),constraints);

        constraints.gridx=2;
        constraints.gridy=3;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj9Gr2.getTheObject(),constraints);

        constraints.gridx=2;
        constraints.gridy=4;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj6.getTheObject(),constraints);

        constraints.gridx=2;
        constraints.gridy=5;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(relSubj9Gr3.getTheObject(),constraints);

        constraints.gridx=3;
        constraints.gridy=0;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(internationalComp,constraints);

        constraints.gridx=3;
        constraints.gridy=1;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(federalComp,constraints);

        constraints.gridx=3;
        constraints.gridy=2;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(cantonalComp,constraints);

        constraints.gridx=3;
        constraints.gridy=3;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(specialDiplom,constraints);

        constraints.gridx=2;
        constraints.gridy=6;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(backButtonPoPThree.getTheObject(),constraints);

        constraints.gridx=3;
        constraints.gridy=6;
        constraints.insets= new Insets(10,20,0, 0);
        plusPanelThree.getTheObject().add(finishButtonPoPThree.getTheObject(),constraints);


        //plusPanelThree.getTheObject().add(badgeIconLabel, constraints);





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
        popUpFrameThree.getTheObject().add(plusPanelThree.getTheObject());

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
            nextButtonPPT.getTheObject().addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    popUpFrameThree.getTheObject().setVisible(true);
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
