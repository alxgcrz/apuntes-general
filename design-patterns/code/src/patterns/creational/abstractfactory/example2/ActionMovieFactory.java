package patterns.creational.abstractfactory.example2;

class ActionMovieFactory implements IMovieFactory {

    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }

}
