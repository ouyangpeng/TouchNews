package com.github.cchao.touchnews.view;

import com.github.cchao.touchnews.javaBean.news.Contentlist;
import com.github.cchao.touchnews.util.Constant;

import java.util.List;

/**
 * Created by cchao on 2016/4/1.
 * E-mail:   cchao1024@163.com
 * Description: View - 新闻频道Fragment
 */
public interface NewsListView {
        /**
         * 获取数据
         *
         * @param newsList newsList
         */
        void onRefreshData ( List< Contentlist > newsList );

        /**
         * 添加数据
         *
         * @param newsList add newsList
         */
        void onReceiveMoreListData ( List< Contentlist > newsList );

        /**
         * 显示信息  e.g. 没有网络、正在加载、异常
         *
         * @param INFOType 枚举值
         * @param infoText 提示的文本内容
         * @see Constant.INFO_TYPE
         */
        void showInfo ( Constant.INFO_TYPE INFOType, String infoText);
        void hideInfo();
}
