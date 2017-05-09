package com.wipro.bank.assessment;
import com.wipro.bank.entity.*;
import java.util.List;
import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
       
    public static final List<Account> accounts=new ArrayList<Account>();
    
	public void Add(Account accountNum1)
    {
		accounts.add(accountNum1);
    } 
	
	 public Account getAccountDetailsByID(int id)
    {
        
		  Account result=null;
	        
	        
	        for(int i=0;i<accounts.size();i++)
	        {
	        	if(accounts.get(i).getAccountID()==id) 
	        		result = accounts.get(i);
	        }
			return result;
			
    }
	
	
	public List<Account> getAccountDetailsByBalance(double amount)
    {
    	
		List<Account> result=new ArrayList<Account>();
    	
        for(int i=0;i<accounts.size();i++)
        {
        	if(accounts.get(i).getBalance()>=amount) 
        		result.add(accounts.get(i));
        }
        
        if(result.size()==0)
        {
        	return null;
        }
        else
        {
    		return result;
        }
        
    }
	
	
}
