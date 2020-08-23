# springboot-smtp-mailer

This is a sample project to send emails AWS SES. User the follwing properties.

################################AWS SES PROPERTIES#####################
spring.mail.host=<host>>
spring.mail.username=<user>>
spring.mail.password=<password>>
spring.mail.properties.mail.transport.protocol=smtp
spring.mail.properties.mail.smtp.port=587
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.ssl.trust=*


########################For SSL #######################################
#server.port=443
#SSL Key Info
#security.require-ssl=true
#server.ssl.key-store-password=lolpop123
#server.ssl.key-store=src/main/resources/amaresh-ssl-key.p12
#server.ssl.key-store-type=PKCS12

