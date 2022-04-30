package telia.hw.infrastructure.exception;

import lombok.Data;

@Data
public class DataNotFoundException extends RuntimeException {
    private final String title;
    private final  String detail;

    public DataNotFoundException(String title, String detail) {
        super(title);
        this.title = title;
        this.detail = detail;
    }
}
