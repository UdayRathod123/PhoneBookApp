package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Model.Contact;
import com.BikkadIT.Repository.ContactRepo;
@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	private ContactRepo contactRepo;
	@Override
	public boolean SaveContact(Contact contact) {
		Contact save = contactRepo.save(contact);
		if(save==null) {
			return false;
		}else {
		return true;
	}
		}

}
