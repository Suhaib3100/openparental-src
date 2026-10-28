package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import androidx.core.util.v;
import com.bumptech.glide.load.engine.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes3.dex */
public class s<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<Data> f44199a;

    /* renamed from: b, reason: collision with root package name */
    private final v.a<List<Throwable>> f44200b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f44201c;

    /* renamed from: d, reason: collision with root package name */
    private final String f44202d;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, v.a<List<Throwable>> aVar) {
        this.f44199a = cls;
        this.f44200b = aVar;
        this.f44201c = (List) com.bumptech.glide.util.m.d(list);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("़"));
        sb.append(cls.getSimpleName());
        String s4 = ProtectedSandApp.s("ऽ");
        sb.append(s4);
        sb.append(cls2.getSimpleName());
        sb.append(s4);
        sb.append(cls3.getSimpleName());
        sb.append(ProtectedSandApp.s("ा"));
        this.f44202d = sb.toString();
    }

    private u<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @o0 com.bumptech.glide.load.i iVar, int i4, int i5, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f44201c.size();
        u<Transcode> uVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            try {
                uVar = this.f44201c.get(i6).a(eVar, i4, i5, iVar, aVar);
            } catch (GlideException e4) {
                list.add(e4);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f44202d, new ArrayList(list));
    }

    public Class<Data> a() {
        return this.f44199a;
    }

    public u<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @o0 com.bumptech.glide.load.i iVar, int i4, int i5, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.m.f(this.f44200b.acquire(), ProtectedSandApp.s("ि"));
        try {
            return c(eVar, iVar, i4, i5, aVar, list);
        } finally {
            this.f44200b.release(list);
        }
    }

    public String toString() {
        return ProtectedSandApp.s("ी") + Arrays.toString(this.f44201c.toArray()) + '}';
    }
}
