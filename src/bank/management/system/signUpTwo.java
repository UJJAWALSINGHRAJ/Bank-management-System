package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signUpTwo extends JFrame implements ActionListener {
    
    JTextField pan , aadhar;
    JButton next;
    JRadioButton Syes, Sno, eyes, eno;
    JComboBox religion, category,occupation, education, income ;
    String formno;
    
    signUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails= new JLabel("page 2: Additional Details ");
        additionalDetails.setFont(new Font("Relaway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
        JLabel name= new JLabel("Religion:");
        name.setFont(new Font("Relaway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
       
                
        JLabel fname= new JLabel("Category:");
        fname.setFont(new Font("Relaway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30); 
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob= new JLabel("Income:");
        dob.setFont(new Font("Relaway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomecategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30); 
        income.setBackground(Color.WHITE);
        add(income);
       
        JLabel gender= new JLabel("Educational:");
        gender.setFont(new Font("Relaway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
       
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Others"};
        education= new JComboBox( educationValues);
        education.setBounds(300,315,400,30); 
        education.setBackground(Color.WHITE);
        add(education);
        
 
        JLabel marital= new JLabel("Occupation:");
        marital.setFont(new Font("Relaway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30); 
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel pannumber= new JLabel("PAN Number:");
        pannumber.setFont(new Font("Relaway",Font.BOLD,20));
        pannumber.setBounds(100,440,400,30);
        add(pannumber);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel aadharnumber= new JLabel("Aadhar Number:");
        aadharnumber.setFont(new Font("Relaway",Font.BOLD,20));
        aadharnumber.setBounds(100,490,200,30);
        add(aadharnumber);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Relaway",Font.BOLD,20));
        senior.setBounds(100,540,200,30);
        add(senior);
        
        Syes= new JRadioButton("Yes");
        Syes.setBounds(300,540,100,30);
        Syes.setBackground(Color.WHITE);
        add(Syes);
        
        Sno = new JRadioButton("No");
        Sno.setBounds(450,540,100,30);
        Sno.setBackground(Color.WHITE);
        add(Sno);
        
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(Syes);
        seniorcitizengroup.add(Sno);
       
        
        JLabel existing= new JLabel("Existing Account:");
        existing.setFont(new Font("Relaway",Font.BOLD,20));
        existing.setBounds(100,590,200,30);
        add(existing);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existingaccountgroup = new ButtonGroup();
        existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);
        
        
       
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont( new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String  sreligion = (String) religion.getSelectedItem();
        String  scategory = (String) category.getSelectedItem();
        String  sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        
        if(Syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(Sno.isSelected()){
        seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount = "yes";
        }else if (eno.isSelected()){
           existingaccount = "no";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try{
           
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"','"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            //SignUp3 object
            setVisible(false);
            new signUpThree(formno).setVisible(true);
        } catch (Exception e) {
        System.out.println(e);
        }
    }
    public static void main(String args[]){
        new signUpTwo("");
    }
}
