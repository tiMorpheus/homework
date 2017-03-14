package timur.task18.factory;

import timur.task18.enums.Language;
import timur.task18.film.LoganMovie;
import timur.task18.film.Movie;

public class LoganFactory implements CinemaFactory {

    private static CinemaFactory instance = new SpidermanFactory();

    public static CinemaFactory getInstance(){
        return instance;
    }

    @Override
    public Movie getMovie(Language language) {
        return new LoganMovie(language);
    }
}
