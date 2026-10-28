package androidx.work.impl;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.impl.model.r;

/* compiled from: Scheduler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface e {

    /* renamed from: h0, reason: collision with root package name */
    public static final int f36169h0 = 50;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f36170i0 = 200;

    void a(@o0 String workSpecId);

    void c(@o0 r... workSpecs);

    boolean d();
}
