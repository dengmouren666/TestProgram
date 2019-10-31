public class Judge {
    private int winnumber;
    private boolean flag = false;
    private int edge;
    public boolean startJudge(int x, int y, String[][] chess,int winnumber,int edge){
        int num = 0;
        this.setWinnumber(winnumber,edge);
        //X轴的横向判断
        //
        //
        for(int i = x ;i < edge && i >= 0;i ++){
            if(chess[i][y] == chess[x][y]){
                num++;
            }
            else{
                break;
            }
        }
        for(int i = x - 1;i < edge && i >= 0;i --) {
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
        for(int i = y ;i < edge && i >= 0;i --){
            if(chess[x][i] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        for(int i = y + 1;i < edge && i >= 0;i ++){
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
        for(int i = x , j = y ; i < edge && j < edge && i >= 0 && j >= 0 ;i --,j ++){
            if(chess[i][j] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        for(int i = x + 1, j = y - 1; i < edge && j < edge && i >= 0 && j >= 0 ;i ++,j --){
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
        for(int i = x , j = y ; i < edge && j < edge && i >= 0 && j >= 0 ;i --,j --){
            if(chess[i][j] == chess[x][y]){
                num++;
            }else{
                break;
            }
        }
        for(int i = x + 1, j = y + 1; i < edge && j < edge && i >= 0 && j >= 0 ;i ++,j ++){
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
    public void setWinnumber(int winnumber,int edge){
        this.winnumber = winnumber;
        this.edge = edge;
    }




}
