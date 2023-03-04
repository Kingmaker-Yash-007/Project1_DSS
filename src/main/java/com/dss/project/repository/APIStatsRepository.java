package com.dss.project.repository;

import com.dss.project.model.APIStats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface APIStatsRepository extends MongoRepository<APIStats, String> {

    APIStats findByURLAndOperation(String url, String get);
}
