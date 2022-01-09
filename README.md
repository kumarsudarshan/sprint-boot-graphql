# Spring Boot GraphQL Example
 

## Getting Started with Swagger-3 in Springboot Rest API

**use** ```http://localhost:8080/swagger-ui/``` to see the HTML document

### Request body for graphQL api example

for book(id) api
```
{
   book(id: "123") {
        title
        authors
        publisher
   }
}
```
for getAllBooks api
```
{
   allBooks {
        isbn
        title
        authors
        publisher
   }
}
```
