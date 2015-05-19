/**
 * Created by bobo on 2015/5/19.
 */
public class Triangles {
    public static void main(String1[] args){

        System.out.println("hypotenuse1 ="+hypotenuse(5,12));
        System.out.println("hypotenuse2 ="+hypotenuse(3,4));
    }
    public static double hypotenuse(double a,double b){
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        return Math.sqrt(a*a+b*b);
        System.out.println(c);
        return c;
    }
}
