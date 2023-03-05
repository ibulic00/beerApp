package com.ivanTest.springMVC.model;

import lombok.Builder;
import lombok.Data;


import java.time.LocalDate;
import java.util.UUID;
@Data
@Builder
public class CustomerDTO {

    UUID id;
    String customerName;
    LocalDate createdDate;
    LocalDate lastModifiedDate;

}
