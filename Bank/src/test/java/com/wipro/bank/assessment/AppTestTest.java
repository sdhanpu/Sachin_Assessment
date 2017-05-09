package com.wipro.bank.assessment;

import com.wipro.bank.entity.*;


import com.wipro.bank.assessment.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;



import org.junit.Test;

public class AppTestTest {

	@Test
	public void add() {
		//fail("Not yet implemented");
		List<Account> accounts=new ArrayList<Account>();
		
		Account accountNum1=new Account(1,"Sachin",465.5);
		Account accountNum2=new Account(2,"Aniraban",121.6);
		Account accountNum3=new Account(3,"Vinod",473.5);
		//Account accountNum4=new Account();
		
		
		
		accounts.add(accountNum1);	
		accounts.add(accountNum2);
		accounts.add(accountNum3);
		
		Account accountNum4=null;
		assertNull(accountNum4);
		
		
		assertNotNull(new ArrayList<Account>().add(accountNum1));
					
		assertNotNull(new Account(4,"Santosh",101.03));
		assertNotNull(new Account());
		
		assertEquals(accountNum1,accounts.add(accountNum1));
		assertEquals(3,accounts.size());
		//assertEqals("Sachin",accounts.get(0).getUserName());

		assertEquals(accounts.get(2),accounts.add(accountNum2));
		assertEquals(2,accounts.size());
		}
	
	
	
	@Test
	public void getAccountDetailsByID(){
		
		List<Account> accounts=new ArrayList<Account>();
		
		Account accountNum1=new Account(1,"Sachin",465.5);
		Account accountNum2=new Account(2,"Aniraban",121.6);
		Account accountNum3=new Account(3,"Vinod",473.5);
		Account accountNum4=null;
		
		accounts.add(accountNum1);	
		accounts.add(accountNum2);
		accounts.add(accountNum3);
		
		
		
		assertNull(null);
		assertNull(accountNum4);
		
		App app1=new App(accounts);		
		Account foundAccount=app1.getAccountDetailsByID(1);				
		assertNotNull("Account containing Act ID1 ",foundAccount);
		assertEquals("Sachin",foundAccount.getUserName());
		assertEquals(1,foundAccount.getAccountID());
		
		
		
		
		
	}
	
	public void getAccountDetailsByBalance()
	{
		
		List<Account> accounts=new ArrayList<Account>();
		
		Account accountNum1=new Account(1,"Sachin",465.5);
		Account accountNum2=new Account(2,"Aniraban",121.6);
		Account accountNum3=new Account(3,"Vinod",473.5);
		Account accountNum4=null;
		
		accounts.add(accountNum1);	
		accounts.add(accountNum2);
		accounts.add(accountNum3);
		
		assertNull(accounts.get(4).getBalance());
		assertNull(accountNum4);
		
		
	}

	
}
