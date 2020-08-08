

public class TreeMap {
    private static void checkTreeMap(){
        CountWordInMap<String> counts = new CountWordInMap<String>();
        counts.push("Tùy");
        counts.push("Cơ");
        counts.push("Ứng");
        counts.push("Biến");
        counts.printList();

        System.out.println();
        counts.checkWord("Hay Chưa");
        counts.printList();
    }

    public static void main(String[] args) {
        checkTreeMap();
    }
}
