import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    // public CompactDisc(String title, String category, float cost, String
    // director, int length) {
    // super(title, category, cost, director, length);
    // }

    public CompactDisc(String title, String category, float cost, String director, int length, String artist,
            ArrayList<Track> tracks) {
        super(title, category, cost, director, length);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return this.artist;
    }

    public void addTrack(String title, int length) {
        tracks.add(new Track(title, length));
    }

    public void removeTrack(String title, int length) {
        Track trackrm = new Track(title, length);
        if (tracks.contains(trackrm)) {
            tracks.remove(trackrm);
        }
    }

    public int getLength() {
        // return sum of lengths
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }

}
