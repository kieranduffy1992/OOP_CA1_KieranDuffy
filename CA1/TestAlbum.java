package CA1;

import javax.swing.*;
import java.awt.*;

public class TestAlbum {
    public static void main(String[] args) {

        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Song allSongs[] = new Song[5];
        allSongs[0]=s1;
        allSongs[1]=s2;
        allSongs[2]=s3;
        allSongs[3]=s4;
        allSongs[4]=s5;

        Album a1 = new Album("Now that’s what I call music 98",allSongs,"Universal Music", 2016);

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText("Name: "+a1.getName()+"\n\nProducer: "+a1.getProducer()+"\n\nRelease Year: "+a1.getReleaseYear()+
                "\n\nNumber of Tracks: "+a1.getNumberOfTracks() +"\n\nTotal Playing Time: "+a1.getPlayingTime()+"\n\n\t\tAlbum Tracks\n\n");

        String output =String.format("\n%-20s%-30s%-15s\n","Track Number","Title","Artist");

        for(int i=0;i<allSongs.length;i++){
            output+= String.format("\n%-20d%-30s%-15s\n",allSongs[i].getTrackNumber(),allSongs[i].getTitle(),allSongs[i].getArtist());
        }

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        int trackNumber = Integer.parseInt(JOptionPane.showInputDialog("Which track would you like to play?"));

        a1.playTrack(trackNumber);

        int shuffle = JOptionPane.showConfirmDialog(null,"Do You wish to shuffle?","Shuffle?",JOptionPane.YES_NO_CANCEL_OPTION);

        if(shuffle==JOptionPane.YES_OPTION){
            a1.shuffle();
        }
        else if(shuffle==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"You Choose not to shuffle");
        }
        else
            JOptionPane.showMessageDialog(null,"Nothing Selected");


        System.exit(0);







    }
}
