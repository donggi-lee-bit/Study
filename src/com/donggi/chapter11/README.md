# 컬렉션 프레임워크

## 컬렉션 프레임워크
### collection
여러 객체를 모아 놓은 것

### framework
표준화, 정형화된 체계적인 프로그래밍 방식

### collections framework
- 컬렉션을 다루기 위한 표준화된 프로그래밍 방식
- 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스를 제공
- java.util패키지에 포함. JDK1.2부터 제공 (이전에도 있었지만 이 때 표준화 시켰음)

### collection class
다수의 데이터를 저장할 수 있는 클래스(예, Vector, ArrayList, HashSet)

### 핵심 인터페이스
- List
  - 순서가 있는 데이터의 집합, 데이터의 중복을 허용 (예, 대기자 명단)
  - ArrayList, LinkedList, Stack, Vector 등

- Set
  - 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않음
  - HashSet, TreeSet 등

- Map
  - key와 value의 쌍으로 이루어진 데이터의 집합
  - 순서는 유지되지 않으며, key는 중복을 허용하지 않고, value는 중복 허용 (우편번호, 지역번호)
  - HashMap, TreeMap, Hashtable, Properies 등 (Map이라고 쓰이지 않은 애들은 표준화 되기 전 만들어짐)

### Collection 인터페이스의 메서드
- add(), addAll()
  - 지정된 객체 또는 Collection의 객체들을 Collection에 추가한다

- contains(), containsAll()
  - 지정된 객체 또는 Collection의 객체들이 Collection에 포함되어 있는지 확인한다

- remove(), removeAll()
  - 지정된 객체를 삭제하거나 지정된 Collection에 포함된 객체들을 삭제한다

### List 인터페이스의 메서드 (순서 O, 중복 O)
- add(), addAll()

- indexOf(), lastIndexOf()
  - 지정된 객체의 위치를 반환한다 (List의 첫번째 요소부터 순방향으로 찾는다)
  - 지정된 객체의 위치를 반환한다 (List의 마지막 요소부터 역방향으로 찾는다)

- remove()

- set()
  - 지정된 위치에 객체를 저장한다

- subList()
  - 지정된 범위에 있는 객체를 반환한다

### Set 인터페이스 (순서 X, 중복 X)
Set 인터페이스의 메서드 = Collection 인터페이스의 메서드와 같다

- addAll()
  - 지정된 Collection의 객체들을 Collection에 추가 (합집합)
- containsAll()
  - 지정된 Collection의 객체들이 Collection에 포함되어 있는지 확인한다 (부분집합)
- removeAll()
  - 지정된 Collection에 포함된 객체들을 삭제한다(차집합)
- retainAll()
  - 지정된 Collection에 포함된 객체들만 남기고 나머지는 Collection에서 삭제한다 (교집합)

### Map 인터페이스 

- containsKey(), containsValue()
  - 지정된 key 객체와 일치하는 Map의 key객체가 있는지 확인
  - 지정된 value 객체와 일치하는 Map의 value객체가 있는지 확인
- entrySet()
  - Map에 저장되어 있는 key-value 쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환 (순서X, 중복X)
- get()
  - 지정한 key객체에 대응하는 value객체를 찾아 반환
- keySet()
  - Map에 저장된 모든 key객체를 반환
- pull(), pullAll()
  - Map에 value객체를 key객체에 연결하여 저장
  - 지정한 key객체와 일치하는 key-value 객체를 삭제
- remove()
- values()
  - Mapd에 저장된 모든 value객체를 반환

## ArrayList
- ArrayList는 기존 Vector를 개선한 으로 구현원리와 기능적으로 동일
- Vector는 자체적으로 동기화, ArrayList는 동기화 X

### ArrayList의 메서드

- 추가
  - add(), add(int index, Object element), addAll(), addAll(int index, Collection c)
- 삭제
  - remove(Ojbect o), remove(int index), revmoeAll(), clear()
- 검색
  - indexOf(), lastIndexOf(), contains(), get(), get(int index, Object element)
  - subList(int fromindex, int toindex), Object[] toArray(), toArray(Object[] a), boolean isEmpty(), trimToSize(), size()

## LinkedList

### 배열의 장단점
- 장점
  - 배열은 구조가 간단하고 데이터를 읽는데 걸리는 시간이 짧다.
- 단점
  - 크기를 변경할 수 없다
  - 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.
  - 하지만 순차적인 데이터 추가(끝)와 삭제(끝)는 빠르다.

### 배열의 단점을 보완해주는 LinkedList
배열과 달리 LinkedList는 불연속적으로 존재하는 데이터를 연결

- 데이터의 삭제 : 한 번의 참조변경만으로 가능
- 데이터의 추가 : 한 번의 Node객체생성과 두 번의 참조변경만으로 가능

LinkedList 단점
- 연결리스트. 데이터 접근성이 나쁘다
  - 한 번에 이동이 안 되고 징검다리 건너듯 한 발씩 갈 수 있다

