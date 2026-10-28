package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes3.dex */
class e<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.d<DataType> f43987a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f43988b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i f43989c;

    e(com.bumptech.glide.load.d<DataType> dVar, DataType datatype, com.bumptech.glide.load.i iVar) {
        this.f43987a = dVar;
        this.f43988b = datatype;
        this.f43989c = iVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@o0 File file) {
        return this.f43987a.a(this.f43988b, file, this.f43989c);
    }
}
