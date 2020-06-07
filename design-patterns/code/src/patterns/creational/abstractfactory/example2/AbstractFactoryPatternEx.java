package patterns.creational.abstractfactory.example2;

class AbstractFactoryPatternEx {

    public static void main(String[] args) {
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        IHollywoodMovie tAction = actionMovies.getHollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();

        System.out.println("\nAction movies are:");
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());

        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        IHollywoodMovie tComedy = comedyMovies.getHollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();

        System.out.println("\nComedy movies are:");
        System.out.println(tComedy.movieName());
        System.out.println(bComedy.movieName());
    }

}
