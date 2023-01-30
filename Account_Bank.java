package Bank_Operations;
import java.util.*;
public class Account_Bank {

	Account A;
	String bName;
	
	Scanner sc = new Scanner(System.in);
	//constructor
	public Account_Bank(String bName) {
		this.bName=bName;
	}
	
	
   public void creatAccount(Account A) {
		if(this.A==null) {
			this.A=A;
			System.out.println(" Congratulations Your Account Opened Succeessffullyy...\n ");
		}else {
			System.out.println("Account Already Created...\n");
		}
	}
	

	
   public void deleteAccount() {
		if(this.A==null) {
			System.out.println("You Dont Have  Account Plz Open Account First : \n");
		}else{
			Scanner Sc= new Scanner (System.in);
			System.out.println("Enter Your Password ");
			int pass=Sc.nextInt();
			if(pass==A.getPswrd()) {
			this.A=null;
			System.out.println("Your Account Deleted Successfully...\n");
		}else {
			System.out.println("you entered wrong pass plz try again ..!");
		}
	  }
	}
	

   public void updateAccount() {
		if(this.A==null) {
			System.out.println("You Dont Have Account Plz Open Account First : \n");
		}else {
			Scanner Sc= new Scanner (System.in);
			System.out.println("Enter Your  Password :");
			int pswd=Sc.nextInt();
			if(A.getPswrd()==pswd) {
			System.out.println("Enter the Data To Update \n ");
			System.out.println("Enter Your New City : ");
			String city=Sc.next();
			A.setCity(city);
			System.out.println("Your city Will Be Updated Succesfully ...\n");
			System.out.println("Enter Your New Number : ");
			long number=Sc.nextLong();
			A.setCuNo(number);
			System.out.println("Your number Will Be Updated Succesfully ...\n");
		
			}
		}
	}
	
	
   public void displayDetails() {
		if(this.A==null) {
			System.out.println("Nothing To display Plz Open Account First : \n");
		}else{
			Scanner Sc= new Scanner (System.in);
			System.out.println("Enter Your Password ");
			int pass=Sc.nextInt();
			if(pass==A.getPswrd()) {
			System.out.println("Correct PAasword Here is You Details LIsted Below...");
			System.out.println( "----------------"+bName+"------------");
			System.out.println("Account Holder Name :" + A.getHoName());
			System.out.println("Account Number :"+ A.getAcNo());
			System.out.println("Account Bank city :"+ A.getCity());
			System.out.println("Account Bank IFSC Code :"+ A.getIfsc());
			System.out.println("Account Holder (Customer) Telephone Number :" + A.getCuNo()+"\n");
			System.out.println("---------------------------------------");
			
			}else {
				System.out.println(" Incorreect Password Entered...try again\n");
			}
		}
	}
	

	
     public void changePassword() {
		if(this.A==null) {
			System.out.println("You Dont Have Account Plz Open Account First :  \n");
		}else{
			
			
			Random ran = new Random();
			long num =ran.nextInt(1000000);
			System.out.println("Otp Send to your Number please enter otp..!");
			System.out.println("Your OTP is : "+num);
			
			System.out.println("Enter Your OTP : ");
			long otp = sc.nextInt();
			
			if(num==otp) {
			System.out.println("LOgin Successfull..!");
			
			Scanner Sc= new Scanner (System.in);
			System.out.println("Enter Your old Password ");
			int pass=Sc.nextInt();
			if(pass==A.getPswrd()) {
			 System.out.println("Enter Your New Password ");
			int newpass = Sc.nextInt();
			A.setPswrd(newpass);
			System.out.println(" Your new Password Updated Succesfully...\n");
			}else {
				System.out.println("Incorrect Password...try again\n");
			}
			
			}else {
				System.out.println("Wrong otp entered PLease Try Again ...!");
			}
			
			
		 }
	   }
	

