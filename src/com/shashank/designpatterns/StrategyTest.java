package com.shashank.designpatterns;

public class StrategyTest {

    public static void main(String...dStrings) {

        EmployeesData empData = new EmployeesData();
        empData.setEmployeesData(new int[]{12, 4 ,5 ,10, 3, 5});
        empData.setSortingStrategy(new SelectionSort());
    }

}

interface SortingStrategyI {

    void sort(int[] empIds);

}

class BubbleSort implements SortingStrategyI {

    @Override
    public void sort(int[] empIds) {
        System.out.println("Sorting using Bubble Sort ...");
        int n = empIds.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (empIds[j] > empIds[j+1])
                {
                    int temp = empIds[j];
                    empIds[j] = empIds[j+1];
                    empIds[j+1] = temp;
                }
    }

}

class SelectionSort implements SortingStrategyI {

    @Override
    public void sort(int[] empIds) {
        System.out.println("Sorting using Selection Sort ...");
        for (int i = 0; i < empIds.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < empIds.length; j++)
                if (empIds[j] < empIds[index]) 
                    index = j;
     
            int smallerNumber = empIds[index];  
            empIds[index] = empIds[i];
            empIds[i] = smallerNumber;
        }
    }
    
}


class QuickSort implements SortingStrategyI {

    @Override
    public void sort(int[] empIds) {
        System.out.println("Sorting using Quick Sort ...");
        quickSort(empIds, 0, empIds.length);
    }
    
    private void quickSort(int[] arr, int start, int end){
        
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
}

class EmployeesData {

    private int [] employeeIds = new int[10];
    
    public EmployeesData() {
        // TODO Auto-generated constructor stub
    }
    
    public EmployeesData(int [] empIds) {
        this.employeeIds = empIds;
    }


    public void setEmployeesData(int[] empIds) {
        this.employeeIds = empIds;
    }

    public void setSortingStrategy(SortingStrategyI strategy) {
        strategy.sort(employeeIds);
        System.out.print("[ ");
        for (int i : employeeIds) {
            System.out.print(i + " ");
        }
        System.out.print("] ");
    }

}