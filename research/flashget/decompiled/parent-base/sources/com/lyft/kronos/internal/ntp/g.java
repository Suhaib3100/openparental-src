package com.lyft.kronos.internal.ntp;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lyft.kronos.internal.ntp.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: SntpResponseCache.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/lyft/kronos/internal/ntp/g;", "Lcom/lyft/kronos/internal/ntp/f;", "Lhb/j;", "syncResponseCache", "Lhb/c;", "deviceClock", "<init>", "(Lhb/j;Lhb/c;)V", "Lcom/lyft/kronos/internal/ntp/e$b;", "get", "()Lcom/lyft/kronos/internal/ntp/e$b;", "response", "Lkotlin/k2;", "a", "(Lcom/lyft/kronos/internal/ntp/e$b;)V", "clear", "()V", "Lhb/j;", "b", "Lhb/c;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final hb.j syncResponseCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final hb.c deviceClock;

    public g(@l hb.j jVar, @l hb.c cVar) {
        l0.p(jVar, ProtectedSandApp.s("ᠶ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ᠷ\u0001"));
        this.syncResponseCache = jVar;
        this.deviceClock = cVar;
    }

    @Override // com.lyft.kronos.internal.ntp.f
    public void a(@l e.b response) {
        l0.p(response, ProtectedSandApp.s("ᠸ\u0001"));
        synchronized (this) {
            this.syncResponseCache.f(response.b());
            this.syncResponseCache.a(response.c());
            this.syncResponseCache.b(response.d());
            k2 k2Var = k2.f75408a;
        }
    }

    @Override // com.lyft.kronos.internal.ntp.f
    public void clear() {
        synchronized (this) {
            this.syncResponseCache.clear();
            k2 k2Var = k2.f75408a;
        }
    }

    @Override // com.lyft.kronos.internal.ntp.f
    @m
    public e.b get() {
        long c5 = this.syncResponseCache.c();
        long d5 = this.syncResponseCache.d();
        long e4 = this.syncResponseCache.e();
        if (d5 == 0) {
            return null;
        }
        return new e.b(c5, d5, e4, this.deviceClock);
    }
}
