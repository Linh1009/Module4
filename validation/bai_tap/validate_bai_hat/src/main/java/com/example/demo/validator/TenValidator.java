package com.example.demo.validator;

import com.example.demo.entity.Music;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class TenValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Music.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        String ten = (String) target;
        ValidationUtils.rejectIfEmpty(errors, "ten", "ten.empty", "Tên bài hát không được để trống");
        if (ten.length() > 800) {
            errors.rejectValue("email", "email.length", "Tên bài hát không được quá 800 kí tự");
        }
        if (!ten.matches("^[a-zA-Z0-9]*$")) {
            errors.rejectValue("email", "email.matches", "Tên bài hát không được chứa kí tự đặt biệt");
        }
    }
}

