package uk.ac.ox.softeng.folder

import uk.ac.ox.softeng.model.ModelRepository

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactorPageableRepository
import reactor.core.publisher.Mono

@R2dbcRepository(dialect = Dialect.POSTGRES)
abstract class FolderRepository implements ReactorPageableRepository<Folder, UUID>, ModelRepository<Folder> {

    abstract Mono<Folder> findById(UUID id)

}