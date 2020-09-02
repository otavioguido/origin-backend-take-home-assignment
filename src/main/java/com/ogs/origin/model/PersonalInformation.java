package com.ogs.origin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInformation {

    private Integer age;

    private Integer dependents;

    private House house;

    private Integer income;

    private MaritalStatus marital_status;

    private Boolean[] risk_questions = new Boolean[3];

    private Vehicle vehicle;
}
