/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import gui.MainMathLog;
import gui.ProgramacionLineal;
import gui.MetodoDeTransporte1;
import gui.LineaDeEspera1;
import gui.PlaneacionDeActividades1;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {
    
    public JFrame mainASYS;
    public JFrame ProgLin;
    public JFrame MetTrans;
    public JFrame LinEsp;
    public JFrame PlanAct;
    public JFrame introduction;
    
    public Main() {
        mainASYS = new MainMathLog(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);
        
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainASYS.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
