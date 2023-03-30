# SpringSecurity-Login
## Spring security 란?
스프링 기반의 애플리케이션 보안 (인증, 권한, 인가 등) 을 담당하는 스프링 하위 프레임워크다. 

스프링 시큐리티에서는 주로 서블릿 필터와 필터체인으로 구성된 위임 모델을 사용한다. 또한 보안과 관련해서 많은 옵션을 제공해주기 때문에 보안관련 로직을 일일이 작성하기 않아도 된다는 장점이 있다. 

스프링 시큐리티는 기본적으로 세션&쿠키 방식으로 인증한다.
### 기본 용어
- 인증(Authentication) : 보호된 리소스에 접근한 대상이 누구인지, 이 작업을 수행해도 되는 주체인지 확인하는 과정
- 인가(Authorize) : 리소스에 대해 접근 가능한 권한을 가지고 있는지 확인하는 과정

### notion Link
https://tricolor-calf-fb2.notion.site/Spring-Security-17c2cc37b8f4461eaf50b9d15f4c2dbe
