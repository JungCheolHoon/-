import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	private List<Student> list; // Input 클래스 내에 많은 메소드가 생기면 Student 배열을 계속해서 받아야 하므로 지역변수로 선언함
	private Scanner sc;
	private File file;

	public Input(List<Student> list) {
		this.list = list;
		sc = new Scanner(System.in);
		this.file = new File("C:/Temp/sungjuk_utf8.dat"); // 파일 만들기
		try {
			this.sc = new Scanner(this.file, "utf-8");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	public void fileInput() { // 파일 읽기
		String line = null;
		StringTokenizer st = null;
		while (this.sc.hasNextLine()) {
			line = this.sc.nextLine();
			//문자열 Parsing : String's split(), Scanner's useDelimeter(), StringTokenizer
			st =new StringTokenizer(line, " ");		//whitespace 기준으로 토큰화하는 클래스 -->  " " 없이 비워놓으면 기본값이 whitespace
//			System.out.println(st.countTokens());
			String [] array = new String[st.countTokens()];		//방 6개 배열 생성
			for(int i = 0 ;  i < array.length ; i ++) {
				array[i] = st.nextToken();
			}
			System.out.println(array[0]);
			Student stduent = new Student(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), Integer.parseInt(array[5]));
			this.list.add(stduent);
		}
	}
}
