package org.greenrobot.eventbus.util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.greenrobot.eventbus.f;

/* compiled from: ExceptionToResourceMapping.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends Throwable>, Integer> f86904a = new HashMap();

    public c a(Class<? extends Throwable> cls, int i4) {
        this.f86904a.put(cls, Integer.valueOf(i4));
        return this;
    }

    public Integer b(Throwable th) {
        int i4 = 20;
        Throwable th2 = th;
        do {
            Integer c5 = c(th2);
            if (c5 == null) {
                th2 = th2.getCause();
                i4--;
                if (i4 <= 0 || th2 == th) {
                    break;
                }
            } else {
                return c5;
            }
        } while (th2 != null);
        f.a.a().b(Level.FINE, "No specific message resource ID found for " + th);
        return null;
    }

    protected Integer c(Throwable th) {
        Class<?> cls = th.getClass();
        Integer num = this.f86904a.get(cls);
        if (num == null) {
            Class<? extends Throwable> cls2 = null;
            for (Map.Entry<Class<? extends Throwable>, Integer> entry : this.f86904a.entrySet()) {
                Class<? extends Throwable> key = entry.getKey();
                if (key.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(key))) {
                    num = entry.getValue();
                    cls2 = key;
                }
            }
        }
        return num;
    }
}
