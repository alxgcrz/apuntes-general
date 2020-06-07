package patterns.structural.composite.example2;

import java.util.List;

class Client {

    public static void main(String[] args) {
        Teacher principal = new Teacher("Dr.S.Som", "Principal");
        Teacher hodMaths = new Teacher("Mrs.S.Das", "Hod-Math");
        Teacher hodCompSc = new Teacher("Mr. V.Sarcar", "Hod-ComputerSc.");
        Teacher mathTeacher1 = new Teacher("Math Teacher-1", "MathsTeacher");
        Teacher mathTeacher2 = new Teacher("Math Teacher-2", "MathsTeacher");
        Teacher cseTeacher1 = new Teacher("CSE Teacher-1", "CSETeacher");
        Teacher cseTeacher2 = new Teacher("CSE Teacher-2", "CSETeacher");
        Teacher cseTeacher3 = new Teacher("CSE Teacher-3", "CSETeacher");
        //Principal is on top of college
        /*HOD -Maths and Comp. Sc. directly reports to him*/
        principal.add(hodMaths);
        principal.add(hodCompSc);
        /*Teachers of Mathematics directly reports to HOD-Maths*/
        hodMaths.add(mathTeacher1);
        hodMaths.add(mathTeacher2);
        /*Teachers of Computer Sc. directly reports to HOD-Comp.Sc.*/
        hodCompSc.add(cseTeacher1);
        hodCompSc.add(cseTeacher2);
        hodCompSc.add(cseTeacher3);
        /*Leaf nodes. There is no department under Mathematics*/
        mathTeacher1.add(null);
        mathTeacher2.add(null);

        /*Leaf nodes. There is no department under CSE.*/
        cseTeacher1.add(null);
        cseTeacher2.add(null);
        cseTeacher3.add(null);
        //Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO ***");
        System.out.println("\nThe college has following structure\n");
        System.out.println(principal.getDetails());
        List<ITeacher> hods = principal.getControllingDepts();
        for (ITeacher hod : hods) {
            System.out.println("\t" + hod.getDetails());
        }
        List<ITeacher> mathTeachers = hodMaths.getControllingDepts();
        for (ITeacher mathTeacher : mathTeachers) {
            System.out.println("\t\t" + mathTeacher.getDetails());
        }
        List<ITeacher> cseTeachers = hodCompSc.getControllingDepts();
        for (ITeacher cseTeacher : cseTeachers) {
            System.out.println("\t\t" + cseTeacher.getDetails());
        }
        //One computer teacher is leaving
        hodCompSc.remove(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 leaving the organization- CSE department has following employees:");
        cseTeachers = hodCompSc.getControllingDepts();
        for (ITeacher cseTeacher : cseTeachers) {
            System.out.println("\t\t" + cseTeacher.getDetails());
        }
    }

}
