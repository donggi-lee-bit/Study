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


