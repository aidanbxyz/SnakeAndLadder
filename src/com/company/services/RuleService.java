package com.company.services;

public interface RuleService {

    public Integer getPosition(Integer outcome, Integer position);

    public Boolean isWinner(Integer position);

}
