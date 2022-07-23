package Part1;

public class BombaCombustivel {
    public String tCombust;
    public double vLitro = 0;
    public double qtdCombust = 0;

    public double abastecerPorValor(double val) {
        return (val / vLitro) * 1;
    }

    public double abastecerPorLitro(double litro) {
        return (litro * vLitro);
    }

    public void alterarValor(double vLitro) {
        this.vLitro = vLitro;
    }

    public void alterarCombustivel(String tCombust) {
        this.tCombust = tCombust;
    }

    public void alterarQuantidadeCombustivel(double qtdCombust) {
        this.qtdCombust = qtdCombust;
    }
}
