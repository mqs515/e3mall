package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * 根据id查询商品详情
	 * @throws Exception 
	 */
	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long itemId) throws Exception {
		TbItem tbItem = itemService.findTbItemById(itemId);
		return tbItem;
	}
}
