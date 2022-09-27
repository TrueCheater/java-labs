package com.example;

import java.util.Objects;

public final class Person {
    private final String name;
    private final String surname;
    private final String birthDate;

    public Person(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if (!Objects.equals(name, person.name))
            return false;
        if (!Objects.equals(surname, person.surname))
            return false;
        return Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }
}
