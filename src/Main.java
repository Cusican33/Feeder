
public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println(f.getCurrentFood());
        System.out.println(Math.random() < 0.05);
        //for (int i = 0; i < 100; i++)
        //{
           // System.out.println(Math.random() < 0.05);
            //System.out.println((int) (Math.random() * 41) + 10);
            //System.out.println(Math.random() < 0.05)
        //}
    }
}
