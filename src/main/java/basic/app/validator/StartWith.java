package basic.app.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StartWithValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartWith {
    String message() default "Slowo musi zaczynac się na literę A!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}