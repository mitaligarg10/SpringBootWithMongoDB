package com.stackroute.muzix.repository;

import com.stackroute.muzix.domain.Track;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track, Long> {

  //  @Query("select t from Track t where t.trackName = :trackName ")
    public List<Track> findByTrackName(String trackName);
}
