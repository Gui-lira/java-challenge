package Controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class SpotifyResponse {
 private PlaylistType playlists;
 public String getValue() {
     return playlists.getPlaylist();
 }
}
