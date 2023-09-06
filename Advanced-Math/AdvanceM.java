import java.util.Scanner;
public class AdvanceM {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome. What would you like to calculate?\nEnter D for derivatives, I for Integrals, or M for matrix determinants.");
    String choice = input.next();
    do {
      if(!choice.equals("D") && !choice.equals("I") && !choice.equals("M")) {
        System.out.println("Please enter either D for derivatives, I for Integrals, or M for matrix determinants.");
        choice = input.next();
      }
    }while (!choice.equals("D") && !choice.equals("I") && !choice.equals("M") );
    if(choice.equals("D")) {
      System.out.println("Choose a Coefficient");
      int coe = input.nextInt();
      String var;
      int power;
      System.out.println("Choose a variable");
      var = input.next();
      do {
        if(var.length() != 1) {
          System.out.println("Please type one character");
          var = input.next();
        }
      } while(var.length() != 1);
      System.out.println("Choose an exponent");
      power = input.nextInt();
      System.out.println("You entered "+ coe + "" + var + "^" + power);
      if (power == 0) {
        System.out.println("Derivative is 0");
      }  
      else if(power ==1) {
        System.out.println("Derivative");
      
      } else {
        System.out.println("Derivative  is " + (power*coe) + "" + var + "^" + (power -1) +"\nGoodbye.");
      }
    } else if (choice.equals("I")) {
      System.out.println("Choose a Coefficient");
      int coe = input.nextInt();
      String var;
      int power;
      System.out.println("Choose a variable");
      var = input.next();
      do {
        if(var.length() != 1) {
          System.out.println("Please type one character");
          var = input.next();
        }
      } while(var.length() != 1);
      System.out.println("Choose an exponent");
      power = input.nextInt();
      System.out.println("You entered "+ coe + "" + var + "^" + power);
      if(power == 0) {
        System.out.println("Integral is " + coe + "" + var + " + C");
      }else if(power == -1) {
        System.out.println("Integral is " + coe + "ln(|" + var + "|)" + " + C");
      } else {
        System.out.println(("Integral is (" + coe + "/" + (power+1) + ")" + var + "^" + (power+1) + " + C" ));
      }
    } else {
      System.out.println("Enter A to find the determinant of a 2x2 matrix or B for a 3x3 matrix");
      String matChoice = input.next();
      do {
        if (!matChoice.equals("A") && !matChoice.equals("B")) {
          System.out.println("Enter either A for a 2x2 matrix or B for a 3x3 matrix");
          matChoice = input.next();
        }
      }while(!matChoice.equals("A") && !matChoice.equals("B"));
      if(matChoice.equals("A")) {
        String choice2;
        do {
          String[][] displayMat = {{"A","B"},{"C","D"}};
          for (int i = 0; i < displayMat.length; i++) {
            for(int j = 0; j < displayMat[i].length; j++) {
              System.out.print("|" + displayMat[i][j]);
            }
            System.out.print("|\n");
    
          }
          System.out.println("This is a 2x2 matrix. Please enter your numbers for positions A,B,C and D respectively");
          int a, b, c, d;
          a = input.nextInt();
          b = input.nextInt();
          c = input.nextInt();
          d = input.nextInt();
          int [][] personalmat = {{a, b}, {c, d}};
          System.out.println("This is your matrix:");
          for(int n = 0; n <personalmat.length; n++) {
            for(int o = 0; o < personalmat[n].length; o++) {
              System.out.print("|" + personalmat[n][o]);
            }
            System.out.print("|\n");
          }
          int deter = personalmat[0][0] *personalmat[1][1] -(personalmat[0][1] *personalmat[1][0]);
          System.out.println("The Determinant of your matrix is " + deter);
          System.out.println("Would you like to find another determinant? Type Y for yes or N for no.");
          choice2 = input.next();

          if (!choice2.equals("Y") && !choice2.equals("N")) {
            System.out.println("Please type either Y for yes or N for No");
            
          }
        } while (choice2.equals("Y") || !choice2.equals("Y") && !choice2.equals("N"));
        if(choice2.equals("N")) {
          System.out.println("Okay. Have a nice day!");
        }
      
      } else {
        
          String[][] displayMat = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
          for (int i = 0; i < displayMat.length; i++) {
            for(int j = 0; j < displayMat[i].length; j++) {
              System.out.print("|" + displayMat[i][j]);
            }
            System.out.print("|\n");
            
          }
          System.out.println("This is a 3x3 matrix. Please enter your numbers for positions A through I respectively");
          int a, b, c, d, e, f, g, h, i;
          a = input.nextInt();
          b = input.nextInt();
          c = input.nextInt();
          d = input.nextInt();
          e = input.nextInt();
          f = input.nextInt();
          g = input.nextInt();
          h = input.nextInt();
          i = input.nextInt();
          
          int [][] personalmat = {{a, b, c}, {d, e, f}, {g,h,i}};
          System.out.println("This is your matrix:");
          for(int n = 0; n <personalmat.length; n++) {
            for(int o = 0; o < personalmat[n].length; o++) {
              System.out.print("|" + personalmat[n][o]);
            }
            System.out.print("|\n");
          }
        int firstMultiplier = personalmat[0][0];
        int secondMultiplier = -1*(personalmat[1][0]);
        int thirdMultiplier = personalmat[2][0];

        int firstAdder = firstMultiplier * ((personalmat[1][1]*personalmat[2][2]) - (personalmat[2][1]*personalmat[1][2]));
        int secondAdder = secondMultiplier * ((personalmat[0][1]*personalmat[2][2]) - (personalmat[2][1]*personalmat[0][2]));
        int thirdAdder = thirdMultiplier * ((personalmat[0][1]*personalmat[1][2]) - (personalmat[1][1]*personalmat[0][2]));
        int determinant = firstAdder + secondAdder + thirdAdder;
        System.out.println("The determinant is " + determinant);
      }
    }
  }
}