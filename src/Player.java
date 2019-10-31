
public class Player {
    private int x;
    private int y;
    public int putChess(String[][] chess,int r){
        switch (r){
            case 0 :chess[x][y] = "*";
                    r++;
                    break;
            case 1 :chess[x][y] = "#";
                    r--;
                    break;
        }
        return r;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