### ArrayList vs LinkedList
1. 순차적으로 데이터 추가 / 삭제 ==> ArrayList가 빠르다
2. 비순차적으로 데이터 추가 / 삭제 ==> LinkedList가 빠르다
3. 접근시간 ==> ArrayList가 빠르다

## Stack & Queue

### Stack
LIFO (Last In First Out). 마지막에 저장된 것을 제일 먼저 꺼내게 됨
- 밑이 막힌 상자
- 저장(push), 추출(pop)
- 배열로 구현하는 게 효율적


### Queue
FIFO (First In First Out). 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다
- 양 끝이 뚫린 상자
- 저장(offer), 추출(poll)
- LinkedList로 구현하는 게 효율적

### Stack의 메서드
- empty() : 비어있는지 boolean으로 반환
- push() : Stack에 객체를 저장한다 
- pop() : Stack의 맨 위에 저장된 객체를 꺼낸다.
- peek() : Stack의 맨 위에 저장된 객체를 반환. pop()과 달리 객체를 꺼내지는 않음 (비었을 때 EmptyStackException 발생)
- search(Object o) : 주어진 객체를 찾아 그 위치를 반환. 못 찾으면 -1 반환. (배열과 달리 0이 아닌 1부터 시작)

### Queue의 메서드
- add() : 저장된 객체를 Queue에 추가. 성공시 true 반환. 저장공간 부족하면 IllegalStateException 발생
- remove() : Queue에서 꺼내 반환. 비어있으면 NoSuchElementException 발생
- element() : 삭제없이 요소를 읽어온다. peek과 달리 Queue가 비었을 때 NoSuchElementException 발생
- **offer()** : Queue에 객체를 저장. true, false 반환
- **poll()** : Queue에서 객체를 꺼내어 반환. 비어있으면 null 반환
- **peek()** : 삭제없이 요소 읽어온다. 비어있으면 null 반환

## Stack & Queue의 활용

### 스택의 활용 예
- 수식계산
- 수식괄호검사
- 워드프로세서의 undo / redo
- 웹브라우저의 뒤로 / 앞으로

### 큐의 활용 예
- 최근사용문서
- 인쇄작업 대기목록
- 버퍼(buffer)

## Iterator, ListIterator, Enumeration
- 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
- Enumeration은 Iterator의 구버전
- ListIterator는 Iterator의 접근성을 향상시킨 것 (이전 요소를 확인하는 previous() method가 있다)

### Iterator가 필요한 이유
- 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
- 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용.

### Iterator의 메서드
- haxNext() : 확인, 읽어 올 요소가 남아있는지 확인한다. boolean 으로 반환 
- next() : 읽기, 다음 요소를 읽어 온다.

```java
import java.util.Iterator;
import java.util.List;

class IteratorEx() {
  List list = new ArrayList();
  Iterator it = list.iterator();    // Iterator는 Collection을 상속받고 있기 때문에 List와 Set 둘 다에 포함되어있다
  
  IteratorEx() {
    while (it.hasNext()) {  // hasNext() 메서드를 이용해 읽어올 요소가 false 될 때까지 while 반복
      System.out.println(it.next()); // next() 메서드를 이용해 while 실행 시 it 에 포함된 요소를 읽어온다 
    }
  } 
} 
```

### Map과 Iterator
- Map에는 Iterator가 없다. keySet(), entrySet(), values()를 호출해야한다

```java
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapIteratorEx() {
  Map map = new HashMap();

//  Set eSet = map.entrySet();
//  Iterator it2 = eSet.iterator();
  Iterator it = map.entrySet().iterator();  // Set으로 반환하는 entrySet() 메서드를 호출하여 iterator() 를 사용한다
}
```

## Arrays class

- 배열의 출력 : toString()
- 배열의 복사 : copyOf(), copyfOfRange()
- 배열 채우기 : fill(), setAll()
```java
class fillEx() {
    
    fillEx() {
      int[] arr = new int[5];
      
      Arrays.fill(arr,9);   // arr = [9, 9, 9, 9, 9]
      Arrays.setAll(arr, (i) -> (int)(Math.rancom() * 5) + 1);   // arr = [1, 5, 2, 1, 1]
    }
}
```
- 배열의 정렬과 검색 : sort(), binarySearch()
```java
class binarySearchEx() {
    binarySearchEx() {
      int[] arr = {3, 2, 0, 1, 4};
      int idx = Arrays.binarySearch(arr, 2);    // 정렬되어 있지 않기 때문에 이상한 값이 나옴

      Arrays.sort(arr); // 배열 arr을 정렬한다.
      Sytem.out.println(Arrays.toString(arr));  // 배열 출력
      int idx = Arrays.binarySearch(arr, 2);    // 올바른 결과가 나올 것이다
    } 
} 
```
- 다차원 배열의 출력 : deepToString()
- 다차원 배열의 비교 : deepEquals()
- 배열을 List로 변환 : asList()

