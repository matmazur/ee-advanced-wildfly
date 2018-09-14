package servlets;

public class stuff {
    private static stuff ourInstance = new stuff();

    public static stuff getInstance() {
        return ourInstance;
    }

    private stuff() {
    }
}
