package lk.royalInstitute.StudentManagementSystem.bo;

import lk.royalInstitute.StudentManagementSystem.bo.custom.impl.CourseBoImpl;
import lk.royalInstitute.StudentManagementSystem.bo.custom.impl.StudentBoImpl;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory(){
    }

    public static BoFactory getInstance(){
        return boFactory==null ? boFactory=new BoFactory() : boFactory;
    }

    public enum BoType{
        COURSE,STUDENT,REGISTRATION;
    }

    public <T extends SuperBO> T getBo(BoType boType){
        switch (boType){
            case COURSE:
                return (T) new CourseBoImpl();
            case STUDENT:
                return (T) new StudentBoImpl();
            default:
                return null;
        }
    }
}
