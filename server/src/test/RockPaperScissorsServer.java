// Name: Sarfaraz Ahmed


package test;


import java.io.*;
import java.net.*;
import java.util.*;

public class RockPaperScissorsServer {


	public static void main(String[] args) {


		System.out.println("RockPaperScissorsServer Is Starting...");
		while(true){
		try{
			ServerSocket s=new ServerSocket(40);


			Socket clientSocket= s.accept();

			System.out.println("Player 1 has connected");

			Socket clientSocket2= s.accept();
			System.out.println("Player 2 has connected");

			 BufferedReader reader = new BufferedReader(
					new InputStreamReader (clientSocket.getInputStream())

			);
			 BufferedReader reader2 = new BufferedReader(
						new InputStreamReader (clientSocket2.getInputStream())

				);

			 System.out.println("Welcome to Rock Paper Scissors Game. "
			 		+ "Type 1 for Rock,"
			 		+ " 2 for Paper,"
			 		+ " 3 for Scissors");
			 PrintWriter writer = new PrintWriter(
						clientSocket.getOutputStream(), true
						 );
			 writer.println("Welcome to Rock Paper Scissors Game. "
				 		+ "Type 1 for Rock,"
				 		+ " 2 for Paper,"
				 		+ " 3 for Scissors");
			 PrintWriter writer2 = new PrintWriter(
						clientSocket2.getOutputStream(), true
						 );
			 writer2.println("Welcome to Rock Paper Scissors Game. "
				 		+ "Type 1 for Rock,"
				 		+ " 2 for Paper,"
				 		+ " 3 for Scissors");

			while(true){

			 String a= reader.readLine();
			 String b= reader2.readLine();

			 	if (a.equals("1") && b.equals("2")){
			 		System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Player 2 win");
					writer.println("Player 2 win");
					writer2.println("Player 2 win");
			 	}
				else if(a.equals("2") && b.equals("1")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Player 1 win");
					writer.println("Player 1 win");
					writer2.println("Player 1 win");
				}
				else if(a.equals("2") && b.equals("3")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Player 2 win");
					writer.println("Player 2 win");
					writer2.println("Player 2 win");
				}
				else if(a.equals("3") && b.equals("2")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Player 1 win");
					writer.println("Player 1 win");
					writer2.println("Player 1 win");
				}
				else if(a.equals("1") && b.equals("3")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Player 1 win");
					writer.println("Player 1 win");
					writer2.println("Player 1 win");
				}
				else if(a.equals("3") && b.equals("1")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Player 2 win");
					writer.println("Player 2 win");
					writer2.println("Player 2 win");
				}
				else if(a.equals("2") && b.equals("2")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Draw");
					writer.println("Draw");
					writer2.println("Draw");
				}
				else if(a.equals("1") && b.equals("1")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Draw");
					writer.println("Draw");
					writer2.println("Draw");
				}
				else if(a.equals("3") && b.equals("3")){
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
					System.out.println("Draw");
					writer.println("Draw");
					writer2.println("Draw");
				}
				else{
					System.out.println("Player 1: " + a);
				    System.out.println("Player 2: " + b);
				    System.out.println("One Player has given an invalid input...Please Try Again");
				    writer.println("One Player has given an invalid input...Please Try Again.");
					writer2.println("One Player has given an invalid input...Please Try Again.");
				}

			}


		}catch (IOException e){
			System.out.println("One Player of this game has left");

		}

	}
  }


}
