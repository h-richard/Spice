package Spice.util;

import java.util.HashMap;

public class TypeResolver {
	private static final HashMap<String, Class<?>> PRIMITIVES = new HashMap<>();
	private static final HashMap<Class<?>, Class<?>> UNBOX_MAP = new HashMap<>();
    static {
        PRIMITIVES.put("int", int.class);
        PRIMITIVES.put("long", long.class);
        PRIMITIVES.put("float", float.class);
        PRIMITIVES.put("double", double.class);
        PRIMITIVES.put("boolean", boolean.class);

        PRIMITIVES.put("Integer", Integer.class);
        PRIMITIVES.put("Long", Long.class);
        PRIMITIVES.put("Float", Float.class);
        PRIMITIVES.put("Double", Double.class);
        PRIMITIVES.put("Boolean", Boolean.class);
        PRIMITIVES.put("String", String.class);
    
        UNBOX_MAP.put(Integer.class, int.class);
        UNBOX_MAP.put(Long.class, long.class);
        UNBOX_MAP.put(Double.class, double.class);
        UNBOX_MAP.put(Float.class, float.class);
        UNBOX_MAP.put(Boolean.class, boolean.class);
        UNBOX_MAP.put(Character.class, char.class);
        UNBOX_MAP.put(Byte.class, byte.class);
        UNBOX_MAP.put(Short.class, short.class);
    }

    public static Class<?> resolve(String typeName) throws ClassNotFoundException {
        if (PRIMITIVES.containsKey(typeName))
            return PRIMITIVES.get(typeName);

        return Class.forName(typeName);
    }
    
    public static Class<?> tryUnbox(Class<?> type) {
        return UNBOX_MAP.getOrDefault(type, type);
    }
}
