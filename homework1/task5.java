class task5 {
    public static void main(String[] args) {
        double[] arr = new double[44400];
        int i = 0;
        for(double x = 24.0; i < 44400; x += 0.01, i++){
            arr[i] = x;
        }
        for(int j = 0; j < 44400; j++){
            if(arr[j] >= 24.12 && arr[j] <= 467.23){
                System.out.print(arr[j]+ " ");
            }
        }
    }
}
