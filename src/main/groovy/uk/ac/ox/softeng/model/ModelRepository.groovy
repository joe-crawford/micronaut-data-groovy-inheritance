package uk.ac.ox.softeng.model

import reactor.core.publisher.Mono

trait ModelRepository<M extends Model> {

    abstract Mono<M> findById(UUID id)

}
