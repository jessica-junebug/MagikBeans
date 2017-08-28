package com.MagicBeans.MagicBeans.Model.Data;

import com.MagicBeans.MagicBeans.Model.PersonalDetails.PersonalDetails;
import com.MagicBeans.MagicBeans.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by penelope fox on 8/10/2017.
 */
@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

    User findByEmail(String email);
}