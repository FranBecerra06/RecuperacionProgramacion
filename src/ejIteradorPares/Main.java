package ejIteradorPares;

public class Main {
    public static void main(String[] args) {
        // Se crea un RangoPares entre 10 y 30
        RangoPares rangoPares = new RangoPares(10, 30);
        
        // Se recorre utilizando for-each, se imprimen solo los números pares
        for (Integer num : rangoPares) {
            System.out.println(num);
        }
    }
}
