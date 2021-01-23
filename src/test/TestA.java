package test;

import test.impl.AImpl;
import test.inter.AInterFace;

/**
 * @author 53137
 */
public class TestA {
    public static void main(String[] args) {
        //多态
        AInterFace a = new AImpl();
        TestA.test(a);
    }

    public static void test(AInterFace aInterface) {

    }
}
