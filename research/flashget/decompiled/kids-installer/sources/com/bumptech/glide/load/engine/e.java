package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes3.dex */
class e<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.d<DataType> f11279a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f11280b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i f11281c;

    e(com.bumptech.glide.load.d<DataType> dVar, DataType datatype, com.bumptech.glide.load.i iVar) {
        this.f11279a = dVar;
        this.f11280b = datatype;
        this.f11281c = iVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@o0 File file) {
        return this.f11279a.a(this.f11280b, file, this.f11281c);
    }
}
