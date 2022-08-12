import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
			System.out.println("성적관리프로젝트 시작");
			List <Student> list = new ArrayList<Student>(2);
			Input input = new Input(list);
			input.fileInput();
			
			Calc calc = new Calc(list);
			calc.calc();
	
			Sort sort = new Sort(list);
			sort.sort();
		
			Output output = new Output();
			output.print(list);
			System.out.println("성적관리프로젝트 종료");
			
	}
}
