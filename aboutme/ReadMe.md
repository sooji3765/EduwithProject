# BE_PJT1-1. 나를 소개하는 홈페이지 만들기


### 웹프론트엔드 기술요구사항

- html layout tag를 사용합니다.
- classname은 일정한 컨벤션을 유지합니다.
- 의미에 맞는 tag를 최대한 사용합니다. (div 사용은 최대한 자제)
- `position`속성과 `float`를 사용해서 element를 배치합니다.
- 라이브러리를 사용한 레이아웃은 지양합니다. (부트스트랩 등)
- `id`와 `class`등의 다양한 `selector`문법을 잘 활용해야 합니다.
 

### 웹백엔드 기술요구사항

- 톰캣서버를 통해서 자기소개 페이지가 동작되야 합니다. (ex http://localhost:8080/aboutme/index.html 에서 노출)
- 서블릿페이지하나를 생성해서, url을 입력했을 때 시간데이터가 화면에 노출돼야 합니다.


## 프로젝트 개발과정 참고

 

### 개발환경

- JDK 설치(ver 1.8)
- 이클립스 설치
- tomcat 설치(ver 8.5)
 

### 개발순서 (BE)

1. 프로젝트 이름을 aboutme 로 Dynamic Web Project 를 생성합니다.
2. 생성된 aboutme 프로젝트의 webContent 폴더에 index.html, aboutme.html, photo.html 파일을 작성합니다.
3. 이미 다른곳에서 작성했다면 해당 디렉토리로 이동합니다. 주의) 반드시 이클립스에서 붙여넣기 합니다.
4. 서블릿 클래스의 이름은 TodayServlet으로 하고, 해당 서블릿의 URL경로는 http://localhost:8080/aboutme/today 로 하는 서블릿 클래스를 생성합니다.
5. 기획서의 내용에 맞게 화면에 현재시간과 메인화면 링크가 나오도록 페이지를 작성합니다.

## 내 결과

