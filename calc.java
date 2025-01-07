class Calculator {
public static void main(String args[]){
System.out.println("Welcome to the calculator");

Scanner sc = new scanner(System.in);
System.out.println("enter the numbers")
int n = sc.nextInt();
int m = sc.nextInt();
System.out.println("enter the operation");
char sign = sc.nextInt.charAt(0);
int res;
switch(sign){

case '+' :  res = addition(n,m);
            System.out.println(res);
 
case '-' : res = subtraction(n,m);
            

case '*' : multiplication(n,m);

case '/' : division(n,m);


}


}

public static int addition(int a , int b){
return a+b;
}

public static int subraction(int a, int b){
return a-b;
}
public static int multiplication(int a , int b){
return a*b;
}
public static float division(int a , int b){
  return a/b;
}

}
