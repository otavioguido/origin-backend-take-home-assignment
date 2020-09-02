package com.ogs.origin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RiskProfile {

    private Score life;

    private Score disability;

    private Score home;

    private Score auto;
}
