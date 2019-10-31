public class ChessBoard {

    public void putChessBoard(String[][] chess,int edge){
        for(int i = 0;i < edge;i ++ ){
            System.out.print("\t"+(i+1));
        }
        System.out.println();
        for(int i = 0;i < edge;i ++) {
            System.out.print(i + 1);
            for (int j = 0; j < edge; j++) {
                System.out.print("\t" + chess[i][j]);
                if(j != edge-1){
                    System.out.print(" |");
                } else{
                    System.out.println();
                }
            }
        }
    }

}
