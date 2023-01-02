package com.service;
import com.domain.Admin;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.List;

public interface AdminInterfaceService {
    public Admin insert(Admin admin);

    public Admin get(Long id);

    public List<Admin> getAll();

    public Admin update(Admin admin);

    public void delete(Long id);
}
