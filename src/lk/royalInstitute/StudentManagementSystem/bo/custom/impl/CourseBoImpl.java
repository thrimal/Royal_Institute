package lk.royalInstitute.StudentManagementSystem.bo.custom.impl;

import lk.royalInstitute.StudentManagementSystem.bo.custom.CourseBO;
import lk.royalInstitute.StudentManagementSystem.dao.DaoFactory;
import lk.royalInstitute.StudentManagementSystem.dao.custom.CourseDAO;
import lk.royalInstitute.StudentManagementSystem.dto.CourseDTO;
import lk.royalInstitute.StudentManagementSystem.entity.Course;

import java.util.ArrayList;

public class CourseBoImpl implements CourseBO {
    private CourseDAO courseDAO=DaoFactory.getInstance().getDao(DaoFactory.DaoType.COURSE);

    @Override
    public boolean saveCourse(CourseDTO courseDTO) throws Exception {
        return courseDAO.save(new Course(
                courseDTO.getCode(),
                courseDTO.getName(),
                courseDTO.getDuration(),
                courseDTO.getCourseFee()
                ));
    }

    @Override
    public boolean updateCourse(CourseDTO courseDTO) throws Exception {
        return courseDAO.update(new Course(
                courseDTO.getCode(),
                courseDTO.getName(),
                courseDTO.getDuration(),
                courseDTO.getCourseFee()
        ));
    }

    @Override
    public boolean deleteCourse(String id) throws Exception {
        return courseDAO.delete(id);
    }

    @Override
    public CourseDTO get(String id) throws Exception {
        Course course = courseDAO.get(id);
        return new CourseDTO(
                course.getCode(),
                course.getName(),
                course.getDuration(),
                course.getCourseFee()
        );
    }

    @Override
    public ArrayList<CourseDTO> getAll() throws Exception {
        ArrayList<Course> all = courseDAO.getAll();
        ArrayList<CourseDTO> courseDTOS=new ArrayList<>();
        for (Course c : all) {
            courseDTOS.add(new CourseDTO(
                    c.getCode(),
                    c.getName(),
                    c.getDuration(),
                    c.getCourseFee()
            ));
        }
        return courseDTOS;
    }

    @Override
    public CourseDTO getCourseById(String id) throws Exception {
        Course course = courseDAO.getCourseById(id);
        return new CourseDTO(
                course.getCode(),
                course.getName(),
                course.getDuration(),
                course.getCourseFee()
        );
    }
}
