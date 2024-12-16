package com.entity.view;

import com.entity.DaohangfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 导航服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:27
 */
@TableName("daohangfuwu")
public class DaohangfuwuView  extends DaohangfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaohangfuwuView(){
	}
 
 	public DaohangfuwuView(DaohangfuwuEntity daohangfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, daohangfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}