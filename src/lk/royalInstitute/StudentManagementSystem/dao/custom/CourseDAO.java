package lk.royalInstitute.StudentManagementSystem.dao.custom;

import lk.royalInstitute.StudentManagementSystem.dao.CrudDAO;
import lk.royalInstitute.StudentManagementSystem.entity.Course;

public interface CourseDAO extends CrudDAO<Course,String> {
    public Course getCourseByName(String id)throws Exception;
}
