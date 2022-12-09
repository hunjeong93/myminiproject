# 스프링 mybatis를 이용한 간단한 게시판

NoSuchMessageException: No message found under code 'invalidLength.user.id' for locale 'ko'

servlet-context.xml 에
```java
<beans:bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
		<beans:property name="basenames">
			<beans:list>
				<beans:value>error_message</beans:value> <!-- /src/main/resources/error_message.properties -->
			</beans:list>
		</beans:property>
		<beans:property name="defaultEncoding" value="UTF-8"/>
	</beans:bean>
```
추가해주고, src/main/resources/error_message.properties 를 추가해줌.


갑자기 톰캣이 정상 작동을 안한다.
Configuration Error: deployment source 'ch4:war exploded' is not valid
에러가 떴고, Artifact ch4:war exploded: Error during artifact deployment. See server log for details.
아티팩트를 찾지 못하는 것 같다.
아 myminiproject 를 검색해야 하는데 이전에 설정해둔 ch4 를 찾는 것 같다.

compiler.xml,artifact folder 등 빌드할때의 정보들 일일히 다 수정해줌.
수정후 프로젝트 재시작 하니 정상 작동함.

