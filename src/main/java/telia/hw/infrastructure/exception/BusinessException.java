package telia.hw.infrastructure.exception;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException {
    private final String title;
    private final  String detail;

    public BusinessException (String title, String detail) {
        super(title);
        this.title = title;
        this.detail = detail;
    }
}