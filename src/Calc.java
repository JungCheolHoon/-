import java.util.List;

public class Calc {
	private List <Student> list;

	public Calc(List <Student> list) {
		this.list = list;
	}
	public void calc() {
		for(Student student : this.list) {
			int total = this.calcTotal(student.getKor(), student.getEng(), student.getMat(), student.getEdp());
			double avg = calcAvg(total, 4);
			char grade = this.calcGrade(avg);
			student.setTot(total);
			student.setAvg(avg);
			student.setGrade(grade);
		}
	}
	private int calcTotal(int kor, int eng, int mat, int dep) {
		return kor + eng + mat + dep;
	}
	/**
	 * @param int su : 과목수
	 * @return	double avg: 평균
	 */
	
	private double calcAvg(int total , int su) {
		return total/(double)su;
	}
	private char calcGrade(double avg) {
		return	(avg>=90 && avg<=100) ? 'A' :
						(avg >=80) ? 'B' :
							(avg >=70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';
	}
}
