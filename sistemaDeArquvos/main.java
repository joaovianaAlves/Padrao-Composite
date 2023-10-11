public class main {
    public static void main(String[] args) {
        
        //Pasta texto
        SistemaDeArquivos lista = new arquivos("Lista.txt", 10);
        

        SistemaDeArquivos carta1 = new arquivos("Carta1.Doc", 15);
        SistemaDeArquivos carta2 = new arquivos("Carta2.Doc", 10);
        SistemaDeArquivos[] cartasElementos = {carta1, carta2};
        SistemaDeArquivos cartas = new pasta("Cartas", cartasElementos);

        SistemaDeArquivos[] textoElemento = {lista, cartas};
        SistemaDeArquivos textos = new pasta("Textos", textoElemento);

        //Pasta Planilhas
        SistemaDeArquivos custos = new arquivos("Custos.xls", 30);
        SistemaDeArquivos salarios = new arquivos("Salarios.xls", 25);
        SistemaDeArquivos[] planilhaElementos = {custos, salarios};
        SistemaDeArquivos planilhas = new pasta("Planilhas", planilhaElementos);

        //Pasta Imagens
        SistemaDeArquivos wallpapper = new arquivos("wallpapper.bmp", 250);
        SistemaDeArquivos Simbolos = new arquivos("Simbolos.gif", 40);
        SistemaDeArquivos[] imagensElementos = {wallpapper, Simbolos};
        SistemaDeArquivos imagens = new pasta("Imagens", imagensElementos);
        
        SistemaDeArquivos geral = new arquivos("Geral.txt", 300);

        SistemaDeArquivos[] docsElementos = {textos, planilhas, imagens, geral};
        SistemaDeArquivos docs = new pasta("Docs", docsElementos);

        // Obter o tamanho total da hierarquia
        System.out.println("Tamanho da pasta Textos: " + textos.obterTamanho() + " bytes");
        System.out.println("Tamanho da pasta Cartas: " + cartas.obterTamanho() + " bytes");
        System.out.println("Tamanho da pasta Planilhas: " + planilhas.obterTamanho() + " bytes");
        System.out.println("Tamanho da pasta Imagens: " + imagens.obterTamanho() + " bytes");

        System.out.println("Tamanho total da hierarquia de pastas e arquivos: " + docs.obterTamanho() + " bytes");
    }
}
