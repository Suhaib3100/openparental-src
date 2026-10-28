package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.o0;
import androidx.core.util.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: DecodePath.java */
/* loaded from: classes3.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f44079f = ProtectedSandApp.s("ई");

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f44080a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> f44081b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> f44082c;

    /* renamed from: d, reason: collision with root package name */
    private final v.a<List<Throwable>> f44083d;

    /* renamed from: e, reason: collision with root package name */
    private final String f44084e;

    /* compiled from: DecodePath.java */
    interface a<ResourceType> {
        @o0
        u<ResourceType> a(@o0 u<ResourceType> uVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, v.a<List<Throwable>> aVar) {
        this.f44080a = cls;
        this.f44081b = list;
        this.f44082c = eVar;
        this.f44083d = aVar;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ऄ"));
        sb.append(cls.getSimpleName());
        String s4 = ProtectedSandApp.s("अ");
        sb.append(s4);
        sb.append(cls2.getSimpleName());
        sb.append(s4);
        sb.append(cls3.getSimpleName());
        sb.append(ProtectedSandApp.s("आ"));
        this.f44084e = sb.toString();
    }

    @o0
    private u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.m.f(this.f44083d.acquire(), ProtectedSandApp.s("इ"));
        try {
            return c(eVar, i4, i5, iVar, list);
        } finally {
            this.f44083d.release(list);
        }
    }

    @o0
    private u<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i4, int i5, @o0 com.bumptech.glide.load.i iVar, List<Throwable> list) throws GlideException {
        int size = this.f44081b.size();
        u<ResourceType> uVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            com.bumptech.glide.load.k<DataType, ResourceType> kVar = this.f44081b.get(i6);
            try {
                if (kVar.a(eVar.a(), iVar)) {
                    uVar = kVar.b(eVar.a(), i4, i5, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable(ProtectedSandApp.s("ई"), 2)) {
                    Objects.toString(kVar);
                }
                list.add(e4);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f44084e, new ArrayList(list));
    }

    public u<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i4, int i5, @o0 com.bumptech.glide.load.i iVar, a<ResourceType> aVar) throws GlideException {
        return this.f44082c.a(aVar.a(b(eVar, i4, i5, iVar)), iVar);
    }

    public String toString() {
        return ProtectedSandApp.s("उ") + this.f44080a + ProtectedSandApp.s("ऊ") + this.f44081b + ProtectedSandApp.s("ऋ") + this.f44082c + '}';
    }
}
