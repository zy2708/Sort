public class swap {
    public static double[] swap(double []numbers){
        for(int i=0; i<numbers.length; i++){
            for(int l=0; l<numbers.length; l++){
                double small=numbers[i];
                double temp=0;
                if(numbers[l]>small){
                    temp=numbers[i];
                    numbers[i] = numbers[l];
                    small = numbers[l];
                    numbers[l]=temp;
                }
            }
        }
        return numbers;
    }
}
