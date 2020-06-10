Import java.util.scanner;
public class switchcase{

public static void main(String[] args){
int choice;
System.out.println("pick one : 1. Hi\t 2 hey\t 3. hello\t");
Scanner sc= new Scanner(System.in);
Choice=sc.nextInt();
switch (choice)
{ 
    Case 1 : System.out.println("you said Hi");
    break;

    Case 2 : System.out.println("you said Hey");
    break;
   
    Case 3 : System.out.println("you said Hello");
    break;
    
    default : System.out.println("invalid choice");
}
}
}
