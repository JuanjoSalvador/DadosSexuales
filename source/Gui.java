/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadossexuales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Wilus
 */
public class Gui implements ActionListener {
    JFrame ventana;
    JButton rolling;
    JLabel negro, blanco, pigzilla;
    
    public void gui() {
        ventana = new JFrame("DadosSexuales 1.0");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(null);
        ventana.setVisible(true);
            
        negro = new JLabel("Negro");
        negro.setBounds(100, 10, 60, 15);
        blanco = new JLabel("Blanco");
        blanco.setBounds(163, 10, 60, 15);
        pigzilla = new JLabel("Pigzilla Softworks");
        pigzilla.setBounds(175, 145, 120, 15);
        
        rolling = new JButton("Rolling");
        rolling.setBounds(90, 80, 120, 20);
        rolling.addActionListener(this);
                
        ventana.add(negro);
        ventana.add(blanco);
        ventana.add(rolling);
        ventana.add(pigzilla);
        JOptionPane.showMessageDialog(null, "DadosSexuales 1.0 \nJuanjo Salvador \nhttp://juanjosalvador.github.io/", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Rolling")) {
            dadosSexuales dados = new dadosSexuales();
            negro.setText(dados.dadoNegro());
            blanco.setText(dados.dadoBlanco());            
        }
    }
}
