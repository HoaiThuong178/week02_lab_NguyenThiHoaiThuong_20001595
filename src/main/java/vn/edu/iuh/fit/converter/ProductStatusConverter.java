package vn.edu.iuh.fit.converter;

import jakarta.persistence.AttributeConverter;
import vn.edu.iuh.fit.enums.EmployeeStatus;
import vn.edu.iuh.fit.enums.ProductStatus;

public class ProductStatusConverter implements AttributeConverter<ProductStatus,Integer> {
    @Override
    public Integer convertToDatabaseColumn(ProductStatus attribute) {
        if(attribute==ProductStatus.active)
            return 1;
        else if(attribute==ProductStatus.deactive)
            return 0;
        else return -1;
    }

    @Override
    public ProductStatus convertToEntityAttribute(Integer dbData) {
        if(dbData==1)
            return ProductStatus.active;
        else if(dbData==0)
            return ProductStatus.deactive;
        else return ProductStatus.deleted;
    }
}
