public class Main {
    public static void main(String[] args) {

        Liste liste = new Liste();


        System.out.println("Aufgabe 8.3.1 |");
        liste.erzeugen();
        liste.anzeigen();
        liste.bubblesort();
        liste.anzeigen();
        System.out.println("Aufgabe 8.3.2 | ");
        TimeTest timeTest = new TimeTest();
        System.out.println("Aufgabe 8.4.1 | Selection Sort");
        liste.erzeugen();
        liste.anzeigen();
        liste.selectionSort();
        liste.anzeigen();
        System.out.println("Aufgabe 8.4.2 | Bublesort vs Selection Sort");
        liste.compareBubleSelection();
        System.out.println("Aufgabe 8.5.1 | Insertion Sort");
        liste.erzeugen();
        liste.anzeigen();
        liste.insertionSort();
        liste.anzeigen();
        System.out.println("Aufgabe 8.5.2 | Bublesort vs Insertion Sort");
        liste.compareBubleInsertion();

        //liste.compareBubleInsertion();
        //liste.compareBubleSelection();
        //liste.erzeugen();
        //liste.anzeigen();
        //liste.insertionSort();
        //liste.anzeigen();
        //TimeTest timeTest = new TimeTest();
        //int[] t = {1, 2, 7, 4, 5, 3, 2, 5};
        //System.out.println(timeTest.getMiniPos(t));
    }
}
