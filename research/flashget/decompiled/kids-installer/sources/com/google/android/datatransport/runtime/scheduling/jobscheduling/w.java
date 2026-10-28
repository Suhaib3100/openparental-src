package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import java.util.concurrent.Executor;
import l1.a;

/* compiled from: WorkInitializer.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f12660a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f12661b;

    /* renamed from: c, reason: collision with root package name */
    private final y f12662c;

    /* renamed from: d, reason: collision with root package name */
    private final l1.a f12663d;

    @h3.a
    w(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, l1.a aVar) {
        this.f12660a = executor;
        this.f12661b = dVar;
        this.f12662c = yVar;
        this.f12663d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<com.google.android.datatransport.runtime.s> it = this.f12661b.N().iterator();
        while (it.hasNext()) {
            this.f12662c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f12663d.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.u
            @Override // l1.a.InterfaceC0460a
            public final Object execute() {
                Object d6;
                d6 = w.this.d();
                return d6;
            }
        });
    }

    public void c() {
        this.f12660a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.v
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e();
            }
        });
    }
}
