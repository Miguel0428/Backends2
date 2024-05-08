package com.apirests2.backends2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "camisas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Camisa {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String name;
private float value;

}
