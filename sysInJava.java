package systemhop;

import java.util.Scanner;

public class sysInJava {
    public static void main(String[] args) {
        System.out.println("welcame in system bank !!");
        account  head = new account(0);
        head  = addHead(head);


    }
    public static account addHead(account head) {
        account newAccount = new account();
        newAccount.next = head ;
        head = newAccount ;
        return head ;
    }
    
}

class dates{
    int day ,moth,year ;
    public dates(int moth,int day,int year){
        this.day= day ;
        this.moth= moth;
        this.year = year ;
    }
}
class account{
    private String name;
    private String lastname ;
    private dates date ;
    private String level ;
    public  account next ;
 
    /**
     * 
     */
    public account(){
       try{ 
        System.out.println("inster inforamtoin  accoutn of  client  .");
        Scanner scanner = new Scanner(System.in);
        System.out.print(".. enter name :  ");
        this.name = scanner.nextLine();
        System.out.print("enter last name : "); 
        this.lastname = scanner.nextLine();
        System.out.print("enter level : ");
        this.level = scanner.nextLine();
        int day ,moth,year ;
        System.out.print("enter day : ");
        day = scanner.nextInt();
        System.out.print("enter moth :  ");
        moth = scanner.nextInt();
        System.out.print("enter year :  ");
        year = scanner.nextInt();

        this.date = new dates(day,moth,year);
     }
        catch{
            System.out.println("error!!");
        }
    }
    public account(int d){
        this.next = null ;

    }

}