package com.mark.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String ID;
    public String User_NAME;
    public String SEX;
    public String AGE;
    public String ADDRESS;
    public String PHONENUMBER;
}
