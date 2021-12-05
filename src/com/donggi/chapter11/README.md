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
 




