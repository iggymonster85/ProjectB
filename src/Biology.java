
public class Biology {
    public String _question;
    public String _options;
    public String _ca;
    public static void main(String[] args) {
        Biology q1 = new Biology();
        q1._question = "The adult human of average age and size has approximately how many quarts of blood?";
        q1._options = " a) 4 \n b) 6 \n c) 8 \n d) 10 \n";
        q1._ca = "c";

        Biology q2 = new Biology();
        q2._question = "What is the most common element in the human body?";
        q2._options = " a) oxygen \n b) calcium \n c) carbon \n d) hydrogen \n";
        q2._ca = "a";

        Biology q3 = new Biology();
        q3._question = "What is the scientific term for the production of light by living organisms?";
        q3._options = " a) photosynthesis \n b) luminary effervescence \n c) syzygy \n d) bioluminsecence \n";
        q3._ca = "a";

        Biology q4 = new Biology();
        q4._question = "Unlike most other fish, sharks have no _____?";
        q4._options = " a) bones \n b) gills \n c) heart \n d) liver \n";
        q4._ca = "a";

        Biology q5 = new Biology();
        q5._question = "What human organ cleans fifty gallons of blood every day?";
        q5._options = " a) kidneys \n b) liver \n c) heart \n d) stomach \n";
        q5._ca = "a";

        Biology q6 = new Biology();
        q6._question = "How many gallons of water can a baobab tree store in its trunk?";
        q6._options = " a) 32 \n b) 3,200 \n c) 320 \n d) 32,000 \n";
        q6._ca = "d";

        System.out.printf("%s", q6._options);
            }

}
