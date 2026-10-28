package org.greenrobot.eventbus.util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.greenrobot.eventbus.f;

/* compiled from: ExceptionToResourceMapping.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends Throwable>, Integer> f32231a = new HashMap();

    public c a(Class<? extends Throwable> cls, int i5) {
        this.f32231a.put(cls, Integer.valueOf(i5));
        return this;
    }

    public Integer b(Throwable th) {
        int i5 = 20;
        Throwable th2 = th;
        do {
            Integer c6 = c(th2);
            if (c6 == null) {
                th2 = th2.getCause();
                i5--;
                if (i5 <= 0 || th2 == th) {
                    break;
                }
            } else {
                return c6;
            }
        } while (th2 != null);
        f.a.a().a(Level.FINE, "No specific message resource ID found for " + th);
        return null;
    }

    protected Integer c(Throwable th) {
        Class<?> cls = th.getClass();
        Integer num = this.f32231a.get(cls);
        if (num == null) {
            Class<? extends Throwable> cls2 = null;
            for (Map.Entry<Class<? extends Throwable>, Integer> entry : this.f32231a.entrySet()) {
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
