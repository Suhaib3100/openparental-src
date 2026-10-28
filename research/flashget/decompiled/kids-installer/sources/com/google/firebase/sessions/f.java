package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/f;", "", "Lcom/google/firebase/sessions/e;", "a", "b", "", "c", "performance", "crashlytics", "sessionSamplingRate", "d", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/google/firebase/sessions/e;", "g", "()Lcom/google/firebase/sessions/e;", "f", "D", "h", "()D", "<init>", "(Lcom/google/firebase/sessions/e;Lcom/google/firebase/sessions/e;D)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e performance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e crashlytics;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double sessionSamplingRate;

    public f() {
        this(null, null, com.google.firebase.remoteconfig.p.f18289o, 7, null);
    }

    public static /* synthetic */ f e(f fVar, e eVar, e eVar2, double d6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            eVar = fVar.performance;
        }
        if ((i5 & 2) != 0) {
            eVar2 = fVar.crashlytics;
        }
        if ((i5 & 4) != 0) {
            d6 = fVar.sessionSamplingRate;
        }
        return fVar.d(eVar, eVar2, d6);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final e getPerformance() {
        return this.performance;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final e getCrashlytics() {
        return this.crashlytics;
    }

    /* renamed from: c, reason: from getter */
    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @d5.d
    public final f d(@d5.d e performance, @d5.d e crashlytics, double sessionSamplingRate) {
        kotlin.jvm.internal.l0.p(performance, ProtectedSandApp.s("᪡"));
        kotlin.jvm.internal.l0.p(crashlytics, ProtectedSandApp.s("᪢"));
        return new f(performance, crashlytics, sessionSamplingRate);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return this.performance == fVar.performance && this.crashlytics == fVar.crashlytics && kotlin.jvm.internal.l0.g(Double.valueOf(this.sessionSamplingRate), Double.valueOf(fVar.sessionSamplingRate));
    }

    @d5.d
    public final e f() {
        return this.crashlytics;
    }

    @d5.d
    public final e g() {
        return this.performance;
    }

    public final double h() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        return Double.hashCode(this.sessionSamplingRate) + ((this.crashlytics.hashCode() + (this.performance.hashCode() * 31)) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("᪣") + this.performance + ProtectedSandApp.s("᪤") + this.crashlytics + ProtectedSandApp.s("᪥") + this.sessionSamplingRate + ')';
    }

    public f(@d5.d e eVar, @d5.d e eVar2, double d6) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("\u1a9f"));
        kotlin.jvm.internal.l0.p(eVar2, ProtectedSandApp.s("᪠"));
        this.performance = eVar;
        this.crashlytics = eVar2;
        this.sessionSamplingRate = d6;
    }

    public /* synthetic */ f(e eVar, e eVar2, double d6, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? e.COLLECTION_SDK_NOT_INSTALLED : eVar, (i5 & 2) != 0 ? e.COLLECTION_SDK_NOT_INSTALLED : eVar2, (i5 & 4) != 0 ? 1.0d : d6);
    }
}
