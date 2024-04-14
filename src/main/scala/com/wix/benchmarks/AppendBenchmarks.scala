package com.wix.benchmarks

import org.openjdk.jmh.annotations._

import scala.collection.mutable

import scala.collection.immutable.{Queue, Stack}
import com.wix.fixtures.AppendFixtures

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(5)
class AppendBenchmarks {

  private val ListSize = 1000
  private val classUnderTest = new AppendFixtures()
  private val Elements: List[Int] = (0 until ListSize).toList

  @Benchmark
  def appendToArray(): Array[Int] = {
    val actual = classUnderTest.appendToArray(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToArrayUsingView(): Array[Int] = {
    val actual = classUnderTest.appendToArrayUsingView(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToArrayBuffer(): mutable.ArrayBuffer[Int] = {
    val actual = classUnderTest.appendToArrayBuffer(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToArrayBuffer(): mutable.ArrayBuffer[Int] = {
    val actual = classUnderTest.prependToArrayBuffer(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToImmutableList(): List[Int] = {
    val actual = classUnderTest.appendToImmutableList(Elements)
    assert(actual == Elements)
    assert(actual ne Elements)
    actual
  }

  @Benchmark
  def prependToImmutableList(): List[Int] = {
    val actual = classUnderTest.prependToImmutableList(Elements)
    assert(actual == Elements)
    assert(actual ne Elements)
    actual
  }

  @Benchmark
  def appendToVector(): Vector[Int] = {
    val actual = classUnderTest.appendToVector(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToVector(): Vector[Int] = {
    val actual = classUnderTest.prependToVector(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToStack(): Stack[Int] = {
    val actual = classUnderTest.appendToStack(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToStack(): Stack[Int] = {
    val actual = classUnderTest.prependToStack(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToQueue(): Queue[Int] = {
    val actual = classUnderTest.appendToQueue(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToQueue(): Queue[Int] = {
    val actual = classUnderTest.prependToQueue(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToMutableList(): mutable.MutableList[Int] = {
    val actual = classUnderTest.appendToMutableList(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToMutableList(): mutable.MutableList[Int] = {
    val actual = classUnderTest.prependToMutableList(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToListBuffer(): mutable.ListBuffer[Int] = {
    val actual = classUnderTest.appendToListBuffer(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToListBuffer(): mutable.ListBuffer[Int] = {
    val actual = classUnderTest.prependToListBuffer(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToMutableQueue(): mutable.Queue[Int] = {
    val actual = classUnderTest.appendToMutableQueue(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def prependToMutableQueue(): mutable.Queue[Int] = {
    val actual = classUnderTest.prependToMutableQueue(Elements)
    assert(actual.toList == Elements)
    actual
  }

  @Benchmark
  def appendToArrayBuilder(): mutable.ArrayBuilder[Int] = {
    val actual = classUnderTest.appendToArrayBuilder(Elements)
    assert(actual.result.toList == Elements)
    actual
  }

}