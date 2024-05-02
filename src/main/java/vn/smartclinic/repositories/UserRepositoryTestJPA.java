/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.smartclinic.entity.User;

/**
 *
 * @author tuanpla
 */
@Repository
public interface UserRepositoryTestJPA extends JpaRepository<User, Integer>{
    
}
