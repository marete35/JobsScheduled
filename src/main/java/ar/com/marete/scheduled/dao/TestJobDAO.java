package ar.com.marete.scheduled.dao;

import java.sql.SQLException;
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
			logger.error(e.getMessage(),e);
			return 0;
		}finally {
			try {
				super.getNamedParameterJdbcTemplate().getJdbcTemplate().getDataSource().getConnection().close();
			} catch (SQLException e) {
				logger.error(e.getMessage(),e);
			}
		}
	}

}
