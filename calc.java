import java.util.Scanner;
class Calculator {
public static void main(String args[]){
System.out.println("Welcome to the calculator");

Scanner sc = new Scanner(System.in);
System.out.println("enter the numbers");
int n = sc.nextInt();
int m = sc.nextInt();
System.out.println("enter the operation");
char sign = sc.next().charAt(0);
double res;
switch(sign){

case '+' :  res = addition(n,m);
            System.out.println(res);
             break;
 
case '-' : res = subtraction(n,m);
           System.out.println(res); 
           break;

case '*' : res = multiplication(n,m);
           System.out .println(res);
           break;  

case '/' : res = division(n,m);
           System .out.println(res);
           break;   

}


}

public static int addition(int a , int b){
return a+b;
}

public static int subtraction(int a, int b){
return a-b;
}
public static int multiplication(int a , int b){
return a*b;
}
public static float division(int a , int b){
  return a/b;
}

}
