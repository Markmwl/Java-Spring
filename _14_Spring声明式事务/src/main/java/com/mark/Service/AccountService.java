package com.mark.Service;

import com.mark.Dal.IAccountDao;
import com.mark.Models.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("AccountService")
public class AccountService {

    @Autowired
    public IAccountDao actDao;

    @Transactional(readOnly = true)
    public List<AccountModel> GetAccount()
    {
        List<AccountModel> accountModels = actDao.GetAccountList();
        return accountModels;
    }


    /**
     * 转账
     * @param OldId 转账人ID
     * @param NewId 收款人ID
     * @param money 转账金额
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.DEFAULT)
    public void SetMoney(int OldId,int NewId,Double money)
    {
        //减少
        actDao.UpdateAccountById(OldId,new Double(-money));

        //异常
        //System.out.println(1/0);

        //增加
        actDao.UpdateAccountById(NewId,new Double(money));
        //System.out.println("转账成功！");
    }
}
