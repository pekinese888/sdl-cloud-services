package com.talebase.cloud.base.ms.paper.enums;

/**
 * 状态
 **/
public enum TOptionStatus {
    /**
     * 未启用
     **/
    DISABLED(0),

    /**
     * 已启用
     **/
    ENABLED(1),

    /**
     * 已删除
     **/
    DELETED(2);
    private final int value;

    private TOptionStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
