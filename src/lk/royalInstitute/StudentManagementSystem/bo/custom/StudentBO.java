package lk.royalInstitute.StudentManagementSystem.bo.custom;

import lk.royalInstitute.StudentManagementSystem.bo.SuperBO;
import lk.royalInstitute.StudentManagementSystem.dto.StudentDTO;

import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    public boolean saveStudent(StudentDTO studentDTO)throws Exception;
    public boolean updateStudent(StudentDTO studentDTO)throws Exception;
    public boolean deleteStudent(String id)throws Exception;
    public StudentDTO get(String id)throws Exception;
    public ArrayList<StudentDTO> getAll()throws Exception;
}
