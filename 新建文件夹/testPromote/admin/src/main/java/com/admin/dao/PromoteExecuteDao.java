package com.admin.dao;

import com.admin.model.PromoteExecute;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoteExecuteDao {

    /**
     * 插入促销基础信息
     */
    int insertPromoteExecute(PromoteExecute promote);


}
