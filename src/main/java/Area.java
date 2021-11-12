
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alan
 */
public class Area {
    public static void main(String[] args){
        String raio = JOptionPane.showInputDialog("Digite o tamanho do raio: ");
        double raioDouble = Double.parseDouble(raio);
        double area = Math.PI*(raioDouble * raioDouble);
        
        if(area <= 1000){
            JOptionPane.showMessageDialog(null,"Área total é : "+ area + "m²","Cálculo da Área", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"É necessário apenas 1 salva-vida", "Quantidade de Salva-vidas",JOptionPane.PLAIN_MESSAGE );
        }else if(area >= 1001 && area <= 10000){
            JOptionPane.showMessageDialog(null,"Área total é: "+ area + "m²","Cálculo da Área", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"São necessários 2 salva-vidas", "Quantidade de Salva-vidas",JOptionPane.PLAIN_MESSAGE );
        }else if(area >= 10001 && area <= 100000){
            JOptionPane.showMessageDialog(null,"Área total é: "+ area + "m","Cálculo da Área", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"São necessários 3 salva-vidas", "Quantidade de Salva-vidas",JOptionPane.PLAIN_MESSAGE );
        }else if(area >= 100001){
            JOptionPane.showMessageDialog(null,"Área total é: "+ area + "m²","Cálculo da Área", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"São necessários 4 salva-vidas", "Quantidade de Salva-vidas",JOptionPane.PLAIN_MESSAGE );
        }
        
    }
    
}
