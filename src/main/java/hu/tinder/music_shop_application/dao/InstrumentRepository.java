package hu.tinder.music_shop_application.dao;

import hu.tinder.music_shop_application.entity.InstrumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ORM, JPA
 * https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa
 * @author Gergely Jakab
 */
//TODO write find all by company
@Repository
public interface InstrumentRepository extends JpaRepository<InstrumentEntity, Long> {

}
