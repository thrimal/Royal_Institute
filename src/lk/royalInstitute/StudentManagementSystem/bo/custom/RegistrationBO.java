package lk.royalInstitute.StudentManagementSystem.bo.custom;

import lk.royalInstitute.StudentManagementSystem.bo.SuperBO;
import lk.royalInstitute.StudentManagementSystem.dto.RegistrationDTO;
import lk.royalInstitute.StudentManagementSystem.entity.Registration;

import java.util.List;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 19-May-23
 */
public interface RegistrationBO extends SuperBO {
    public boolean saveRegistration(RegistrationDTO registrationDTO) throws Exception;
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception;
    public boolean deleteRegistration(String id)throws Exception;
    public RegistrationDTO getRegistration(String id)throws Exception;
    public List<RegistrationDTO> getAllRegistrationDtos()throws Exception;
}
