package dto;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.annotation.Nullable;

import java.util.UUID;

public interface DemoEndpoints {
    @Get("/required-nullable-issue") UUID issue3(@QueryValue("id") @Nullable UUID id);
}
