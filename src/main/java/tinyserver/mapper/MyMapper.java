package tinyserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * 
 * @author lsk
 *
 */
@Mapper
public interface MyMapper {
	
	@Select("SELECT count(*) FROM CITY ")
    Long count();
}
