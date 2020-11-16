package org.sci;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailCapacity;
    private String alternateMail;
    private String companyName = "BZNSoftware";


    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + firstName + " " + lastName);

        this.department = setDepartment();
        System.out.println("Department: " +department);

        password = randomPassword(9);
        System.out.println("Your password is: " + password );

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName + ".com";
        System.out.println("Your Email is: " +email);
    }

    private String setDepartment(){
        System.out.println("Select department:  \n1 for Management\n2 for Web Development \n3 for Mobile Development \n4 for Game Development\n Select number: " );
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice ==1) {return "ManagementTeam";}
        else if (departmentChoice == 2) {return "WebDevelopment";}
        else if (departmentChoice == 3) {return "MobileDevelopment";}
        else if (departmentChoice == 4) {return "GameDevelopment";}
        else {return "No department selected";}
    }

    private String randomPassword(int length){
        String passwordSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890!@#$%^&*()_+=?><4";
        char[] password = new char[length];
        for(int i =0;i<length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password) ;
    }

    private String generalInfo(){
        return  "Your general info is: "+ "\n" +"Full name " + firstName + " " + lastName +"\n" + "Company email: " + email +"\n" + "Mail Capacity "+ mailCapacity + " 2mb" ;
    }
    public void showGeneralInfo()
    {
        System.out.println(generalInfo());
    }


    public void  setMailBoxCapacity(int mailCapacity){ this.mailCapacity = mailCapacity;}

    public void setAlternateMail(String alternateMail){ this.alternateMail = alternateMail; }

    public void changePass(String password){ this.password = password; }

    public int getMailCapacity() {return mailCapacity; }

    public String getAltEmail(){return alternateMail;}

    public String getPassword(){return password; }

}
