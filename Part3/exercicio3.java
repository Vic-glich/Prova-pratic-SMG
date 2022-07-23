package Part3;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
        Ingresso i = new Ingresso();
        IngressoVIP vip = new IngressoVIP();
        System.out.println("Ingresso normal: "+i.ImprimirValor()+"\nIngresso VIP: "+vip.IngressoVip);
        System.out.println("A diferença de valor será de: "+(vip.IngressoVip - i.val));
    }
}
