import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class MockDraft {

    public static void main(String[] args) throws InterruptedException{
        //create mockDraft instance & parse prospect data
        MockDraft mockDraft = new MockDraft();
        ProspectParser parser = new ProspectParser("[\n" +
                "  {\n" +
                "    \"Rank\": 1,\n" +
                "    \"Name\": \"Myles Garrett\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 2,\n" +
                "    \"Name\": \"Leonard Fournette\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 3,\n" +
                "    \"Name\": \"Reuben Foster\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 4,\n" +
                "    \"Name\": \"Jamal Adams\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 5,\n" +
                "    \"Name\": \"Malik Hooker\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 6,\n" +
                "    \"Name\": \"Solomon Thomas\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Stanford\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 7,\n" +
                "    \"Name\": \"Jonathan Allen\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 8,\n" +
                "    \"Name\": \"Mike Williams\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 9,\n" +
                "    \"Name\": \"Quincy Wilson\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 10,\n" +
                "    \"Name\": \"O.J. Howard\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 11,\n" +
                "    \"Name\": \"Corey Davis\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Western Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 12,\n" +
                "    \"Name\": \"Marshon Lattimore\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 13,\n" +
                "    \"Name\": \"Dalvin Cook\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"FSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 14,\n" +
                "    \"Name\": \"David Njoku\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 15,\n" +
                "    \"Name\": \"Mitch Trubisky\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"UNC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 16,\n" +
                "    \"Name\": \"DeShone Kizer\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Notre Dame\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 17,\n" +
                "    \"Name\": \"Gareon Conley\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 18,\n" +
                "    \"Name\": \"Garett Bolles\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Utah\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 19,\n" +
                "    \"Name\": \"Ryan Ramczyk\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Wisconsin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 20,\n" +
                "    \"Name\": \"Taco Charlton\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 21,\n" +
                "    \"Name\": \"Sidney Jones\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 22,\n" +
                "    \"Name\": \"Charles Harris\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Missouri\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 23,\n" +
                "    \"Name\": \"Derek Barnett\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 24,\n" +
                "    \"Name\": \"Christian McCaffrey\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Stanford\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 25,\n" +
                "    \"Name\": \"Deshaun Watson\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 26,\n" +
                "    \"Name\": \"Jabrill Peppers\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 27,\n" +
                "    \"Name\": \"Takkarist McKinley\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"UCLA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 28,\n" +
                "    \"Name\": \"Ryan Anderson\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 29,\n" +
                "    \"Name\": \"Tre'Davious White\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 30,\n" +
                "    \"Name\": \"Montravius Adams\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Auburn\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 31,\n" +
                "    \"Name\": \"Caleb Brantley\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 32,\n" +
                "    \"Name\": \"Alvin Kamara\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 33,\n" +
                "    \"Name\": \"Haason Reddick\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Temple\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 34,\n" +
                "    \"Name\": \"Cam Robinson\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 35,\n" +
                "    \"Name\": \"Jalen Tabor\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 36,\n" +
                "    \"Name\": \"Budda Baker\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 37,\n" +
                "    \"Name\": \"John Ross\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 38,\n" +
                "    \"Name\": \"Marlon Humphrey\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 39,\n" +
                "    \"Name\": \"Jarrad Davis\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 40,\n" +
                "    \"Name\": \"Justin Evans\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 41,\n" +
                "    \"Name\": \"Jordan Leggett\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 42,\n" +
                "    \"Name\": \"Cooper Kupp\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Eastern Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 43,\n" +
                "    \"Name\": \"Marcus Williams\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Utah\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 44,\n" +
                "    \"Name\": \"Adoree Jackson\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"USC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 45,\n" +
                "    \"Name\": \"Forrest Lamp\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Western Kentucky\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 46,\n" +
                "    \"Name\": \"Desmond King\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Iowa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 47,\n" +
                "    \"Name\": \"Zach Cunningham\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Vanderbilt\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 48,\n" +
                "    \"Name\": \"TJ Watt\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Wisconsin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 49,\n" +
                "    \"Name\": \"Dan Feeney\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Indiana\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 50,\n" +
                "    \"Name\": \"Patrick Mahomes\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Texas Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 51,\n" +
                "    \"Name\": \"Evan Engram\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Ole Miss\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 52,\n" +
                "    \"Name\": \"Zay Jones\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"East Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 53,\n" +
                "    \"Name\": \"Dawaune Smoot\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 54,\n" +
                "    \"Name\": \"Cordrea Tankersley\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 55,\n" +
                "    \"Name\": \"D'Onta Foreman\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Texas\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 56,\n" +
                "    \"Name\": \"Joe Mixon\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Oklahoma\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 57,\n" +
                "    \"Name\": \"Tim Williams\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 58,\n" +
                "    \"Name\": \"Joe Mathis\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 59,\n" +
                "    \"Name\": \"Carl Lawson\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Auburn\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 60,\n" +
                "    \"Name\": \"Carlos Henderson\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Louisiana Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 61,\n" +
                "    \"Name\": \"Eddie Jackson\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 62,\n" +
                "    \"Name\": \"Fabian Moreau\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"UCLA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 63,\n" +
                "    \"Name\": \"Raekwon McMillian\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 64,\n" +
                "    \"Name\": \"Bucky Hodges\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Virginia Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 65,\n" +
                "    \"Name\": \"Brad Kaaya\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 66,\n" +
                "    \"Name\": \"Carroll Phillips\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 67,\n" +
                "    \"Name\": \"Jourdan Lewis\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 68,\n" +
                "    \"Name\": \"Curtis Samuel\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 69,\n" +
                "    \"Name\": \"Jordan Willis\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Kansas State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 70,\n" +
                "    \"Name\": \"Malik McDowell\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Michigan State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 71,\n" +
                "    \"Name\": \"DeMarcus Walker\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"FSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 72,\n" +
                "    \"Name\": \"Pat Elflein\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 73,\n" +
                "    \"Name\": \"Rasul Douglas\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"West Virginia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 74,\n" +
                "    \"Name\": \"Howard Wilson\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Houston\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 75,\n" +
                "    \"Name\": \"Obi Melifonwu\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"UConn\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 76,\n" +
                "    \"Name\": \"Elijah Lee\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Kansas State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 77,\n" +
                "    \"Name\": \"Garrett Sickels\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Penn State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 78,\n" +
                "    \"Name\": \"Chad Hansen\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"California\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 79,\n" +
                "    \"Name\": \"JuJu Smith-Schuster\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"USC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 80,\n" +
                "    \"Name\": \"Elijah Qualls\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 81,\n" +
                "    \"Name\": \"Anthony Walker\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Northwestern\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 82,\n" +
                "    \"Name\": \"Jamaal Williams\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"BYU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 83,\n" +
                "    \"Name\": \"Gerald Everett\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"South Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 84,\n" +
                "    \"Name\": \"Antonio Garcia\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Troy\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 85,\n" +
                "    \"Name\": \"Jaleel Johnson\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Iowa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 86,\n" +
                "    \"Name\": \"Ethan Pocic\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 87,\n" +
                "    \"Name\": \"Isaiah Ford\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Virginia Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 88,\n" +
                "    \"Name\": \"Wayne Gallman\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 89,\n" +
                "    \"Name\": \"Eddie Vanderdoes\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"UCLA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 90,\n" +
                "    \"Name\": \"Marcus Maye\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 91,\n" +
                "    \"Name\": \"Kevin King\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 92,\n" +
                "    \"Name\": \"Vince Biegel\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Wisconsin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 93,\n" +
                "    \"Name\": \"Cameron Sutton\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 94,\n" +
                "    \"Name\": \"Jake Butt\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 95,\n" +
                "    \"Name\": \"Corn Elder\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 96,\n" +
                "    \"Name\": \"Chris Wormley\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 97,\n" +
                "    \"Name\": \"Dion Dawkins\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Temple\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 98,\n" +
                "    \"Name\": \"Chidobe Awuzie\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Colorado\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 99,\n" +
                "    \"Name\": \"Carlos Watkins\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 100,\n" +
                "    \"Name\": \"Tarell Basham\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Ohio\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 101,\n" +
                "    \"Name\": \"Tyus Bowser\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Houston\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 102,\n" +
                "    \"Name\": \"Nathan Peterman\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Pittsburgh\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 103,\n" +
                "    \"Name\": \"Julie'n Davenport\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Bucknell\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 104,\n" +
                "    \"Name\": \"Roderick Johnson\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"FSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 105,\n" +
                "    \"Name\": \"Chris Godwin\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Penn State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 106,\n" +
                "    \"Name\": \"Elijah Hood\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 107,\n" +
                "    \"Name\": \"Cole Hikutini\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 108,\n" +
                "    \"Name\": \"Charles Walker\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Oklahoma\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 109,\n" +
                "    \"Name\": \"Jehu Chesson\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 110,\n" +
                "    \"Name\": \"Jeremy McNichols\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Boise State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 111,\n" +
                "    \"Name\": \"Dalvin Tomlinson\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 112,\n" +
                "    \"Name\": \"Tedric Thompson\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Colorado\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 113,\n" +
                "    \"Name\": \"Brian Hill\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Wyoming\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 114,\n" +
                "    \"Name\": \"Samaje Perine\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Oklahoma\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 115,\n" +
                "    \"Name\": \"Dede Westbrook\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Oklahoma\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 116,\n" +
                "    \"Name\": \"Nazair Jones\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 117,\n" +
                "    \"Name\": \"Davis Webb\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"California\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 118,\n" +
                "    \"Name\": \"Daeshon Hall\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 119,\n" +
                "    \"Name\": \"Kareem Hunt\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Toledo\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 120,\n" +
                "    \"Name\": \"Jalen Reeves-Maybin\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 121,\n" +
                "    \"Name\": \"Tarean Folston\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Notre Dame\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 122,\n" +
                "    \"Name\": \"Dorian Johnson\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Pitt\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 123,\n" +
                "    \"Name\": \"Amara Darboh\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 124,\n" +
                "    \"Name\": \"Jarron Jones\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Notre Dame\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 125,\n" +
                "    \"Name\": \"Trey Hendrickson\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Florida Atlantic\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 126,\n" +
                "    \"Name\": \"Malachi Dupre\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 127,\n" +
                "    \"Name\": \"Erik Magnuson\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 128,\n" +
                "    \"Name\": \"Amba Etta-Tawo\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Syracuse\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 129,\n" +
                "    \"Name\": \"Chad Wheeler\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"USC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 130,\n" +
                "    \"Name\": \"Adam Bisnowaty\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Pitt\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 131,\n" +
                "    \"Name\": \"Marquez White\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"FSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 132,\n" +
                "    \"Name\": \"Noble Nwachukwu\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"West Virginia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 133,\n" +
                "    \"Name\": \"KD Cannon\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Baylor\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 134,\n" +
                "    \"Name\": \"Josh Reynolds\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 135,\n" +
                "    \"Name\": \"Ahkello Witherspoon\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Colorado\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 136,\n" +
                "    \"Name\": \"Michael Roberts\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Toledo\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 137,\n" +
                "    \"Name\": \"Lorenzo Jerome\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Saint Francis (PA)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 138,\n" +
                "    \"Name\": \"Trent Taylor\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Louisiana Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 139,\n" +
                "    \"Name\": \"Duke Riley\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 140,\n" +
                "    \"Name\": \"Vincent Taylor\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 141,\n" +
                "    \"Name\": \"Steven Taylor\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Houston\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 142,\n" +
                "    \"Name\": \"Tyler Orlosky\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"West Virginia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 143,\n" +
                "    \"Name\": \"Fred Ross\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Mississippi State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 144,\n" +
                "    \"Name\": \"Bryan Cox\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 145,\n" +
                "    \"Name\": \"Ryan Switzer\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 146,\n" +
                "    \"Name\": \"Taylor Moton\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Western Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 147,\n" +
                "    \"Name\": \"Jeremy Sprinkle\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Arkansas\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 148,\n" +
                "    \"Name\": \"Conor McDermott\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"UCLA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 149,\n" +
                "    \"Name\": \"Travis Rudolph\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"FSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 150,\n" +
                "    \"Name\": \"Josh Harvey-Clemons\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 151,\n" +
                "    \"Name\": \"Kendell Beckwith\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 152,\n" +
                "    \"Name\": \"Jalen Robinette\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Air Force\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 153,\n" +
                "    \"Name\": \"Damore'ea Stringfellow\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Ole Miss\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 154,\n" +
                "    \"Name\": \"Zach Banner\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"USC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 155,\n" +
                "    \"Name\": \"Channing Stribling\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 156,\n" +
                "    \"Name\": \"Avery Gennesy\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 157,\n" +
                "    \"Name\": \"Kermit Whitfield\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Florida St\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 158,\n" +
                "    \"Name\": \"Derek Rivers\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Youngstown State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 159,\n" +
                "    \"Name\": \"John Johnson\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Boston College\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 160,\n" +
                "    \"Name\": \"Tanoh Kpassagnon\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Villanova\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 161,\n" +
                "    \"Name\": \"Taywan Taylor\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Western Kentucky\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 162,\n" +
                "    \"Name\": \"Noah Brown\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 163,\n" +
                "    \"Name\": \"Travin Dural\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 164,\n" +
                "    \"Name\": \"Ryan Glasgow\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 165,\n" +
                "    \"Name\": \"Paul Magloire Jr.\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Arizona\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 166,\n" +
                "    \"Name\": \"Marlon Mack\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"South Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 167,\n" +
                "    \"Name\": \"Stacy Coley\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 168,\n" +
                "    \"Name\": \"Isaiah McKenzie\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Georgia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 169,\n" +
                "    \"Name\": \"Blake Jarwin\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 170,\n" +
                "    \"Name\": \"Cole Luke\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Notre Dame\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 171,\n" +
                "    \"Name\": \"Justin Davis\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"USC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 172,\n" +
                "    \"Name\": \"Derrick Griffin\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Texas Southern\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 173,\n" +
                "    \"Name\": \"Josh Malone\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 174,\n" +
                "    \"Name\": \"Jamari Staples\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 175,\n" +
                "    \"Name\": \"J.J. Dielman\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Utah\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 176,\n" +
                "    \"Name\": \"Ish Zamora\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Baylor\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 177,\n" +
                "    \"Name\": \"James Quick\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 178,\n" +
                "    \"Name\": \"Alex Anzalone\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 179,\n" +
                "    \"Name\": \"Alek Torgersen\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Penn\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 180,\n" +
                "    \"Name\": \"Cooper Rush\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Central Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 181,\n" +
                "    \"Name\": \"Damien Mama\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"USC\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 182,\n" +
                "    \"Name\": \"Larry Ogunjobi\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Charlotte\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 183,\n" +
                "    \"Name\": \"Matt Milano\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Boston College\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 184,\n" +
                "    \"Name\": \"Jordan Sterns\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 185,\n" +
                "    \"Name\": \"Jerod Evans\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Virginia Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 186,\n" +
                "    \"Name\": \"David Sharpe\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Florida\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 187,\n" +
                "    \"Name\": \"Dan Skipper\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Arkansas\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 188,\n" +
                "    \"Name\": \"Kyle Fuller\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"Baylor\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 189,\n" +
                "    \"Name\": \"Eric Saubert\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Drake\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 190,\n" +
                "    \"Name\": \"Jon Heck\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 191,\n" +
                "    \"Name\": \"Corey Clement\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Wisconsin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 192,\n" +
                "    \"Name\": \"Damontae Kazee\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"San Diego State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 193,\n" +
                "    \"Name\": \"Jadar Johnson\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 194,\n" +
                "    \"Name\": \"Jalen Myrick\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Minnesota\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 195,\n" +
                "    \"Name\": \"Ben Gedeon\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 196,\n" +
                "    \"Name\": \"Jack Tocho\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"NC State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 197,\n" +
                "    \"Name\": \"Pharaoh Brown\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Oregon\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 198,\n" +
                "    \"Name\": \"Nico Siragusa\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"San Diego State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 199,\n" +
                "    \"Name\": \"Donnel Pumphrey\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"San Diego State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 200,\n" +
                "    \"Name\": \"Artavis Scott\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 201,\n" +
                "    \"Name\": \"ArDarius Stewart\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 202,\n" +
                "    \"Name\": \"Avery Moss\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Youngstown State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 203,\n" +
                "    \"Name\": \"Deatrich Wise Jr.\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Arkansas\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 204,\n" +
                "    \"Name\": \"Davon Godchaux\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 205,\n" +
                "    \"Name\": \"C.J. Beathard\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Iowa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 206,\n" +
                "    \"Name\": \"Speedy Noil\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 207,\n" +
                "    \"Name\": \"Greg Pyke\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Georgia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 208,\n" +
                "    \"Name\": \"Nate Hairtson\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Temple\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 209,\n" +
                "    \"Name\": \"Joe Williams\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Utah\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 210,\n" +
                "    \"Name\": \"Rayshawn Jenkins\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 211,\n" +
                "    \"Name\": \"Stanley Williams\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Kentucky\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 212,\n" +
                "    \"Name\": \"Nyeem Wartman-White\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Penn St\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 213,\n" +
                "    \"Name\": \"Tyrone Swoopes\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Texas\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 214,\n" +
                "    \"Name\": \"Ejuan Price\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Pitt\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 215,\n" +
                "    \"Name\": \"Keith Kelsey\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 216,\n" +
                "    \"Name\": \"Josh Carraway\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"TCU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 217,\n" +
                "    \"Name\": \"Keionta Davis\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Chattanooga\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 218,\n" +
                "    \"Name\": \"Johnathan Ford\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Auburn\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 219,\n" +
                "    \"Name\": \"David Jones\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Richmond\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 220,\n" +
                "    \"Name\": \"Nathan Gerry\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Nebraska\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 221,\n" +
                "    \"Name\": \"Elijah McGuire\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"UL Lafayette\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 222,\n" +
                "    \"Name\": \"Hardy Nickerson\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 223,\n" +
                "    \"Name\": \"Josh Jones\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"NC State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 224,\n" +
                "    \"Name\": \"Freddie Stevenson\",\n" +
                "    \"Position\": \"FB\",\n" +
                "    \"School\": \"Florida State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 225,\n" +
                "    \"Name\": \"Jonah Pirsig\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Minnesota\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 226,\n" +
                "    \"Name\": \"Seth Russell\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Baylor\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 227,\n" +
                "    \"Name\": \"Clint Van Horn\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Marshall\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 228,\n" +
                "    \"Name\": \"Devine Redding\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Indiana\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 229,\n" +
                "    \"Name\": \"Ricky Seals-Jones\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 230,\n" +
                "    \"Name\": \"De'Veon Smith\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 231,\n" +
                "    \"Name\": \"D.J. Jones\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Ole Miss\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 232,\n" +
                "    \"Name\": \"Ukeme Eligwe\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Georgia Southern\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 233,\n" +
                "    \"Name\": \"Adam Shaheen\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Ashland\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 234,\n" +
                "    \"Name\": \"DeAngelo Brown\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 235,\n" +
                "    \"Name\": \"Josiah Price\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Michigan State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 236,\n" +
                "    \"Name\": \"Montae Nicholson\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Michigan State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 237,\n" +
                "    \"Name\": \"Shelton Gibson\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"West Virginia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 238,\n" +
                "    \"Name\": \"Ben Boulware\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 239,\n" +
                "    \"Name\": \"Sean Harlow\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Oregon State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 240,\n" +
                "    \"Name\": \"Tony Conner\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Ole Miss\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 241,\n" +
                "    \"Name\": \"Aaron Jones\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"UTEP\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 242,\n" +
                "    \"Name\": \"Ezra Robinson\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Tennessee State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 243,\n" +
                "    \"Name\": \"James Conner\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Pittsburgh\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 244,\n" +
                "    \"Name\": \"DeVonte Fields\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Louisville\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 245,\n" +
                "    \"Name\": \"James Onwualu\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Notre Dame\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 246,\n" +
                "    \"Name\": \"Riley Bullough\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Michigan State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 247,\n" +
                "    \"Name\": \"Tanner Vallejo\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Boise State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 248,\n" +
                "    \"Name\": \"Des Lawrence\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 249,\n" +
                "    \"Name\": \"Joe Yearby\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Miami\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 250,\n" +
                "    \"Name\": \"Jeremy Cutrer\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Middle Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 251,\n" +
                "    \"Name\": \"Jermaine Grace\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 252,\n" +
                "    \"Name\": \"Austin Rehkow\",\n" +
                "    \"Position\": \"P\",\n" +
                "    \"School\": \"Idaho\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 253,\n" +
                "    \"Name\": \"Isaac Rochell\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Notre Dame\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 254,\n" +
                "    \"Name\": \"Ashton Lampkin\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 255,\n" +
                "    \"Name\": \"Isaac Asiata\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Utah\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 256,\n" +
                "    \"Name\": \"Jessamen Dunker\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Tennessee State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 257,\n" +
                "    \"Name\": \"Dylan Cole\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Missouri State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 258,\n" +
                "    \"Name\": \"Brady Gustafson\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Montana\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 259,\n" +
                "    \"Name\": \"William Likely III\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Maryland\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 260,\n" +
                "    \"Name\": \"Lewis Neal\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"LSU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 261,\n" +
                "    \"Name\": \"Corey Smith\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Ohio State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 262,\n" +
                "    \"Name\": \"Ralph Green III\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Indiana\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 263,\n" +
                "    \"Name\": \"Matthew Dayes\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"NC State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 264,\n" +
                "    \"Name\": \"Billy Brown\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Shepherd\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 265,\n" +
                "    \"Name\": \"Sefo Liufau\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Colorado\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 266,\n" +
                "    \"Name\": \"Chase Roullier\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Wyoming\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 267,\n" +
                "    \"Name\": \"Gavin Andrews\",\n" +
                "    \"Position\": \"OG\",\n" +
                "    \"School\": \"Oregon State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 268,\n" +
                "    \"Name\": \"Erik Austell\",\n" +
                "    \"Position\": \"OG\",\n" +
                "    \"School\": \"Charleston Southern\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 269,\n" +
                "    \"Name\": \"Justin Senior\",\n" +
                "    \"Position\": \"OT\",\n" +
                "    \"School\": \"Mississippi State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 270,\n" +
                "    \"Name\": \"Darrell Daniels\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 271,\n" +
                "    \"Name\": \"Caleb Peterson\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 272,\n" +
                "    \"Name\": \"Jahad Thomas\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Temple\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 273,\n" +
                "    \"Name\": \"Xavier Woods\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Louisiana Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 274,\n" +
                "    \"Name\": \"Calvin Munson\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"San Diego State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 275,\n" +
                "    \"Name\": \"Randall Goforth\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"UCLA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 276,\n" +
                "    \"Name\": \"Brendan Langley\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Lamar (TX)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 277,\n" +
                "    \"Name\": \"Psalm Wooching\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Washington\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 278,\n" +
                "    \"Name\": \"Breon Borders\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Duke\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 279,\n" +
                "    \"Name\": \"Levon Myers\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Northern Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 280,\n" +
                "    \"Name\": \"Tanzel Smart\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Tulane\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 281,\n" +
                "    \"Name\": \"Quincy Adeboyejo\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Ole Miss\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 282,\n" +
                "    \"Name\": \"Kenny Golladay\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Northern Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 283,\n" +
                "    \"Name\": \"Treyvon Hester\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Toledo\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 284,\n" +
                "    \"Name\": \"Gabe Marks\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Washington State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 285,\n" +
                "    \"Name\": \"Brad Watson\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Wake Forest\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 286,\n" +
                "    \"Name\": \"Harvey Langi\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"BYU\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 287,\n" +
                "    \"Name\": \"Chunky Clements\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 288,\n" +
                "    \"Name\": \"Demetrious Cox\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Michigan State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 289,\n" +
                "    \"Name\": \"George Kittle\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Iowa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 290,\n" +
                "    \"Name\": \"Zach Pascal\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Old Dominion\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 291,\n" +
                "    \"Name\": \"Sam Rogers\",\n" +
                "    \"Position\": \"FB\",\n" +
                "    \"School\": \"Virginia Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 292,\n" +
                "    \"Name\": \"Kyle Kalis\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Michigan\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 293,\n" +
                "    \"Name\": \"Jordan Morgan\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Kutztown\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 294,\n" +
                "    \"Name\": \"Torrodney Prevot\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Oregon\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 295,\n" +
                "    \"Name\": \"Mitch Leidner\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Minnesota\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 296,\n" +
                "    \"Name\": \"Phazahn Odom\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Fordham\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 297,\n" +
                "    \"Name\": \"Cole Croston\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Iowa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 298,\n" +
                "    \"Name\": \"Deyshawn Bond\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"Cincinnati\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 299,\n" +
                "    \"Name\": \"De'Angelo Henderson\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Coastal Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 300,\n" +
                "    \"Name\": \"Joshua Posley\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Ball State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 301,\n" +
                "    \"Name\": \"Ahmad Thomas\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Oklahoma\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 302,\n" +
                "    \"Name\": \"Greg Mabin\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Iowa\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 303,\n" +
                "    \"Name\": \"Jon Toth\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"Kentucky\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 304,\n" +
                "    \"Name\": \"Connor Harris\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Lindenwood\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 305,\n" +
                "    \"Name\": \"Andreas Knappe\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Connecticut\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 306,\n" +
                "    \"Name\": \"Mack Hollins\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 307,\n" +
                "    \"Name\": \"Nate Andrews\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Florida State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 308,\n" +
                "    \"Name\": \"Emmanuel Holder\",\n" +
                "    \"Position\": \"FB\",\n" +
                "    \"School\": \"Towson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 309,\n" +
                "    \"Name\": \"Cole Mazza\",\n" +
                "    \"Position\": \"LS\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 310,\n" +
                "    \"Name\": \"Dare Ogunbowale\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Wisconsin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 311,\n" +
                "    \"Name\": \"Cameron Tom\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"Southern Mississippi\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 312,\n" +
                "    \"Name\": \"Treston Decoud\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Oregon State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 313,\n" +
                "    \"Name\": \"Deon Hollins\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"UCLA\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 314,\n" +
                "    \"Name\": \"Jake Elliott\",\n" +
                "    \"Position\": \"K\",\n" +
                "    \"School\": \"Memphis\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 315,\n" +
                "    \"Name\": \"Weston Steelhammer\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Air Force\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 316,\n" +
                "    \"Name\": \"Greg Ward Jr.\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Houston\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 317,\n" +
                "    \"Name\": \"Shock Linwood\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Baylor\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 318,\n" +
                "    \"Name\": \"Trevor Knight\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Texas A&M\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 319,\n" +
                "    \"Name\": \"Danny Isidora\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Miami (Fla.)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 320,\n" +
                "    \"Name\": \"Chris Carson\",\n" +
                "    \"Position\": \"RB\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 321,\n" +
                "    \"Name\": \"Jerome Lane\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Akron\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 322,\n" +
                "    \"Name\": \"Chad Kelly\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Ole Miss\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 323,\n" +
                "    \"Name\": \"Joshua Dobbs\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Tennessee\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 324,\n" +
                "    \"Name\": \"Al-Quadin Muhammad\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Miami\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 325,\n" +
                "    \"Name\": \"Kent Perkins\",\n" +
                "    \"Position\": \"T\",\n" +
                "    \"School\": \"Texas\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 326,\n" +
                "    \"Name\": \"Josh Tupou\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Colorado\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 327,\n" +
                "    \"Name\": \"Kylie Fitts\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Utah\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 328,\n" +
                "    \"Name\": \"Bobby Wolford\",\n" +
                "    \"Position\": \"FB\",\n" +
                "    \"School\": \"Boston College\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 329,\n" +
                "    \"Name\": \"Lucas Crowley\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"North Carolina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 330,\n" +
                "    \"Name\": \"Jordan Burton\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 331,\n" +
                "    \"Name\": \"Jhajuan Seales\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Oklahoma State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 332,\n" +
                "    \"Name\": \"Brandon Bell\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Penn State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 333,\n" +
                "    \"Name\": \"Barrett Burns\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Appalachian State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 334,\n" +
                "    \"Name\": \"Ken Ekanem\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Virginia Tech\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 335,\n" +
                "    \"Name\": \"Orion Stewart\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Baylor\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 336,\n" +
                "    \"Name\": \"Jay Guillermo\",\n" +
                "    \"Position\": \"C\",\n" +
                "    \"School\": \"Clemson\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 337,\n" +
                "    \"Name\": \"Sojourn Shelton\",\n" +
                "    \"Position\": \"CB\",\n" +
                "    \"School\": \"Wisconsin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 338,\n" +
                "    \"Name\": \"Devaroe Lawrence\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Auburn\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 339,\n" +
                "    \"Name\": \"Kevin Davis\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Colorado St\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 340,\n" +
                "    \"Name\": \"Deon-Tay McManus\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Marshall\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 341,\n" +
                "    \"Name\": \"Jordan Westerkamp\",\n" +
                "    \"Position\": \"WR\",\n" +
                "    \"School\": \"Nebraska\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 342,\n" +
                "    \"Name\": \"Cameron Lee\",\n" +
                "    \"Position\": \"G\",\n" +
                "    \"School\": \"Illinois ST\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 343,\n" +
                "    \"Name\": \"Wes Lunt\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Illinois\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 344,\n" +
                "    \"Name\": \"Damarius Travis\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Minnesota\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 345,\n" +
                "    \"Name\": \"Quincy Mauger\",\n" +
                "    \"Position\": \"S\",\n" +
                "    \"School\": \"Georgia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 346,\n" +
                "    \"Name\": \"Jonnu Smith\",\n" +
                "    \"Position\": \"TE\",\n" +
                "    \"School\": \"Florida International\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 347,\n" +
                "    \"Name\": \"Jamal Marcus\",\n" +
                "    \"Position\": \"EDGE\",\n" +
                "    \"School\": \"Akron\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 348,\n" +
                "    \"Name\": \"Marcus Oliver\",\n" +
                "    \"Position\": \"LB\",\n" +
                "    \"School\": \"Indiana\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 349,\n" +
                "    \"Name\": \"Zane Gonzalez\",\n" +
                "    \"Position\": \"K\",\n" +
                "    \"School\": \"Arizona State\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 350,\n" +
                "    \"Name\": \"Harold Brantley\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"Missouri\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 351,\n" +
                "    \"Name\": \"Toby Baker\",\n" +
                "    \"Position\": \"P\",\n" +
                "    \"School\": \"Alabama\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 352,\n" +
                "    \"Name\": \"Antonio Pipkin\",\n" +
                "    \"Position\": \"QB\",\n" +
                "    \"School\": \"Tiffin\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"Rank\": 353,\n" +
                "    \"Name\": \"Isaiah Golden\",\n" +
                "    \"Position\": \"DL\",\n" +
                "    \"School\": \"McNeese State\"\n" +
                "  }\n" +
                "]");
        //generate list of draftable players, and list of already drafted players
        List<Player> draftables = null;
        List<Player> drafted = new ArrayList<>();

        try {
            draftables = parser.parse();
        }
        catch (JSONException je) {
            System.out.println("Error in JSON data." + '\n');
        }

        //initialize myTeam and myPick
        System.out.println("Please enter your team, or 'random' if you'd like a random team assigned to you." + '\n');
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine().toLowerCase();
        Team myTeam;
        int myPick;

        if (t.equals("random")) {
            myPick = 1 + (int)(Math.random() * 32);
            myTeam = mockDraft.getTeam(myPick);
        }
        else {
            myTeam = mockDraft.getTeam(t);
            myPick = myTeam.getPick();
        }

        //     playerSelection -> player being selected in a given round
        Player playerSelection;
        //     selectionName   -> name of player being selected in a given round
        String selectionName = "";
        //     selectionPos    -> name of position of player being selected in a given round
        String selectionPos = "";

        Thread.sleep(1000);
        System.out.println('\n' +"Welcome to the 2017 NFL Draft. You will be drafting as the " + myTeam.getName()
                            + "." + '\n' );
        Thread.sleep(2000);

        //TODO: String 'nth' value being 'st' for pick == 1, 'nd' for pick == 2,
        //TODO: 'rd' for pick ==3, 'th' otherwise
        System.out.println("You will be selecting at pick " + Integer.toString(myPick) + "." + '\n');
        Thread.sleep(3000);

        //iterate through first round by pick
        for (int n = 1; n <= 32; n++) {
            if (n == myPick) {
                playerSelection = mockDraft.draft(myPick, myTeam.getName(), draftables, drafted);
                selectionName = playerSelection.getName();
                selectionPos = playerSelection.getPositionName();
                drafted.add(playerSelection);
            }
            else {
                Player AIDraftee = mockDraft.AIdraft(mockDraft.getTeam(n), draftables, drafted);
                drafted.add(AIDraftee);
                //AIDraftee = new Player("John Hunchak", Position.ILB, 3);
                System.out.println("With pick " + Integer.toString(n) + " the " +
                                    mockDraft.getTeam(n).getName() + " select " +
                                    AIDraftee.getName() + ", " + AIDraftee.getPositionName() + ", " + AIDraftee.getSchool() + "." + '\n' );
            }
            Thread.sleep(1500);
        }
        //TODO: add another round using counter 'pickCounter', each loop is new round beginning at
        //TODO: pickCounter = 32 (round 2), 64 (round 3), etc.

        //TODO: alternative: helper function 'draftRounds(int rounds, ...)' that receives the number of
        //TODO: round to draft, using 'rounds' as a decreasing counter to 0

        System.out.println("Thank you for attending the 2017 NFL Draft. Here is your 2017 draft class: " + '\n' +
                            "Round 1: " + selectionName + ", " + selectionPos);
    }


    private Team getTeam(int pick) {
        Team myTeam = Team.IND;
        for (Team t : Team.values()) {
            if (pick == t.getPick()) {
                myTeam = t;
            }
        }
        return myTeam;
    }

    private Team getTeam(String name) {
        Team myTeam = Team.ATL;
        for (Team t : Team.values()) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                myTeam = t;
            }
        }
        return myTeam;
    }


    private Player draft(int pick, String team, List<Player> selectableList, List<Player> selectedList) {
        Player mySelection = null;

        System.out.println("The " + team + " are on the clock! Enter your selection below." + '\n' + '\n' );
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        for (Player p: selectableList) {
            if (p.getName().toLowerCase().contains(s)) {
                mySelection = p;
            }
        }
        if (mySelection == null || selectedList.contains(mySelection)) {
            System.out.println('\n' + "Please select a remaining draft-eligible player." + '\n' );
            draft(pick, team, selectableList, selectedList);
        }
        if (mySelection != null) {
            System.out.println("With pick " + Integer.toString(pick) + " the " + team + " select " +
                    mySelection.getName() + ", " + mySelection.getPositionName()+ ", " + mySelection.getSchool() + "."  + '\n' );
        }

        return mySelection;
    }


    private Player AIdraft(Team team, List<Player> selectableList, List<Player> selectedList) {
        List<Position> teamNeeds = team.getNeeds();
        List<Player> draftBoard = new ArrayList<>();
        Player draftee = null;
/*
        for (Player p: selectableList) {
            if (teamNeeds.contains(p.getPosition()) && !selectedList.contains(p)) {
                draftBoard.add(p);
            }
        }

        if (random < 1) {
            System.out.println("The owner of the " + team.getName() + " has approached you for guidance." + '\n'
                                + "What player do you advise them to select?");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            for (Player p: selectableList) {
                if (p.getName().contains(s)) {
                    draftee = p;
                }
            }
        }

        //by need
        if (draftee == null) {
            for (Player p : draftBoard) {
                for (int n = 1; draftee == null; n++) {
                    if (p.getRank() == n) {
                        draftee = p;
                    }
                }
            }
        }

        //BPA
        if (draftee == null) {
            for (Player p: selectableList) {
                for (int n = 1; draftee == null; n++) {
                    if (p.getRank() == n && !selectedList.contains(p)) {
                        draftee = p;
                    }
                }
            }
        }
*/
        Player selection = draftValues(selectableList, selectedList,  teamNeeds);
        return selection;
    }


    private Player draftValues(List<Player> draftBoard, List<Player> selected, List<Position> teamNeeds) {
        Random generator = new Random();
        double random = generator.nextDouble();
        double playerScore = 0;
        double highestScore = 0;
        Player bestSelection = null;
        //iterate through the draft board, give each player score, and sort by score...
        for (Player p: draftBoard) {
            //TODO: change constants to local variable factors
            playerScore += (random * 1000.0)/((p.getRank()/2));
            if(p.getPositionName().equals("QB") && teamNeeds.contains(p.getPosition())) {
                playerScore += 40.0;
            }

            if(p.getPositionName().equals("EDGE")) {
                playerScore += 5.0;
            }

            if(teamNeeds.contains(p.getPosition())) {
                playerScore += 10.0;
            }
            if ((playerScore > highestScore || bestSelection == null) && !selected.contains(p)) {
                bestSelection = p;
                highestScore = playerScore;
            }
            //to see scores:
            /*
            if (!selected.contains(p)) {
                System.out.println(p.getName() + " " + playerScore);
            }
            */
            playerScore = 0;
        }
        return bestSelection;
    }

}
