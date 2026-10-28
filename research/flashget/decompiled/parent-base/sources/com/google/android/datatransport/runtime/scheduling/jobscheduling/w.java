package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p8.a;

/* compiled from: WorkInitializer.java */
/* loaded from: classes5.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f52190a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f52191b;

    /* renamed from: c, reason: collision with root package name */
    private final y f52192c;

    /* renamed from: d, reason: collision with root package name */
    private final p8.a f52193d;

    @cd.a
    w(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, p8.a aVar) {
        this.f52190a = executor;
        this.f52191b = dVar;
        this.f52192c = yVar;
        this.f52193d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<com.google.android.datatransport.runtime.s> it = this.f52191b.p0().iterator();
        while (it.hasNext()) {
            this.f52192c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f52193d.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.v
            @Override // p8.a.InterfaceC1373a
            public final Object j() {
                Object d5;
                d5 = w.this.d();
                return d5;
            }
        });
    }

    public void c() {
        this.f52190a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.u
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e();
            }
        });
    }
}
