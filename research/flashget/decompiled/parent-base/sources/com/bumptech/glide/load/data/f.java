package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f43770b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f43771a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public Class<Object> a() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ࡩ"));
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public e<Object> b(@o0 Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    private static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f43772a;

        b(@o0 Object obj) {
            this.f43772a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @o0
        public Object a() {
            return this.f43772a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    @o0
    public synchronized <T> e<T> a(@o0 T t4) {
        e.a<?> aVar;
        try {
            com.bumptech.glide.util.m.e(t4);
            aVar = this.f43771a.get(t4.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f43771a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(t4.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f43770b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (e<T>) aVar.b(t4);
    }

    public synchronized void b(@o0 e.a<?> aVar) {
        this.f43771a.put(aVar.a(), aVar);
    }
}
