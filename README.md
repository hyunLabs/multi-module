### Multi Module 작업 내용
- API / Common 모듈 생성
- API 모듈은 Common 모듈의 졵대하는 클래스를 참조 및 사용
- Exception 핸드링 컨벤션
- Multi Module 구조에서 DB 연동
- Multi Module 구조에서 Gradle을 사용한 빌드 및 배포

### Multi Module 설정
- settings.gradle 우선순위 : Module > Root
* Module 내의 settings.gradle 삭제

### Mulit Module 의존성 설정(build.gralde)
```
dependencies {
    implementation project(':module-common') # 의존성 설정을 한 settings.gralde과 동일해야함
}

tasks.register(“prepareKotlinBuildScriptModel”){}
```

### gradle build
```
./gradlew clean :module-api:buildNeeded --stacktrace --info --refresh-dependencies -x test
```