package dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

@ApiModel
//@Introspected(
//        accessKind = {Introspected.AccessKind.FIELD, Introspected.AccessKind.METHOD},
//        visibility = Introspected.Visibility.PUBLIC)
public class DemoDto {
    public @NotBlank String valueStr;

    public static class Form extends DemoDto {
        public @Min(0) BigDecimal valueNum;
    }

    public static class FormWithNullableBlank extends DemoDto {
        public @Nullable @NotBlank String valueStrBlank;
    }
}
