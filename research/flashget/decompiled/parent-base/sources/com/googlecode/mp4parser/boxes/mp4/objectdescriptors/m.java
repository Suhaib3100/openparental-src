package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ObjectDescriptorFactory.java */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected static Logger f64010a = Logger.getLogger(m.class.getName());

    /* renamed from: b, reason: collision with root package name */
    protected static Map<Integer, Map<Integer, Class<? extends b>>> f64011b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(f.class);
        hashSet.add(o.class);
        hashSet.add(b.class);
        hashSet.add(i.class);
        hashSet.add(l.class);
        hashSet.add(n.class);
        hashSet.add(a.class);
        hashSet.add(j.class);
        hashSet.add(h.class);
        hashSet.add(e.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class<? extends b> cls = (Class) it.next();
            g gVar = (g) cls.getAnnotation(g.class);
            int[] tags = gVar.tags();
            int objectTypeIndication = gVar.objectTypeIndication();
            Map<Integer, Class<? extends b>> map = f64011b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i4 : tags) {
                map.put(Integer.valueOf(i4), cls);
            }
            f64011b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i4, ByteBuffer byteBuffer) throws IOException {
        b pVar;
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        Map<Integer, Class<? extends b>> map = f64011b.get(Integer.valueOf(i4));
        if (map == null) {
            map = f64011b.get(-1);
        }
        Class<? extends b> cls = map.get(Integer.valueOf(p4));
        String s4 = ProtectedSandApp.s("ፚ\u0001");
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            f64010a.warning(ProtectedSandApp.s("፝\u0001") + Integer.toHexString(i4) + s4 + Integer.toHexString(p4) + ProtectedSandApp.s("፞\u0001") + cls);
            pVar = new p();
        } else {
            try {
                pVar = cls.newInstance();
            } catch (Exception e4) {
                f64010a.log(Level.SEVERE, ProtectedSandApp.s("\u135b\u0001") + cls + ProtectedSandApp.s("\u135c\u0001") + i4 + s4 + p4, (Throwable) e4);
                throw new RuntimeException(e4);
            }
        }
        pVar.e(p4, byteBuffer);
        return pVar;
    }
}
