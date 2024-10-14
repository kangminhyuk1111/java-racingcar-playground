package cargame.vo;

import java.util.Objects;

public class Name {

    private final String name;

    public Name(final String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("글자수는 0자리이상 5자리 이하로 제한합니다");
        }

        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
