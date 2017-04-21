package gameoflifeth;

public class ServeurGolTh extends Thread{
    
    private Espace es;
    private int temp;
    
    public ServeurGolTh(Espace es_, int temp_){
        es = es_;
        temp = temp_;
        
    }
       
    public void run() {
        while (!isInterrupted()){
            try {
            //analyse pour le prochain loop
                for (Carre c : es.getCarres()){
                    if(!c.isPopule() & (c.getQttadjpop() == 3)){
                        c.setProchain(true);
                    }
                    else if(c.isPopule()&((c.getQttadjpop() < 2)||(c.getQttadjpop() > 3))){
                        c.setProchain(false);
                    }
                    else{
                        c.setProchain(c.isPopule());
                    }
                }
                //exécution
                for (Carre c : es.getCarres()){
                    if(c.isProchain()){
                        c.setpopule();
                    }
                    else{
                        c.setnotpopule();
                    }
                }
                Thread.sleep(temp);
            }
            catch (InterruptedException ex) {
                //
            }
        }
    } 
}
