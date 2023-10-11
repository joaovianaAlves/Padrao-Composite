public class arquivos extends SistemaDeArquivos {
    private int size;
    
    public arquivos(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    public int obterTamanho(){
        return this.size;
    };
}