    public void balanceEnquiry() {
	            	if(this.A==null) {
	        			System.out.println("You Dont Have Account To Show Data Plz Open Account First : \n");
	        		}else{
	        			Scanner Sc= new Scanner (System.in);
	        			System.out.println("Enter Your Password ");
	        			int pass=Sc.nextInt();
	        			if(pass==A.getPswrd()) {
	        			
	        			System.out.println("Your Account Balance Is : Rs"+ A.getAccBal()+"Cr");
	        		}else {
	        			System.out.println(" Wrong Password Entered...try again\n ");
	        		}
           	      }
	            }

   public void depositCash() {
                	  if(this.A==null) {
                		  System.out.println("You Dont Have Account Plz Open Account First : \n");
          	        	}else{
              			Scanner Sc = new Scanner (System.in);
              			System.out.println(" Enter Amount TO Deposit : ");
              			double damt = Sc.nextDouble();// damt= deposit amount
              			
              		double depositbal =A.getAccBal()+ damt;
              			A.setAccbal(depositbal);
              			System.out.println("Your Account Will Be Creditted With Amount " +damt +" \n");
              			System.out.println("Your New Account Balance Will Be : " + A.getAccBal());
              		}
	            }


       public void withdrawCash() {
            	  if(this.A==null) {
            		  System.out.println("You Dont Have Account Plz Open Account First : \n");
      	        	  		
            	  }else{
                    Scanner Sc= new Scanner (System.in);
        			System.out.println("Enter Your Password ");
        			int pass=Sc.nextInt();
        			if(pass==A.getPswrd()) {
        			
          			System.out.println(" Enter Amount TO Withdraw  : ");
          			double wamt = Sc.nextDouble();
          		if(wamt>A.getAccBal()) {//wamt = withdrawal amount
          			System.out.println(" Your Funds Are Not Sufficient \n");
          			System.out.println("Available Balance are : Rs "+A.getAccBal());
          			}else {
          			
          				System.out.println("Sure You Want to Withdraw Confirm PLease [Yes/No]");
          				String ans=sc.next();
          				if(ans.equalsIgnoreCase("no")) {
          					System.out.println(" Your Money NOt Debittedd..!");
          					
          				}else {
          				
          				
          				double bal = A.getAccBal()-wamt;
              			A.setAccbal(bal);
              			System.out.println("Your Account Will Be Debitted With Amount " + wamt +"\n");
              			
              			System.out.println("Your New Account Balance Will Be : " + A.getAccBal());
          				}
          		
          			}
          			}else {
          				System.out.println("You Entered Wrong Password  Plz Try Again....");
          			}	
          		}
             }
 
 
 public void  transferMoney() {
	System.out.println("Enter Amout To Be Transfer...\n ");
	Scanner Sc = new Scanner (System.in);
	double tamt =Sc.nextDouble();
	System.out.println("Enter Reciever Bank Name ...\n");
	String recBankname = Sc.next();
	
	//Money Debitted
	if(recBankname==this.bName) {
		System.out.println("done ");
	}
	
	if(tamt>A.getAccBal()) {
			System.out.println(" ohho  Your Funds Are Not Sufficient To Transfer ... \n");
			}else {
				System.out.println(" Enter Your Password ...\n");
				int pass = Sc.nextInt();
				if(pass==A.getPswrd()) {
				
				double bal = A.getAccBal()-tamt;
  			A.setAccbal(bal);
  			System.out.println("Your "+ this.bName + " Account Will Be Debitted With Amount " + tamt +"\n");
  			
  			System.out.println(" If It Is Not You,We Can't Do Anything Go to Your Bank :)(: ... \n");
  			
  			System.out.println("Your New Account Balance Will Be : " + A.getAccBal()+"\n");
		
	//money Creditted
	
		System.out.println("You  "+ recBankname  +" Account Will Be Creditted OF Amount "+tamt +"\n");
		double depositbal =A.getAccBal()+ tamt;
		A.setAccbal(depositbal);
		System.out.println("Your New Account Balance Will Be : " + A.getAccBal()+" \n");
			}else {
				System.out.println(" Your entered Wrong Password...Try again After Some time ...\n");
			}
		}
    }
}