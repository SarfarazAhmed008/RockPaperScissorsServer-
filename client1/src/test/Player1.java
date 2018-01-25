// Name: Sarfaraz Ahmed


package test;

import java.io.*;
import java.net.*;
import java.util.*;

public class Player1 {

	public Player1() {

	}


	public static void main(String[] args) {


		try {
			Socket serverSocket = new Socket("localhost", 40);

			BufferedReader reader = new BufferedReader(
				new InputStreamReader (serverSocket.getInputStream())

			);




			 PrintWriter writer = new PrintWriter(
					serverSocket.getOutputStream(), true
					 );


			 System.out.println(reader.readLine());


			 Scanner consoleInput= new Scanner(System.in);


			 while(true){

			 System.out.print("Player 1: ");

			 writer.println(consoleInput.nextLine());
			 System.out.println(reader.readLine());
			 }


		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {


			e.printStackTrace();
		}




	}

}
