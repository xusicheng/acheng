package cn.itcast.dao;

public @interface Query {
    String value();

    boolean nativeQuery();
}
