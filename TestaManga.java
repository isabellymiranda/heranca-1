public class TestaManga{
    public static void main(String[]args) {
        Manga manga=new Manga();
        manga.setFolhas("Mediana");
        manga.setRaizes("Poucas");
        manga.setTronco(1);
        manga.setFruto("0");

        System.out.println("Tamanho das folhas- "+manga.getFolhas());
        System.out.println("Quantidade de raizes- "+manga.getRaizes());
        System.out.println("Quantidade de Troncos- "+manga.getTronco());
        System.out.println("Frutos- "+manga.getFruto());
    }
}