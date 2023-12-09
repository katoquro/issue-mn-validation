package dto;

import io.micronaut.core.annotation.Introspected;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Introspected(
        accessKind = {Introspected.AccessKind.FIELD, Introspected.AccessKind.METHOD},
        visibility = Introspected.Visibility.PUBLIC)
public @interface ApiModel {
}
