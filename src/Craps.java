import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Craps {
    private Die die1, die2;
    private int rollnum, point;
    
    //intantialize Craps default values
    Craps(){
        die1 = new Die();
        die2 = new Die();
        rollnum = 0;
        point = 0;
    } 
    
    //intantialize default Dicepic
    public ImageIcon getDicepic(int x){
        if (x==1)
            return die1.getPic();
        else
            return die2.getPic();
    } 
    
    //roll dice and increase roll
    public void roll(){
        rollnum++;
        die1.roll();
        die2.roll();
        if (rollnum==1)point = getTotal();
    } 
    
    //Check to see if the user has won
    public boolean hasWon(){
        if(rollnum==1)
            return(getTotal()==7 || getTotal()==11);
        else          
            return(point == getTotal());
    } 
    
    //Check to see if the user has lost
    public boolean hasLost(){
        if(rollnum==1) 
            return(getTotal()==2 || getTotal()==3|| getTotal()==10);
        else
            return(getTotal()==7);
    } 

    //Get the total dice roll
    public int getTotal(){
        return die1.getValue() + die2.getValue();
    }
    public int getPoint(){
        return point;
    }
    public void newGame(){
        rollnum=0;
        point=0;
    }
}
