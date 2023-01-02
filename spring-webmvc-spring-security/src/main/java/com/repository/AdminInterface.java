package com.repository;
import com.domain.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public interface AdminInterface {
    public List<Admin> getAll();

    public Admin create(Admin admin);

    public Admin get(Long id);

    public Admin update(Admin admin);

    public void delete(Long id);
}
