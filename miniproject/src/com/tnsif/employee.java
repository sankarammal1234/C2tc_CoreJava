package com.tnsif;
import java.sql.SQLException;
import java.util.Scanner;

public class employee{

public static void main(String[] args)throws SQLException 
{
 
    Scanner in = new Scanner(System.in);
    int option;
    boolean exit = false;
 System.out.println("Employee Management");
 while( !exit )
 {
  System.out.println("Choose which operation to perform : ");
  System.out.println("1.Insert\n2.Show\n3.Update\n4.Delete\n5.Exit");
  option = in.nextInt();
  switch( option )
  {
     case 1:
      System.out.println("Number of rows affected : "+operation.insert());
   break;
     case 2:
    operation.show();
    break;
     case 3:
    System.out.println("Number of rows affected : "+operation.update());
   break;
     case 4:
   System.out.println("Number of rows affected : "+operation.delete());
   break;
     case 5:
    exit = true;
    System.out.println("Terminated!");
    break;
     default:
    System.out.println("Invalid Option !");
  }
 }
     in.close();
}

}
