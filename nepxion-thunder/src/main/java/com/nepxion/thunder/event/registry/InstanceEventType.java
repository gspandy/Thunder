package com.nepxion.thunder.event.registry;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

public enum InstanceEventType {
    ONLINE("online"),
    OFFLINE("offline");

    private String value;

    private InstanceEventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public static InstanceEventType fromString(String value) {
        for (InstanceEventType type : InstanceEventType.values()) {
            if (type.getValue().equalsIgnoreCase(value.trim())) {
                return type;
            }
        }
        
        throw new IllegalArgumentException("Mismatched type with value=" + value);
    }

    @Override
    public String toString() {
        return value;
    }
}