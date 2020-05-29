package lottery;

import java.util.Scanner;
import java.lang.Math;

public class lottery_game {

	public static void main(String[] args) {
		
				          System.out.println("Your no. ");
		          Scanner sc=new Scanner(System.in);
		          int y=sc.nextInt();
		          int x=((int)(Math.random()*100)-1);
		          System.out.println("Lottery no is "+x);
		          if(x==y)
		          System.out.println("You Won");
		          else
		          System.out.println("Sorry try again");    

	}

}
