public class Physics {
    public String _question;
    public String _options;
    public String _ca;

    public static void main(String[] args) {
        Physics q1 = new Physics();
        q1._question = "When was the idea of the atom first introduced?";
        q1._options = " a) 450 B.C. \n b) 1791 \n c) 1942 \n d) 1050 \n";
        q1._ca = "a";

        Physics q2 = new Physics();
        q2._question = "What physicist discovered that a wave's frequency changes when the source and the observer are in motion relative to one another?";
        q2._options = " a) Christian Doppler \n b) Albert Einstein \n c) Max Planck \n d) Enrico Fermi \n";
        q2._ca = "a";

        Physics q3 = new Physics();
        q3._question = "In what type of matter are atoms most tightly packed?";
        q3._options = " a) All are the same \n b) liquids \n c) solids \n d) gases \n";
        q3._ca = "c";

        Physics q4 = new Physics();
        q4._question = "How long does it take for light to travel from the Sun's surface to the Earth?";
        q4._options = " a) 8 hours \n b) 8 minutes \n c) 8 seconds \n d) 8 days \n";
        q4._ca = "b";

        Physics q5 = new Physics();
        q5._question = "What astronomical model positioned the Sun near the center of the Universe?";
        q5._options = " a) Copernican Model \n b) Anaxagorac Model \n c) Geocentric Model \n d) Ptolemaic Model \n";
        q5._ca = "a";

        Physics q6 = new Physics();
        q6._question = "Which of the following best describes our Moon's orbit around Earth?";
        q6._options = " a) Molniya orbit \n b) geostationary rotation \n c) non-synchronous rotation \n d) synchronous rotation \n";
        q6._ca = "d";
    }
}