package com.xufx.ConcreteBuilder;

import com.xufx.Builder.Builder;
import com.xufx.Product.Product;

/**
 * 具体的构建器实现对象
 */
public class ConcreteBuilder implements Builder {
    public Product getResultProduct() {
        return resultProduct;
    }

    public void setResultProduct(Product resultProduct) {
        this.resultProduct = resultProduct;
    }

    /**
     * 构建器最终构建的产品对象
     */
    private Product resultProduct;

    public void buildHead(String head) {
        resultProduct.setHead(head);
    }

    public void buildBody(String body) {
        resultProduct.setBody(body);
    }

    public void buildEnd(String end) {
        resultProduct.setEnd(end);
    }

}