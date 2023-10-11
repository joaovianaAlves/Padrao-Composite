public class pasta extends SistemaDeArquivos {
    private SistemaDeArquivos[] elementos;
    

    public pasta(String name, SistemaDeArquivos[] elementos){
        this.name=name;
        this.elementos = elementos;
    }


    public int obterTamanho(){
        int tamanhoTotal = 0;

        for (SistemaDeArquivos elemento : elementos) {
            tamanhoTotal += elemento.obterTamanho();
        }

        return tamanhoTotal;
    }
}
