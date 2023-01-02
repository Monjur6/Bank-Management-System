package com.repository;

import com.domain.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AdminRepository implements AdminInterface {

    private SessionFactory sessionFactory;

    public AdminRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //@Override
    public List<Admin> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Admin> adminQuery = session.createQuery("from Admin", Admin.class);
        return adminQuery.getResultList();
    }

    //@Override
    public Admin create(Admin admin) {
        Session session = sessionFactory.getCurrentSession();
        session.save(admin);
        return admin;
    }

    //@Override
    public Admin get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Admin.class, id);
    }

    //@Override
    public Admin update(Admin admin) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(admin);
        return admin;
    }

    //@Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Admin admin = get(id);
        if (admin != null) {
            session.delete(admin);
        }
    }
//public class AdminRepository {
//    private DataSource dataSource;
//
//    private static final String ALL = "select id, name, email, password from admin";
//
//    private static final String SELECT_ONE = "select id, name, email, password from admin where id = ?";
//
//    private static final String CREATE = "insert into admin (name, email, password) values (?, ?, ?)";
//
//    private static final String UPDATE = "update admin set name = ?, email = ?, password = ? where id = ?";
//
//    private static final String DELETE = "delete from admin where id = ?";
//
//    public AdminRepository(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    public List<Admin> list() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(ALL);
//        return mapper(resultSet);
//    }
//
//    public Admin get(Long id) throws SQLException {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ONE);
//        preparedStatement.setLong(1, id);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        Admin admin = new Admin();
//        while (resultSet.next()) {
//            admin.setId(resultSet.getLong(1));
//            admin.setName(resultSet.getString(2));
//            admin.setEmail(resultSet.getString(3));
//            admin.setPassword(resultSet.getString(4));
//        }
//        return admin;
//    }
//
//    public boolean create(Admin admin) throws SQLException {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(CREATE);
//        preparedStatement.setString(1, admin.getName());
//        preparedStatement.setString(2, admin.getEmail());
//        preparedStatement.setString(3, admin.getPassword());
//        return preparedStatement.execute();
//    }
//
//    public boolean update(Admin admin) throws SQLException {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
//        preparedStatement.setString(1, admin.getName());
//        preparedStatement.setString(2, admin.getEmail());
//        preparedStatement.setString(3, admin.getPassword());
//        preparedStatement.setLong(4, admin.getId());
//        return preparedStatement.execute();
//    }
//
//    public boolean delete(Long id) throws SQLException {
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
//        preparedStatement.setLong(1, id);
//        return preparedStatement.execute();
//    }
//
//    private List<Admin> mapper(ResultSet resultSet) throws SQLException {
//        List<Admin> students = new ArrayList<>();
//        while(resultSet.next()) {
//            Admin admin = new Admin();
//            admin.setId(resultSet.getLong(1));
//            admin.setName(resultSet.getString(2));
//            admin.setEmail(resultSet.getString(3));
//            admin.setPassword(resultSet.getString(4));
//            students.add(admin);
//        }
//        return students;
//    }

    ////////////////////
//    private SessionFactory sessionFactory;
//
//    public LeaveApplicationImplRepository(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public List<LeaveApplication> getAll() {
//        Session session = sessionFactory.getCurrentSession();
//        Query<LeaveApplication> leaveApplicationQuery = session.createQuery("from LeaveApplication", LeaveApplication.class);
//        return leaveApplicationQuery.getResultList();
//    }
//
//    public LeaveApplication create(LeaveApplication leaveApplication) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(leaveApplication);
//        return leaveApplication;
//    }
//
//    public LeaveApplication get(Long id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(LeaveApplication.class, id);
//    }
//
//    public LeaveApplication update(LeaveApplication leaveApplication) {
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(leaveApplication);
//        return leaveApplication;
//    }
//
//    public void delete(Long id) {
//        Session session = sessionFactory.getCurrentSession();
//        LeaveApplication leaveApplication = get(id);
//        if (leaveApplication != null) {
//            session.delete(leaveApplication);
//        }
//    }
}
