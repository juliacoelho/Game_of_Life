package gameoflifeth;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Dessin implements MouseListener{
    Espace es;
    
    public Dessin(Espace es_){
        es = es_;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point pt;
        pt = e.getPoint();
        for (Carre c : es.getCarres()){
            if(c.isIn(pt.x, pt.y)){
                if(c.isPopule()){
                    c.setnotpopule();
                }
                else{
                    c.setpopule();
                }
            }
        }
        }
    
    public void effacer (){
        for (Carre c : es.getCarres()){
            c.setnotpopule();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        }

    @Override
    public void mouseReleased(MouseEvent e) {
        }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }
    
    public void gunner(){
        es.getCarres().get(4559).setpopule();
        es.getCarres().get(4560).setpopule();
        es.getCarres().get(4489).setpopule();
        es.getCarres().get(4490).setpopule();
        es.getCarres().get(3859).setpopule();
        es.getCarres().get(3789).setpopule();
        es.getCarres().get(3788).setpopule();
        es.getCarres().get(3790).setpopule();
        es.getCarres().get(3719).setpopule();
        es.getCarres().get(3718).setpopule();
        es.getCarres().get(3720).setpopule();
        es.getCarres().get(3717).setpopule();
        es.getCarres().get(3721).setpopule();
        es.getCarres().get(3647).setpopule();
        es.getCarres().get(3651).setpopule();
        es.getCarres().get(3646).setpopule();
        es.getCarres().get(3652).setpopule();
        es.getCarres().get(3577).setpopule();
        es.getCarres().get(3578).setpopule();
        es.getCarres().get(3579).setpopule();
        es.getCarres().get(3580).setpopule();
        es.getCarres().get(3581).setpopule();
        es.getCarres().get(3507).setpopule();
        es.getCarres().get(3511).setpopule();
        es.getCarres().get(3438).setpopule();
        es.getCarres().get(3440).setpopule();
        es.getCarres().get(3369).setpopule();
        es.getCarres().get(3157).setpopule();
        es.getCarres().get(3085).setpopule();
        es.getCarres().get(3086).setpopule();
        es.getCarres().get(3088).setpopule();
        es.getCarres().get(3089).setpopule();
        es.getCarres().get(2944).setpopule();
        es.getCarres().get(2950).setpopule();
        es.getCarres().get(2804).setpopule();
        es.getCarres().get(2805).setpopule();
        es.getCarres().get(2807).setpopule();
        es.getCarres().get(2809).setpopule();
        es.getCarres().get(2810).setpopule();
        es.getCarres().get(2177).setpopule();
        es.getCarres().get(2178).setpopule();
        es.getCarres().get(2107).setpopule();
        es.getCarres().get(2108).setpopule();
    }
    
    public void still(){
        es.getCarres().get(284).setpopule();
        es.getCarres().get(285).setpopule();
        es.getCarres().get(354).setpopule();
        es.getCarres().get(355).setpopule();
        es.getCarres().get(704).setpopule();
        es.getCarres().get(707).setpopule();
        es.getCarres().get(635).setpopule();
        es.getCarres().get(636).setpopule();
        es.getCarres().get(775).setpopule();
        es.getCarres().get(776).setpopule();
        es.getCarres().get(1124).setpopule();
        es.getCarres().get(1126).setpopule();
        es.getCarres().get(1055).setpopule();
        es.getCarres().get(1195).setpopule();
        es.getCarres().get(1196).setpopule();
        es.getCarres().get(1474).setpopule();
        es.getCarres().get(1475).setpopule();
        es.getCarres().get(1544).setpopule();
        es.getCarres().get(1546).setpopule();
        es.getCarres().get(1615).setpopule();
        es.getCarres().get(1616).setpopule();
        es.getCarres().get(1895).setpopule();
        es.getCarres().get(1964).setpopule();
        es.getCarres().get(1966).setpopule();
        es.getCarres().get(2034).setpopule();
        es.getCarres().get(2037).setpopule();
        es.getCarres().get(2105).setpopule();
        es.getCarres().get(2106).setpopule();
    }
    
    public void oscillator(){
        es.getCarres().get(284).setpopule();
        es.getCarres().get(285).setpopule();
        es.getCarres().get(286).setpopule();
        es.getCarres().get(704).setpopule();
        es.getCarres().get(705).setpopule();
        es.getCarres().get(706).setpopule();
        es.getCarres().get(735).setpopule();
        es.getCarres().get(736).setpopule();
        es.getCarres().get(807).setpopule(); 
        es.getCarres().get(874).setpopule();
        es.getCarres().get(945).setpopule();
        es.getCarres().get(946).setpopule();
        es.getCarres().get(1804).setpopule();
        es.getCarres().get(1805).setpopule();
        es.getCarres().get(1807).setpopule();
        es.getCarres().get(1808).setpopule();
        es.getCarres().get(1735).setpopule();
        es.getCarres().get(1736).setpopule();
        es.getCarres().get(1737).setpopule();
        es.getCarres().get(1875).setpopule();
        es.getCarres().get(1876).setpopule();
        es.getCarres().get(1877).setpopule();
        es.getCarres().get(3105).setpopule();
        es.getCarres().get(3106).setpopule();
        es.getCarres().get(3107).setpopule();
        es.getCarres().get(3108).setpopule();
        es.getCarres().get(3109).setpopule();
        es.getCarres().get(3110).setpopule();
        es.getCarres().get(3111).setpopule();
        es.getCarres().get(3112).setpopule();
        es.getCarres().get(3113).setpopule();
        es.getCarres().get(3114).setpopule();
    }
    
    public void glider(){
        es.getCarres().get(642).setpopule();
        es.getCarres().get(710).setpopule();
        es.getCarres().get(712).setpopule();
        es.getCarres().get(781).setpopule();
        es.getCarres().get(782).setpopule();
    }
    
    public void spaceship(){
        es.getCarres().get(642).setpopule();
        es.getCarres().get(644).setpopule();
        es.getCarres().get(715).setpopule();
        es.getCarres().get(785).setpopule();
        es.getCarres().get(855).setpopule();
        es.getCarres().get(925).setpopule();
        es.getCarres().get(924).setpopule();
        es.getCarres().get(923).setpopule();
        es.getCarres().get(852).setpopule();
        es.getCarres().get(652).setpopule();
        es.getCarres().get(654).setpopule();
        es.getCarres().get(725).setpopule();
        es.getCarres().get(795).setpopule();
        es.getCarres().get(865).setpopule();
        es.getCarres().get(935).setpopule();
        es.getCarres().get(1005).setpopule();
        es.getCarres().get(1004).setpopule();
        es.getCarres().get(1003).setpopule();
        es.getCarres().get(932).setpopule();
        es.getCarres().get(791).setpopule();
        es.getCarres().get(662).setpopule();
        es.getCarres().get(664).setpopule();
        es.getCarres().get(735).setpopule();
        es.getCarres().get(805).setpopule();
        es.getCarres().get(875).setpopule();
        es.getCarres().get(945).setpopule();
        es.getCarres().get(1015).setpopule();
        es.getCarres().get(1085).setpopule();
        es.getCarres().get(1084).setpopule();
        es.getCarres().get(1083).setpopule();
        es.getCarres().get(1012).setpopule();
        es.getCarres().get(801).setpopule();
        es.getCarres().get(871).setpopule();
    }
    
}
