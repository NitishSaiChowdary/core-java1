import java.io.File;
import java.io.IOException;

public class eg4 {
	public static void main(String[] args) throws IOException {
		
		File file =new File("one.txt");
		file.createNewFile();
		System.out.println("Filecreated");
	}

}
