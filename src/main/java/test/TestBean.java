package test;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestBean {
    String name;

    public TestBean(String name) {
        this.name = name;
    }
}
