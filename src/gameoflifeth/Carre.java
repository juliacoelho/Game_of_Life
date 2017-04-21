package gameoflifeth;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;


public class Carre extends JLabel{
    
    boolean popule;
    private final Color jeune = Color.YELLOW;
    private final Color noir = Color.BLACK;
    private Espace es;
    private final List<Carre> carresadj = new ArrayList<>();
    private final int coordx;
    private final int coordy;
    private int qttadjpop;
    private boolean prochain;
    
    public Carre(int x,int y, Espace es_, boolean popule_){
        es=es_;
        popule = popule_;
        es.add(this);
        coordx = x;
        coordy = y;
        qttadjpop = 0;
        this.setBounds(coordx,coordy,10,10);
        this.setOpaque(true);
        if (popule){
            this.setBackground(jeune);
        }
        else{
            this.setBackground(noir);
        }
    }
    
    public void setpopule(){
        popule = true;
        this.setBackground(jeune);
    }
    
    public void setnotpopule(){
        popule = false;
        this.setBackground(noir);
    }

    public int getCoordx() {
        return coordx;
    }

    public int getCoordy() {
        return coordy;
    }

    public boolean isPopule() {
        return popule;
    }
    
    public boolean isAdj(Carre carre){
        //au lieu d une expression if/else
        return (((carre.getCoordx()-10<=coordx)&(coordx<=carre.getCoordx()+10))&((carre.getCoordy()-10<=coordy)&(coordy<=carre.getCoordy()+10))&(carre!=this));
        }
    
    public void addAdj(Carre carre){
        carresadj.add(carre);
    }

    public int getQttadjpop() {
        qttadjpop = 0;
        for (Carre c : carresadj){
            if (c.isPopule()){
                qttadjpop ++;
            }
        }
        return qttadjpop;
    }

    public List<Carre> getCarresadj() {
        return carresadj;
    }

    public boolean isProchain() {
        return prochain;
    }

    public void setProchain(boolean prochain) {
        this.prochain = prochain;
    }
    
    public boolean isIn(int x, int y){
        return (((coordx <= x)&(x <= coordx + 10))&((coordy <= y)&(y <= coordy + 10)));
    }
    
}
