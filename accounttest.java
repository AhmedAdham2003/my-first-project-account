package account;
import java.util.Date;
import java.util.Scanner;
public class accounttest {
		int acc_no;  
		String name;  
		float amount;
		String phone;
	
     //Method to initialize object  
		void insert(int a,String n,float amt, String mobile){  
		acc_no=a;  
		name=n;  
		amount=amt;
		phone=mobile;
		}  
		//deposit method  
		void deposit(float amt){  
		amount=amount+amt;  
		System.out.println(amt+" deposited");  
		}  
		//withdraw method  
		void withdraw(float amt){  
		if(amount<amt){  
		System.out.println("Insufficient Balance");  
		}else{  
		amount=amount-amt;  
		System.out.println(amt+" withdrawn");  
		}  
		}  

	    //method to check the balance of the account  
		void checkBalance(){System.out.println("Balance is: "+amount);}  
		//method to display the values of an object  
		void display(){System.out.println(acc_no+" "+name+" "+amount+" " +phone);}  
 

//Creating a test class to deposit and withdraw amount  
	
	public static void main(String[] args) {
		
		 // add Date of operation
		System.out.print("Current Date is:    ");
 		Date date = new Date();
 		System.out.println( date );
		
		
		Scanner input = new Scanner(System.in);         		                                  
        int number = 0;                                        
         try {
        	System.out.println("==========================================================");
        	System.out.println("chose one there :  1. Deposite"+"  " +"2.Withdraw"+"   "+"3.Balance");
        	System.out.println("==========================================================");
        	System.out.print("Input your chose & click Enter key: ");     
            number = input.nextInt(); }                     
            finally {                                       
                input.close();
        if (number>3) {
			System.out.println("invalid chose try again");
			
		} 			
		int chose = number;
		acount a1=new acount(); 
        String chosen;
      		switch (chose) {
            case 1:  number = 0;
            System.out.println("operation is deposite");
            a1.insert(832345,"Muhammed",3000,"7704261264"); 
			a1.display(); 
                     break;
            
            case 2:  chosen = "";
            System.out.println("operation is withdraw");
            a1.deposit(40000);  
			//a1.checkBalance();  
			a1.withdraw(15000);  
			a1.checkBalance();
             break;
            case 3:  chosen = "";
            System.out.println("operation is check balance");
            a1.checkBalance();
                     break;
        }
            		 
            }		 
	
	}
}
