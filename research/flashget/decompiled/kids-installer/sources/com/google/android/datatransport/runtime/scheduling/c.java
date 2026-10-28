package com.google.android.datatransport.runtime.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.j;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import com.google.android.datatransport.runtime.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import l1.a;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f12563f = Logger.getLogger(x.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final y f12564a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12565b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f12566c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f12567d;

    /* renamed from: e, reason: collision with root package name */
    private final l1.a f12568e;

    @h3.a
    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, y yVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, l1.a aVar) {
        this.f12565b = executor;
        this.f12566c = eVar;
        this.f12564a = yVar;
        this.f12567d = dVar;
        this.f12568e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(s sVar, k kVar) {
        this.f12567d.P0(sVar, kVar);
        this.f12564a.a(sVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final s sVar, j jVar, k kVar) {
        try {
            n c6 = this.f12566c.c(sVar.b());
            if (c6 == null) {
                String format = String.format(ProtectedSandApp.s("\u205f"), sVar.b());
                f12563f.warning(format);
                jVar.a(new IllegalArgumentException(format));
            } else {
                final k b6 = c6.b(kVar);
                this.f12568e.d(new a.InterfaceC0460a() { // from class: com.google.android.datatransport.runtime.scheduling.a
                    @Override // l1.a.InterfaceC0460a
                    public final Object execute() {
                        Object d6;
                        d6 = c.this.d(sVar, b6);
                        return d6;
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e6) {
            f12563f.warning(ProtectedSandApp.s("\u2060") + e6.getMessage());
            jVar.a(e6);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.e
    public void a(final s sVar, final k kVar, final j jVar) {
        this.f12565b.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(sVar, jVar, kVar);
            }
        });
    }
}
