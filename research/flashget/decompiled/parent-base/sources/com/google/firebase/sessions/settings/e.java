package com.google.firebase.sessions.settings;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b&\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lcom/google/firebase/sessions/settings/e;", "", "", "sessionEnabled", "", "sessionSamplingRate", "", "sessionRestartTimeout", "cacheDuration", "", "cacheUpdatedTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "a", "()Ljava/lang/Boolean;", "b", "()Ljava/lang/Double;", "c", "()Ljava/lang/Integer;", "d", "e", "()Ljava/lang/Long;", "f", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "j", "Ljava/lang/Double;", "l", "Ljava/lang/Integer;", "k", "h", "Ljava/lang/Long;", "i", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final Boolean sessionEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final Double sessionSamplingRate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final Integer sessionRestartTimeout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final Integer cacheDuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final Long cacheUpdatedTime;

    public e(@m Boolean bool, @m Double d5, @m Integer num, @m Integer num2, @m Long l4) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d5;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l4;
    }

    public static e g(e eVar, Boolean bool, Double d5, Integer num, Integer num2, Long l4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = eVar.sessionEnabled;
        }
        if ((i4 & 2) != 0) {
            d5 = eVar.sessionSamplingRate;
        }
        Double d6 = d5;
        if ((i4 & 4) != 0) {
            num = eVar.sessionRestartTimeout;
        }
        Integer num3 = num;
        if ((i4 & 8) != 0) {
            num2 = eVar.cacheDuration;
        }
        Integer num4 = num2;
        if ((i4 & 16) != 0) {
            l4 = eVar.cacheUpdatedTime;
        }
        eVar.getClass();
        return new e(bool, d6, num3, num4, l4);
    }

    @m
    /* renamed from: a, reason: from getter */
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @m
    /* renamed from: b, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @m
    /* renamed from: c, reason: from getter */
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @m
    /* renamed from: d, reason: from getter */
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @m
    /* renamed from: e, reason: from getter */
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return l0.g(this.sessionEnabled, eVar.sessionEnabled) && l0.g(this.sessionSamplingRate, eVar.sessionSamplingRate) && l0.g(this.sessionRestartTimeout, eVar.sessionRestartTimeout) && l0.g(this.cacheDuration, eVar.cacheDuration) && l0.g(this.cacheUpdatedTime, eVar.cacheUpdatedTime);
    }

    @l
    public final e f(@m Boolean sessionEnabled, @m Double sessionSamplingRate, @m Integer sessionRestartTimeout, @m Integer cacheDuration, @m Long cacheUpdatedTime) {
        return new e(sessionEnabled, sessionSamplingRate, sessionRestartTimeout, cacheDuration, cacheUpdatedTime);
    }

    @m
    public final Integer h() {
        return this.cacheDuration;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d5 = this.sessionSamplingRate;
        int hashCode2 = (hashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.cacheUpdatedTime;
        return hashCode4 + (l4 != null ? l4.hashCode() : 0);
    }

    @m
    public final Long i() {
        return this.cacheUpdatedTime;
    }

    @m
    public final Boolean j() {
        return this.sessionEnabled;
    }

    @m
    public final Integer k() {
        return this.sessionRestartTimeout;
    }

    @m
    public final Double l() {
        return this.sessionSamplingRate;
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("Ն\u0001") + this.sessionEnabled + ProtectedSandApp.s("Շ\u0001") + this.sessionSamplingRate + ProtectedSandApp.s("Ո\u0001") + this.sessionRestartTimeout + ProtectedSandApp.s("Չ\u0001") + this.cacheDuration + ProtectedSandApp.s("Պ\u0001") + this.cacheUpdatedTime + ')';
    }
}
