package io.web.validator;

import io.web.request.data.RequestComment;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.google.common.collect.ObjectArrays;

@Service
public class CommentValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestComment requestComment = (RequestComment) target;
        if ("good".equals(requestComment.getValue())){
            errors.popNestedPath();
            errors.rejectValue("no goood", "103", ObjectArrays.newArray(Object.class, 2), "default Message");
            errors.pushNestedPath("propertyName");
        }
    }
}
