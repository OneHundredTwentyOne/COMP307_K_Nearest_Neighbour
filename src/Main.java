import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public void main() throws IOException{
		try {
			BufferedReader in = new BufferedReader(new FileReader("iris-training.txt"));
			String line = in.readLine();
			Scanner scan = new Scanner(line);
			if(scan.hasNext()){
				double v1 = scan.nextDouble();
				double v2 = scan.nextDouble();
				double v3 = scan.nextDouble();
				String type = scan.next();
				Iris iris = new Iris(v1,v2,v3,type);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
