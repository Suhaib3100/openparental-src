package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.impl.j f36504b;

    /* renamed from: c, reason: collision with root package name */
    private String f36505c;

    /* renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f36506d;

    public o(androidx.work.impl.j workManagerImpl, String workSpecId, WorkerParameters.a runtimeExtras) {
        this.f36504b = workManagerImpl;
        this.f36505c = workSpecId;
        this.f36506d = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f36504b.J().l(this.f36505c, this.f36506d);
    }
}
