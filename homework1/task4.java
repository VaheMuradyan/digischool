class task4 {
    public static void main(String[] args) {
        int arr[] = new int[100];
        for(int i = 1, j = 0; j < 100; i++, j++){
            arr[j] = i;
        }
        for(int x : arr){
            if((x % 5 == 0)  || (x % 5 == 5)){
                System.out.println(x);
            }
        }
    }
}
