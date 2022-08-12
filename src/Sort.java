/*
 * 	객체 정렬하기
 * 	1.	배열 정렬하기
 * 		- Arrays.sort()
 * 		- Comparable interface를 재정의해야
 * 		- compareTo()
 * 	2. Collection 정렬하기
 * 		- Collections.sort()
 * 		- Comparator interface를 재정의해야
 * 		- compare()
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort{
	private List<Student> list;
	
	public Sort(List<Student> list) {
		this.list = list;
	}
	
	public void sort() {
		Collections.sort(this.list, new Comparator<Student>() {
			@Override
			public int compare(Student front, Student back) {
				return front.getName().compareTo(back.getName());			//문자열 기준 오름차순
			}
		});
	}
//	public void sort() {
//		Collections.sort(this.list,new MyComparator());
//	}
//	
//	class MyComparator implements Comparator<Student>{			//인터페이스이므로 재정의하여야함
//
//		@Override
//		public int compare(Student front, Student back) {
//			return back.getTot() - front.getTot();
//		}
//		
//	}
}