package uk.ac.ox.softeng.terminology

import uk.ac.ox.softeng.model.Model

import groovy.transform.CompileStatic
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.MappedEntity

@CompileStatic
@Introspected
@MappedEntity
class Terminology extends Model {

    String terminologyName

}
