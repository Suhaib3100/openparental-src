package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f44670a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    private static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        final Class<Z> f44671a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f44672b;

        /* renamed from: c, reason: collision with root package name */
        final e<Z, R> f44673c;

        a(@o0 Class<Z> cls, @o0 Class<R> cls2, @o0 e<Z, R> eVar) {
            this.f44671a = cls;
            this.f44672b = cls2;
            this.f44673c = eVar;
        }

        public boolean a(@o0 Class<?> cls, @o0 Class<?> cls2) {
            return this.f44671a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f44672b);
        }
    }

    @o0
    public synchronized <Z, R> e<Z, R> a(@o0 Class<Z> cls, @o0 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f44670a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f44673c;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ਤ") + cls + ProtectedSandApp.s("ਥ") + cls2);
    }

    @o0
    public synchronized <Z, R> List<Class<R>> b(@o0 Class<Z> cls, @o0 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f44670a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f44672b)) {
                arrayList.add(aVar.f44672b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@o0 Class<Z> cls, @o0 Class<R> cls2, @o0 e<Z, R> eVar) {
        this.f44670a.add(new a<>(cls, cls2, eVar));
    }
}
