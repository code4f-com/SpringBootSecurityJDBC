/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.smartclinic.domain.LoginAttempt;
import vn.smartclinic.repositories.LoginAttemptRepository;

/**
 *
 * @author tuanpla
 */
@Service
@Transactional(readOnly = true)
public class LoginService {

  private final LoginAttemptRepository repository;

  public LoginService(LoginAttemptRepository repository) {
    this.repository = repository;
  }

  @Transactional
  public void addLoginAttempt(String email, boolean success) {
    LoginAttempt loginAttempt = new LoginAttempt(email, success, LocalDateTime.now());
    repository.add(loginAttempt);
  }

  public List<LoginAttempt> findRecentLoginAttempts(String email) {
    return repository.findRecent(email);
  }
}