package com.ivanTest.lombok.model;

import lombok.Builder;
import lombok.Data;


import java.time.LocalDate;
import java.util.UUID;
@Data
@Builder
public class Customer {

    UUID id;
    String customerName;
    LocalDate createdDate;
    LocalDate lastModifiedDate;

}
