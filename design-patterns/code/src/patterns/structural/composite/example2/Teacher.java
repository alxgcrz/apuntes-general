package patterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

class Teacher implements ITeacher {

    private String teacherName;
    private String deptName;
    private List<ITeacher> controls;

    Teacher(String teacherName, String deptName) {
        this.teacherName = teacherName;
        this.deptName = deptName;
        controls = new ArrayList<>();
    }

    void add(Teacher teacher) {
        controls.add(teacher);
    }

    void remove(Teacher teacher) {
        controls.remove(teacher);
    }

    List<ITeacher> getControllingDepts() {
        return controls;
    }

    @Override
    public String getDetails() {
        return (teacherName + " is the " + deptName);
    }

}
