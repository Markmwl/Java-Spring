package com.mark.Dal;

import com.mark.Models.AccountModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAccountDao {
    int UpdateAccountById(@Param("ID")Integer id, @Param("MONEY")Double money);

    List<AccountModel> GetAccountList();
}
