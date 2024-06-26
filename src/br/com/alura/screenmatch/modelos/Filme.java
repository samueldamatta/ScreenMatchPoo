public class Filme {
    public String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome(String oPoderosoChefão) {
        return nome;
    }

    public int getAnoDeLancamento(int i) {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public int getDuracaoEmMinutos(int i) {
        return duracaoEmMinutos;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano do lançamento: " + anoDeLancamento );


    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes ++;

    }

    double pegaMedia(){
        return somaAvaliacoes/totalDeAvaliacoes;
    }


}
