package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f11891a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    private static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Z> f11892a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<R> f11893b;

        /* renamed from: c, reason: collision with root package name */
        final e<Z, R> f11894c;

        a(@o0 Class<Z> cls, @o0 Class<R> cls2, @o0 e<Z, R> eVar) {
            this.f11892a = cls;
            this.f11893b = cls2;
            this.f11894c = eVar;
        }

        public boolean a(@o0 Class<?> cls, @o0 Class<?> cls2) {
            return this.f11892a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11893b);
        }
    }

    @o0
    public synchronized <Z, R> e<Z, R> a(@o0 Class<Z> cls, @o0 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f11891a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f11894c;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ǩ") + cls + ProtectedSandApp.s("Ǫ") + cls2);
    }

    @o0
    public synchronized <Z, R> List<Class<R>> b(@o0 Class<Z> cls, @o0 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f11891a.iterator();
        while (it.hasNext()) {
            if (it.next().a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@o0 Class<Z> cls, @o0 Class<R> cls2, @o0 e<Z, R> eVar) {
        this.f11891a.add(new a<>(cls, cls2, eVar));
    }
}
