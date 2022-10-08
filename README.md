# Head First Design Patterns
《Head First Design Patterns》 학습 저장소입니다.

## Strategy Pattern
### 행동 양식을 데이터 멤버화 시켜 객체의 부속품으로 구현하는 방법
- Inheritance가 아닌 Composition(혹은 Aggregation)을 활용하는 패턴
- Implementation보다 Interface에 맞춰서 프로그래밍
- Dynamic binding을 통해서 함수 호출이 이뤄짐
- 게임 등에 사용

## Observer Pattern
### Collection 객체를 활용하여 Subject와 Observer의 결합도를 느슨하게 만드는 패턴
- 지금은 Deprecated 되었지만 Java에 Observable 클래스와 Observer 인터페이스가 있을 정도로 많이 사용되는 패턴
- 대표적으로 Swing 라이브러리의 ActionListener 등에서 사용됨
- Subject에서 정보를 보내는 Push 방식과, Subject가 알림을 보냈을 때 Observer에서 필요한 정보를 가져오는 Pull 방식이 있음
