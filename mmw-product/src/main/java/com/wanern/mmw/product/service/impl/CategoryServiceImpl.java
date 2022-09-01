package com.wanern.mmw.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanern.mmw.common.utils.PageUtils;
import com.wanern.mmw.common.utils.Query;

import com.wanern.mmw.product.dao.CategoryDao;
import com.wanern.mmw.product.entity.CategoryEntity;
import com.wanern.mmw.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    @Override
    public List<CategoryEntity> listWithTree() {
        // 1、查询所有分类数据
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        if (categoryEntities == null) {
            return Collections.emptyList();
        }

        // 2、查询所有父级元素
        List<CategoryEntity> categoryList = categoryEntities.stream()
                .filter(item -> item.getParentCid() == 0)
                .map(item -> {
                    item.setChildren(getChildren(item, categoryEntities));
                    return item;
                })
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
        return categoryList;
    }


    /**
     * 递归获取子集
     * @param ele
     * @param categoryEntities
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity ele, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> children = categoryEntities.stream()
                .filter(item -> item.getParentCid() == ele.getCatId())
                .map(item -> {
                    item.setChildren(getChildren(item, categoryEntities));
                    return item;
                })
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
        return children;
    }
}