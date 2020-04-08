package com.codegym;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1, 3, 9, -1, 4};
        BinarySearch<Integer> binarySearch = new BinarySearch<>(array);
        //sắp xếp array theo thứ tự tăng dần
        binarySearch.arrangeArray();
        //Tìm kiếm bằng đệ quy
        if (binarySearch.search(0, array.length - 1, 11)) {
            System.out.println("Tìm thấy");
        } else {
            System.out.println("Không có phần tử này");
        }
    }
}
