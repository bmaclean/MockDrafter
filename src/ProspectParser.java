import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Brendan on 2017-01-17.
 */
public class ProspectParser {
    private String jsondata;
    //TODO: function for writing to JSON data - add attributes (description, etc.)
    //my field:

    public ProspectParser(String jsondata) {
        this.jsondata = jsondata;

    }

    public List<Player> parse() throws org.json.JSONException {
        List<Player> prospects = new ArrayList<>();
        JSONArray prospectArray = new JSONArray(jsondata);

        for (int i = 0; i < prospectArray.length(); i++){
            JSONObject obj = prospectArray.getJSONObject(i);
            Player ithPlayer = parsePlayer(obj);
            prospects.add(ithPlayer);
        }
        return prospects;
    }

    public Player parsePlayer(JSONObject json) throws JSONException {
        String name = json.getString("Name");
        String school = json.getString("School");
        int rank = json.getInt("Rank");
        Position position = Position.P;
        Player thisPlayer;

        for (Position p : Position.values()) {
            if (json.getString("Position").equals(p.getName())) {
                position = p;
            }
        }
        thisPlayer = new Player(name, position, rank, school);
        return thisPlayer;
    }
}
