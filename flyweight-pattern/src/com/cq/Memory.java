package com.cq;

/**
 * 内存
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class Memory {

    /**
     * 内存大小，单位为MB
     */
    private int size;

    /**
     * 内存是否在使用
     */
    private boolean isUsed;

    /**
     * 内存id
     */
    private String id;

    public Memory(int size, boolean isUsed, String id) {
        this.size = size;
        this.isUsed = isUsed;
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", isUsed=" + isUsed +
                ", id='" + id + '\'' +
                '}';
    }
}
