# java-ac4y-indicator-soap-service

WAR application with JAX-WS SOAP web service for indicator operations.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-indicator-soap-service`
- **Version**: `1.0.0`

## Description

SOAP web service (WAR) providing JAX-WS endpoints for indicator operations. Includes a web service protocol interface, implementation class, and a standalone publisher for testing.

### Key Classes

- `Ac4yIndicatorWebService` - JAX-WS web service implementation
- `Ac4yIndicatorWebServiceProtocol` - Web service protocol/interface
- `Publisher` - Standalone SOAP endpoint publisher

## Dependencies

- `ac4y-indicator-object-service` (service layer)
- `com.sun.xml.ws:jaxws-rt` (JAX-WS runtime)
- Log4j 2

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJIndicatorModule/Ac4yIndicatorSOAPService`.
