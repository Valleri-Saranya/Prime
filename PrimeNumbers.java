import java.io.*;
import java.util.*;
import java.util.Scanner;
public class PrimeNumbers
{
public static void main(String[] args)
{
int n;
Scanner sc= new Scanner(System.in);
System.out.print("enter the number:");
n=sc.nextInt();
boolean isPrime=true;
for (int i = 2; i < n; i++) 
{
if (n % i == 0) 
{
isPrime = false;
break;
 }
 }
 if (isPrime)
 {
 System.out.println(n + " is a prime number");
 } 
else 
{
 System.out.println(n + " is not a prime number");
 }
 }
}

