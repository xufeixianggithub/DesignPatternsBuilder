package com.xufx.Client;

import com.xufx.Builder.Builder;
import com.xufx.ConcreteBuilder.ConcreteBuilder;
import com.xufx.Director.Director;
import com.xufx.Product.ConcretProduct;
import com.xufx.Product.Product;

public class Client {
    public static void main(String[] args) {
        Product pro=new ConcretProduct();
        ConcreteBuilder builder=new ConcreteBuilder();
        builder.setResultProduct(pro);

        Director d=new Director(builder);

        d.construct("a","b","d");
        System.out.println(pro);
    }
}
