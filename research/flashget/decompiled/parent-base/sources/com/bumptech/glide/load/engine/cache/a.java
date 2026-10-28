package com.bumptech.glide.load.engine.cache;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: DiskCache.java */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: DiskCache.java */
    /* renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    public interface InterfaceC0737a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f43929a = 262144000;

        /* renamed from: b, reason: collision with root package name */
        public static final String f43930b = ProtectedSandApp.s("ࣃ");

        @q0
        a a();
    }

    /* compiled from: DiskCache.java */
    public interface b {
        boolean a(@o0 File file);
    }

    void a(com.bumptech.glide.load.f fVar, b bVar);

    @q0
    File b(com.bumptech.glide.load.f fVar);

    void c(com.bumptech.glide.load.f fVar);

    void clear();
}
