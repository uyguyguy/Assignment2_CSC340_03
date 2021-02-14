import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table;
import java.util.Scanner;

/**
 *
 * @author green
 */
public class MichaelExample {

    enum pos {
        adjective, adverb, noun, conjunction, interjection, preposition, pronoun, verb
    }

    private enum Words {
        ENTRY0("Distinct", pos.adjective, "Familiar. Worked in Java."),
        ENTRY1("Distinct", pos.adjective, "Unique. No duplicates. Clearly different or of a different kind."),
        ENTRY2("Distinct", pos.adverb, "Uniquely. Written \"distinctly\"."),
        ENTRY3("Distinct", pos.noun, "A keyword in this assignment."),
        ENTRY4("Distinct", pos.noun, "A keyword in this assignment."),
        ENTRY5("Distinct", pos.noun, "A keyword in this assignment."),
        ENTRY6("Distinct", pos.noun, "An advanced search option."),
        ENTRY7("Distinct", pos.noun, "Distinct is a parameter in this assignment."),
        ENTRY8("Placeholder", pos.adjective, "To be updated..."),
        ENTRY9("Placeholder", pos.adjective, "To be updated..."),
        ENTRY10("Placeholder", pos.adverb, "To be updated..."),
        ENTRY11("Placeholder", pos.conjunction, "To be updated..."),
        ENTRY12("Placeholder", pos.interjection, "To be updated..."),
        ENTRY13("Placeholder", pos.noun, "To be updated..."),
        ENTRY14("Placeholder", pos.noun, "To be updated..."),
        ENTRY15("Placeholder", pos.noun, "To be updated..."),
        ENTRY16("Placeholder", pos.preposition, "To be updated..."),
        ENTRY17("Placeholder", pos.pronoun, "To be updated..."),
        ENTRY18("Placeholder", pos.verb, "To be updated..."),
        ENTRY19("CSC340", pos.adjective, "= C++ version of CSC210 + CSC220 + more."),
        ENTRY20("CSC340", pos.noun, "A CS upper division course."),
        ENTRY21("CSC340", pos.noun, "Many hours outside of class."),
        ENTRY22("CSC340", pos.noun, "Programming Methodology."),
        ENTRY23("CSC220", pos.adjective, "Ready to create complex data structures."),
        ENTRY24("CSC220", pos.verb, "To create data structures."),
        ENTRY25("Book", pos.noun, "A set of pages."),
        ENTRY26("Book", pos.noun, "A written work published in printed or electronic form."),
        ENTRY27("Book", pos.verb, "To arrange for someone to have a seat on a plane."),
        ENTRY28("Book", pos.verb, "To arrange something on a particular date."),
        ENTRY29("Adverb", pos.noun, "Adverb is a word that adds more information about place, time, manner, cause or degree to a verb, an adjective, a phrase or another adverb."),
        ENTRY30("Adjective", pos.noun, "Adjective is a word that describes a person or thing, for example big, red and\n"
                + "clever in a big house, red wine and a clever idea."),
        ENTRY31("Interjection", pos.noun, "Interjection is a short sound, word or phrase spoken suddenly to express an\n"
                + "emotion. Oh!, Look out! and Ow! are interjections."),
        ENTRY32("Noun", pos.noun, "Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris\n"
                + "or city) or a thing, a quality or an activity (such as plant, sorrow or tennis."),;

        private String word;
        private pos pos1;
        private String def;

        private Words(String word, pos pos1, String def) {
            this.word = word;
            this.pos1 = pos1;
            this.def = def;
        }

        public String getWord() {
            return this.word;
        }

        public pos getPos() {

            return this.pos1;
        }

        public String getDef() {
            return this.def;
        }

        @Override
        public String toString() {
            return this.word + " [" + this.pos1 + "]" + " : " + this.def;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("! Loading data...");
        Multimap<String, String> greenDictionary = ArrayListMultimap.create();
        SetMultimap<String, String> distinctDictionary = HashMultimap.create();
        Table<String, pos, String> distinctTable = HashBasedTable.create();

        int i = 0;

        for (Words entry : Words.values()) {
            greenDictionary.put(entry.getWord(), entry + "\n");
            distinctDictionary.put(entry.getWord(), entry + "\n");
            distinctTable.put(entry.getWord(), entry.getPos(), entry.getDef());
        }
        System.out.println("! Loading completed...");
        System.out.println("-----DICTIONARY 340 JAVA-----");
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num < 100) {
            System.out.print("Search: ");
            String Entry = sc.nextLine(); // scanner input        

            if (Entry.equals("!q")) {
                break;
            }
            Entry = Entry.toLowerCase();
            Entry = Entry.substring(0, 1).toUpperCase() + Entry.substring(1);

            String[] userInput = Entry.split(" ");
            if (greenDictionary.containsKey(userInput[0])) {
                if (userInput.length == 1) {
                    System.out.println("	| \n	" + Entry + " : " + greenDictionary.get(Entry) + "\n	| \n");
                    System.out.println("3");
                } else if (userInput.length <= 3) {

                    if (userInput[1].equals("distinct")) {
                        System.out.println("	| \n	" + userInput[0] + ":" + distinctDictionary.get(userInput[0]) + "\n	| \n");
                        System.out.println("1");
                    }

                    if (userInput[1].equals("adjective") || userInput[1].equals("adverb") || userInput[1].equals("conjunction") || userInput[1].equals("interjection") || userInput[1].equals("noun") || userInput[1].equals("preposition") || userInput[1].equals("pronoun") || userInput[1].equals("verb")) {
                        System.out.println("	| \n	" + userInput[0] + ":" + "[" + userInput[1] + "] " + distinctTable.get(userInput[0], Enum.valueOf(pos.class, userInput[1])) + "\n	| \n");
                        System.out.println("2");
                    }

                } else {
                    continue;
                }
            } else {
                System.out.println("	| \n	" + "Not found." + "\n	| \n");
            }
            num++;
        }
        System.out.println("-----THANK YOU-----");
    }
}