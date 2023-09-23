
import javax.swing.*;



public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x == 0){
            Random_A valor = new Random_A();
            String menu = JOptionPane.showInputDialog(null, "|Menu inicial\n|1- Jogo de adivinhação\n|2- Sair");
            int menus = Integer.parseInt(menu);

            switch (menus){
                case 1:
                    //String menu2 = JOptionPane.showInputDialog(null, "Jogo de adivinhação\nInsira um número de 1 a 100");
                    int X = valor.valor_aleatorio(); // Renomeei o método para valorAleatorio
                    int y = 0;
                    int cont = 0;
                    while (y == 0){
                        String menu2 = JOptionPane.showInputDialog(null, "Jogo de adivinhação\nInsira um número de 1 a 100");
                        int menus2 = Integer.parseInt(menu2);
                        if (menus2 == X){
                            JOptionPane.showMessageDialog(null, "Parabéns você acertou o número, JOGUE NA LOTERIA PARCEIRO!!!");
                        }
                        else if (menus2 >= X) {
                            JOptionPane.showMessageDialog(null, "Insira um número menor");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Insira um número maior");
                        }

                        cont ++;
                        if (cont == 5){
                            y = 1;
                        }
                    }
                    break; // Adicionei um break para sair do switch
                case 2:
                    x = 1;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menus);
            }
        }
    }
}
