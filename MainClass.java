import java.util.Scanner;

public class MainClass 
{
	
	public static void main(String[]args)
	{
       service s=new service();
       Scanner sc=new Scanner(System.in);
       
       System.out.println("1. Menu");
       System.out.println("Enter any key to exit");
       
       String choice=sc.next();
       
       if(choice.equals("1")==false)
       {
    	   System.out.println("Thank you");
    	   System.exit(0);
       }
       while(choice.equals("1"))
       {
    	   try
    	   {
    		   System.out.println("1. Insert/create Employees Details");
    		   System.out.println("2. Update Employees Details");
    		   System.out.println("3. Delete Employees Details");
    		   System.out.println("4. Show Employees Details");
    		   System.out.println("Any key to Exit");
    		   
    		   String choice2=sc.next();
    		   
    		   switch(choice2)
    		   {
    		      case "1": Employee e1=new Employee();
    		                System.out.println("Enter name");
    		                e1.setName(sc.next());
    		                
    		                System.out.println("Enter age");
    		                e1.setAge(sc.next());
    		                
     		                System.out.println("Enter salary");
   		                    e1.setSal(sc.next());
    		                
    		                System.out.println("Enter Designation");
      		                e1.setDesig(sc.next());
    		                
    		                
    		               System.out.println("Enter DepartmentNo");
    		                 e1.setDeptno(sc.nextInt());
    		                
    		                System.out.println("Enter Email id");
    		                e1.setEmailId(sc.next());
    		                
    		                s.create(e1);
    		                
    		                break;
    		      case "2": Employee e2=new Employee();
    		    	          System.out.println("Enter name");
    		    	          e2.setName(sc.next());
    		    	          
    		    	          System.out.println("Enter age");
    		    	          e2.setAge(sc.next());
    		    	          
    		    	         System.out.println("Enter email id");
    		    	          e2.setEmailId(sc.next());
    		    	           
    		    	           s.update(e2);
    		    	           break;
    		     case "3": System.out.println("Enter email");
    		                String email=sc.next();
    		              
    		               s.deleteByEmail(email);
    		               break;
    		         
    		      case "4":System.out.println("1. Show particular employee details using email id\n 2. Show all Employees \n3. Show sorted Employee details");
                           int otpn=sc.nextInt();
                           switch(otpn)
                           {
                           case 1: System.out.println("Enter email");
                                    String email1=sc.next();
                                    
                                   s.getEmployeeByEmail(email1);
                                    break;
                                    
                           case 2: System.out.println("Displaying all the employees in the table");
                        	       s.getAllEmployees();
                        	       break;
                           case 3: System.out.println("Displaying all the employees details sorted by emailId");
                                   s.getAllEmployeesSortByEmailId();
                                   break;
                           }
                           break;
    		      default : System.out.println("Exiting.......");
    		                System.exit(0);
    		              
    		}
    		   
    	   }
    	   catch(Exception sqle)
    	   {
    		   sqle.printStackTrace();
    	   }
       }
       
       
	}
}
