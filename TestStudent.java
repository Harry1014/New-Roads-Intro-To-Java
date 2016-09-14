import java.util.Scanner;
public class TestStudent{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("enter your name");

    String name = input.next();

    System.out.println("your name is" + name);

    int graduationYear = input.nextInt();

    System.out.println("what year do you graduate?");

    String classes = "";
      if(graduationYear == 17){

      classes = "senior";
    }
      else if(graduationYear == 18){
        classes = "junior";

    }
      else if(graduationYear == 19){
        classes = "sophmore";

        }
    else if (graduationYear == 20){
       classes = "freshmen";
    }


    System.out.println("You are a" + classes);
    
    
  }


}