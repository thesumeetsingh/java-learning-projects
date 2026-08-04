package com.springJDBCDemo.demo.AlienRepo;


import com.springJDBCDemo.demo.Model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AlienRepository {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien){
        String sql="insert into alien(id, name, tech) values(?,?,?)";
        template.update(sql, alien.getId(), alien.getName(), alien.getTech());

    }

    public List<Alien> findAll(){
        String sql= "select * from alien";

//        RowMapper<Alien> mapper= new RowMapper<Alien>() {
//            @Override
//            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Alien alien= new Alien();
//                alien.setId(rs.getInt(1));
//                alien.setName(rs.getString(2));
//                alien.setTech(rs.getString(3));
//
//
//                return alien;
//            }
//        };


        List<Alien> list= template.query(sql, (rs, row) -> {
            Alien alien= new Alien();
            alien.setId(rs.getInt(1));
            alien.setName(rs.getString(2));
            alien.setTech(rs.getString(3));
            return alien;
        });

        return list;
    }
}
