package uk.ac.ox.softeng.model


import groovy.transform.CompileStatic
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty

@CompileStatic
@MappedEntity
@Introspected
abstract class Model {

    @Id
    @GeneratedValue
    UUID id

//    @MappedProperty // uncomment to fix
    boolean finalised

}
