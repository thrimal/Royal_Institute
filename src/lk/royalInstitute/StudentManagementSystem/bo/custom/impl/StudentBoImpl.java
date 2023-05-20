package lk.royalInstitute.StudentManagementSystem.bo.custom.impl;

import lk.royalInstitute.StudentManagementSystem.bo.custom.StudentBO;
import lk.royalInstitute.StudentManagementSystem.dao.DaoFactory;
import lk.royalInstitute.StudentManagementSystem.dao.custom.StudentDAO;
import lk.royalInstitute.StudentManagementSystem.dto.StudentDTO;
import lk.royalInstitute.StudentManagementSystem.entity.Student;

import java.util.ArrayList;

public class StudentBoImpl implements StudentBO {
    private StudentDAO studentDAO= DaoFactory.getInstance().getDao(DaoFactory.DaoType.STUDENT);

    @Override
    public boolean saveStudent(StudentDTO studentDTO) throws Exception {
        return studentDAO.save(new Student(
//                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getAddress(),
                studentDTO.getContact(),
                studentDTO.getDob(),
                studentDTO.getGender()
        ));
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) throws Exception {
        return studentDAO.update(new Student(
//                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getAddress(),
                studentDTO.getContact(),
                studentDTO.getDob(),
                studentDTO.getGender()
        ));
    }

    @Override
    public boolean deleteStudent(String id) throws Exception {
        return studentDAO.delete(id);
    }

    @Override
    public StudentDTO get(String id) throws Exception {
        Student student = studentDAO.get(id);
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getAddress(),
                student.getContact(),
                student.getDob(),
                student.getGender()
        );
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        ArrayList<Student> all = studentDAO.getAll();
        ArrayList<StudentDTO> studentDTOS=new ArrayList<>();
        for (Student s : all) {
            studentDTOS.add(new StudentDTO(
                    s.getId(),
                    s.getName(),
                    s.getAddress(),
                    s.getContact(),
                    s.getDob(),
                    s.getGender()
            ));
        }
        return studentDTOS;
    }
}
