package jiyeon;

import java.util.HashMap;
import java.util.Map;


public class CompanyMap {

	//관리할 사원 목록
	Map< String, Employee > map = new HashMap<>();
	
	//사원 추가(Create)
	public void insert(Employee e) {
		map.put(e.getEn(),e);
	}
	
	//사원 조회(Read)
	//사원 전체 조회
	public Employee[] getAllEmployees() {
		Employee[] newArr = new Employee[map.size()];
		
		map.values().toArray(newArr);
		
		return newArr;
	}
	
	//사번으로 특정 사원 조회
	public Employee getEmployeeByEn(String en) {
		return map.get(en);
	}
	
	//사원 수정
	public void update(Employee e) {
		map.put(e.getEn(), e);
		
	}
	
	//사원 삭제
	public void delete(String en) {
		map.remove(en);
		
	}
}
