
public class Excecao_tipoA extends Exception{

    public Excecao_tipoA(String mensagem) {
        super(mensagem);
    }

    public void gerarExcecao() throws Excecao_tipoA {
        throw new Excecao_tipoA("Esta � uma Exce��o do Tipo A");
    }
    
}
