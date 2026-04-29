package default;
/**
 * 
 * A class providing arithmetic and string operations.
 */
public class MyClass {
/**
 * Adds two integers 
 * @param a the first integer 
 * @param b the second integer
 * @return the sum of a and b 
 */
public int add(int a, int b){
return a + b;
}
/**
 * Concatenates two strings together 
 * @param a the first string
 * @param b the second string
 * @return the concatenation of a and b 
 */
public String add(String a, String b){
return a + b;
}
/**
 * Subtracts b from a
 * @param a the first integer
 * @param b the second integer
 * @return the difference of a and b 
 */
public int sub(int a, int b){
return a - b;
}
/**
 * Multiplies two integers together
 * @param a the first integer 
 * @param b the second integer
 * @return the product of a and b 
 */
public int mult(int a, int b){
return a * b;
}
/**
 * Divides a by b using integer division 
 * @param a the dividend
 * @param b the divisor (must not be zero)
 * @return the integer quotient of a divided by b
 */
public int div(int a, int b){  
return a / b;
}
/**
 * Returns the remainder of dividing a by b
 * @param a the dividend
 * @param b the divisor
 * @return the remainder when a is divided by b
 */
public int mod(int a, int b){
return a % b;
}
/**
 * Returns a greeting string for the given name 
 * @param name the name to greet 
 * @return a greeting string in the form "Hello " followed by the name 
 */
public String sayHello(String name){
return "Hello " + name;
}
}