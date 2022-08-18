package com.wanern.mmw.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * Created by Ale on 2021/8/13
 */
public class PageQueryUtils {

    /**
     * PAGE_KEY: 当前分页对象
     * CURRENT_PAGE_KEY: 当前页key
     * PAGE_SIZE_KEY: 页大小key
     */
    private static final String PAGE_KEY = "pageInfo";
    private static final String CURRENT_PAGE_KEY = "currentPage";
    private static final String PAGE_SIZE_KEY = "pageSize";


    /**
     * 默认值
     * CURRENT_PAGE: 当前页
     * PAGE_SIZE: 页大小
     */
    private static final int CURRENT_PAGE = 1;
    private static final int PAGE_SIZE = 10;


    public static IPage getPage(String params) {
        if (ESUtils.isEmpty(params) || !isExist(params)) {
            return new Page(CURRENT_PAGE, PAGE_SIZE);
        }
        JSONObject paramData = JSONObject.parseObject(params);
        JSONObject pageForm = paramData.getJSONObject(PAGE_KEY);
        if (!pageForm.containsKey(CURRENT_PAGE_KEY) || !pageForm.containsKey(PAGE_SIZE_KEY)) {
            return new Page(CURRENT_PAGE, PAGE_SIZE);
        }
        int currentPage = pageForm.getIntValue(CURRENT_PAGE_KEY);
        int pageSize = pageForm.getIntValue(PAGE_SIZE_KEY);
        if (currentPage <= 0 || pageSize <= 0) {
            return new Page(CURRENT_PAGE, PAGE_SIZE);
        }
        return new Page(currentPage, pageSize);
    }


    /**
     * 是否存在 PAGE_KEY
     * @param params
     * @return
     */
    private static boolean isExist(String params) {
        JSONObject paramData = JSONObject.parseObject(params);
        return !ESUtils.isEmpty(paramData) && paramData.containsKey(PAGE_KEY);
    }
}
