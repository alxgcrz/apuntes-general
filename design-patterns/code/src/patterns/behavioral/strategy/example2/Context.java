package patterns.behavioral.strategy.example2;

class Context {

    IChoice myC;

    // Set a Strategy or algorithm in the Context
    void SetChoice(IChoice ic) {
        myC = ic;
    }

    void ShowChoice(String s1, String s2) {
        myC.myChoice(s1, s2);
    }

}
