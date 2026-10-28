package com.bumptech.glide;

import androidx.annotation.q0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, b> f42894a;

    /* compiled from: GlideExperiments.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, b> f42895a = new HashMap();

        a() {
        }

        a b(b bVar) {
            this.f42895a.put(bVar.getClass(), bVar);
            return this;
        }

        f c() {
            return new f(this);
        }

        a d(b bVar, boolean z4) {
            if (z4) {
                b(bVar);
            } else {
                this.f42895a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* compiled from: GlideExperiments.java */
    interface b {
    }

    f(a aVar) {
        this.f42894a = Collections.unmodifiableMap(new HashMap(aVar.f42895a));
    }

    @q0
    <T extends b> T a(Class<T> cls) {
        return (T) this.f42894a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.f42894a.containsKey(cls);
    }
}
