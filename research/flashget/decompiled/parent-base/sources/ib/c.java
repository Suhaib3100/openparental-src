package ib;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lyft.kronos.internal.ntp.h;
import fg.l;
import fg.m;
import hb.f;
import hb.g;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: KronosClockImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"Lib/c;", "Lhb/f;", "Lcom/lyft/kronos/internal/ntp/h;", "ntpService", "Lhb/c;", "fallbackClock", "<init>", "(Lcom/lyft/kronos/internal/ntp/h;Lhb/c;)V", "", "b", "()Z", "Lkotlin/k2;", "d", "()V", "shutdown", "", "f", "()J", "Lhb/g;", "c", "()Lhb/g;", "e", "()Ljava/lang/Long;", "a", "Lcom/lyft/kronos/internal/ntp/h;", "Lhb/c;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final h ntpService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final hb.c fallbackClock;

    public c(@l h hVar, @l hb.c cVar) {
        l0.p(hVar, ProtectedSandApp.s("㠚\u0001"));
        l0.p(cVar, ProtectedSandApp.s("㠛\u0001"));
        this.ntpService = hVar;
        this.fallbackClock = cVar;
    }

    @Override // hb.f, hb.c
    public long a() {
        return f.a.a(this);
    }

    @Override // hb.f
    public boolean b() {
        return this.ntpService.b();
    }

    @Override // hb.f
    @l
    public g c() {
        g c5 = this.ntpService.c();
        return c5 == null ? new g(this.fallbackClock.a(), null) : c5;
    }

    @Override // hb.f
    public void d() {
        this.ntpService.d();
    }

    @Override // hb.f
    @m
    public Long e() {
        g c5 = this.ntpService.c();
        if (c5 != null) {
            return Long.valueOf(c5.e());
        }
        return null;
    }

    @Override // hb.c
    public long f() {
        return this.fallbackClock.f();
    }

    @Override // hb.f
    public void shutdown() {
        this.ntpService.shutdown();
    }
}
