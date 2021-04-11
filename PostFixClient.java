import java.util.*;


public class PostFixClient
{
    public static void main ( String[] args )
    {
        PostFix t = new PostFix();
        System.out.println(t.solve());

        PostFix test = new PostFix("2 7 + 1 2 + +");
        System.out.println(test.solve());

        PostFix test2 = new PostFix("1 2 3 4 + + +");
        System.out.println(test2.solve());

        PostFix test3 = new PostFix("9 3 * 8 / 4 +");
        System.out.println(test3.solve());

        PostFix test4 = new PostFix("3 3 + 7 * 9 2 / +");
        System.out.println(test4.solve());

        PostFix test5 = new PostFix("9 3 / 2 * 7 9 * + 4 -");
        System.out.println(test5.solve());

        PostFix test6 = new PostFix("5 5 + 2 * 4 / 9 +");
        System.out.println(test6.solve());
    }
}