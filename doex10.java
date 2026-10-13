
import java.util.Scanner;

public class doex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int op, quant, pagamento, clientes=0, totalVendido=0;
        float totalPedido=0, totalFinal=0, totalFaturado=0, des=0, acres=0;
        String c;

        c="S";

        do { 
            System.out.println("========== AUTOATENDIMENTO ==========");
            System.out.println(" ");
            System.out.println("1 - Hambúrguer .............. R$ 22,00");
            System.out.println("2 - Cheeseburger ............ R$ 26,00");
            System.out.println("3 - Batata frita ............ R$ 15,00");
            System.out.println("4 - Refrigerante ............ R$ 8,0");
            System.out.println("5 - Sobremesa ............... R$ 12,00");
            System.out.println("6 - Finalizar pedido");
            op = scanner.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Quantidade: ");
                    quant = scanner.nextInt();

                    totalPedido+=quant*22;
                    totalVendido++;
                    break;
                case 2:
                    System.out.println("Quantidade: ");
                    quant = scanner.nextInt();

                    totalPedido+=quant*26;
                    totalVendido++;
                    break;
                case 3:
                    System.out.println("Quantidade: ");
                    quant = scanner.nextInt();

                    totalPedido+=quant*15;
                    totalVendido++;
                    break;
                case 4:
                    System.out.println("Quantidade: ");
                    quant = scanner.nextInt();

                    totalPedido+=quant*8;
                    totalVendido++;
                    break;
                case 5:
                    System.out.println("Quantidade: ");
                    quant = scanner.nextInt();

                    totalPedido+=quant*12;
                    totalVendido++;
                    break;
                case 6:
                    System.out.println("1 - PIX");
                    System.out.println("2 - Dinheiro");
                    System.out.println("3 - Cartão de débito");
                    System.out.println("4 - Cartão de crédito");
                    pagamento = scanner.nextInt();

                    switch (pagamento){
                        case 1:{
                            totalFinal=(float) (totalPedido-(totalPedido*0.05));
                            des=(float) 0.5;
                            break;
                        }
                        case 2:{
                            totalFinal=(float) (totalPedido-(totalPedido*0.03));
                            des=(float) 0.3;
                            break;
                        }
                            case 3:{
                            totalFinal=totalPedido;
                            des = 0;
                            break;
                        }
                            case 4:{
                            totalFinal=(float) (totalPedido+(totalPedido*0.05));
                            acres=(float) 0.5;
                            break;
                        }
                        default:
                            System.out.println("Opção invalida");
                    }
                    totalFaturado+=totalFinal;
                    clientes++;
                    System.out.println("Valor original: R$"+totalPedido);
                    if(des>=0){
                        System.out.println("Desconto de "+des+"%");
                    }
                    else{
                        System.out.println("Acrescimo de "+acres+"%");
                    }
                    System.out.println("Valor final: R$"+totalFinal);

                    System.out.println("Deseja iniciar o pedido de outro cliente (S/N)?");
                    c = scanner.next().toUpperCase();

                    if("S".equals(c)){
                        quant=0;
                        totalPedido=0;
                    }



                    break;


                default:
                    System.out.println("Opção invalida");
            }


            
        } while ("S".equals(c));
        System.out.println("Quantidade de clientes atendidos: "+clientes);
        System.out.println("Quantidade total de itens vendidos: "+totalVendido);
        System.out.println("Faturamento total do restaurante: "+totalFaturado);
    }
}
