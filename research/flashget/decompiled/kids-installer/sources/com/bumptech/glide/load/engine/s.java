package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import androidx.core.util.p;
import com.bumptech.glide.load.engine.i;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public class s<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<Data> f11459a;

    /* renamed from: b, reason: collision with root package name */
    private final p.a<List<Throwable>> f11460b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f11461c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11462d;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, p.a<List<Throwable>> aVar) {
        this.f11459a = cls;
        this.f11460b = aVar;
        this.f11461c = (List) com.bumptech.glide.util.l.c(list);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ŝ"));
        sb.append(cls.getSimpleName());
        String s5 = ProtectedSandApp.s("Ş");
        sb.append(s5);
        sb.append(cls2.getSimpleName());
        sb.append(s5);
        sb.append(cls3.getSimpleName());
        sb.append(ProtectedSandApp.s("ş"));
        this.f11462d = sb.toString();
    }

    private u<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @o0 com.bumptech.glide.load.i iVar, int i5, int i6, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f11461c.size();
        u<Transcode> uVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            try {
                uVar = this.f11461c.get(i7).a(eVar, i5, i6, iVar, aVar);
            } catch (GlideException e6) {
                list.add(e6);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f11462d, new ArrayList(list));
    }

    public Class<Data> a() {
        return this.f11459a;
    }

    public u<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @o0 com.bumptech.glide.load.i iVar, int i5, int i6, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.l.d(this.f11460b.b());
        try {
            return c(eVar, iVar, i5, i6, aVar, list);
        } finally {
            this.f11460b.a(list);
        }
    }

    public String toString() {
        return ProtectedSandApp.s("Š") + Arrays.toString(this.f11461c.toArray()) + '}';
    }
}
