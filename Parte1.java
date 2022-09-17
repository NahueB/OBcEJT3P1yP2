public class Parte1
{
    public static void main(String[] args)
    {
        int suma=suma(1,2,3);
        System.out.println("SUMA:");
        System.out.println(suma);

        Coche micoche=new Coche();
        micoche.AnadirPuerta();
        System.out.println("PUERTAS:");
        System.out.println(micoche.puerta);
    }
    public static int suma(int a, int b,int c)
    {
        return a+b+c;
    }
}
class Coche
{
    public int puerta = 0;

    public void AnadirPuerta()
    {
        this.puerta++;
    }
}