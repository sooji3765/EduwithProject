
# 프로젝트 A-2, 포트폴리오 웹페이지-구성요소 만들기

### 리뷰 결과 

    Pass


### 화면 레이아웃 피드백 후 수정


> 테이블 요소  
  
- `<thead>`, `<tbody>`, `<tfoot>`을 사용하고 `<th>`, `<td>`를 구분해서 사용한다.      
    `th`, `td`를 잘 구분해서 사용 해야 한다.
    테이블 타이틀과 요소를 나타낼 때, `th`를 사용해 의미를 정확하게 표현하기


> 폼 요소    
  
- body요소 외에 각 요소에 `font`를 적용해야 원하는 폰트로 화면이 변함 

> 리스트 요소  

- 의미에 맞는 태그 이름으로 사용한다.
=> 정의에 맞는 이름 작성   


> 그 외

- `h1`~`h6`를 사용 할때, 프로젝트 레벨을 생각하며 헤딩 태그 사용시 유의
- 각 태그가 가지고 있는 기본 속성 값의 이해가 필요  
- `float` 속성 사용시 , 정확한 사용법을 익힐 필요가 있음.
- `float` 사용 후 , clear를 통해 걸어두었던 float 요소를 없애고 이후 다른 요소에 영향이 없도록 해줘야 한다.


### float 속성 정리

- `float` 속성을 사용하면 태그 요소가 지닌 공간 요소를 무시하고 배치
- `right`,`left` 두가지가 존재

~~~css
p{
    float: left;
    height: 20px;
}

h2{
    float: left;
    height: 20px;   
}
~~~

- `float` 속성을 제거 : `clear` 
- `clear: left or right` 

~~~css
p:after{
    // left, right 모두 무시
    clear: both;
}
~~~

### display 속성 정리

- 어떤 방식으로 표시 할지 설정
- `display : inline`  , 기본 값으로 앞뒤 줄바꿈이 없음
- `display : block` , 요소 앞뒤로 줄 바꿈
- `display : none` , 박스 생성되지 않음, 공간 생성이 없음
- `display : inline-block` , 요소는 inline 이지만, block 처럼 표시

~~~css
div{
    // div 기본 display는 block
    display: inline;
    height: 300px
}
~~~

### overflow 속성

- 요소의 박스 내용이 길때, 어떻게 보일지 선택
- `overflow : visible` 기본값, 내용이 길어도 흘러 넘쳐서 보임
- `overflow : hidden` 내용이 넘치면 자름
- `overflow : scroll` 내용이 넘치지 않아도 스크롤 바가 보임
- `overflow : auto` 내용이 잘릴때만 스크롤바가 보임
 
 ~~~css
 div{
    overflow: hidden;
 }   
 ~~~