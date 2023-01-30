package Bank_Operations;
import java.util.Scanner;
public class Account_Bank_Driver {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Which Bank You Wants to Open Account : ");
		String bankname =Sc.nextLine();
		System.out.println("Thats Nice Decision Now Go with Following Options...!");
		Account_Bank B1 =new Account_Bank(bankname); // Object - Account_Bank Class
				boolean exit = true;
				while(exit) {
				System.out.println("Enter Your Choice :\n 1.Open Account \n 2.Delete Account \n 3.Update Account \n 4.Display Account Details \n"
						+ " 5.Change Password \n 6.Balance Enquiry \n 7.Deposit Cash/Money  \n 8.Withdraw Cash \n 9.Transfer Money \n 10.Exit ");
				int Choice =Sc.nextInt();
				
				switch(Choice) {
			
				
				case 1:
				{
					System.out.println(" Enter Your Details : \n");
					System.out.println(" Enter Customer Name : ");
					String honame = Sc.next();
					System.out.println(" Enter Customer Account Number : ");
					long accnum = Sc.nextLong();
					System.out.println(" Enter Bank City  : ");
					String city = Sc.next();
					System.out.println(" Enter Bank IFSC Code : ");
					String ifsc = Sc.next();
					System.out.println(" Enter Customer Number : ");
					long custnum = Sc.nextLong();
					System.out.println(" Enter Your Account Password  : ");
					int accpass = Sc.nextInt();
					System.out.println(" Enter Your first funds into your this new Account : ");
					double accbal = Sc.nextDouble();
					
					// constructor to pass data
					B1.creatAccount(new Account(honame,accnum,city,ifsc,custnum,accpass,accbal));
				}
				break;
				case 2 :
				{
					B1.deleteAccount();
				}
				break;
				case 3 :
				{
					B1.updateAccount();
				}
				break;
				case 4 :
				{
					B1.displayDetails();
				}
				break;
				case 5 :
				{
					B1.changePassword();
				}
				break;
				case 6 :
				{
					B1.balanceEnquiry();
				}
				break;
				case 7 :
				{
					B1.depositCash();
				}
				break;
				case 8 :
				{
					B1.withdrawCash();
				}
				break;
				case 9:
				{
					B1.transferMoney();
				}
				break;
			    case 10 :
				{
					exit=false;
					System.out.println("yOu aRe oUt nOw ... ");
				}
				break;
				default :
				{
					System.out.println("------------Invalid Option-------------");
				}
			}
		 }
	  }
   }
