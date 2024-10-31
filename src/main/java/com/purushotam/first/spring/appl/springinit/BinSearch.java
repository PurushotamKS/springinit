package com.purushotam.first.spring.appl.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinSearch {

    @Autowired
    private SortAlgo sortAlgo;
        
    public BinSearch(SortAlgo sortAlgo){
        super();
        this.sortAlgo=sortAlgo;
    }

    public int BinarySearch(int[] num,int numtosearch){
        
        //now if suppose the code contains logic for bubble sort and i want to change it for binary search, i would need to change the whole logic, whoch is a case of TIGHT COUPLING
        //one of the solution is to create a new class for bubblesort and implement it as a dependency here, nut if i have multiple algos, i will have to create a new class for each    
        //let's make use of a generic interface called SortAlgo
        return sortAlgo.sort(num,numtosearch);
    }//just a demo
}
