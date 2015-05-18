/**
 * Created by Administrator on 2015/5/17.
 */
public class WriteSpaces {
    public static void main(String[] args){
        drawTop();
    }
    public static void writeSpaces(int number){
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }


    public static void drawTop(){
        int SUB_HEIGHT =10;
        for (int line = 1; line < SUB_HEIGHT; line++) {
            System.out.print("|");
            writeSpaces(line-1);
            System.out.print("\\");
            writeSpaces(2*SUB_HEIGHT-2*line);
            System.out.print("/");
            writeSpaces(line-1);
            System.out.println("|");
        }
    }
}
