package com.hoaxify.ws.user;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME) //annotation runtimede çözümlenir.
@Constraint(validatedBy = { UniqueUserNameValidator.class})
public @interface UniqueUserName {

    String message() default "{hoaxify.constraint.username.UniqueUsername.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
