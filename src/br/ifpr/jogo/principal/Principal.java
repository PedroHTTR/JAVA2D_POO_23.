package br.ifpr.jogo.principal;
import javax.swing.JFrame;
public class Principal extends JFrame{
    
    public Principal(){
        super.setVisible(true);
        this.setSize(480, 480);
        this.setTitle(("Meu jogo"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Principal principal = new Principal(); 
    }
}
