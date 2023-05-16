import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton runButton;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton recursivoButton;
    private JPanel recursividadPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textField2;
    private JButton runButton1;
    private JTextArea textArea2;
    private JTextField textField3;
    private JButton runButton2;
    private JTextArea textArea3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton runButton3;
    private JTextArea textArea4;

    Factorial f = new Factorial();
    Fibonacci f1 = new Fibonacci();
    Suma s = new Suma();


    public App() {
        setContentPane(recursividadPanel);
        runButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factorial();
            }
        });
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fibonacci();
            }
        });
        runButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaNnum();
            }
        });
        runButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        runButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaABN();
            }
        });
    }

    public void factorial(){
        textArea1.setText("");
        textArea1.append("Este es el factorial iterativo: " + f.fIterativo(Integer.parseInt(textField1.getText())) + "\n\n");
        textArea1.append("Este es el factorial recursivo: " + f.fRecursivo(Integer.parseInt(textField1.getText())));
    }

    public void fibonacci(){
        textArea2.setText("");
        f1.setN(Integer.parseInt(textField2.getText()));
        textArea2.append(f1.imprimirFibo(f1.getN()));
    }

    public void sumaNnum(){
        textArea3.setText("");
        s.setN(Integer.parseInt(textField3.getText()));
        textArea3.append("La suma desde 1 - " + s.getN() + " es: " + s.fSumaRecursivo(s.getN()) + "\n\n");
        textArea3.append("La suma desde 1 - " + s.getN() + " solo n impares es: " + s.fSumaRecursivoImpares(s.getN()));
    }

    public void sumaABN(){
        textArea4.setText("");
        s.setN(Integer.parseInt(textField4.getText()));
        s.setX(Integer.parseInt(textField5.getText()));
        textArea4.append("La suma desde " + s.getN() + " - " + s.getX() + " es de: " + s.fSumaAB(s.getN(), s.getX()));
    }

}
