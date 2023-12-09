package dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;

@Introspected(
        accessKind = {Introspected.AccessKind.FIELD, Introspected.AccessKind.METHOD},
        visibility = Introspected.Visibility.PUBLIC)
public class Issue2Dto {
    public @NotBlank String valueStr;

    public static class Form extends Issue2Dto {
        public @Nullable @NotBlank String valueStrBlank;
    }
}
