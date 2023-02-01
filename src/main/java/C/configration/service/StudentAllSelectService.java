package C.configration.service;

import C.configration.Student;
import C.configration.dao.StudentDao;


import java.util.Map;

public class StudentAllSelectService {

	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}
	
}