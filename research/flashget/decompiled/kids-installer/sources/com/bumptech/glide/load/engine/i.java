package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.o0;
import androidx.core.util.p;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f11354f = ProtectedSandApp.s("Œ");

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f11355a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> f11356b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> f11357c;

    /* renamed from: d, reason: collision with root package name */
    private final p.a<List<Throwable>> f11358d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11359e;

    /* compiled from: DecodePath.java */
    interface a<ResourceType> {
        @o0
        u<ResourceType> a(@o0 u<ResourceType> uVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, p.a<List<Throwable>> aVar) {
        this.f11355a = cls;
        this.f11356b = list;
        this.f11357c = eVar;
        this.f11358d = aVar;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ŋ"));
        sb.append(cls.getSimpleName());
        String s5 = ProtectedSandApp.s("Ō");
        sb.append(s5);
        sb.append(cls2.getSimpleName());
        sb.append(s5);
        sb.append(cls3.getSimpleName());
        sb.append(ProtectedSandApp.s("ō"));
        this.f11359e = sb.toString();
    }

    @o0
    private u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.l.d(this.f11358d.b());
        try {
            return c(eVar, i5, i6, iVar, list);
        } finally {
            this.f11358d.a(list);
        }
    }

    @o0
    private u<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, @o0 com.bumptech.glide.load.i iVar, List<Throwable> list) throws GlideException {
        int size = this.f11356b.size();
        u<ResourceType> uVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            com.bumptech.glide.load.k<DataType, ResourceType> kVar = this.f11356b.get(i7);
            try {
                if (kVar.a(eVar.a(), iVar)) {
                    uVar = kVar.b(eVar.a(), i5, i6, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable(ProtectedSandApp.s("Ŏ"), 2)) {
                    Objects.toString(kVar);
                }
                list.add(e6);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f11359e, new ArrayList(list));
    }

    public u<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, @o0 com.bumptech.glide.load.i iVar, a<ResourceType> aVar) throws GlideException {
        return this.f11357c.a(aVar.a(b(eVar, i5, i6, iVar)), iVar);
    }

    public String toString() {
        return ProtectedSandApp.s("ŏ") + this.f11355a + ProtectedSandApp.s("Ő") + this.f11356b + ProtectedSandApp.s("ő") + this.f11357c + '}';
    }
}
