package Part1;

import java.util.Scanner;

public class exercicio1 {
    static BombaCombustivel b = new BombaCombustivel();
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            boolean x = false;

            System.out.println("Informe o combustivel da bomba: ");
            b.alterarCombustivel(valor.nextLine());

            while (x == false) {    
                System.out.println("Tipo de combustivel: "+b.tCombust+"\nValor do litro: "+b.vLitro+"\nQuantidade na bomba: "+b.qtdCombust);
                System.out.println("Informe uam das seguintes opções:");
                System.out.println("(1) Abastecer por valor \n(2) Abastecer por Litro \n(3) Alterar valor do litro \n(4) Alterar combustivel \n(5) Alterar qtd na bomba \n(6) Finalizar");
                String esc = valor.nextLine();
                switch (esc) {
                    case "1":
                        System.out.println("Informe o valor que deseja abastecer: ");
                        double prec = valor.nextDouble();
                        
                        if (prec <= 0) {
                            System.out.println("Informe um valor válido!!");
                        } else if (b.qtdCombust <= 0) {
                            System.out.println("Não ah combustivel na bomba!!");
                        } else if (b.vLitro <= 0) {
                            System.out.println("Não foi especificado o preço!!");
                        }
                        
                        System.out.println("Quantia abastecida: "+b.abastecerPorValor(prec)+" L ");
                    break;
                    case "2":
                        System.out.println("Informe o valor que deseja abastecer: ");
                        double Combs = valor.nextDouble();
                        
                        if (Combs <= 0) {
                            System.out.println("Informe um valor válido!!");
                        } else if (b.qtdCombust <= 0) {
                            System.out.println("Não ah combustivel na bomba!!");
                        } else if (b.vLitro <= 0) {
                            System.out.println("Não foi especificado o preço!!");
                        } 
                        
                        System.out.println("Quantia a pagar: "+b.abastecerPorLitro(Combs)+"R$");
                    break;
                    case "3":
                        System.out.println("Informe o novo valor do litro: ");
                        double li = valor.nextDouble();
                        
                        if (li <= 0) {
                            System.out.println("Informe um valor válido!!");
                        } 
                        
                        b.alterarValor(li);
                    break;
                    case "4":
                        System.out.println("Informe o novo combustivel da bomba: ");
                        String bomb = valor.nextLine();
                        
                        b.alterarCombustivel(bomb);
                    break;
                    case "5":
                        System.out.println("Informe a quantidade restante na bomba: ");
                        double qtd = valor.nextDouble();
                        
                        if (qtd <= 0) {
                            System.out.println("Informe um valor válido!!");
                        } 
                        
                        b.alterarQuantidadeCombustivel(qtd);
                    break;
                    case "6":
                        System.out.println("Finalizando...");
                        x = true;
                    break;
                    default: 
                        
                    break;
                }
            }
        }
    }

    public static void AbsComb(String val) {
        try (Scanner teste = new Scanner(System.in)) {

            if (val == "1") {
                System.out.println("Informe o valorque deseja abastecer: ");
                double prec = teste.nextDouble();
                
                if (prec <= 0) {
                    System.out.println("Informe um valor válido!!");
                    AbsComb("1");
                } else if (b.qtdCombust <= 0) {
                    System.out.println("Não ah combustivel na bomba!!");
                    AbsComb("1");
                } else if (b.vLitro <= 0) {
                    System.out.println("Não foi especificado o preço!!");
                    AbsComb("1");
                }
                
                b.abastecerPorValor(prec);
            } else if (val == "2") {
                System.out.println("Informe o valorque deseja abastecer: ");
                double Combs = teste.nextDouble();
                
                if (Combs <= 0) {
                    System.out.println("Informe um valor válido!!");
                    AbsComb("2");
                } else if (b.qtdCombust <= 0) {
                    System.out.println("Não ah combustivel na bomba!!");
                    AbsComb("2");
                } else if (b.vLitro <= 0) {
                    System.out.println("Não foi especificado o preço!!");
                    AbsComb("2");
                } 
                
                b.abastecerPorLitro(Combs);
            }
        }
    }

    public static void Alteracoes(String typ) {
        try (Scanner teste = new Scanner(System.in)) {
            if (typ == "3") {
                System.out.println("Informe o novo valor do litro: ");
                double li = teste.nextDouble();
                
                if (li <= 0) {
                    System.out.println("Informe um valor válido!!");
                    AbsComb("3");
                } 
                
                b.alterarValor(li);
            } else if (typ == "4") {
                System.out.println("Informe o novo combustivel da bomba: ");
                String bomb = teste.nextLine();
                
                b.alterarCombustivel(bomb);
            } else if (typ == "5") {
                System.out.println("Informe a quantidade restante na bomba: ");
                double qtd = teste.nextDouble();
                
                if (qtd <= 0) {
                    System.out.println("Informe um valor válido!!");
                    AbsComb("5");
                } 
                
                b.alterarQuantidadeCombustivel(qtd);
            }
        }
    }

}