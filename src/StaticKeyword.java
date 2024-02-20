public class StaticKeyword {

    public static void main(String[] args) {

        //  Static = modifier. A single copy of a variable/method is created and shared.
        //           The class "owns" the static member

        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Joe");
        Friend friend3 = new Friend("Frank");

        Friend.displayFriends();

    }
}
