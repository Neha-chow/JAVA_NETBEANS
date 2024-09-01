
package bitwiseoperators;
public class BitwiseOperators {
    public static void main(String[] args) {
       int x = 10;
       int y = 3;
       int z;
       //bitwise operation
       z=x&y;
       System.out.println("AND OPERATION BETWEEN 10 ,3 IS:"+z);
       z=x|y;
       System.out.println("OR OPERATION BETWEEN 10 ,3 IS:"+z);
       z=~x;
       System.out.println("Not OPERATION of 10  IS:"+z);
       z=x^y;
       System.out.println("xor OPERATION BETWEEN 10 ,3 IS:"+z);
       z=x<<1;
       System.out.println("LEFT SHIFT OPERATION ON 10 IS:"+z);
       z=x>>1;
       System.out.println("RIGHT SHIFT OPERATION ON 10 IS:"+z);
    }
    
}
