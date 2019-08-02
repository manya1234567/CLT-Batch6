package day10;

import java.util.Scanner;

public class McqTest {
	public static void main(String[] args) {
	   
	   
	    int score = 0;
	    Scanner sc = new Scanner(System.in);

	    String[] mcq1 = new String[5];
	    mcq1[0] = "1. Which country is most populated?\n";
	    mcq1[1] = "united states";
	    mcq1[2] = "China";
	    mcq1[3] = "India ";
	    mcq1[4] = "England ";

	    String useranswer1 = mcq1[0];

	    if(useranswer1==mcq1[0]){
	        System.out.println(mcq1[0]);
	        System.out.println("A. United States");
	        System.out.println("B. China");
	        System.out.println("C. India");
	        System.out.println("D. England");
	        System.out.println();
	        System.out.print("Enter your answer: ");
	        String uchoose1 = sc.next();

	        switch (uchoose1.toUpperCase()){
	            case "A":
	                uchoose1 = "United States";
	                System.out.println("Incorrect!\n\n");
	                break;
	            case "B":
	                uchoose1 = "China";
	                System.out.println("Correct!\n\n");
	                score++;
	                break;
	            case "C":
	                uchoose1 = "India";
	                System.out.println("Incorrect!\n\n");
	                break;
	            case "D":
	                uchoose1 = "England";
	                System.out.println("Incorrect!\n\n");
	                break;
	            default: 
	                uchoose1 = "Incorrect, choice.\n\n";
	                break;
	            }// end of switch case
	            System.out.println("You scored a total of " +score );
	    }
	    
	    String[] mcq2 = new String[5];
	    mcq1[0] = "2. Which country has highest GDP?\n";
	    mcq1[1] = "united states";
	    mcq1[2] = "China";
	    mcq1[3] = "India ";
	    mcq1[4] = "England ";

	    String useranswer2 = mcq1[0];

	    if(useranswer2==mcq2[0]){
	        System.out.println(mcq2[0]);
	        System.out.println("A. United States");
	        System.out.println("B. China");
	        System.out.println("C. India");
	        System.out.println("D. England");
	        System.out.println();
	        System.out.print("Enter your answer: ");
	        String uchoose2 = sc.next();

	        switch (uchoose2.toUpperCase()){
	            case "A":
	                uchoose2 = "United States";
	                System.out.println("Incorrect!\n\n");
	                break;
	            case "B":
	                uchoose2 = "China";
	                System.out.println("Correct!\n\n");
	                score++;
	                break;
	            case "C":
	                uchoose2 = "India";
	                System.out.println("Incorrect!\n\n");
	                break;
	            case "D":
	                uchoose2 = "England";
	                System.out.println("Incorrect!\n\n");
	                break;
	            default: 
	                uchoose2 = "Incorrect, choice.\n\n";
	                break;
	            }// end of switch case
	            System.out.println("You scored a total of " +score );
	    }
	    
	    
	}

}