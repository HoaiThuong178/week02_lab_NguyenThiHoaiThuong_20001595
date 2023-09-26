package vn.edu.iuh.fit.converter;

import jakarta.persistence.AttributeConverter;
import vn.edu.iuh.fit.enums.EmployeeStatus;

import java.lang.annotation.Annotation;

public class EmployeeStatusConverter implements AttributeConverter<EmployeeStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(EmployeeStatus attribute) {
        if(attribute==EmployeeStatus.active)
            return 1;
        else if(attribute==EmployeeStatus.deactive)
            return 0;
        else return -1;
    }

    @Override
    public EmployeeStatus convertToEntityAttribute(Integer dbData) {
        if(dbData==1)
            return EmployeeStatus.active;
        else if(dbData==0)
            return EmployeeStatus.deactive;
        else return EmployeeStatus.deleted;
    }
}
