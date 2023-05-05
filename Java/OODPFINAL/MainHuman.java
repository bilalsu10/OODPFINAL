package Java.OODPFINAL;
import java.util.Scanner;

public class MainHuman {
     public static void main(String[] args) {    
        System.out.println("\t\t\t\t\t\t\t\t---Welcome To Lala fitness---\n");
        int bookTime = table();
        int member = 0 ;
        System.out.println("\n                          ==========================================================================================================");
        while(member != 1 && member != 2){
            System.out.print("\nIf you are member type 1 if not type 2 : ");
            Scanner Scanner = new Scanner(System.in);  
            member = Scanner.nextInt();
        if(member == 1){
            memberLogin(bookTime);
        } else if(member == 2){
            nonmemberLogin(bookTime);
        }
     }
}
        
        
        

        
        
        
    

    public static int table (){
        
        int timescan = 0;
        System.out.println("\t\t\t\t\t\t\t        Time table for Booking fitness\n\n");
        System.out.println("\t8:30-10.30\t\t10.30-12.00\t\t12.00-14.00\t\t14.00-16.00\t\t16.00-18.00\t\t18.00-20.00");
        System.out.println("\tpress1\t\t\tpress2\t\t\tpress3\t\t\tpress4\t\t\tpress5\t\t\tpress6");
        System.out.println();
        while(timescan != 1 && timescan != 2 && timescan != 3 && timescan != 4 && timescan != 5 && timescan != 6){
            System.out.print("Press : ");
            Scanner Timescan = new Scanner(System.in);
            
            timescan = Timescan.nextInt();

        }
       
        return timescan;


    }
    public static Void memberLogin(int time){
        int count =0 ;
        System.out.print("Please enter your ID : ");
        Scanner Scanner = new Scanner(System.in);
        String ID = Scanner.nextLine();
        Member[] members = Member.getMembers();
        for (Member m : members){
         if (m.getid(ID).equals(ID)){
             showResult(m.showName(ID),time);
             count ++;
             break;
         }
    }
        if(count ==0){
            System.out.println("Your Id not match please try again\n");
            memberLogin(time);
        }





        return null;
    }

    public static Void nonmemberLogin(int time){
        System.out.print("Please enter your name : ");
        Scanner Scanner = new Scanner(System.in);
        String nonMemName = Scanner.nextLine();
        showResult(nonMemName,time);
        return null;

    }


    public static Void showResult(String name, int time){
        System.out.println("\n                          ==========================================================================================================");
        System.out.println("\t\t\t\t\t\t\tWelcome " + name + " great to see you again");
        switch (time){
            case 1:
             System.out.println("\t\t\t\t\t\t\t  Your time period in from 8:30-10:30");
             System.out.println("\t\t\t\t\t\t\t\t\tThank you");
             break;
            case 2:
             System.out.println("\t\t\t\t\t\t\t  Your time period in from 10:30-12:00");
             System.out.println("\t\t\t\t\t\t\t\t\tThank you");
             break;
            case 3:
             System.out.println("\t\t\t\t\t\t\t  Your time period in from 12:00-14:00");
             System.out.println("\t\t\t\t\t\t\t\t\tThank you");
             break;
            case 4:
             System.out.println("\t\t\t\t\t\t\t  Your time period in from 14:00-16:00");
             System.out.println("\t\t\t\t\t\t\t\t\tThank you");
             break;
            case 5:
             System.out.println("\t\t\t\t\t\t\t  Your time period in from 16:00-18:00");
             System.out.println("\t\t\t\t\t\t\t\t\tThank you");
             break;
            case 6:
             System.out.println("\t\t\t\t\t\t\t  Your time period in from 18:00-20:00");
             System.out.println("\t\t\t\t\t\t\t\t\tThank you");
             break;

            default : 
            System.out.println("\t\t\t\tThank You");
        }
        return null;


    }
}
  
   
