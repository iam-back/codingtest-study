# Array

---

## 0. Definition

`Array:배열`이란 동일한 타입의 변수를 할당하는 자료구조로, 메모리 크기가 한 번 할당되면 변경할 수 없다.

## 1. Arrays

Array 클래스를 다루기 위한 유틸리티 클래스.<br>
배열에 대한 정렬, 이진탐색, list 변환 등 자주 사용되는 알고리즘을 제공한다.


### 1.1 자주 사용되는 메소드

1. \<T> T[] copyOf(T[], int newLength)
    * 배열을 새로운 크기의 배열에 복사하는 메소드
    * 내부적으로는 System.arraycopy() 메소드를 사용한다

2. \<T> List<T> asList(T... a)
    * 배열을 ArrayList 로 변환하는 메소드

3. String toString(T[] a)
    * 배열요소들을 append 하여 String 으로 변환
    * 내부적으로 StringBuilder 를 사용 

4. equals(T[] a, T[] b)
    * 두 배열이 동일성을 보장하는지 확인하는 메소드
    
5. \<T> Stream<T> stream(T[] array)
    * 배열에 대한 Stream 객체를 반환하는 메소드