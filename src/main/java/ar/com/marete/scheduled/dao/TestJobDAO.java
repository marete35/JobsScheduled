package ar.com.marete.scheduled.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class TestJobDAO extends BaseJobDAO{
	
	@SuppressWarnings("unchecked")
	public Integer getCount(){
		
		try {
			String sql = "select count(*) from master.city";
			return super.getNamedParameterJdbcTemplate().queryForObject(sql,(HashMap)null,Integer.class);
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

}
