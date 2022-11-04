# Head First Design Patterns

《Head First Design Patterns》 학습 저장소입니다.

## Strategy pattern

> 객체의 행동 양식을 캡슐화하고 데이터 멤버화 시켜 객체의 부속품으로 구현하는 패턴

- Inheritance가 아닌 Composition(혹은 Aggregation)을 활용하는 패턴
- Implementation보다 Interface에 맞춰서 프로그래밍
- Runtime 중에 객체의 행동을 동적으로 바꿀 수 있어 유연한 코드 작성이 가능함
- 같은 행동을 해도 장착한 아이템에 따라서 다르게 동작하게 하는 RPG 게임 등에 적용할 여지가 있음

## Observer pattern

> Collection 객체를 활용하여 Subject와 Observer의 결합을 느슨하게 만드는 패턴

- Deprecated 되었지만 Java에 Observable 클래스와 Observer 인터페이스가 있을 정도로 많이 사용되는 패턴
- 대표적으로 Swing 라이브러리의 ActionListener 등에서 사용됨
- Subject에서 데이터를 보내는 Push 방식과, Subject가 알림을 보냈을 때 Observer에서 필요한 데이터를 가져오는 Pull 방식이 있음

## Decorator pattern

> 객체를 Wrapping하여 기능을 확장시키는 패턴

- 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다는 개방-폐쇄 원칙(OCP, Open-Closed Principle)에 따른 패턴
- Java의 각종 I/O stream 객체들이 Decorator Pattern으로 만들어짐
- 자잘한 객체가 너무 많이 생길 수 있고, 코드가 복잡해질 수 있다는 단점이 있음

## Factory pattern

> 객체를 생성하는 코드를 특정 함수에 집중시키는 패턴

### Simple factory

- 객체 생성을 전담하는 함수를 하나의 클래스에 모아두는 방법

### Factory method pattern

- 객체를 생성하는 함수를 상위 클래스에서 추상 함수로 정의하고, 하위 클래스에서 override하여 다양한 객체 생성을 실행하도록 하는 방법

### Abstract factory pattern

- 객체의 구성 요소를 생성하는 Factory를 인터페이스로 정의하고, 이를 구현하는 다양한 Factory 클래스를 정의하는 방법.

## Singleton pattern

> 특정 클래스의 Instance가 단 하나만 생성되도록 하는 패턴

- 스레드 풀, 캐시, 대화상자, 디바이스 드라이버 등에 사용됨
- 둘 이상의 객체가 생성되면 에러가 발생
- 멀티 스레드 프로그래밍을 할 경우 주의해야 함

## Command pattern

> 한 줄의 함수 호출을 커맨드 객체로 캡슐화한 후 Invoker를 통해 간접적으로 명령을 실행시키는 패턴

## Adapter pattern

> 객체를 Wrapping하여 기능을 변경시키는 패턴

## Facade pattern

> 특정 서브 시스템에 소속된 여러 개의 객체에 접근하기 위한 통합된 접근 경로를 제공하는 패턴

## Template method pattern

> 객체가 실행해야 하는 알고리즘의 기본 골격을 상위 클래스에 구현하고 하위 클래스에서 override하여 행위의 다양성을 표현하는 패턴
