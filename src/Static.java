public class Static {
    //STATIC METHOD
    static void myStaticMethod() {
        System.out.println("i want to further my studies in australia");
    }
    //PUBLIC METHOD
    public void myPublicMethod() {
        System.out.println("in melborne university");
    }
    public static void main(String[] args) {
        /*static call*/
        myStaticMethod();
        /*public call*/
        Static myObj = new Static();
        myObj.myPublicMethod();
    }
}
