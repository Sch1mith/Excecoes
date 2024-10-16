public class Excecao_tipoB extends Exception {
    public Excecao_tipoB(String mensagem) {
        super(mensagem);
    }

    public void gerarExcecao() throws Excecao_tipoB {
        throw new Excecao_tipoB("Esta é uma Exceção do Tipo B");
    }
}