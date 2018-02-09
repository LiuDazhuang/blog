package top.kkzhixia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import top.kkzhixia.modle.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from users")
	public List<User> findAll();

}
