Java Concurrency

---

## CPU cache and Main Memory

## Race Condition

## Concurrency 

## Java Concurrency 

### synchronized : a. 동기화 된

* multi-thread 환경에서 원자성을 보장하기 위한 키워드
* 메소드나 블록으로 정의할 수 있음
* Blocking-io 로 성능 저하를 일으킴

### java.util.concurrent.Lock

### volatile : a. 변덕스러운, 휘발성의

* multi-thread 환경에서 하나의 thread 만 read 하고 다른 thread 는 read-only 인 경우 사용하는 키워드
* CPU cache 가 아닌 main memory 를 참조하여 데이터에 접근함. 이는 `가시성` 을 보장한다고 함
* volatile 인 이유는 main memory 가 휘발성이기 때문
* volatile 은 multi-thread 환경에서 동일한 메모리를 참조하여 read 에 대해서는 보장하나 write 에 대한 race condition 상황에서는 보장할 수 없음

## java.util.concurrent

### Atomic : 원자성

* multi-thread 환경에서 동시성을 보장하기 위해서 