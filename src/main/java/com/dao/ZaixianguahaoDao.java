package com.dao;

import com.entity.ZaixianguahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianguahaoVO;
import com.entity.view.ZaixianguahaoView;


/**
 * 在线挂号
 * 
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
public interface ZaixianguahaoDao extends BaseMapper<ZaixianguahaoEntity> {
	
	List<ZaixianguahaoVO> selectListVO(@Param("ew") Wrapper<ZaixianguahaoEntity> wrapper);
	
	ZaixianguahaoVO selectVO(@Param("ew") Wrapper<ZaixianguahaoEntity> wrapper);
	
	List<ZaixianguahaoView> selectListView(@Param("ew") Wrapper<ZaixianguahaoEntity> wrapper);

	List<ZaixianguahaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianguahaoEntity> wrapper);
	
	ZaixianguahaoView selectView(@Param("ew") Wrapper<ZaixianguahaoEntity> wrapper);
	

}
