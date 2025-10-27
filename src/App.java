public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Porfavor introduzca 10 numeros enteros.");

        int neg = 0;
        int pos = 0;

        for(int i = 0; i < 10; i++){
           if (Integer.parseInt(System.console().readLine()) < 0 ){
            neg++;
           } else {
            pos++;
           }
        }
        System.out.println("Hay "+pos+" números positivos y "+neg+" números negativos.");
    }
}
