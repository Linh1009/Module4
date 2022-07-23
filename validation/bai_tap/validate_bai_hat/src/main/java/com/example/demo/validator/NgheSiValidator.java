package com.example.demo.validator;

import com.example.demo.entity.Music;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class NgheSiValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Music.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        String ngheSi = (String) target;
        ValidationUtils.rejectIfEmpty(errors, "ten", "ten.empty", "Tên nghệ si không được để trống");
        if (ngheSi.length() > 300) {
            errors.rejectValue("email", "email.length", "Tên nghệ sĩ không được quá 300 kí tự");
        }
        if (!ngheSi.matches("^[a-zA-Z0-9]*$")) {
            errors.rejectValue("email", "email.matches", "Tên nghệ sĩ không được chứa kí tự đặt biệt");
        }
    }
}

