public class TesteExcecoes {
    public static void main(String[] args) {
        Excecao_tipoA excecao01 = new Excecao_tipoA("Exceção A");
        Excecao_tipoB excecao02 = new Excecao_tipoB("Exceção B");

        try {
            excecao01.gerarExcecao();
        } catch (Excecao_tipoA e) {
            System.out.println("Capturada: " + e.getMessage());
        }

        try {
            excecao02.gerarExcecao();
        } catch (Excecao_tipoB e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }
}