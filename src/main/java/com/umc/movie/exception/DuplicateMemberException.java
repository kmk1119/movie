package com.umc.movie.exception;

public class DuplicateMemberException extends RuntimeException {
    private final String code;

    public DuplicateMemberException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}