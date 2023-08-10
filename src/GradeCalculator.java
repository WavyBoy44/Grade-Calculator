import java.util.*;
import java.text.*;
public class GradeCalculator {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		int score = 0;
		double total = 0;
		int totalScores = 0;
		
		do {
			System.out.print("Enter a score: ");
			score = input.nextInt();
			if(score < 0) {
				break;
			}
			else if(score > 100) {
				System.out.println("Score can not be over 100");
				continue;
			}
			total += score;
			totalScores++;
		}while(score >= 0);
		input.close();
		
		double average = total / (double)(totalScores);
		
		System.out.println("The average score is: " + df.format(average));
		
		if(average > 90) {
			System.out.println("Excellent Work!");
		}
		else if(average > 80 && average <= 90) {
			System.out.println("Good Job!");
		}
		else if(average > 70 && average <= 80) {
			System.out.println("Keep It Up!");
		}
		else {
			System.out.println("Let\'s work hard to get those grades up");
		}
		

	}

}
