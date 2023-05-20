package lk.royalInstitute.StudentManagementSystem.bo.custom;

import lk.royalInstitute.StudentManagementSystem.bo.SuperBO;
import lk.royalInstitute.StudentManagementSystem.dto.CourseDTO;
import lk.royalInstitute.StudentManagementSystem.dto.StudentDTO;
import lk.royalInstitute.StudentManagementSystem.entity.Course;

import java.util.ArrayList;

public interface CourseBO extends SuperBO{
    public boolean saveCourse(CourseDTO courseDTO)throws Exception;
    public boolean updateCourse(CourseDTO courseDTO)throws Exception;
    public boolean deleteCourse(String id)throws Exception;
    public CourseDTO get(String id)throws Exception;
    public ArrayList<CourseDTO> getAll()throws Exception;
    public CourseDTO getCourseByName(String id)throws Exception;
}
