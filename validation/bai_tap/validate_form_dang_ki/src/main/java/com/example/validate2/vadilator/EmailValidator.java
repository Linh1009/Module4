package com.example.validate2.vadilator;

import com.example.validate2.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmailValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        String email = (String) target;
        ValidationUtils.rejectIfEmpty(errors, "email", "email.empty", "email không được để trống");
        if(email.length() < 10) {
            errors.rejectValue("email", "email.length", "email không được nhỏ hơn 10 kí tự");
        }
        if (!email.matches("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$")) {
            errors.rejectValue("email", "email.matches", "email phải đúng định dạng");
        }
    }
}
