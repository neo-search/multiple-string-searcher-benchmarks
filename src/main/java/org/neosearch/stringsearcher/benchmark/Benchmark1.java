package org.neosearch.stringsearcher.benchmark;

//import com.google.caliper.Benchmark;

public class Benchmark1 {
//    @Benchmark
    void timeNanoTime(int reps) {
        for (int i = 0; i < reps; i++) {
            System.nanoTime();
        }
    }
}