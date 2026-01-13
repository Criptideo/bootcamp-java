// CLASSE: É um tiipo estruturado que pode conter atributos e métodos
// A CLASSE também pode ter construtores, sobrecarga, encapsulamento, herança, polimorfismo etc

public class Triangle {
    public double ladoDois, ladoUm, ladoTres;

    //acresentando métodos de cálculo de área

    public double AreaTriangle() {
        //calculo da área = √p(p-a)(p-b)(p-c)
        //p = (a + b + c) / 2

        double p = (ladoDois + ladoUm + ladoTres) / 2;
        return Math.sqrt(p * (p-ladoUm)*(p-ladoDois)*(p-ladoTres));
    }
}
