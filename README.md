# Head First Design Patterns
《Head First Design Patterns》 학습 저장소입니다.

## Strategy Pattern
### 행동 양식을 데이터 멤버화 시켜 객체의 부속품으로 구현하는 패턴
- Inheritance가 아닌 Composition(혹은 Aggregation)을 활용하는 패턴
- Implementation보다 Interface에 맞춰서 프로그래밍
- Dynamic binding을 통해서 함수 호출이 이뤄짐

## Observer Pattern
### Collection 객체를 활용하여 Subject와 Observer의 결합을 느슨하게 만드는 패턴
- Deprecated 되었지만 Java에 Observable 클래스와 Observer 인터페이스가 있을 정도로 많이 사용되는 패턴
- 대표적으로 Swing 라이브러리의 ActionListener 등에서 사용됨
- Subject에서 데이터를 보내는 Push 방식과, Subject가 알림을 보냈을 때 Observer에서 필요한 데이터를 가져오는 Pull 방식이 있음

## Decorator Pattern
### 객체를 Wrapping하여 기능을 확장시키는 패턴
- 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다는 개방-폐쇄 원칙(OCP, Open-Closed Principle)에 따른 패턴
- Composition과 Delegation으로 Runtime 중에 새로운 행동을 추가할 수 있음
- Java의 각종 I/O stream 객체들이 Decorator Pattern으로 만들어짐
- 자잘한 객체가 너무 많이 생길 수 있고, 코드가 복잡해질 수 있다는 단점이 있음
