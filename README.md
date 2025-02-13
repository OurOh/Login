# Login 프로젝트  
**간단한 로그인 기능 구현 연습 프로젝트**

---

## 📋 프로젝트 개요  
이 프로젝트는 **로그인 기능 구현** 연습을 위해 진행되었습니다.  
Spring Framework (Spring MVC) 기반으로 로그인 흐름을 학습하고 구현하는 데 중점을 두었습니다.

---

## 🚀 주요 기능  
- **회원가입**: 사용자 정보를 입력하여 회원가입을 진행합니다.  
- **로그인**: 아이디와 비밀번호를 검증하여 로그인을 처리합니다.  
- **세션 관리**: 로그인 상태를 유지하고 사용자 세션을 관리합니다.

---

## 🛠️ 기술 스택  
- **Backend**: Java, Spring Framework (Spring MVC)  
- **Build Tool**: Maven  
- **Version Control**: Git & GitHub

---

## 🧑‍💻 개발자 정보  
- **개발자**: 오승안 / OH SEUNG ANH  
- **이메일**: dhtmddks98@naver.com, ahn980321@gmail.com  
- **GitHub**: [https://github.com/OurOh](https://github.com/OurOh)  
- **개인 블로그**: [https://ouroh.tistory.com/](https://ouroh.tistory.com/)

---

## 🗂️ 프로젝트 구조  
```plaintext
login3/
│
├── src/                  # 소스코드
│   ├── main/
│   │   ├── java/         # Java 소스 파일
│   │   │   └── com/mycompany/myapp/
│   │   │       ├── controller/
│   │   │       │   ├── HomeController.java
│   │   │       │   └── LoginController.java
│   │   │       ├── dao/
│   │   │       │   ├── UserDAO.java
│   │   │       │   └── UserDAOImpl.java
│   │   │       ├── model/
│   │   │       │   └── User.java
│   │   │       └── service/
│   │   │           ├── UserService.java
│   │   │           └── UserServiceImpl.java
│   │   └── resources/    # 설정 및 리소스 파일
│   │       └── mybatis/
│   │           └── UserMapper.xml
│   │       └── log4j.xml
│   │       └── application.properties
│   │
│   └── test/             # 테스트 코드
│       └── resources/
│           └── log4j.xml
│
├── webapp/
│   └── WEB-INF/
│       ├── spring/
│       │   ├── appServlet/
│       │   │   └── servlet-context.xml
│       │   └── root-context.xml
│       ├── views/
│       └── web.xml
│
├── pom.xml         
└── README.md           
