package gameoflifeth;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Espace extends JPanel{
    
    private final List<Carre> carres = new ArrayList<>();
    private ImageIcon imlogo = new ImageIcon(getClass().getResource("/images/logocentrale.png"));

    
    public Espace(){
        
        JLabel logo = new JLabel(imlogo);
        logo.setBounds(700, 600,286,104);
        this.add(logo);
        
        for (int i =0; i<700; i+=10){
            for (int j=0; j<700; j+=10){
              carres.add(new Carre(i, j, this, false));
            }    
        }
        for (Carre c1 : carres){
            for (Carre c2 : carres){
                if (c1.isAdj(c2)){
                    c1.addAdj(c2);
                }
            }
        }
    
        

        
    }

    public List<Carre> getCarres() {
        return carres;
    }
    
}
