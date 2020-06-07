package patterns.creational.abstractfactory.example2;

interface IMovieFactory {

    IHollywoodMovie getHollywoodMovie();

    IBollywoodMovie getBollywoodMovie();

}
