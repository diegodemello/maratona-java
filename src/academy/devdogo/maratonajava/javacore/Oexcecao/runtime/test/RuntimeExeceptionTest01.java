package academy.devdogo.maratonajava.javacore.Oexcecao.runtime.test;

public class RuntimeExeceptionTest01 {
    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString());

        int[] nums = {1, 2};
        System.out.println(nums[3]);
    }
}
