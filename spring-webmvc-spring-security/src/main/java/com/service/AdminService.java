package com.service;

import com.domain.Admin;
import com.repository.AdminInterface;
import com.repository.AdminRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@Transactional
public class AdminService implements AdminInterfaceService {
    private AdminInterface adminInterface;

    public AdminService(AdminRepository adminRepository) {
        this.adminInterface = adminRepository;
    }
    @Transactional
    public Admin insert(Admin admin) {
        return adminInterface.create(admin);
    }

    @Transactional(readOnly = true)
    public Admin get(Long id) {
        return adminInterface.get(id);
    }

    @Transactional(readOnly = true)
    public List<Admin> getAll() {
        return adminInterface.getAll();
    }

    @Transactional
    public void delete(Long id) {
        adminInterface.delete(id);
    }

    @Transactional
    public Admin update(Admin admin) {
        return adminInterface.update(admin);
    }
//public class AdminService {
//    private AdminRepository adminRepository;
//
//    public AdminService(AdminRepository adminRepository) {
//        this.adminRepository = adminRepository;
//    }
//
//    public boolean insert(Admin admin) throws SQLException {
//        admin.setName(admin.getName().toUpperCase());
//        admin.setEmail(admin.getEmail().toUpperCase());
//        admin.setEmail(admin.getPassword().toUpperCase());
//        return adminRepository.create(admin);
//    }

//    private LeaveApplicationRepository leaveApplicationRepository;
//
//    public LeaveApplicationImplService(LeaveApplicationRepository leaveApplicationRepository) {
//        this.leaveApplicationRepository = leaveApplicationRepository;
//    }
//
//    @Transactional
//    public LeaveApplication insert(LeaveApplication leaveApplication) {
//        return leaveApplicationRepository.create(leaveApplication);
//    }
//
//    @Transactional(readOnly = true)
//    public LeaveApplication get(Long id) {
//        return leaveApplicationRepository.get(id);
//    }
//
//    @Transactional(readOnly = true)
//    public List<LeaveApplication> getAll() {
//        return leaveApplicationRepository.getAll();
//    }
//
//    @Transactional
//    public LeaveApplication update(LeaveApplication leaveApplication) {
//        return leaveApplicationRepository.update(leaveApplication);
//    }
//
//    @Transactional
//    public void delete(Long id) {
//        leaveApplicationRepository.delete(id);
//    }

    ////////////////////////

//    private UserRepository userRepository;
//
//    private PasswordEncoder passwordEncoder;
//
//    public UserImplService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Transactional
//    public User insert(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.create(user);
//    }
//
//    @Transactional(readOnly = true)
//    public User get(Long id) {
//        return userRepository.get(id);
//    }
//
//    @Transactional(readOnly = true)
//    public List<User> getAll() {
//        return userRepository.getAll();
//    }
//
//    @Transactional
//    public User update(User user) {
//        return userRepository.update(user);
//    }
//
//    @Transactional
//    public void delete(Long id) {
//        userRepository.delete(id);
//    }
//
//    @Transactional(readOnly = true)
//    public User getByUsername(String username) { return userRepository.getByUsername(username); }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = getByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getAuthorities());
//    }











//    private LeaveTypeRepository leaveTypeRepository;
//
//    public LeaveTypeServiceImpl(LeaveTypeRepository leaveTypeRepository) {
//        this.leaveTypeRepository = leaveTypeRepository;
//    }
//
//    @Transactional
//    public LeaveType insert(LeaveType leaveType) {
//        return leaveTypeRepository.create(leaveType);
//    }
//
//    @Transactional(readOnly = true)
//    public LeaveType get(Long id) {
//        return leaveTypeRepository.get(id);
//    }
//
//    @Transactional(readOnly = true)
//    public List<LeaveType> getAll() {
//        return leaveTypeRepository.getAll();
//    }
//
//    @Transactional
//    public LeaveType update(LeaveType leaveType) {
//        return leaveTypeRepository.update(leaveType);
//    }
//
//    @Transactional
//    public void delete(Long id) {
//        leaveTypeRepository.delete(id);
//    }




//    private LeaveApplicationRepository leaveApplicationRepository;
//
//    public LeaveApplicationImplService(LeaveApplicationRepository leaveApplicationRepository) {
//        this.leaveApplicationRepository = leaveApplicationRepository;
//    }
//
//    @Transactional
//    public LeaveApplication insert(LeaveApplication leaveApplication) {
//        return leaveApplicationRepository.create(leaveApplication);
//    }
//
//    @Transactional(readOnly = true)
//    public LeaveApplication get(Long id) {
//        return leaveApplicationRepository.get(id);
//    }
//
//    @Transactional(readOnly = true)
//    public List<LeaveApplication> getAll() {
//        return leaveApplicationRepository.getAll();
//    }
//
//    @Transactional
//    public LeaveApplication update(LeaveApplication leaveApplication) {
//        return leaveApplicationRepository.update(leaveApplication);
//    }
//
//    @Transactional
//    public void delete(Long id) {
//        leaveApplicationRepository.delete(id);
//    }
}
