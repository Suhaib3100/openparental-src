package org.apache.log4j.or;

import java.util.Hashtable;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.RendererSupport;

/* loaded from: classes3.dex */
public class RendererMap {
    static ObjectRenderer defaultRenderer = new DefaultRenderer();
    Hashtable map = new Hashtable();

    public static void addRenderer(RendererSupport rendererSupport, String str, String str2) {
        LogLog.debug("Rendering class: [" + str2 + "], Rendered class: [" + str + "].");
        ObjectRenderer objectRenderer = (ObjectRenderer) OptionConverter.instantiateByClassName(str2, ObjectRenderer.class, null);
        if (objectRenderer == null) {
            LogLog.error("Could not instantiate renderer [" + str2 + "].");
            return;
        }
        try {
            rendererSupport.setRenderer(Loader.loadClass(str), objectRenderer);
        } catch (ClassNotFoundException e4) {
            LogLog.error("Could not find class [" + str + "].", e4);
        }
    }

    public void clear() {
        this.map.clear();
    }

    public String findAndRender(Object obj) {
        if (obj == null) {
            return null;
        }
        return get((Class) obj.getClass()).doRender(obj);
    }

    public ObjectRenderer get(Object obj) {
        if (obj == null) {
            return null;
        }
        return get((Class) obj.getClass());
    }

    public ObjectRenderer getDefaultRenderer() {
        return defaultRenderer;
    }

    public void put(Class cls, ObjectRenderer objectRenderer) {
        this.map.put(cls, objectRenderer);
    }

    ObjectRenderer searchInterfaces(Class cls) {
        ObjectRenderer objectRenderer = (ObjectRenderer) this.map.get(cls);
        if (objectRenderer != null) {
            return objectRenderer;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ObjectRenderer searchInterfaces = searchInterfaces(cls2);
            if (searchInterfaces != null) {
                return searchInterfaces;
            }
        }
        return null;
    }

    public ObjectRenderer get(Class cls) {
        while (cls != null) {
            ObjectRenderer objectRenderer = (ObjectRenderer) this.map.get(cls);
            if (objectRenderer != null) {
                return objectRenderer;
            }
            ObjectRenderer searchInterfaces = searchInterfaces(cls);
            if (searchInterfaces != null) {
                return searchInterfaces;
            }
            cls = cls.getSuperclass();
        }
        return defaultRenderer;
    }
}
