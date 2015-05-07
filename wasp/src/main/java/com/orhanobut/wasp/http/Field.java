package com.orhanobut.wasp.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Used to define named pair for a form-encoded request.
 *
 * @author Timothy Asiimwe
 */

@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface Field {
    String value();
}
