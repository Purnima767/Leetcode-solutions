class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++)
        {
            int temp = i;
            boolean self = true;
            while(temp > 0)
            {
                int r = temp % 10;
                if(r == 0 || i % r != 0)
                {
                    self = false;
                    break;
                }
                temp /= 10;
            }
            if(self)
            {
                result.add(i);
            }
        }
        return result;
    }
}
