package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
	/**
	 * 根据商品的id查询商品的信息
	 */
	public TbItem findTbItemById(Long id)throws Exception;

}
