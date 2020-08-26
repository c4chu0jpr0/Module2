package FileAdd;

import PackageWord.Example;
import PackageWord.Meaning;
import PackageWord.TypeWord;
import PackageWord.Word;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckAdd {

    public void check(String word,ArrayList<Word> arrayList){
        ArrayList<Example> meaningsList= new ArrayList<>();
        ArrayList<Meaning> typeWordList= new ArrayList<>();
        ArrayList<TypeWord> wordsList = new ArrayList<>();
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        do {
            startP:{
                System.out.println("1. Noun");
                System.out.println("2. Verb");
                System.out.println("3. Adj");
                System.out.println("4. Save");
                System.out.print("Input number: ");
                String choice =scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.print("Input synonym word: ");
                    String synonymNoun= scanner.nextLine();
                    String typeWordNoun = "Noun";
                    System.out.print("Input is meaning: ");
                    String meanNoun= scanner.nextLine();
                    System.out.print("Example: ");
                    String exampleNoun = scanner.nextLine();

                    Example exampleN = new Example(exampleNoun);
                    meaningsList.add(exampleN);
                    Meaning meaningNoun = new Meaning(meanNoun, meaningsList);
                    typeWordList.add(meaningNoun);
                    TypeWord typeWordN = new TypeWord(typeWordNoun,typeWordList);
                    wordsList.add(typeWordN);
                    Word wordNoun= new Word(word,wordsList,synonymNoun);

                    arrayList.add(wordNoun);
                    check= false;
                    break;
                case "2":
                    System.out.print("Input synonym word: ");
                    String synonymVerb= scanner.nextLine();
                    String typeWordVerb = "Verb";
                    System.out.print("Input is meaning: ");
                    String meanVerb= scanner.nextLine();
                    System.out.print("Example: ");
                    String exampleVerb = scanner.nextLine();

                    Example exampleV = new Example(exampleVerb);
                    meaningsList.add(exampleV);
                    Meaning meaningVerb = new Meaning(meanVerb, meaningsList);
                    typeWordList.add(meaningVerb);
                    TypeWord typeWordV = new TypeWord(typeWordVerb,typeWordList);
                    wordsList.add(typeWordV);
                    Word wordVerb= new Word(word,wordsList,synonymVerb);

                    arrayList.add(wordVerb);
                    check= false;
                    break;
                case "3":
                    System.out.print("Input synonym word: ");
                    String synonymAdj= scanner.nextLine();
                    String typeWordAdj = "Adj";
                    System.out.print("Input is meaning: ");
                    String meanAdj= scanner.nextLine();
                    System.out.print("Example: ");
                    String exampleAdj = scanner.nextLine();

                    Example exampleA = new Example(exampleAdj);
                    meaningsList.add(exampleA);
                    Meaning meaningAdj = new Meaning(meanAdj, meaningsList);
                    typeWordList.add(meaningAdj);
                    TypeWord typeWordA = new TypeWord(typeWordAdj,typeWordList);
                    wordsList.add(typeWordA);
                    Word wordAdj= new Word(word,wordsList,synonymAdj);

                    arrayList.add(wordAdj);
                    check=false;
                    break;
                case "4":
                    break startP;
                }
            }
        }while (check);

    }
}
