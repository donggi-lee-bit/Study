# 객체지향개념

### 클래스의 정의
클래스란 객체를 정의해 놓은 것

###클래스의 용도
클래스는 객체를 생성하는데 사용

### 객체와 인스턴스
- 객체
  - 모든 인스턴스를 대표하는 일반적 용어
- 인스턴스
  - 특정 클래스로부터 생성된 객체

클래스 (설계도) ----------> 인스턴스 (객체)
### 객체의 생성과 사용
```
Tv t = new Tv();
```
t = 리모컨 역할을 한다

### 순서
1. 클래스 작성
2. 객체 생성
3. 객체 사용


## 객체 배열
참조변수 배열이라고도 한다
```java
Tv tv1, tv2, tv3;
==> Tv[] tvArr = new Tv[3];

Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv타입의 참조변수 배열
        
tvArr[0] = new Tv();
tvArr[1] = new Tv();
tvArr[2] = new Tv();

// 요걸 배열로 나타낸 게 위 코드
Tv t1 = new Tv();
Tv t2 = new Tv();
Tv t3 = new Tv();
```

## 클래스의 정의

클래스 == 데이터 + 함수

1. 변수 : 하나의 데이터를 저장할 수 있는 공간
2. 배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
3. 구조체 : 서로 관련된 여러 데이터를 하나로 저장할 수 있는 공간
4. 클래스 : 데이터와 함수의 결합 (구조체 + 함수)

```java
int hour;
int minute;
int second;

int hour1, hour2, hour3;
int minute1, minute2, minute3;
int second1, second2, second3;

int[] hour = new int[3];
int[] minute = new int[3];
int[] second = new int[3];

=======>

Class Time {
    int hour;
    int minute;
    int second;
}
        
Time t = new Time();

Time t1 = new Time();
Time t2 = new Time();
Time t3 = new Time();

Time[] t = new Time[3];
t[0] = new Time();
t[1] = new Time();
t[2] = new Time();

```
### 선언 위치에 따른 변수의 종류

```java
class Variables {
    int iv; // 인스턴스 변수
    static int cv; // 클래스 변수 (static변수, 공유변수)
  void method() {
      int lv = 0; // 지역변수
  } 
}
```
|변수의 종류|선언위치|생성시기|
|------|---|---|
|클래스 변수|클래스 영역|클래스가 메모리에 올라갈 때|
|인스턴스 변수|클래스 영역|**인스턴스가 생성되었을 때**|
|지역변수|클래스 영역 이외의 영역|변수 선언문이 수행되었을 때|
