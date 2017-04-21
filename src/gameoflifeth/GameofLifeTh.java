package gameoflifeth;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameofLifeTh{
    
    public static void main(String[] args) throws InterruptedException {
        JFrame f = new JFrame("Game of Life");
        f.setSize(1000,740);
        Espace es = new Espace();
        
        
        f.setContentPane(es);
        Dessin d = new Dessin(es);
        es.addMouseListener(d);
        
        es.setLayout(null);    
        
        JLabel menu = new JLabel("Menu");
        menu.setLocation(825, 10);
        menu.setSize(120,30);
        es.add(menu);
       
        JLabel menu2 = new JLabel("Temps entre iterations (milisec)");
        menu2.setLocation(750, 50);
        menu2.setSize(200,30);
        es.add(menu2);
        
        JTextField temps = new JTextField("100");
        temps.setLocation(780, 90);
        temps.setSize(120,30);
        es.add(temps);
        
        JButton Commencer = new JButton("Commencer"); 
        Commencer.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        ServeurGolTh s = new ServeurGolTh(es, Integer.parseInt(temps.getText()));
        s.start();
        Commencer.setEnabled(false);
        temps.setEnabled(false);
        }});
        Commencer.setLocation(780, 130);
        Commencer.setSize(120,30);
        Commencer.setBackground(Color.LIGHT_GRAY);
        es.add(Commencer);
        
        JButton Effacer = new JButton("Effacer"); 
        Effacer.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        d.effacer();
        }});
        Effacer.setLocation(780, 170);
        Effacer.setSize(120,30);
        Effacer.setBackground(Color.LIGHT_GRAY);
        es.add(Effacer);
        
        JButton Fermer = new JButton("Fermer"); 
        Fermer.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        System.exit(0);
        }});
        Fermer.setLocation(780, 210);
        Fermer.setSize(120,30);
        Fermer.setBackground(Color.LIGHT_GRAY);
        es.add(Fermer);
        
        JButton Gunners = new JButton("Gunner"); 
        Gunners.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        d.gunner();
        }});
        Gunners.setLocation(780, 330);
        Gunners.setSize(120,30);
        Gunners.setBackground(Color.GRAY);
        es.add(Gunners);
        
        JButton Glider = new JButton("Glider"); 
        Glider.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        d.glider();
        }});
        Glider.setLocation(780, 370);
        Glider.setSize(120,30);
        Glider.setBackground(Color.GRAY);
        es.add(Glider);
        
        JButton Oscillator = new JButton("Oscillator"); 
        Oscillator.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        d.oscillator();
        }});
        Oscillator.setLocation(780, 410);
        Oscillator.setSize(120,30);
        Oscillator.setBackground(Color.GRAY);
        es.add(Oscillator);
        
        JButton Still = new JButton("Still Life"); 
        Still.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        d.still();
        }});
        Still.setLocation(780, 450);
        Still.setSize(120,30);
        Still.setBackground(Color.GRAY);
        es.add(Still);
        
        JButton Spaceship = new JButton("Spaceship"); 
        Spaceship.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
        d.spaceship();
        }});
        Spaceship.setLocation(780, 490);
        Spaceship.setSize(120,30);
        Spaceship.setBackground(Color.GRAY);
        es.add(Spaceship);
     
        f.setVisible(true);
    }
    
}
