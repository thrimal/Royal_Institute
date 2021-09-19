package lk.royalInstitute.StudentManagementSystem.dao;

import lk.royalInstitute.StudentManagementSystem.dao.custom.impl.CourseDaoImpl;
import lk.royalInstitute.StudentManagementSystem.dao.custom.impl.RegistrationDaoImpl;
import lk.royalInstitute.StudentManagementSystem.dao.custom.impl.StudentDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return daoFactory==null ? daoFactory=new DaoFactory() : daoFactory;
    }

    public enum DaoType{
        COURSE,REGISTRATION,STUDENT;
    }

    public <T extends SuperDAO> T getDao(DaoType daoType){
        switch (daoType){
            case COURSE:
                return (T) new CourseDaoImpl();
            case STUDENT:
                return (T) new StudentDaoImpl();
            case REGISTRATION:
                return (T) new RegistrationDaoImpl();
            default:
                return null;
        }
    }
}
