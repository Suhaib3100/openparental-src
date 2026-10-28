package hb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Clock.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lhb/g;", "", "", "posixTimeMs", "timeSinceLastNtpSyncMs", "<init>", "(JLjava/lang/Long;)V", "a", "()J", "b", "()Ljava/lang/Long;", "c", "(JLjava/lang/Long;)Lhb/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "e", "Ljava/lang/Long;", "f", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long posixTimeMs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final Long timeSinceLastNtpSyncMs;

    public g(long j4, @m Long l4) {
        this.posixTimeMs = j4;
        this.timeSinceLastNtpSyncMs = l4;
    }

    public static g d(g gVar, long j4, Long l4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = gVar.posixTimeMs;
        }
        if ((i4 & 2) != 0) {
            l4 = gVar.timeSinceLastNtpSyncMs;
        }
        gVar.getClass();
        return new g(j4, l4);
    }

    /* renamed from: a, reason: from getter */
    public final long getPosixTimeMs() {
        return this.posixTimeMs;
    }

    @m
    /* renamed from: b, reason: from getter */
    public final Long getTimeSinceLastNtpSyncMs() {
        return this.timeSinceLastNtpSyncMs;
    }

    @l
    public final g c(long posixTimeMs, @m Long timeSinceLastNtpSyncMs) {
        return new g(posixTimeMs, timeSinceLastNtpSyncMs);
    }

    public final long e() {
        return this.posixTimeMs;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return this.posixTimeMs == gVar.posixTimeMs && l0.g(this.timeSinceLastNtpSyncMs, gVar.timeSinceLastNtpSyncMs);
    }

    @m
    public final Long f() {
        return this.timeSinceLastNtpSyncMs;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.posixTimeMs) * 31;
        Long l4 = this.timeSinceLastNtpSyncMs;
        return hashCode + (l4 == null ? 0 : l4.hashCode());
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("㠕\u0001") + this.posixTimeMs + ProtectedSandApp.s("㠖\u0001") + this.timeSinceLastNtpSyncMs + ProtectedSandApp.s("㠗\u0001");
    }
}
