import java.util.Random;

public class TimeTest {
    long start;
    long end;
    private int[] zahl;
    private int[] amount = {100, 200, 400, 800, 1600};
    private int MAX;
    public TimeTest()
    {

        for(int i = 0; i < amount.length; i++)
        {
            MAX = amount[i];
            zahl = new int[MAX];
            erzeugen();
            start = System.nanoTime();
            bubblesort();
            end = System.nanoTime();
            System.out.println("Zeit mit Länge " + MAX + " | " + (end-start));
        }
    }

    public void erzeugen()
    {
        Random zufall = new Random();
        for (int i=0; i<MAX; i++)
            zahl[i] = zufall.nextInt(10*MAX);
    }

    private void tausche(int index1, int index2)
    {
        int temp = zahl[index1];
        zahl[index1] = zahl[index2];
        zahl[index2] = temp;
    }

    public void bubblesort()
    {
        for (int durchgang = 1; durchgang < MAX; durchgang++)
            for (int index = 0; index < MAX-durchgang; index++)
                if (zahl[index] > zahl[index+1])
                    tausche(index,index+1);
    }
}
