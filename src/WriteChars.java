/**
 * Created by bobo on 2015/5/17.
 */
public class WriteChars {
    public static void writeChars(char ch,int number){
        for (int i = 1; i <= number; i++) {
            System.out.print(ch);
        }
    }

    public static void main(String1[] args){
        writeChars('=',20);
        System.out.println();
        for (int i = 1; i < 10; i++) {
            writeChars('>',i);
            writeChars(' ',20-2*i);
            writeChars('<',i);
            System.out.println();
        }
        writeChars('=',20);
        System.out.println();
        query();
    }

    public static void query(){
        System.out.print("hahah");
    }
}
