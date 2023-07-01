class task3 {
    public static void main(String[] args) {
        int index = 0;
        int num = -20;
        int[] arr = new int[20];
        do{
            if(num % 2 != 0){
                arr[index] = num;
                index++;
            }
            num++;
        }while(index < 20);
        for(int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
