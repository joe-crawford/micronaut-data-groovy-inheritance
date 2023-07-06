# micronaut-data-groovy-inheritance

Instructions:
* Run against a blank Postgres database with name, username and password = `sandbox`
* An error occurs on running: 

  ```
  11:45:06.263 [main] ERROR io.micronaut.runtime.Micronaut - Error starting Micronaut server: Bean definition [io.micronaut.data.r2dbc.config.R2dbcSchemaGenerator] could not be loaded: Error instantiating bean of type  [io.micronaut.data.r2dbc.config.R2dbcSchemaGenerator]

  Message: Unable to create table column for property [finalised] of entity [uk.ac.ox.softeng.folder.Folder] with unknown data type: OBJECT
  Path Taken: new R2dbcSchemaGenerator(List configurations,R2dbcSchemaHandler schemaHandler)
  io.micronaut.context.exceptions.BeanInstantiationException: Bean definition [io.micronaut.data.r2dbc.config.R2dbcSchemaGenerator] could not be loaded: Error instantiating bean of type  [io.micronaut.data.r2dbc.config.R2dbcSchemaGenerator]```

* Uncomment the `@MappedProperty` annotation on the boolean field on `Model`, the application runs successfully.


---

## Micronaut 3.9.4 Documentation

- [User Guide](https://docs.micronaut.io/3.9.4/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.9.4/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.9.4/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
- [Micronaut Gradle Plugin documentation](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/)
## Feature data-r2dbc documentation

- [Micronaut Data R2DBC documentation](https://micronaut-projects.github.io/micronaut-data/latest/guide/#dbc)

- [https://r2dbc.io](https://r2dbc.io)


## Feature test-resources documentation

- [Micronaut Test Resources documentation](https://micronaut-projects.github.io/micronaut-test-resources/latest/guide/)


## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


## Feature r2dbc documentation

- [Micronaut R2DBC documentation](https://micronaut-projects.github.io/micronaut-r2dbc/latest/guide/)

- [https://r2dbc.io](https://r2dbc.io)


