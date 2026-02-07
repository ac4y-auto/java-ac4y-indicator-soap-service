# Architektura - java-ac4y-indicator-soap-service

## Attekintes

WAR alkalmazas JAX-WS SOAP webszolgaltatassal az indikator muveletekhez.

## Szerkezet

```
src/main/java/ac4y/indicator/service/
  publish/
    Publisher.java                              - Onallo SOAP vegpont publikalas
  web/
    Ac4yIndicatorWebService.java                - JAX-WS webszolgaltatas implementacio
    Ac4yIndicatorWebServiceProtocol.java        - Webszolgaltatas protokoll/interfesz
src/main/webapp/WEB-INF/
  web.xml                                       - Servlet konfiguracio WSServlet-tel
  sun-jaxws.xml                                 - JAX-WS vegpont konfiguracio
```

## Fuggosegek

- ac4y-indicator-object-service (szolgaltatas reteg)
- com.sun.xml.ws:jaxws-rt (JAX-WS futtato kornyezet)
- Log4j 2

## Eredet

Az `IJIndicatorModule/Ac4yIndicatorSOAPService` modulbol kinyerve.
