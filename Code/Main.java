public class Main {
    public static void main(String[] args) {
        App music = new App();

        User currentUser = new User();
        currentUser.setEmail("123@gmail.com");
        currentUser.setPassword("hehe");
        currentUser.setSubscriptionType(Subscriptions.PRO);

        //Adds a song called Do it alone by Kid Cudi with no album or feature artist for the song. Prints if added or not
        System.out.println(music.addSongToPlaylist(currentUser, "awesome music",
            new Song("Do it alone", new Artist("Kid Cudi"), null, null, 3.45)));

    }
}