package net.javaguides.springboot.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;
    private String firstName;
    private String lastname;

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastname;
    }
}
