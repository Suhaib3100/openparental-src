package com.google.android.datatransport.runtime.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.n;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import com.google.android.datatransport.runtime.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p8.a;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes5.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f52093f = Logger.getLogger(x.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final y f52094a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f52095b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f52096c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f52097d;

    /* renamed from: e, reason: collision with root package name */
    private final p8.a f52098e;

    @cd.a
    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, y yVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, p8.a aVar) {
        this.f52095b = executor;
        this.f52096c = eVar;
        this.f52094a = yVar;
        this.f52097d = dVar;
        this.f52098e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(s sVar, k kVar) {
        this.f52097d.p3(sVar, kVar);
        this.f52094a.a(sVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final s sVar, n nVar, k kVar) {
        try {
            com.google.android.datatransport.runtime.backends.n nVar2 = this.f52096c.get(sVar.b());
            if (nVar2 == null) {
                String format = String.format(ProtectedSandApp.s("옂"), sVar.b());
                f52093f.warning(format);
                nVar.a(new IllegalArgumentException(format));
            } else {
                final k a5 = nVar2.a(kVar);
                this.f52098e.b(new a.InterfaceC1373a() { // from class: com.google.android.datatransport.runtime.scheduling.b
                    @Override // p8.a.InterfaceC1373a
                    public final Object j() {
                        Object d5;
                        d5 = c.this.d(sVar, a5);
                        return d5;
                    }
                });
                nVar.a(null);
            }
        } catch (Exception e4) {
            f52093f.warning(ProtectedSandApp.s("옃") + e4.getMessage());
            nVar.a(e4);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.e
    public void a(final s sVar, final k kVar, final n nVar) {
        this.f52095b.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(sVar, nVar, kVar);
            }
        });
    }
}
