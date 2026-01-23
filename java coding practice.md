# **JAVA CODE DAILY PRACTICE**



**1.** **TWO SUM:**

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.



You may assume that each input would have exactly one solution, and you may not use the same element twice.



You can return the answer in any order.



**Example 1:**



Input: nums = \[2,7,11,15], target = 9

Output: \[0,1]

Explanation: Because nums\[0] + nums\[1] == 9, we return \[0, 1].



**PROGRAM:**



class Solution {

    public int\[] twoSum(int\[] nums, int target) {

        for(int i=0; i< nums.length ; i++){         **// nums.length is used for length of an array**

            for(int j=i+1; j < nums.length ;j++){

                if(nums\[i] + nums\[j] == target){

                    return new int\[]{i,j};         **//creates an array as \[i,j]**

                }

            }

        }

        return new int\[]{};

    }

}



**2. PALINDROME NUMBER**

Given an integer x, return true if x is a palindrome, and false otherwise.



**Example 1:**



Input: x = 121

Output: true

Explanation: 121 reads as 121 from left to right and from right to left.



**CODE:**

class Solution {

    public boolean isPalindrome(int x) {

        if(x<0){                          **// Negative numbers are not palindrome (eg.-121 is not palindrome)**

            return false;

        }

        int org = x;

        int rev = 0;

        while(x != 0){                  **// Check until the given number becomes 0.**

            int rem = x % 10;

            rev = rev \* 10 + rem;       **// Logic for reversing the number.**

            x = x / 10;

        }

        if (rev == org){              **// check If reversed number is == to given number**

                return true;

 

        }

        else{

            return false;

        }

    }

}



**3. SWAPPING OF TWO NUMBERS WITHOUT THIRD VARIABLE**



**CODE:**

import java.util.\*;



public class Main {

    public static void main(String\[] args) {

      int a,b,temp;

      Scanner sc = new Scanner(System.in);        **//runtime la input vangurathuku**

      System.out.print("Enter a: ");

      a = sc.nextInt();                           **//input a vangurom  (5)**

      System.out.print("Enter b: ");              **//input b vangurom  (2)**

      b = sc.nextInt();

      a = a+b;   **//5+2=7**

      b = a-b;   **//7-2=5**

      a = a-b;   **//7-5=2**

      System.out.println("After swapping a = "+a+" b = "+b);

  }

}



**OUTPUT:**

Enter a: 1

Enter b: 2

After swapping a = 2 b = 5



**4. CHECKING ODD OR EVEN:**



**CODE:**

import java.util.\*;



public class Main {

    public static void main(String\[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        n = sc.nextInt();

        if(n % 2 == 0){                 **//Oru number even naa athu 2 aala divisible ah irukanum.**

            System.out.println("Even");

        }

        else{

            System.out.println("Odd");  **//Illana athu odd number.**

        }

  }

}



**OUTPUT:**

Enter n: 86

Even



Enter n: 7

Odd



**5. PRIME NUMBER**



**CODE:**

class Solution {

     boolean isPrime(int n) {

        if(n<=1){              **//Prime numbers are greater than 1. (Number divisible by 1 or itself).**

            return false;

        }

        for(int i=2; i<=n/2; i++){   **// Loop 2 la irunthu n/2 varaikum run aagum.**

            if(n%i==0){              **//inga vera ethum factors irukaa nu check pannum.**

                return false;        **//So athu not prime.**

            }

        }

        return true;

 

    }

}



**OUTPUT:**

7

true



**6. FACTORIAL**

**Input: n = 5**

**Output: 120**

**Explanation: 1 x 2 x 3 x 4 x 5 = 120**



**CODE:**

class Solution {

    	int factorial(int n) {          **// Function to calculate factorial of a number.**

 	int fact =1;                    **//1 la irunthu than multiply aagum.**

        for(int i=2; i<=n; i++){

            fact = fact \* i;

        }

        return fact;                **//Loop kulla return kudutha multiple times fact value varum, so outside of loop kudukurom.**

    }

}



**OUTPUT:**

5

120



**7. LARGEST OF 3 NUMBERS.**



**CODE:**

import java.util.\*;

class Main {

 	static void large(int a, int b, int c ){        **//Static use panra naala method a object illama call panlam**

 		if(a>b \&\& a>c){

 			System.out.println("A is larger.");  **\&\& -> AND**

 		}

 		else if(b>c){

 			System.out.println("B is larger.");

 		}

 		else{

 			System.out.println("C is larger.");

 		}

 	}

 

    public static void main(String\[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

 	int n2 = sc.nextInt();

 	int n3 = sc.nextInt();

 	large(n1,n2,n3);

    }

}



**OUTPUT:**

22

34

12

B is larger.



**8. FIBONACCI SERIES  (Every number is the sum of the previous two numbers.)**



**CODE:** 

import java.util.\*;

class Main {

&nbsp;	static void fibo(int n){

&nbsp;		int first=0, second = 1; **//Series ooda 1st and 2nd number 0 and 1 ah irukanum.**

&nbsp;		int next = 0;

&nbsp;		System.out.print("The Fibonacci series: "+first+" "+second); **//printing 1st and 2nd number.**

&nbsp;		for(int i=2; i<=n; i++){         **//input number varaikum loop run aagum.**

&nbsp;			next = first+second;

&nbsp;			first = second;

&nbsp;			second = next;

&nbsp;			System.out.print(" "+next); **//Next number ah print panrom.**

&nbsp;		}

&nbsp;		

&nbsp;	}

&nbsp;	public static void main(String args\[]){

&nbsp;		Scanner sc = new Scanner(System.in);

&nbsp;		int n = sc.nextInt();                **//Entha number varaikum series irukanumnu vaangurom.**

&nbsp;		fibo(n);       **//Method calling**

&nbsp;	}

&nbsp;       

&nbsp;   

}



**OUTPUT:** 

10

The Fibonacci series: 0 1 1 2 3 5 8 13 21 34 55





**9. REVERSING THE NUMBER**



**CODE:**

import java.util.\*;

class Main {

&nbsp;	static void revr(int n){		

&nbsp;               int rev = 0;

&nbsp;		int rem=0;

&nbsp;		while(n!=0){

&nbsp;			rem = n%10; **//used for taking last digit of n** 

&nbsp;			rev = rev\*10+rem; 

&nbsp;			n = n/10;  **//used for quotient.**

&nbsp;		}

&nbsp;		System.out.println("The reversed number is "+rev);

&nbsp;	}

&nbsp;	public static void main(String args\[]){

&nbsp;		Scanner sc = new Scanner(System.in);

&nbsp;		int n = sc.nextInt();  **//125**

&nbsp;		revr(n);

&nbsp;	}

&nbsp;       

&nbsp;   

}



**OUTPUT:**

125

The reversed number is 521

