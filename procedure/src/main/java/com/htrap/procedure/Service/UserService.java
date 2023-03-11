package com.htrap.procedure.Service;

import com.htrap.procedure.Model.StudInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    String schema,String procedure, String[] params
    public List<StudInfo> getAllData(String schema,String table,Integer id, Float marks){
//      String sql = "exec sql.stData @student_id = 1, @obtainedMarks = 40";
        if(schema == null && table == null && id == null && marks == null){
            id = 0;
            marks = (float) 0;
            schema = "sql";
            table = "stData";
        }
        String sql = "exec "+schema+"."+table+" @student_id = "+id.toString()+", "+"@obtainedMarks ="+marks.toString();


        List<StudInfo> s_list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(StudInfo.class));
        return s_list;
    }
}
