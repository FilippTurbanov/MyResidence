package collections.dto;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Passport {
    private String id;
    private Date effectiveAt;
    private String fio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(Date effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void generatePassport() {
        Random rnd = new Random();
        setId((rnd.nextInt(9_000_000) + 1_000_000) + "А" + (rnd.nextInt(900) + 100)
                + "РВ" + rnd.nextInt(10));
        setEffectiveAt(new Date());
        setFio("Нечеловек Рэндомайз Генератович");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", effectiveAt=" + effectiveAt +
                ", fio='" + fio + '\'' +
                '}';
    }
}
