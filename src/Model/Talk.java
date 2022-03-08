package Model;

import Utils.Verify;

public class Talk {
    private String title;
    private int time;

    public Talk(String _title, int _time){
        this.title = _title;
        this.time = _time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if(Verify.ContainsDigit(title)!=true)
            throw new Exception("The title should not contains a digit");
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) throws Exception {
        if(Verify.CheckLigthningFive(time)!=true)
            throw new Exception("The title should not contains a digit");
        this.time = time;
    }

}
