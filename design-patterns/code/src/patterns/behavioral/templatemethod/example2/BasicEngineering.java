package patterns.behavioral.templatemethod.example2;

abstract class BasicEngineering {

    // papers() in the template method
    void papers() {
        //Common papers:
        math();
        softSkills();
        //Specialized Paper:
        specialPaper();
    }

    //Non-Abstract method math(), softSkills() are //already implemented by Template class
    private void math() {
        System.out.println("Mathematics");
    }

    private void softSkills() {
        System.out.println("softSkills");
    }

    //Abstract method specialPaper() must be implemented in derived classes
    abstract void specialPaper();

}
