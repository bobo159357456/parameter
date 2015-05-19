/**
 * Created by bobo on 2015/5/19.
 */
public class Mile {
    public static void main(String1[] args){
        double vacation = miles(15000);
        System.out.println("15000 feet is"+vacation+"miles.");
        System.out.println(miles(20000));
    }
    public  static double miles(double feet){
        return feet/5280.0;
    }
}
