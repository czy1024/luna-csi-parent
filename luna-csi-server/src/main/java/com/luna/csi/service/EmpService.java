package com.luna.csi.service;

import com.luna.csi.mapper.EmpMapper;
import com.luna.csi.entity.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: luna
 * @CreateTime: 2021-04-28 15:46:27
 */
public interface EmpService {

    /**
     * 通过主键查询数据
     *
     * @param id 主键
     * @return 对象
     */
    Emp getById(Long id);

    /**
     * 通过实体不为空的属性作为筛选条件查询单个
     *
     * @param emp 条件
     * @return 对象
     */
    Emp getByEntity(Emp emp);

    /**
     * 通过实体不为空的属性作为筛选条件查询列表
     *
     * @param emp 条件
     * @return 对象列表
     */
    List<Emp> listByEntity(Emp emp);

    /**
     * 条件分页查询
     *
     * @param emp 查询条件
     * @param page 起始标号
     * @param pageSize 查询条目
     * @return 对象列表
     */
    PageInfo listPageByEntity(int page, int pageSize, Emp emp);

    /**
     * 条件分页查询
     *
     * @param page 起始标号
     * @param pageSize 查询条目
     * @return 对象列表
     */
    PageInfo listPage(int page, int pageSize);

    /**
     * Id列表查询对象列表
     *
     * @param ids Id列表
     * @return 对象列表
     */
    List<Emp> listByIds(List<Long> ids);

    /**
     * 插入
     *
     * @param emp 对象
     * @return 影响行数
     */
    int insert(Emp emp);

    /**
     * 列表插入
     *
     * @param list 列表对象
     * @return 影响行数
     */
    int insertBatch(List<Emp> list);

    /**
     * 更新
     *
     * @param emp 对象
     * @return 影响行数
     */
    int update(Emp emp);

    /**
     * 列表更新
     *
     * @param list 列表对象
     * @return 影响行数
     */
    int updateBatch(List<Emp> list);

    /**
     * 删除
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 条件删除
     *
     * @param emp 对象
     * @return 影响行数
     */
    int deleteByEntity(Emp emp);

    /**
     * 主键列表删除
     *
     * @param list 主键列表
     * @return 影响行数
     */
    int deleteByIds(List<Long> list);

    /**
     * 数据条目
     *
     * @return 影响行数
     */
    int countAll();

    /**
     * 条件查询数目
     *
     * @param emp 对象
     * @return 影响行数
     */
    int countByEntity(Emp emp);
}
