public interface DictionaryDataInterface {
    // all words in the dictionary
    enum WordList {
        ARROW("Arrow"),
        BOOK("Book"),
        DISTINCT("Distinct"),
        PLACEHOLDER("Placeholder"),
        REVERSE("Reverse"),
        INDEPENDENCE("Independence"),
        YES("Yes"),
        HOUSE("House"),
        DATE("Date"),
        OPTIONAL("Optional"),
        KEY("Key"),
        GIFT("Gift"),
        OUTSPOKEN("Outspoken"),
        DEFEND("Defend"),
        FINAL("Final"),
        ILL("Ill"),
        YEAR("Year"),
        SOFTEN("Soften"),
        FRIENDLY("Friendly");


        private String name;

        WordList(String name) {
            setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameLowerCase() {
            return name.toLowerCase();
        }
    }

    // all kinds word's type
    enum WordType {
        NOUN("noun"),
        VERB("verb"),
        ADJECTIVE("adjective"),
        ADVERB("adverb"),
        CONJUNCTION("conjunction"),
        INTERJECTION("interjection"),
        PREPOSITION("preposition"),
        PRONOUN("pronoun");

        private String name;

        WordType(String name) {
            setName(name);
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // all messages which would send to user in different conditions
    enum Message {
        EMPTY_MEAN_WARNING("To be updated..."),
        LOADING_START("! Loading data..."),
        LOADING_END("! Loading completed..."),
        TITLE("===== DICTIONARY 340 JAVA ====="),
        OVERVIEW("----- Keywords: " + Action.getNumKeywords() +
                "\n----- Definitions: " + Action.getNumDefinitions()),
        MISSING_WORD("   |" +
                "\n   <NOT FOUND> To be considered for the next release. Thank you." +
                "\n   |"),
        INSTRUCTION("   |" +
                "\n   PARAMETER HOW-TO, please enter:" +
                "\n   1. A search key -then 2. An optional part of speech -then" +
                "\n   3. An optional 'distinct' -then 4. An optional 'reverse'" +
                "\n   |"),
        EXIST("-----THANK YOU-----"),
        SEARCH("Search");

        private String str;

        Message(String str) {
            setMessage(str);
        }

        public void setMessage(String str) {
            this.str = str;
        }

        public String getMessage() {
            return str;
        }
    }

    // all words with its characteristic and definition
    enum WordFullMean {
        // Arrow
        ARROW_NOUN(WordList.ARROW.getName(), WordType.NOUN.getName(), "Here is one arrow: <IMG> -=>> </IMG>"),
        // Book
        BOOK_NOUN1(WordList.BOOK.getName(), WordType.NOUN.getName(), "A set of pages."),
        BOOK_NOUN2(WordList.BOOK.getName(), WordType.NOUN.getName(), "A written work published in printed or electronic form."),
        BOOK_VERB1(WordList.BOOK.getName(), WordType.VERB.getName(), "To arrange for someone to have a seat on a plane."),
        BOOK_VERB2(WordList.BOOK.getName(), WordType.VERB.getName(), "To arrange something on a particular date."),
        // Distinct
        DISTINCT_ADJECTIVE1(WordList.DISTINCT.getName(), WordType.ADJECTIVE.getName(), "Familiar. Worked in Java."),
        DISTINCT_ADJECTIVE2(WordList.DISTINCT.getName(), WordType.ADJECTIVE.getName(), "Unique. No duplicates. Clearly different or of a different kind."),
        DISTINCT_ADVERB(WordList.DISTINCT.getName(), WordType.ADVERB.getName(), "Uniquely. Written \"distinctly\"."),
        DISTINCT_NOUN1(WordList.DISTINCT.getName(), WordType.NOUN.getName(), "A keyword in this assignment."),
        DISTINCT_NOUN2(WordList.DISTINCT.getName(), WordType.NOUN.getName(), "A keyword in this assignment."),
        DISTINCT_NOUN3(WordList.DISTINCT.getName(), WordType.NOUN.getName(), "A keyword in this assignment."),
        DISTINCT_NOUN4(WordList.DISTINCT.getName(), WordType.NOUN.getName(), "An advanced search option."),
        DISTINCT_NOUN5(WordList.DISTINCT.getName(), WordType.NOUN.getName(), "Distinct is a parameter in this assignment."),
        // Placeholder
        PLACEHOLDER_ADJECTIVE1(WordList.PLACEHOLDER.getName(), WordType.ADJECTIVE.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_ADJECTIVE2(WordList.PLACEHOLDER.getName(), WordType.ADJECTIVE.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_ADVERB(WordList.PLACEHOLDER.getName(), WordType.ADVERB.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_CONJUNCTION(WordList.PLACEHOLDER.getName(), WordType.CONJUNCTION.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_INTERJECTION(WordList.PLACEHOLDER.getName(), WordType.INTERJECTION.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_NOUN1(WordList.PLACEHOLDER.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_NOUN2(WordList.PLACEHOLDER.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_NOUN3(WordList.PLACEHOLDER.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_PREPOSITION(WordList.PLACEHOLDER.getName(), WordType.PREPOSITION.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_PRONOUN(WordList.PLACEHOLDER.getName(), WordType.PRONOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        PLACEHOLDER_VERB(WordList.PLACEHOLDER.getName(), WordType.VERB.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        // Reverse
        REVERSE_ADJECTIVE1(WordList.REVERSE.getName(), WordType.ADJECTIVE.getName(), "On back side."),
        REVERSE_ADJECTIVE2(WordList.REVERSE.getName(), WordType.ADJECTIVE.getName(), "Opposite to usual or previous arrangement."),
        REVERSE_NOUN1(WordList.REVERSE.getName(), WordType.NOUN.getName(), "A dictionary program's parameter."),
        REVERSE_NOUN2(WordList.REVERSE.getName(), WordType.NOUN.getName(), "Change to opposite direction."),
        REVERSE_NOUN3(WordList.REVERSE.getName(), WordType.NOUN.getName(), "The opposite."),
        REVERSE_NOUN4(WordList.REVERSE.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        REVERSE_NOUN5(WordList.REVERSE.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        REVERSE_NOUN6(WordList.REVERSE.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        REVERSE_NOUN7(WordList.REVERSE.getName(), WordType.NOUN.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        REVERSE_VERB1(WordList.REVERSE.getName(), WordType.VERB.getName(), "Change something to opposite."),
        REVERSE_VERB2(WordList.REVERSE.getName(), WordType.VERB.getName(), "Go back."),
        REVERSE_VERB3(WordList.REVERSE.getName(), WordType.VERB.getName(), "Revoke ruling."),
        REVERSE_VERB4(WordList.REVERSE.getName(), WordType.VERB.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        REVERSE_VERB5(WordList.REVERSE.getName(), WordType.VERB.getName(), Message.EMPTY_MEAN_WARNING.getMessage()),
        REVERSE_VERB6(WordList.REVERSE.getName(), WordType.VERB.getName(), "Turn something inside out."),
        // Independence
        INDEPENDENCE_NOUN1(WordList.INDEPENDENCE.getName(), WordType.NOUN.getName(), "Freedom from political control by other countries."),
        INDEPENDENCE_NOUN2(WordList.INDEPENDENCE.getName(), WordType.NOUN.getName(), "The time when a country gains freedom from political control by another country."),
        INDEPENDENCE_NOUN3(WordList.INDEPENDENCE.getName(), WordType.NOUN.getName(), "The freedom to organize your own life,make your own decisions,etc..without needing help from other people"),
        // Yes
        YES_NOUN1(WordList.YES.getName(), WordType.NOUN.getName(), "Used to answer a question and say that sth is correct or ture."),
        YES_NOUN2(WordList.YES.getName(), WordType.NOUN.getName(), "Used to show that you agree with what has been said."),
        YES_NOUN3(WordList.YES.getName(), WordType.NOUN.getName(), "Used to agree to a request or to give permission."),
        // House
        HOUSE_NOUN(WordList.HOUSE.getName(), WordType.NOUN.getName(), "A building for people to live in, useally for one family."),
        HOUSE_VERB(WordList.HOUSE.getName(), WordType.VERB.getName(), "To provide a place for sb to live."),
        // Date
        DATE_NOUN1(WordList.DATE.getName(), WordType.NOUN.getName(), "A time in the past or future that is not a particular day."),
        DATE_NOUN2(WordList.DATE.getName(), WordType.NOUN.getName(), "An arrangement to meet sb at a particlar time."),
        DATE_VERB1(WordList.DATE.getName(), WordType.VERB.getName(), "To write or print the date on sth."),
        DATE_VERB2(WordList.DATE.getName(), WordType.VERB.getName(), "To say when sth old existed or was made."),
        // Optional
        OPTIONAL_ADJECTIVE(WordList.OPTIONAL.getName(), WordType.ADJECTIVE.getName(), "That you can choose to do or have if you want to."),
        // Key
        KEY_NOUN(WordList.KEY.getName(), WordType.NOUN.getName(), "A spacially shaped piece of metal used for locking a door,starting a car,etc."),
        // Gift
        GIFT_VERB(WordList.GIFT.getName(), WordType.VERB.getName(), "To give sth to sb wothout their having to make any effort to get it."),
        // Outspoken
        OUTSPOKEN_ADJECTIVE(WordList.OUTSPOKEN.getName(), WordType.ADJECTIVE.getName(), "Saying wxactly what you think, even if this shocks or offends people."),
        // Defend
        DEFEND_VERB(WordList.DEFEND.getName(), WordType.VERB.getName(), "To protect sb/sth from attack."),
        // Final
        FINAL_ADJECTIVE(WordList.FINAL.getName(), WordType.ADJECTIVE.getName(), "Being or happening at the end of a series of events,actions,statements,etc."),
        // Ill
        ILL_ADVERB(WordList.ILL.getName(), WordType.ADVERB.getName(), "Badly or in an unpleasant way."),
        // Year
        YEAR_NOUN(WordList.YEAR.getName(), WordType.NOUN.getName(), "The period from 1 january to 31 December, that 365 or 366 days,12 mounths."),
        // Soften
        SOFTEN_VERB(WordList.SOFTEN.getName(), WordType.VERB.getName(), "To become, or to make sth softer."),
        // Friendly
        FRIENDLY_ADJECTIVE(WordList.FRIENDLY.getName(), WordType.ADJECTIVE.getName(), "Behaving in a kind and pleasant way because you like sb or want to help them.");
        private String name;
        private String type;
        private String mean;

        WordFullMean(String name, String type, String mean) {
            setName(name);
            setType(type);
            setMean(mean);
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMean() {
            return this.mean;
        }

        public void setMean(String mean) {
            this.mean = mean;
        }

        @Override
        public String toString() {
            return name + " [" + type + "] : " + mean;
        }
    }
}
