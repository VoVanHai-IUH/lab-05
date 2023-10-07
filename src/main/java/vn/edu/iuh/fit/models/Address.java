package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.Country;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    @Column(name = "number", length = 20)
    private String number;
    @Column(name = "Street", length = 150)
    private String Street;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "zipcode", length = 7)
    private String zipcode;
    @Column(name = "country", length = 30)
    private Country country;


    public Address(String number, String street, String city, String zipcode, Country country) {
        this.number = number;
        Street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    @OneToOne
    private Candidate candidate;

    @OneToOne
    private Company company;
}
