package Controllers;

import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import services.src.main.java.Get;
import services.src.main.java.Insert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class GetPlaylist {
    private Insert insert;
    private Get getService;
    @PostMapping("/playlist")
    @ResponseBody
    public String getPlaylist(@RequestBody RequestForm requestForm) throws IOException {
        String[] value = requestForm.getValue();
        JsonBody apiResponse;

        if (value.length == 2) {
                URL url = new URL("api.openweathermap.org/data/2.5/weather?lat" +
                        value[0] + "&lon=" + value[1]
                        +"&appid=6801fe9e74c3fd9d5a5b0ea6b668d7af");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    apiResponse = (JsonBody) con.getContent();
        } else {
            URL url = new URL("api.openweathermap.org/data/2.5/weather?q=" +
                    value[0]
                    +"&appid=6801fe9e74c3fd9d5a5b0ea6b668d7af");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            apiResponse = (JsonBody) con.getContent();
        }
        Float average = apiResponse.GetAverage();
        String style = getService.getStyleByWeather(average);
        URL url = new URL("https://api.spotify.com/v1/q=genre:" + style + "type=playlist/4fda7f4932bf4c068141a1e526502f7e");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        SpotifyResponse spotifyResponse = (SpotifyResponse) con.getContent();
        String relationId = getService.getRealtionByStyle(style);
        insert.insertRecord(Long.getLong(relationId));
        return spotifyResponse.getValue();
    }
}
