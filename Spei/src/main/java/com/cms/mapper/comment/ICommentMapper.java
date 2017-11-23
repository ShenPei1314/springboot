package com.cms.mapper.comment;

import java.util.List;
import java.util.Map;

import com.cms.bean.Comment;
import com.cms.bean.Params;

public interface ICommentMapper {
  
	/**
	 * 查询所有评论
	 */
	public List<Map<String,Object>> findComments(Params params);
	
	/**
	 * 查询总数*
	 * @return
	 */
	public int findCount();
	/**
	 * 删除
	 * 方法名：updateComment<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月20日-上午10:11:33 <br/>
	 * 手机:1564545646464<br/>
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int updateComment(Comment comment);
}
