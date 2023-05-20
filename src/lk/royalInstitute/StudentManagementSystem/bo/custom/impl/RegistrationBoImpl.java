package lk.royalInstitute.StudentManagementSystem.bo.custom.impl;

import lk.royalInstitute.StudentManagementSystem.bo.custom.RegistrationBO;
import lk.royalInstitute.StudentManagementSystem.dao.DaoFactory;
import lk.royalInstitute.StudentManagementSystem.dao.custom.RegistrationDAO;
import lk.royalInstitute.StudentManagementSystem.dto.RegistrationDTO;
import lk.royalInstitute.StudentManagementSystem.entity.Course;
import lk.royalInstitute.StudentManagementSystem.entity.Registration;
import lk.royalInstitute.StudentManagementSystem.entity.Student;
import lk.royalInstitute.StudentManagementSystem.util.FactoryConfiguration;
import org.hibernate.Session;

import java.util.List;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 19-May-23
 */
public class RegistrationBoImpl implements RegistrationBO {
    private RegistrationDAO registrationDAO= DaoFactory.getInstance().getDao(DaoFactory.DaoType.REGISTRATION);

    @Override
    public boolean saveRegistration(RegistrationDTO registrationDTO) throws Exception {
        return registrationDAO.save(new Registration(
//                registrationDTO.getRegNo(),
                registrationDTO.getRegDate(),
                registrationDTO.getRegFee(),
                new Student(registrationDTO.getStudentDTO()),
                new Course(registrationDTO.getCourseDTO())
        ));
    }

    @Override
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteRegistration(String id) throws Exception {
        return registrationDAO.delete(id);
    }

    @Override
    public RegistrationDTO getRegistration(String id) throws Exception {
        return null;
    }

    @Override
    public List<RegistrationDTO> getAllRegistrationDtos() throws Exception {
        return null;
    }
}
