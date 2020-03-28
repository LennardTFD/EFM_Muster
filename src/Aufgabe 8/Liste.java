import java.util.Random;

public class Liste
{
    public final int MAX = 10;
    private int[] zahl;

    public Liste()
    {
        zahl = new int[MAX];
    }

    public void erzeugen()
    {
        Random zufall = new Random();
        for (int i=0; i<MAX; i++)
            zahl[i] = zufall.nextInt(10*MAX);
    }

    public void anzeigen()
    // 10 Zeilen mit jeweils 10 Zahlen
    {
        for (int i=1; i<=MAX; i++)
        {
            System.out.print(zahl[i-1]+"\t");
            // nach jeweils 10 Zahlen erfolgt ein Zeilenumbruch
            if (i % 10 == 0) System.out.println();
        }
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

    public int getMiniPos(int entry)
    {
        int min = entry;
        for(int i = min; i < zahl.length; i++)
            if(zahl[i] < zahl[min])
                min = i;
        return min;
    }

    public void selectionSort()
    {
        int min;
        for(int i = 0; i < zahl.length; i++)
        {
            min = getMiniPos(i);
            int tmp = zahl[min];
            zahl[min] = zahl[i];
            zahl[i] = tmp;
        }
    }

    public void compareBubleSelection()
    {
        erzeugen();
        long start;
        long end;
        int [] clonedArray = new int[MAX];
        for(int i = 0; i < clonedArray.length; i++)
        {
            clonedArray[i] = zahl[i];
        }

        start = System.nanoTime();
        bubblesort();
        end = System.nanoTime();
        long bubleSortTime = end-start;
        zahl = clonedArray;
        start = System.nanoTime();
        selectionSort();
        end = System.nanoTime();
        long selectionSortTime = end-start;
        if(selectionSortTime > bubleSortTime)
        {
            System.out.println("Bublesort ist schneller");
        }
        else
        {
            System.out.println("Selection Sort ist schneller");
        }
    }

    public void insertionSort()
    {
        int tmp;

        for(int i = 1; i < zahl.length; i++)
        {
            tmp = zahl[i];
            int j = i;
            while(j > 0 && zahl[j - 1] > tmp)
            {
                zahl[j] = zahl[j - 1];
                j--;
            }

            zahl[j] = tmp;
        }
    }

    public void compareBubleInsertion()
    {
        erzeugen();
        long start;
        long end;
        int [] clonedArray = new int[MAX];
        for(int i = 0; i < clonedArray.length; i++)
        {
            clonedArray[i] = zahl[i];
        }

        start = System.nanoTime();
        bubblesort();
        end = System.nanoTime();
        long bubleSortTime = end-start;
        zahl = clonedArray;
        start = System.nanoTime();
        insertionSort();
        end = System.nanoTime();
        long insertionSortTime = end-start;
        if(insertionSortTime > bubleSortTime)
        {
            System.out.println("Bublesort ist schneller");
        }
        else
        {
            System.out.println("Insertion Sort ist schneller");
        }
    }
}