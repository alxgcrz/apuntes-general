package patterns.behavioral.iterator.example2;

interface Iterator {

    void first();//Reset to first element

    String next();//get next element

    Boolean isDone();//End of collection check

    String currentItem();//Retrieve Current Item

}
