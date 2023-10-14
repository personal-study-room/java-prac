package 클래스.기초활용예제.ex02;

public class IntArrayInfo {

    int count;
    int max;
    int min;
    int sum;
    double average;

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }
        // 소수부를 잃지 않도록 먼저 1.0을 곱하여 double로 만듦
        average = 1.0 * sum / nums.length;
    }
}
