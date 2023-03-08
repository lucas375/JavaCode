import java.io.File;
import java.util.Scanner;

public class LerComScaner {
	public static void main(String[] args) {
		File ar = new File("C:\\Users\\Lucas\\OneDrive\\Documentos\\test.txt");

		Scanner sc = null;
		try {
			sc = new Scanner(ar);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(sc !=null) {
				sc.close();
			}
		}


	}
}
