package com.ivan.diplomski.database;


import com.ivan.diplomski.Misc.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends MongoRepository<Article,String> {

}