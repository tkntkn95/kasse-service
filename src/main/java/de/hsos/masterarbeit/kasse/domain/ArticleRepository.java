package de.hsos.masterarbeit.kasse.domain;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
}
