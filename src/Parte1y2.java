public class Parte1y2
{
    public static void main(String[] args)
    {
        int suma=suma(1,2,3);
        System.out.println("La suma es:"+suma);

        Coche micoche=new Coche();
        micoche.AnadirPuerta();
        System.out.println("El numero de puertas es: " + micoche.puerta);
    }
    public static int suma(int a, int b,int c)
    {
        return a+b+c;
    }
}
class Coche
{
    public int puerta = 4;

    public void AnadirPuerta()
    {
        this.puerta++;
    }
}
