package springdemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmplyoeeDB {
	JdbcTemplate jt;
	public EmplyoeeDB() {
	}
	public EmplyoeeDB(JdbcTemplate jt) {
		this.jt = jt;
	}
	public int addEmplyoee(Emplyoee e) {
		String str= "insert into emplyoee values("+ e.getEid()+",'"+e.getEname()+"',"+e.getSalary()+")";
		return jt.update(str);
	}
	public List<Emplyoee> getEmplyoeeDetails(){
		return jt.query("select * from emplyoee", new RowMapper<Emplyoee>() {
			public Emplyoee mapRow(ResultSet r,int row) throws SQLException{
				Emplyoee e=new Emplyoee();
				e.setEid(r.getInt(1));
				e.setEname(r.getString(2));
				e.setSalary(r.getFloat(3));
				return e;
			}
		});
	}	
}
	
