public class Judge {
    private int winnumber;
    private boolean flag = false;
    public boolean startJudge(int x, int y, String[][] chess,int winnumber){
        int num = 0;
        this.setWinnumber(winnumber);
        //X轴的横向判断
        //
        //
        for(int i = x ;i < 3 && i >= 0;i ++){
            if(chess[i][y] == chess[x][y]){
                num++;
            }
            else{
                break;
            }
        }
        for(int i = x - 1;i < 3 && i >= 0;i --) {
            if(chess[i][y] == chess[x][y]) {
                num++;
            } else {
                break;
            }
        }
        this.winJudge(num);
        if(flag == true){
            return flag;
        }
        //Y轴的竖向判断
        //
        //
        num = 0;
        for(int i = y ;i < 3 && i >= 0;i --){
            if(chess[x][i] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        for(int i = y + 1;i < 3 && i >= 0;i ++){
            if(chess[x][i] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        this.winJudge(num);
        if(flag == true){
            return flag;
        }
        //右斜向判断
        //
        //
        num = 0;
        for(int i = x , j = y ; i < 3 && j < 3 && i >= 0 && j >= 0 ;i --,j ++){
            if(chess[i][j] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        for(int i = x + 1, j = y - 1; i < 3 && j < 3 && i >= 0 && j >= 0 ;i ++,j --){
            if(chess[i][j] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        this.winJudge(num);
        if(flag == true){
            return flag;
        }
        //左斜向判断
        //
        //
        num = 0;
        for(int i = x , j = y ; i < 3 && j < 3 && i >= 0 && j >= 0 ;i --,j --){
            if(chess[i][j] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        for(int i = x + 1, j = y + 1; i < 3 && j < 3 && i >= 0 && j >= 0 ;i ++,j ++){
            if(chess[i][j] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        this.winJudge(num);
            return flag;
    }
    public void winJudge(int num){
        if(num == winnumber){
            flag = true;
        }else{
            flag = false;
        }
    }
    public void setWinnumber(int winnumber){
        this.winnumber = winnumber;
    }




}
