package com.cms.mapper.banner;

import java.util.List;

import com.cms.bean.Banner;
/**
 * 
 * 轮播图的管理
 * IBannerMapper<br/>
 * 创建人:AywenLin<br/>
 * 时间：2017年11月3日-上午11:45:11 <br/>
 * @version 1.0.0<br/>
 *
 */
public interface IBannerMapper {
	/**
	 * 
	 * (查询轮播图)<br/>
	 * 方法名：selectBanners<br/>
	 * 创建人：AywenLin <br/>
	 * 时间：2017年11月3日-上午11:46:33 <br/>
	 * 手机:17742597905<br/>
	 * @return List<Banner><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<Banner> selectBanners();
}
