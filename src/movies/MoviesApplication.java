package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice:");
        int selection = input.getInt();

        Movie[] newMoviesArray = MoviesArray.findAll();

        boolean continueToMenu = true;

        while (continueToMenu) {
            if (selection == 1) {
                System.out.println("Okay, here are all of the movies");
                for (Movie movie : newMoviesArray) {
                    System.out.printf("%s ...a %s%n", movie.getName(), movie.getCategory());
                }
            } else if (selection == 2) {
                System.out.println("Here are all of the animated features:");
                System.out.println("-------------------------------");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 3) {
                System.out.println("Here are all of the dramas:");
                System.out.println("-------------------------------");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 4) {
                System.out.println("Showing all horror movies:");
                System.out.println("-------------------------------");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 5) {
                System.out.println("Showing all Sci-Fi movies:");
                System.out.println("-------------------------------");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 0) {
                System.out.println("Thank you!");
                continueToMenu = false;
                System.exit(1);
            } else {
                System.out.println("What would you like to do?\n" +
                        "\n" +
                        "0 - exit\n" +
                        "1 - view all movies" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n" +
                        "\n" +
                        "Enter your choice:");
                selection = input.getInt();
            }

        }


    }
}
