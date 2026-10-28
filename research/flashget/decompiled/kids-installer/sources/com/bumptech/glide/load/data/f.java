package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f11064b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f11065a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes3.dex */
    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public Class<Object> a() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᱵ"));
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public e<Object> b(@o0 Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes3.dex */
    private static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f11066a;

        b(@o0 Object obj) {
            this.f11066a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @o0
        public Object a() {
            return this.f11066a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    @o0
    public synchronized <T> e<T> a(@o0 T t5) {
        e.a<?> aVar;
        com.bumptech.glide.util.l.d(t5);
        aVar = this.f11065a.get(t5.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it = this.f11065a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a<?> next = it.next();
                if (next.a().isAssignableFrom(t5.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f11064b;
        }
        return (e<T>) aVar.b(t5);
    }

    public synchronized void b(@o0 e.a<?> aVar) {
        this.f11065a.put(aVar.a(), aVar);
    }
}
