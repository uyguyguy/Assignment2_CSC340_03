import java.util.*;

public class Action implements DictionaryDataInterface{
    public static HashSet<String> set = new HashSet<String>();

    public static void printSearchResult(String userInput, Map dictionary, Map dataType) {
        userInput = userInput.toLowerCase(); // turn all letter to lower case
        //checking the number of arguments given by the user
        String[] arr = userInput.split(" ");

        // if input length larger than 4, call out introduction
        if (arr.length > 4 || userInput.isEmpty()) {
            System.out.println(Message.INSTRUCTION.getMessage());
        } else {
            List<WordFullMean> finalWord = new ArrayList<>();
            // for argue if list is empty
            boolean x = false;
            OUT:
            for (int i = 0; i < arr.length; i++) {

                // argue on the first word
                if (i == 0) {
                    // to exist program
                    if (arr[i].equalsIgnoreCase("!q")) {
                        break OUT;
                        // print introduction
                    } else if (arr[i].equalsIgnoreCase("!help")) {
                        System.out.println(Message.INSTRUCTION.getMessage());
                        break OUT;
                        // print when word unreadable
                    } else if (!dictionary.containsKey(arr[i])) {
                        printMessageError(i, arr[i]);
                        // store the word into list
                    } else if (dictionary.containsKey(arr[i])) {
                        finalWord = getWordByName(arr[i]);
                        x = true;
                    }
                }

                // argue on the 2nd word
                if (i == 1) {
                    if (arr[i].equalsIgnoreCase("!help")) {
                        System.out.println(Message.INSTRUCTION.getMessage());
                        // check if the word has the type
                    } else if (dataType.containsKey(arr[i])) {
                        finalWord = getWordByType(arr[i], finalWord);
                        // reverse word definition
                    } else if (arr[i].equalsIgnoreCase("reverse")) {
                        finalWord = getWordReverse(finalWord);
                        // distinct word definition
                    } else if (arr[i].equalsIgnoreCase("distinct")) {
                        finalWord = getWordDistinct(finalWord);
                        // check if the word type exist
                    } else if (!checkIsHaveValue(arr[i], finalWord)) {
                        printMessageError(0, arr[i]);
                        x = false;
                        // print when word unreadable
                    } else if (!dictionary.containsKey(arr[i])) {
                        printMessageError(i, arr[i]);
                    }
                }

                // argue on 3rd
                if (i == 2) {
                    if (arr[i].equalsIgnoreCase("reverse")) {
                        finalWord = getWordReverse(finalWord);
                        // distinct word definition
                    } else if (arr[i].equalsIgnoreCase("distinct")) {
                        finalWord = getWordDistinct(finalWord);
                        // print when word unreadable
                    } else if (!dictionary.containsKey(arr[i])) {
                        printMessageError(i, arr[i]);
                    }
                }

                if (i == 3) {
                    if (arr[i].equalsIgnoreCase("reverse")) {
                        finalWord = getWordReverse(finalWord);
                        // print when word unreadable
                    } else if (!dictionary.containsKey(arr[i]) || arr[i].equalsIgnoreCase("distinct")) {
                        printMessageError(i, arr[i]);
                    }
                }
            }

            // if list has data, then print
            if(x == true) {
                printWord(finalWord);
            }
        }
    }


    // print all definition of a word
    public static void printWord(List<WordFullMean> word){
        System.out.println("   |");
        for (int i = 0; i < word.size(); i++) {
            System.out.println("    " + word.get(i));
        }
        System.out.println("   |");
    }

    // print message if no vocab in dictionary
    public static void printMessageError(int place, String word) {
        List<String> message = new ArrayList<>();
        place = place+1;
        if (place == 1) {
            message.add(Message.MISSING_WORD.getMessage());
            message.add(Message.INSTRUCTION.getMessage());
        }
        if (place == 2) {
            message.add("|");
            message.add("<The entered " + place + "nd parameter '"+ word +"' is NOT a part of speech.>");
            message.add("<The entered " + place + "nd parameter '"+ word +"' is NOT 'distinct'.>");
            message.add("<The entered " + place + "nd parameter '"+ word +"' is NOT 'reverse'.>");
            message.add("<The entered " + place + "nd parameter '"+ word +"' was disregarded.>");
            message.add("<The " + place + "nd parameter should be a part of speech or 'distinct' or 'reverse'.");
            message.add("|");
        } else if (place == 3) {
            message.add("|");
            message.add("<The entered " + place + "rd parameter '"+ word +"' is NOT 'distinct'.>");
            message.add("<The entered " + place + "rd parameter '"+ word +"' is NOT 'reverse'.>");
            message.add("<The entered " + place + "rd parameter '"+ word +"' was disregarded.>");
            message.add("<The " + place + "nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
            message.add("|");
        } else if (place == 4) {
            message.add("|");
            message.add("<The entered " + place + "th parameter '"+ word +"' is NOT 'reverse'.>");
            message.add("<The entered " + place + "th parameter '"+ word +"' was disregarded.>");
            message.add("<The " + place + "th parameter should be 'reverse'");
            message.add("|");
        }
        if (place != 1) {
            for (int i = 0; i < message.size(); i++) {
                System.out.println("   " + message.get(i));
            }
        } else {
            for (int i = 0; i < message.size(); i++) {
                System.out.println(message.get(i));
            }
        }
    }


    // get all a word's definition in a type
    public static List<WordFullMean> getWordByType(String type, List<WordFullMean> wordFullInfo) {
        List<WordFullMean> wordByType = new ArrayList<>();

        for (WordFullMean word : wordFullInfo) {
            if (word.getType().equalsIgnoreCase(type)) {
                wordByType.add(word);
            }
        }

        return wordByType;
    }

    // get all definition of a word into a list
    public static List<WordFullMean> getWordByName(String wordName) {
        List<WordFullMean> wordFullInfo = new ArrayList<>();
        for (WordFullMean word : WordFullMean.values()) {
            if (word.getName().equalsIgnoreCase(wordName)) {
                wordFullInfo.add(word);
            }
        }
        return wordFullInfo;
    }

    // inverse a word's definition
    public static List<WordFullMean> getWordReverse(List<WordFullMean> fullInfo) {
        Collections.reverse(fullInfo);
        return fullInfo;
    }

    // get all distinct definition of a word
    public static List<WordFullMean> getWordDistinct(List<WordFullMean> fullInfo) {
        for (int i = 0; i < fullInfo.size() - 1; i++) {
            for (int j = fullInfo.size() - 1; j > i; j--) {
                if (fullInfo.get(j).getType().equals(fullInfo.get(i).getType()) && fullInfo.get(j).getMean().equals(fullInfo.get(i).getMean())) {
                    fullInfo.remove(j);
                }
            }
        }
        return fullInfo;
    }

    // count number of definitions
    public static int getNumDefinitions() {
        return DictionaryDataInterface.WordFullMean.values().length;
    }

    // count number of keywords
    public static int getNumKeywords() {
        DictionaryDataInterface.WordFullMean[] words = DictionaryDataInterface.WordFullMean.values();
        String[] wordMean = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            wordMean[i] = words[i].getName();
        }
        return getNonRepeat(wordMean);
    }

    // count number of non-repeat value in a array
    public static int getNonRepeat(String[] array) {
        for(String str : array)
        {
            set.add(str);
        }
        return set.size();
    }

    // argue if list has the value
    public static boolean checkIsHaveValue(String name, List<WordFullMean> list) {
        Map<String, WordFullMean> word = new HashMap<>();
        for(int i = 0; i < list.size(); i++) {
            word.put(list.get(i).getType(), list.get(i));
        }
        if (word.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

}
