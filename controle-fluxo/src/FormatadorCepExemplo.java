public class FormatadorCepExemplo {
    public static void main(String[] args) {
    
        try {
            String cepFormatado = fortmatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O cep não corresponde com as regras de negocio");
    
        } 
    
    }
    static String fortmatarCep (String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //Simulando um cep formatado
            return "23.765-064";
    }
}
