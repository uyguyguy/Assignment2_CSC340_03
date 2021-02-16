/****************************************************************
 *
 * File: Assignment-02
 * By: Shixin Wang & Siqi Guo
 * Date: 2/15/2021
 *
 * Description: it's a dictionary, user can type in the word and
 * the system will give its definition
 *
 ****************************************************************/

import java.util.*;

public class Assignment2_CSC340 implements DictionaryDataInterface{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Message.LOADING_START.getMessage());
        // loads all the original data into dictionary
        Map<String, Object> dictionary = new HashMap<>();
        dictionary.put(WordList.ARROW.getNameLowerCase(), Action.getWordByName(WordList.ARROW.getName()));
        dictionary.put(WordList.BOOK.getNameLowerCase(), Action.getWordByName(WordList.BOOK.getName()));
        dictionary.put(WordList.DISTINCT.getNameLowerCase(), Action.getWordByName(WordList.DISTINCT.getName()));
        dictionary.put(WordList.PLACEHOLDER.getNameLowerCase(), Action.getWordByName(WordList.PLACEHOLDER.getName()));
        dictionary.put(WordList.REVERSE.getNameLowerCase(), Action.getWordByName(WordList.REVERSE.getName()));
        dictionary.put(WordList.INDEPENDENCE.getNameLowerCase(), Action.getWordByName(WordList.INDEPENDENCE.getName()));
        dictionary.put(WordList.YES.getNameLowerCase(), Action.getWordByName(WordList.YES.getName()));
        dictionary.put(WordList.HOUSE.getNameLowerCase(), Action.getWordByName(WordList.HOUSE.getName()));
        dictionary.put(WordList.DATE.getNameLowerCase(), Action.getWordByName(WordList.DATE.getName()));
        dictionary.put(WordList.OPTIONAL.getNameLowerCase(), Action.getWordByName(WordList.OPTIONAL.getName()));
        dictionary.put(WordList.KEY.getNameLowerCase(), Action.getWordByName(WordList.KEY.getName()));
        dictionary.put(WordList.GIFT.getNameLowerCase(), Action.getWordByName(WordList.GIFT.getName()));
        dictionary.put(WordList.OUTSPOKEN.getNameLowerCase(), Action.getWordByName(WordList.OUTSPOKEN.getName()));
        dictionary.put(WordList.DEFEND.getNameLowerCase(), Action.getWordByName(WordList.DEFEND.getName()));
        dictionary.put(WordList.FINAL.getNameLowerCase(), Action.getWordByName(WordList.FINAL.getName()));
        dictionary.put(WordList.ILL.getNameLowerCase(), Action.getWordByName(WordList.ILL.getName()));
        dictionary.put(WordList.YEAR.getNameLowerCase(), Action.getWordByName(WordList.YEAR.getName()));
        dictionary.put(WordList.SOFTEN.getNameLowerCase(), Action.getWordByName(WordList.SOFTEN.getName()));
        dictionary.put(WordList.FRIENDLY.getNameLowerCase(), Action.getWordByName(WordList.FRIENDLY.getName()));

        Map<String, Object> dataType = new HashMap<>();
        dataType.put(WordType.NOUN.getName(), WordType.NOUN);
        dataType.put(WordType.VERB.getName(), WordType.VERB);
        dataType.put(WordType.ADJECTIVE.getName(), WordType.ADJECTIVE);
        dataType.put(WordType.ADVERB.getName(), WordType.ADVERB);
        dataType.put(WordType.CONJUNCTION.getName(), WordType.CONJUNCTION);
        dataType.put(WordType.INTERJECTION.getName(), WordType.INTERJECTION);
        dataType.put(WordType.PRONOUN.getName(), WordType.PRONOUN);
        dataType.put(WordType.PREPOSITION.getName(), WordType.PREPOSITION);


        // Loading ends here
        System.out.println(Message.LOADING_END.getMessage());

        System.out.println();
        System.out.println(Message.TITLE.getMessage());
        System.out.println(Message.OVERVIEW.getMessage());
        System.out.println();

        int num = 1; // number of searching times
        String userInput; // user's input
        // do loop until user decided to quit
            do {
                System.out.print(Message.SEARCH.getMessage() + " [" + num + "] : ");
                userInput = sc.nextLine();
                Action.printSearchResult(userInput, dictionary, dataType);
                num++;
            } while (!userInput.equalsIgnoreCase("!q"));

            System.out.println();
            System.out.println(Message.EXIST.getMessage());

    }

}

