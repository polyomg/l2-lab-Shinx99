package poly.edu.Java5_Lab3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    private String id;
    private String fullname;
    @Builder.Default
    private String photo = "trump-logo.png";
    @Builder.Default
    private boolean gender = true;
    @Builder.Default
    private Date birthday = new Date();
    @Builder.Default
    private double salary = 12345.6789;
    @Builder.Default
    private Integer level = 0;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }
//
//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public Integer getLevel() {
//        return level;
//    }
//
//    public void setLevel(Integer level) {
//        this.level = level;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public Staff() {
//    }
//
//    public Staff(String id, String fullname, String photo, boolean gender, Date birthday, double salary, Integer level) {
//        this.id = id;
//        this.fullname = fullname;
//        this.photo = photo;
//        this.gender = gender;
//        this.birthday = birthday;
//        this.salary = salary;
//        this.level = level;
//    }
}
