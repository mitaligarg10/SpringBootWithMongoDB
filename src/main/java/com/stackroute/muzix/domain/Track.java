package com.stackroute.muzix.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;

@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
//@Table(name = "TRACK")
@Document(collection = "track")
public class Track {
    @Id
    long trackId;
    String trackName;
    String trackComments;
    int yearOfRelease;

    public Track(long trackId,String trackName, String trackComments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
    }




    @Override
    public String toString() {
        return "Muzix{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
