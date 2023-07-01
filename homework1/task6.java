class task6 {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        for(int i = 1, j = 0; j < 1000; j++, i++){
            arr[j] = i;
        }
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                counter++;
        }
        System.out.println(counter);
    }
}
