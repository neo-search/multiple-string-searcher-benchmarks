package org.neosearch.stringsearcher.benchmark;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 2, jvmArgs = { "-Xms2G", "-Xmx2G" })
@Warmup(iterations = 5)
public class BenchmarkRunner {

    // LinkedBlockingDeque
//Benchmark                     Mode  Cnt  Score   Error  Units
//StringSearcherBenchmark.init  avgt   20  0,051 ± 0,002   s/op

// LinkedList
//Benchmark                     Mode  Cnt  Score   Error  Units
//StringSearcherBenchmark.init  avgt   20  0,050 ± 0,003   s/op

// LinkedBlockingDeque
//Benchmark                                            Mode  Cnt   Score    Error  Units
//BenchmarkRunner.loopFor                              avgt   40  ≈ 10⁻⁶           ms/op
//StringSearcherBenchmark.measureTimeWith1000Keywords  avgt   20   0,533 ±  0,039   s/op
//StringSearcherBenchmark.measureTimeWithSomeKeywords  avgt   20   0,044 ±  0,001   s/op

    // LinkedList
//    Benchmark                                            Mode  Cnt  Score   Error  Units
//    StringSearcherBenchmark.measureTimeWith1000Keywords  avgt   20  0,537 ± 0,044   s/op
//    StringSearcherBenchmark.measureTimeWithSomeKeywords  avgt   20  0,045 ± 0,001   s/op

//    Benchmark                                            Mode  Cnt  Score   Error  Units
//    StringSearcherBenchmark.measureTimeWith1000Keywords  avgt   20  0,529 ± 0,050   s/op
//    StringSearcherBenchmark.measureTimeWithSomeKeywords  avgt   20  0,042 ± 0,001   s/op

    public static void main(String[] args) throws RunnerException {

        System.out.println(BenchmarkRunner.class.getSimpleName());
        Options opt = new OptionsBuilder().include("org.neosearch.stringsearcher.benchmark.*").forks(1).build();

        new Runner(opt).run();
    }

}
