package com.meet.contactAPI.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@NoArgsConstructor
@Data
@AllArgsConstructor
@JsonInclude(NON_DEFAULT)
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @UuidGenerator
    @Column(name = "id", updatable = false, unique = true)
    private String id;
    private String name;
    private String email;
    private String title;
    private String phone;
    private String address;
    private String status;
    private String photoUrl;
}
