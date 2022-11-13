package org.capybaras.kinogeek.entity


import org.neo4j.springframework.data.core.schema.Id
import org.neo4j.springframework.data.core.schema.Node
import org.neo4j.springframework.data.core.schema.Relationship
import org.neo4j.springframework.data.core.schema.Relationship.Direction.INCOMING


@Node
data class Movie(
    @Id
    var id: Long,
//    @Relationship(type = "DIRECTED", direction = INCOMING)
//    var directors: MutableSet<Person> = mutableSetOf(),
)
