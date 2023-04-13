package com.mark.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel {
    public Integer id;
    public String  name;
    private Double money;
}
