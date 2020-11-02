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

    public int getNumberOfTracks(){
        int numberOfTracks=0;

        for(int i=0;i<tracks.length;i++){
            if(tracks[i] !=null){
                numberOfTracks++;
            }
        }
        return numberOfTracks;

    }

    public int getPlayingTime(){

        int totalPlayingTime=0;

        for(int i=0;i<tracks.length;i++){
            totalPlayingTime+=tracks[i].getDuration();
        }

        return totalPlayingTime;
    }

    public void playTrack(int number){


        if(number >= 1 && number <= 5)
        {
            Song song = null;

            for(int i=0;i<tracks.length;i++){
                if(tracks[i].getTrackNumber() ==number){
                    song = tracks[i];
                }
            }
            JOptionPane.showMessageDialog(null,"Now playing track-details as follows\n\n"+song,
                   "Playing Track",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,"An invalid track number was supplied!","Bad Track Number",JOptionPane.ERROR_MESSAGE);
    }

    public void shuffle(){

        Song songs[]=new Song[5];
        String output="";

        for(int i=0;i<tracks.length;i++){
            songs[i]=tracks[(int)(Math.random()*5)];
            output+=songs[i]+"\n";
        }

        JOptionPane.showMessageDialog(null,"Shuffled playlist is as follows:\n\n"+output,
                "Shuffled Playlist",JOptionPane.INFORMATION_MESSAGE);




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
