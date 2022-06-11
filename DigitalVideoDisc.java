import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost, director, length);
	}

	public boolean search(String title) {

		String[] splitString = title.split(" ");

		for (int i = 0; i < splitString.length; i++) {
			Pattern pattern = Pattern.compile(splitString[i].trim().toLowerCase());
			Matcher matcher = pattern.matcher(this.title.trim().toLowerCase());
			if (!matcher.find())
				return false;
		}
		return true;
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
