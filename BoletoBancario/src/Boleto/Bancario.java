package Boleto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bancario {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner le = new Scanner(System.in);
        ArrayList<DacBoleto> boleto = new ArrayList<DacBoleto>();
        String s = "";
        int op, dac = 0, resto, cod, vencimento, agencia, valor, carteira = 110, carteira2 = 123456788, moeda = 9, livres = 000;
        File todos = new File("Todos.txt");
        FileOutputStream Todos = new FileOutputStream(todos);

        do {
            System.out.println("Digite uma das opções abaixo:");
            System.out.println("1 - Cadastrar Boleto Bancario " + " \n0 - Sair ");
            op = le.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Código do Banco: ");
                    cod = le.nextInt();
                    System.out.println("Data de Vencimento: ");
                    vencimento = le.nextInt();
                    System.out.println("Agência/Conta Corrente: ");
                    agencia = le.nextInt();
                    System.out.println("Valor do Documento: ");
                    valor = le.nextInt();

                    boleto.add(new DacBoleto(cod, moeda, dac, vencimento, valor, carteira, carteira2, agencia, livres));

                    for (int i = 0; i < boleto.size(); i++) {
                        s += boleto.get(i).getCodigo();
                        s += boleto.get(i).getMoeda();
                        s += boleto.get(i).getDac();
                        s += boleto.get(i).getFatorVencimento();
                        s += boleto.get(i).getTitulo();
                        s += boleto.get(i).getCarteira() + boleto.get(i).getCarteira2();
                        s += boleto.get(i).getAgencia();
                        s += boleto.get(i).getLivres();
                        s += boleto.get(i).getMult();
                        s += "\r\n";
                    }
                    Todos.write(s.getBytes());
                    break;

                case 0:
                    System.out.println("Saindo..... ");
                    break;

                default:
                    System.out.println("Opção invalida!!! ");
                    break;
            }
        } while (op != 0);

    }

}
