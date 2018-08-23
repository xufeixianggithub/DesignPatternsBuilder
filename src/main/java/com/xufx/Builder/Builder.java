package com.xufx.Builder;

import com.xufx.Product.Product;

/**
 * 构建器接口，定义创建一个产品对象所需的各个部件的操作
 */
public interface Builder {
    /**
     * 示意方法，构建某个部件
     */
    public void buildHead(String head);
    public void buildBody(String body);
    public void buildEnd(String end);

}