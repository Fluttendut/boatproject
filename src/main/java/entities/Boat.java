package entities;

import jakarta.persistence.*;


@Entity
@Table(name = "boat_type")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boatType; //array?

    @Column(nullable = false)
    private String name;


    public Boat(String name) {
        this.name = name;
    }

    public Boat() {

    }

    public int getBoatType() {
        return boatType;
    }

    public void setBoatType(int boatType) {
        this.boatType = boatType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
