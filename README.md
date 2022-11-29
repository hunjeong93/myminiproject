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
