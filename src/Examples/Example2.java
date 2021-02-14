import java.util.*;

public class Example2 {

    //create enum for all the parts of speech
    enum Speech
    {
        ADJECTIVE("Placeholder [adjective] : To be updated..."),
        ADVERB("Placeholder [adverb] : To be updated..."),
        CONJUNCTION("Placeholder [conjunction] : To be updated..."),
        INTERJUNCTION("Placeholder [interjunction] : To be updated..."),
        NOUN("Placeholder [noun] : To be updated..."),
        PREPOSITION("Placeholder [preposition] : To be updated..."),
        PRONOUN("Placeholder [pronoun] : To be updated..."),
        VERB("Placeholder [verb] : To be updated...");

        private String value;

        Speech(String s) { this.value = s; }

        public String getValue() { return value; }
    };

    //creating enum for  definitions used in this program
    enum Data
    {
        LOADING("! Loading data..."),
        LOADING_COMPLETED("! Loading completed..."),
        PRINT("-----DICTIONARY 340 JAVA----"),
        OOPS("arguments must be a part of a speech or \"distinct\""),
        SEARCH("Search: ");

        private String value;

        Data(String s) { this.value = s; }

        public String getValue() { return value; }
    };

    //creating enum for all the definitions of CSC210 used in this program
    enum CSC210
    {
        ADJECTIVE1("CSC210 [adjective] : Comfortable with Objects and Classes"),
        ADJECTIVE2("CSC210 [adjective] : Ready for CSC 220"),
        NOUN("CSC210 [noun]Intro to Java "),
        VERB("CSC210 [verb] : To learn Java");

        private String value;

        CSC210(String s) { this.value = s; }

        public String getValue() { return value; }
    };

    //creating enum for all the definitions of CSC340 used in this program
    enum CSC340{
        ADJECTIVE("CSC340 [adjective] : = C++ version of CSC210 + CSC220 + more."),
        NOUN1("CSC340 [noun] : A CS upper division course."),
        NOUN2("CSC340 [noun] : Many hours outside of class."),
        NOUN3("CSC340 [noun] : Programming Methodology.");

        private String value;

