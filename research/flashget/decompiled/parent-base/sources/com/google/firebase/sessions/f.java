package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/sessions/f;", "", "Lcom/google/firebase/sessions/e;", "performance", "crashlytics", "", "sessionSamplingRate", "<init>", "(Lcom/google/firebase/sessions/e;Lcom/google/firebase/sessions/e;D)V", "a", "()Lcom/google/firebase/sessions/e;", "b", "c", "()D", "d", "(Lcom/google/firebase/sessions/e;Lcom/google/firebase/sessions/e;D)Lcom/google/firebase/sessions/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/sessions/e;", "g", "f", "D", "h", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e performance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e crashlytics;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double sessionSamplingRate;

    public f() {
        this(null, null, com.google.firebase.remoteconfig.p.f60679p, 7, null);
    }

    public static /* synthetic */ f e(f fVar, e eVar, e eVar2, double d5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = fVar.performance;
        }
        if ((i4 & 2) != 0) {
            eVar2 = fVar.crashlytics;
        }
        if ((i4 & 4) != 0) {
            d5 = fVar.sessionSamplingRate;
        }
        return fVar.d(eVar, eVar2, d5);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final e getPerformance() {
        return this.performance;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final e getCrashlytics() {
        return this.crashlytics;
    }

    /* renamed from: c, reason: from getter */
    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @fg.l
    public final f d(@fg.l e performance, @fg.l e crashlytics, double sessionSamplingRate) {
        kotlin.jvm.internal.l0.p(performance, ProtectedSandApp.s("Ә\u0001"));
        kotlin.jvm.internal.l0.p(crashlytics, ProtectedSandApp.s("ә\u0001"));
        return new f(performance, crashlytics, sessionSamplingRate);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return this.performance == fVar.performance && this.crashlytics == fVar.crashlytics && Double.compare(this.sessionSamplingRate, fVar.sessionSamplingRate) == 0;
    }

    @fg.l
    public final e f() {
        return this.crashlytics;
    }

    @fg.l
    public final e g() {
        return this.performance;
    }

    public final double h() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        return Double.hashCode(this.sessionSamplingRate) + ((this.crashlytics.hashCode() + (this.performance.hashCode() * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("Ӛ\u0001") + this.performance + ProtectedSandApp.s("ӛ\u0001") + this.crashlytics + ProtectedSandApp.s("Ӝ\u0001") + this.sessionSamplingRate + ')';
    }

    public f(@fg.l e eVar, @fg.l e eVar2, double d5) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("Ә\u0001"));
        kotlin.jvm.internal.l0.p(eVar2, ProtectedSandApp.s("ә\u0001"));
        this.performance = eVar;
        this.crashlytics = eVar2;
        this.sessionSamplingRate = d5;
    }

    public /* synthetic */ f(e eVar, e eVar2, double d5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? e.COLLECTION_SDK_NOT_INSTALLED : eVar, (i4 & 2) != 0 ? e.COLLECTION_SDK_NOT_INSTALLED : eVar2, (i4 & 4) != 0 ? 1.0d : d5);
    }
}
