package myleetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1_TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = new Solution_1_1().twoSum(nums, target);
		System.out.println("Result = [" + result[0] + "], [" + result[1] + "]");
	}

}

class Solution_1_1 {
    public int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	if(nums == null || nums.length <=1) 
    		return result;
    	
        Map<Integer /* target - current*/, Integer /* index */> map = new HashMap<>();
        
        // ѭ��ÿ����
        for(int i = 0; i < nums.length; i++) {
        	// ȡ����ǰλ�õ���ֵ
        	int current = nums[i];
        	// �����ǰ��ֵ��Map���Ѿ����ڣ������Ѿ�����������λ�ã�
        	if(map.get(current) != null) {
        		// ����ԭ��¼�����ĵ�λ�ã��͵�ǰ��ֵ��λ��
        		return new int[] {map.get(current), i};
        	}
        	
        	// ���û�д��ڣ�����ǰ��ֵ����ȥtarget,����map�У�key=target-��ǰֵ��value=��ǰֵ��λ�ã�
        	map.put(target-current, i);
        }
        
        return result;
    }
}