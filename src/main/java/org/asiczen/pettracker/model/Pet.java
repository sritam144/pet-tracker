package org.asiczen.pettracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "pet_pet")
public class Pet {

    @Id
    private String id;
    @Indexed
    private String ownerId;
    private String animalType = "pet";
    private String name;
    private String petType;
    private String petBreed;
    private String petColour;
    private String petSex;
    private String kennelClubRegNo;
    private float petWeight;
    private Date petDob;

    //@DBRef
    private Device device; // One-to-one with device.
}
