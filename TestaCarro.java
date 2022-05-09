public class TestaCarro {
    public static void main (String[]args){

        Carro carro = new Carro();
        carro.setMarca(marca:"Fiat");
        carro.setModelo(modelo:"pailo fire");
        carro.setPlaca(placa:"EDD-2503");
        carro.setrRenavam(renavam:123456789);

        //SHIFT + ALT + SETA PARA BAIXO COPIA A LINHA

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenavam());
        

    }
}
