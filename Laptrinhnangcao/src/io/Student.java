package io;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Date birthday;

    public Student(int id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = Date.from(birthday.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
  
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', birthday=" + birthday + '}';
    }
}
