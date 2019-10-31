public class ChessBoard {

    public void putChessBoard(String[][] chess){
        System.out.println("\t1\t2\t3");
        for(int i = 0;i < 3;i++){
                System.out.println((i+1)+"\t"+chess[i][0]+" | "+chess[i][1]+" | "+chess[i][2]);
        }
    }

}
