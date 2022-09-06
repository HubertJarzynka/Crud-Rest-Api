package com.crud.tasks.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

import java.util.Optional;

@Getter
@Builder
@AllArgsConstructor
public class Mail {
    private final String mailTo;
    private final String subject;
    private final String message;
    @Builder.Default
    private final Optional<String> toCc = Optional.ofNullable(null);
}