class Twosum {

    public int\[] twoSum(int\[] nums, int target) {

        for(int i=0; i< nums.length ; i++){         **// nums.length is used for length of an array**

            for(int j=i+1; j < nums.length ;j++){

                if(nums\[i] + nums\[j] == target){

                    return new int\[]{i,j};         **//creates an array as \[i,j]**

                }

            }

        }

        return new int\[]{};

    }

}


