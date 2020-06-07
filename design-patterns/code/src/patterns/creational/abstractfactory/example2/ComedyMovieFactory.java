package patterns.creational.abstractfactory.example2;

class ComedyMovieFactory implements IMovieFactory {

    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

}