## Comparator와 Comparable
- 객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스
  - Comparable : 기본 정렬기준을 구현하는데 사용
  - Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
```
public interface Comparator {
  int compare(Object o1, Object o2); // o1, o2 두 객체를 비교
  boolean equals(Object obj); // equals를 오버라이딩하라는 뜻
}

public interface Comparator {
  int compareTo (Object o); // 주어진 객체(o)를 자신과 비
}
```

## HashSet
HashSet : 순서 X, 중복 X
List : 순서 O, 중복 O

- HashSet
  - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
  - 순서를 유지하려면 LinkedHashSet 클래스 사용

- TreeSet
  - 범위 검색과 정렬에 유리한 컬렉션 클래스
  - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림

### 주요 메서드

- HashSet()
  - HashSet(Collecion c) : 생성자
  - HashSet(int initialCapacity) : 컬렉션 클래스는 용량이 부족하면 자동으로 늘리지만 초기 용량을 설정하는 것
  - HashSet(int initialCapacity, float loadFactor) : loadFactor는 어느 시점에 용량을 두 배로 늘릴건지. 0.8하면 80% 찼을 경우에 용량을 늘린다

- add(Object o) : 추가
  - addAll(Collecion c) : 합집합
  - remove(Object o) : 삭제
  - removeAll(Collection c) : 삭제
  - retainAll(Collection c) : 조건부삭제, 차집합
  - clear() : 모두삭제

- isEmpty() : 비었는지 확인한 결과 반환
  - size() : 저장된 객체 수
  - toArray() : 객체 배열로 반환
  - toArray(Ojbect[] a) : 객체 배열로 반환

## TreeSet
범위 탐색, 정렬
- 이진 탐색 트리(binary search tree)로 구현. **범위 탐색**과 **정렬**에 유리.
- 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖고 있다
- 각 요소(node)가 나무 형태로 연결 (LinkedList의 변형)

### 이진 탐색 트리 (binary search tree)
- 부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장
- 데이터가 많아질수록 추가, 삭제에 시간이 더 걸린다 (비교 횟수가 증가하기 때문에)

### 주요 생성자와 메서드
- TreeSet() : 기본 생성자
- TreeSet(Comparator comp) : TreeSet을 만들 때는 비교 기준을 입력한다. (정렬 기준 입력하지 않으면 comparable, 기본 비교 기준)
- Object first() : 정렬된 순서에서 첫번째 객체 반환
- Object last() : 정렬된 순서에서 마지막 객체 반환
- Object ceiling(Object o) : 지정된 객체와 같은 객체 반환, 없으면 큰 값을 가진 객체 중 가장 가까운 값의 객체 반환. 없으면 null
- Object floor(Ojbect o) : 지정된 객체와 같은 객체 반환, 없으면 작은 값을 객체 중 가까운 값의 객체 반환. 없으면 null
- Object higher(Object o) : 지정된 객체보다 큰 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null
- SortedSet SubSet(Object fromElement, Object toElement) : from ~ to 범위 결과를 반환. 끝 범위는 포함하지 않음
- SortedSet headSet(Object toElement) : 지정된 객체보다 작은 값의 객체들을 반환
- Sorted tailSet(Object fromElement) : 지정된 객체보다 큰 값의 객체들을 반환

## HashMap
- Map interface를 구현. 데이터를 키와 값의 쌍으로 저장 (순서X, 중복 : key X, 값 O)
- HashMap(동기화 X)은 Hashtable(동기화 O)의 신버전
---
- HashMap
  - Map 인터페이스를 구현한 대표적인 컬렉션 클래스
  - 순서를 유지하려면 LinkedHashMap 클래스를 사용하면 된다
- TreeMap (= TreeSet)
  - 범위 검색 정렬에 유리한 컬렉션 클래스
  - HashMap보다 데이터 추가, 삭제에 시간이 더 걸림
  
### hashing
- 해시함수로 해시테이블에 데이터를 저장, 검색
- 해시테이블은 배열과 링크드 리스트가 조합된 형태
- 해시테이블에 저장된 데이터를 가져오는 과정
  - key로 해시함수를 호출해서 해시코드를 얻는다
  - 해시코드에 대응하는 링크드리스트를 배열에서 찾는다
  - 링크드리스트에서 key와 일치하는 데이터를 찾는다
    - 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다. 서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.

### HashMap 주요 메서드
- HashMap()
- Object put(Object key, Object value) : key와 value 입력
- void putAll(Map m)
- Object remove(Object key)
- Object replace(Object key, Object value)
- boolean replace(Object key, Object oldValue, Object newValue)
---
- Set entry()
- Set keySet()
- Collection values()
---
- Object get(Object key)
- Object getOrDefault(Object key, Object dafaultValue)
- boolean containsKey(Object Key)
- boolean containsValue(Object Value)
---
- int size()
- boolean isEmpty()
- void clear()
- Object clone()
