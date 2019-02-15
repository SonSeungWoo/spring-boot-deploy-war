## mybatis oracle procedure xmlType 설정

#### mvn install

mvn install:install-file -Dfile=lib/com/custom/orai18n.jar -DgroupId=com.custom -DartifactId=orai18n -Dversion=12.1.0.2 -Dpackaging=jar

mvn install:install-file -Dfile=lib/com/custom/ojdbc7.jar -DgroupId=com.custom -DartifactId=ojdbc7 -Dversion=12.1.0.2 -Dpackaging=jar

mvn install:install-file -Dfile=lib/com/custom/xdb6.jar -DgroupId=com.custom -DartifactId=xdb6 -Dversion=12.1.0.2 -Dpackaging=jar

mvn install:install-file -Dfile=lib/com/custom/xmlparserv2-12.1.0.2.jar -DgroupId=com.custom -DartifactId=xmlparserv2 -Dversion=12.1.0.2 -Dpackaging=jar

## spring boot deploy war

#### war로 배포할시 xmlparserv2 관련에러가 발생함 tomcat 설정따로 해줘야함
java.lang.SecurityException: org.xml.sax.SAXNotRecognizedException: Feature: http://apache.org/xml/features/allow-java-encodings 에러발생

#### TOMCAT_HOME/conf/catalina.properties에 아래와 같이 추가

* javax.xml.parsers.DocumentBuilderFactory = com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl
* javax.xml.transform.TransformerFactory = com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl
* javax.xml.parsers.SAXParserFactory = com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl
* javax.xml.datatype.DatatypeFactory = com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl
