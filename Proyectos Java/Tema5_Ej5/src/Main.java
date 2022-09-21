public class Main {
    public static void main(String[] args) {
        var estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}