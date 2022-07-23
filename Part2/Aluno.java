package Part2;

public class Aluno {
    public String Matric;
    public String Name;
    public double n1;
    public double n2;
    public double trab;

    //peso 7
    public double media() {
        return ((n1 * 2.5) + (n2 * 2.5) + (trab * 2)) / 2;
    }

    public double Final() {
        return (((2.5 * 2.5) + (2.5 * 2.5) + (2 * 2)) / 2) - (((n1 * 2.5) + (n2 * 2.5) + (trab * 2)) / 2);
    }
}
