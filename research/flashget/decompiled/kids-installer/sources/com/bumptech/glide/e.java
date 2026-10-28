package com.bumptech.glide;

import androidx.annotation.q0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, b> f10795a;

    /* compiled from: GlideExperiments.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, b> f10796a = new HashMap();

        a() {
        }

        a b(b bVar) {
            this.f10796a.put(bVar.getClass(), bVar);
            return this;
        }

        e c() {
            return new e(this);
        }

        a d(b bVar, boolean z5) {
            if (z5) {
                b(bVar);
            } else {
                this.f10796a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* compiled from: GlideExperiments.java */
    interface b {
    }

    e(a aVar) {
        this.f10795a = Collections.unmodifiableMap(new HashMap(aVar.f10796a));
    }

    @q0
    <T extends b> T a(Class<T> cls) {
        return (T) this.f10795a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.f10795a.containsKey(cls);
    }
}
