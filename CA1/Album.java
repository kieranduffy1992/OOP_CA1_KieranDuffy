package CA1;

import javax.swing.*;
import java.util.Arrays;

public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "No Name Specified";}
        else
            this.name = name;

    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void playTrack(int number){
        if(number >= 1 && number <= 5)
        {


        }
        else
            JOptionPane.showMessageDialog(null,"An invalid track number was supplied!","Bad Track Number",JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", tracks=" + Arrays.toString(tracks) +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
