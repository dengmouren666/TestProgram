import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,v=0;
        boolean flag = false;
        Scanner number = new Scanner(System.in);
        //随机数生成选择谁先开始
        Random random = new Random();
        ChessBoard computer = new ChessBoard();
        int r = random.nextInt(2);
        //
        String[][] chess ={{"_","_","_"},{"_","_","_"},{"_","_","_"}};
        System.out.print("Please input the WinNumber");
        int winnumber = number.nextInt();
        computer.putChessBoard(chess);
        switch (r){
            case 0 : System.out.println("Please A input first");
                     break;
            case 1 : System.out.println("Please B input first");
                     break;
        }
        ChessBoard play = new ChessBoard();
        Judge is = new Judge();
        Player a = new Player();
        Scanner inx = new Scanner(System.in);
        Scanner iny = new Scanner(System.in);
        while (flag == false){
            if(v != 0) {
                System.out.println("Please input 'x' and 'y' to continue game.");
            }
            x = inx.nextInt()-1;
            y = iny.nextInt()-1;
            a.setX(x);
            a.setY(y);
            r = a.putChess(chess,r);
            flag = is.startJudge(x,y,chess,winnumber);
            play.putChessBoard(chess);
            v=1;
        }
        switch (r){
            case 1 : System.out.print("A win!!!");
                     break;
            case 0 : System.out.print("B win!!!");
                     break;
        }
    }
}
