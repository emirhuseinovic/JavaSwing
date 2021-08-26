package com.company;




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
        popUpFrame.getTheObject().setSize(new Dimension(800, 600));
        popUpFrame.getTheObject().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //popUpFrame.getTheObject().setBounds(280, 120, 800, 600);



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
        plusPanel.getTheObject().setSize(new Dimension(800, 600));
        plusPanel.getTheObject().setBackground(Color.darkGray);
        plusPanel.getTheObject().setLayout(new GridBagLayout() );




/*
        MyFrame<JPanel> panelThree= new MyFrame <JPanel>(new JPanel());
        panelThree.getTheObject().setSize(new Dimension(300, 600));
        panelThree.getTheObject().setBackground(Color.black);

        MyFrame<JPanel> panelTop= new MyFrame<JPanel> (new JPanel());
        panelTop.getTheObject().setSize(new Dimension(1200, 600));
        panelTop.getTheObject().setBackground(Color.red);
*/
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
        labelBigPlus.getTheObject().setToolTipText("Novi podatak");


        // All other components
        MyFrame<JLabel> schoolYearLabel= new MyFrame<JLabel>(new JLabel("Školska godina"));
        schoolYearLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        schoolYearLabel.getTheObject().setForeground(Color.white);
        schoolYearLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);


        MyFrame<JTextField> schoolYearData= new MyFrame<JTextField>(new JTextField(20));
        schoolYearData.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        schoolYearData.getTheObject().setBackground(Color.darkGray);
        schoolYearData.getTheObject().setForeground(Color.white);
        schoolYearData.getTheObject().setPreferredSize(new Dimension(200,50));
        schoolYearData.getTheObject().setHorizontalAlignment(JTextField.CENTER);

        MyFrame<JTextField> currentDateData= new MyFrame<JTextField>(new JTextField(20));
        currentDateData.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.decode("#66d9ff")));
        currentDateData.getTheObject().setBackground(Color.darkGray);
        currentDateData.getTheObject().setForeground(Color.white);
        currentDateData.getTheObject().setPreferredSize(new Dimension(200,50));
        currentDateData.getTheObject().setHorizontalAlignment(JTextField.CENTER);

        MyFrame<JLabel> currentDateLabel= new MyFrame<JLabel>(new JLabel("Datum upisa"));
        currentDateLabel.getTheObject().setPreferredSize(new Dimension(200,50));
        currentDateLabel.getTheObject().setForeground(Color.white);
        currentDateLabel.getTheObject().setHorizontalAlignment(JLabel.CENTER);

        MyFrame<JButton> nextButton= new MyFrame<JButton>(new JButton("Dalje"));
        nextButton.getTheObject().setForeground(Color.decode("#66d9ff"));
        nextButton.getTheObject().setPreferredSize(new Dimension(200,50));
        nextButton.getTheObject().setBackground(Color.darkGray);

        String [] schoolYears= {"2021/2022","2022/2023", "2023/2024", "2024/2025", "2025/2026" };
        MyFrame<JComboBox> schoolYearsListData= new MyFrame<JComboBox>(new JComboBox(schoolYears));
        schoolYearsListData.getTheObject().setPreferredSize(new Dimension(200,50));
        schoolYearsListData.getTheObject().setBackground(Color.darkGray);
        schoolYearsListData.getTheObject().setForeground(Color.white);
        schoolYearsListData.getTheObject().setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#66d9ff")));












        // Add to plusPanel
        //plusPanel.getTheObject().add(schoolYearData.getTheObject());
        // plusPanel.getTheObject().add(schoolYearLabel.getTheObject());

        constraints.gridx=0;
        constraints.gridy=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        plusPanel.getTheObject().add(schoolYearsListData.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=1;
        constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(schoolYearLabel.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=2;
        constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(currentDateData.getTheObject(), constraints);

        constraints.gridx=0;
        constraints.gridy=3;
        constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(currentDateLabel.getTheObject(), constraints);

        constraints.gridx=2;
        constraints.gridy=4;
        constraints.insets=new Insets(10,0,0,0);
        plusPanel.getTheObject().add(nextButton.getTheObject(), constraints);



        // Add to main JPanel
        mainPanelObj.getTheObject().add(sidePanel.getTheObject(), BorderLayout.WEST);
        mainPanelObj.getTheObject().add(labelBigPlus.getTheObject(),BorderLayout.CENTER);
        // mainPanelObj.getTheObject().add(plusPanel.getTheObject(), BorderLayout.CENTER);

        // Adding icons to panelOne
        sidePanel.getTheObject().add(labelIconOne.getTheObject());
        sidePanel.getTheObject().add(labelIconThree.getTheObject());
        sidePanel.getTheObject().add(labelIconTwo.getTheObject());
        sidePanel.getTheObject().add(labelIconFour.getTheObject());
        //mainPanelObj.getTheObject().add(panelTwo.getTheObject());
        //mainPanelObj.getTheObject().add(panelThree.getTheObject());
        //mainPanelObj.getTheObject().add(panelTop.getTheObject());


        // Add to JFrame
        obj.getTheObject().add(mainPanelObj.getTheObject());
        popUpFrame.getTheObject().add(plusPanel.getTheObject());

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




    }

}