        CSC340(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Verb used in this program
    enum Verb{
        Noun("Verb [noun] : Verb is a word or group of words that expresses an action (such as eat), an event\n" +
                "(such as happen) or a state (such as exist).");
        private String value;

        Verb(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Book used in this program
    enum Book {
        Noun1("Book [noun] : A set of pages."),
        Noun2("Book [noun] : A written work published in printed or electronic form."),
        Verb1("Book [verb] : To arrange for someone to have a seat on a plane."),
        Verb2("Book [verb] : To arrange something on a particular date.");
        private String value;

        Book(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Bookable used in this program
    enum Bookable {
        ADJECTIVE("Bookable [adjective] : Can be ordered in advance.");

        private String value;

        Bookable(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Conjunction used in this program
    enum Conjunction {
        NOUN("Conjunction [noun] : Conjunction is a word that joins words, phrases or sentences, for example 'and', 'but', 'or'.");

        private String value;

        Conjunction(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Interjection used in this program
    enum Interjection {
        NOUN("Interjection [noun] : Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections.");

        private String value;

        Interjection(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Adjective used in this program
    enum Adjective {
        NOUN("Adjective [noun] : Adjective is a word that describes a person or thing, for example big, red and clever in a big house, red wine and a clever idea.");

        private String value;

        Adjective(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    //creating enum for all the definitions of Exit used in this program
    enum Exit {
        NOTFOUND("<Not found>"),
        EXIT("-----THANK YOU-----");

        private String value;

        Exit(String s) { this.value = s; }

        public String getValue() { return value; }
    }

    public static void main(String[] args) {

        System.out.println(Data.LOADING.getValue());

        //Generating all the values required in the dictionary by using the values from enum
        List<String> noFilter = new ArrayList<>();
        noFilter.add(Speech.ADJECTIVE.value);
        noFilter.add(Speech.ADJECTIVE.value);
        noFilter.add(Speech.ADVERB.value);
        noFilter.add(Speech.CONJUNCTION.value);
        noFilter.add(Speech.INTERJUNCTION.value);
        noFilter.add(Speech.NOUN.value);
        noFilter.add(Speech.NOUN.value);
        noFilter.add(Speech.NOUN.value);
        noFilter.add(Speech.PREPOSITION.value);
        noFilter.add(Speech.PRONOUN.value);
        noFilter.add(Speech.VERB.value);

        List<String> distinct = new ArrayList<>();
        Arrays.stream(Speech.values()).forEach(speech -> distinct.add(speech.value));

        List<String> noun = new ArrayList<>();
        noun.add(Speech.NOUN.value);
        noun.add(Speech.NOUN.value);
        noun.add(Speech.NOUN.value);

        List<String> adjective = new ArrayList<>();
        adjective.add(Speech.ADJECTIVE.value);
        adjective.add(Speech.ADJECTIVE.value);

        List<String> csc210 = new ArrayList<>();
        Arrays.stream(CSC210.values()).forEach(speech -> csc210.add(speech.value));

        List<String> csc210noun = new ArrayList<>();
        csc210noun.add(CSC210.NOUN.getValue());

        List<String> csc210adjective = new ArrayList<>();
        csc210adjective.add(CSC210.ADJECTIVE1.getValue());
        csc210adjective.add(CSC210.ADJECTIVE2.getValue());

        List<String> csc210verb = new ArrayList<>();
        csc210verb.add(CSC210.VERB.getValue());

        List<String> cSC340 = new ArrayList<>();
        Arrays.stream(CSC340.values()).forEach(speech -> cSC340.add(speech.value));

        List<String> cSC340noun = new ArrayList<>();
        cSC340noun.add(CSC340.NOUN1.getValue());
        cSC340noun.add(CSC340.NOUN2.getValue());
        cSC340noun.add(CSC340.NOUN3.getValue());

        List<String> cSC340adjective = new ArrayList<>();
        cSC340adjective.add(CSC340.ADJECTIVE.getValue());


        List<String> verb = new ArrayList<>();
        Arrays.stream(Verb.values()).forEach(value -> verb.add(value.value));

        List<String> book = new ArrayList<>();
        Arrays.stream(Book.values()).forEach(value -> book.add(value.value));

        List<String> booknoun = new ArrayList<>();
        booknoun.add(Book.Noun1.getValue());
        booknoun.add(Book.Noun2.getValue());

        List<String> bookverb = new ArrayList<>();
        bookverb.add(Book.Verb1.getValue());
        bookverb.add(Book.Verb2.getValue());

        List<String> bookable = new ArrayList<>();
        bookable.add(Bookable.ADJECTIVE.getValue());

        List<String> conjunction = new ArrayList<>();
        conjunction.add(Conjunction.NOUN.getValue());

        List<String> interjectionnoun = new ArrayList<>();
        interjectionnoun.add(Interjection.NOUN.getValue());

        List<String> adjectivenoun = new ArrayList<>();
        adjectivenoun.add(Adjective.NOUN.getValue());

        List<String> exit = new ArrayList<>();
        exit.add(Exit.EXIT.getValue());

        List<String> notFound = new ArrayList<>();
        notFound.add(Exit.NOTFOUND.getValue());

        //Generating the dictionary and mapping the key-value pairs
        Map<String, Object> dictionary = new HashMap<>();
        dictionary.put("placeholder",noFilter);
        dictionary.put("distinct", distinct);
        dictionary.put("noun", noun);
        dictionary.put("adjective", adjective);
        dictionary.put("oops", Arrays.asList(Data.OOPS.getValue()));
        dictionary.put("csc210", csc210);
        dictionary.put("csc210noun", csc210noun);
        dictionary.put("csc210adjective", csc210adjective);
        dictionary.put("csc210verb", csc210verb);
        dictionary.put("csc340", cSC340);
        dictionary.put("csc340noun", cSC340noun);
        dictionary.put("csc340adjective", cSC340adjective);
        dictionary.put("verb", verb);
        dictionary.put("verbnoun", verb);
        dictionary.put("book", book);
        dictionary.put("booknoun", booknoun);
        dictionary.put("bookverb", bookverb);
        dictionary.put("bookable", bookable);
        dictionary.put("conjunction", conjunction);
        dictionary.put("interjectionnoun", interjectionnoun);
        dictionary.put("adjectivenoun", adjectivenoun);
        dictionary.put("exit", exit);
        dictionary.put("notFound", notFound);

        System.out.println(Data.LOADING_COMPLETED.getValue());
        System.out.println();
        System.out.println(Data.PRINT.getValue());
        System.out.println();

        //Taking the input search parameter from user and displaying the required data from the dictionary using the search key
        while (true) {
            Scanner reader = new Scanner(System.in);
            String userInput = null;
            String search = null;
            System.out.print(Data.SEARCH.getValue());
            userInput = reader.nextLine();

            //checking the number of arguments given by the user and handling the program accordingly so that it will not break
            String[] arr=userInput.split(" ");
            if (arr.length==1) {
                search = arr[0];
                getSearchResults(search, null, dictionary);
            }
            else if (arr.length==2) {
                if (arr[0].equalsIgnoreCase("placeholder"))
                    search = arr[1];
                else search = arr[0] + arr[1];
                getSearchResults(search,null,dictionary);
            }
            else if (arr.length==3) {
                if (arr[0].equalsIgnoreCase("placeholder"))
                    search = arr[1];
                else search = arr[0] + arr[1];
                getSearchResults(search, arr[2], dictionary);
            }
        }
    }

    public static void getSearchResults(String name, String arg2, Map dictionary){
        System.out.println("   |" );
        List<String> searchResult=null;
        if (name.equalsIgnoreCase("!Q")){
            searchResult = (List<String>) dictionary.get("exit");
        }
        else if (dictionary.containsKey(name)) {
            searchResult = (List<String>) dictionary.get(name);
        }
        else searchResult = (List<String>) dictionary.get("notFound");

        if (arg2!=null && arg2.equalsIgnoreCase("distinct")){
            new HashSet<>(searchResult).stream().forEach(s -> {
                System.out.print("     ");
                System.out.println(s);
            });
        }
        else {
            searchResult.stream().forEach(s -> {
                System.out.print("     ");
                System.out.println(s);
            });
        }

        System.out.println("   |" );
        if (name.equalsIgnoreCase("!Q")){
            System.exit(0);
        }
    }
}