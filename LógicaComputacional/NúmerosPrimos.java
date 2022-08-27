package númeroprimofor;

import javax.swing.JOptionPane;

public class NúmeroPrimoFOR {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        for (int i = 0; i < n; i++) {
            int d = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    d++;
                }
            }
            if (d == 2) {
                JOptionPane.showMessageDialog(null, i + ", esse número é primo");
            }
        }
    }
}
