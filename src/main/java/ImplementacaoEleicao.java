public class ImplementacaoEleicao {

    double totalEleitores=1000;
    double validos=800;
    double votosBrancos=150;
    double nulos=50;

    public static void main(String[] args) {
        ImplementacaoEleicao im = new ImplementacaoEleicao();
        System.out.println("Porcentagem de votos válidos: +" +im.calcularPercentualVotosValidos()+"%");
        System.out.println("Porcentagem de votos brancos: +" +im.calcularPercentualVotosBrancos()+"%");
        System.out.println("Porcentagem de votos Nulos: +" +im.calcularPercentualVotosNulos()+"%");
    }

    public double calcularPercentualVotosValidos(){
        return(validos / totalEleitores) * 100;
    }

    public double calcularPercentualVotosBrancos(){
        return (votosBrancos / totalEleitores) * 100;
    }

    public double calcularPercentualVotosNulos(){
        return(nulos / totalEleitores) * 100;
    }
}
