public class TestaCarro {
    public static void main (String[]args){

        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Palio Fire");
        carro.setPlaca( "EDD-2503");
        carro.setRenavam(123456789);

        //SHIFT + ALT + SETA PARA BAIXO COPIA A LINHA

        System.out.println("MARCA- "+carro.getMarca());
        System.out.println("MODELO- "+carro.getModelo());
        System.out.println("PLACA- "+carro.getPlaca());
        System.out.println("RENAVAM- "+ carro.getRenavam());
        

    }
}
