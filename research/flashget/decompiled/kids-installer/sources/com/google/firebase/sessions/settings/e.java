package com.google.firebase.sessions.settings;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\nR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b!\u0010\nR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000e¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/settings/e;", "", "", "a", "()Ljava/lang/Boolean;", "", "b", "()Ljava/lang/Double;", "", "c", "()Ljava/lang/Integer;", "d", "", "e", "()Ljava/lang/Long;", "sessionEnabled", "sessionSamplingRate", "sessionRestartTimeout", "cacheDuration", "cacheUpdatedTime", "f", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/e;", "", "toString", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "j", "Ljava/lang/Double;", "l", "Ljava/lang/Integer;", "k", "h", "Ljava/lang/Long;", "i", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Boolean sessionEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Double sessionSamplingRate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Integer sessionRestartTimeout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Integer cacheDuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Long cacheUpdatedTime;

    public e(@d5.e Boolean bool, @d5.e Double d6, @d5.e Integer num, @d5.e Integer num2, @d5.e Long l5) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d6;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l5;
    }

    public static /* synthetic */ e g(e eVar, Boolean bool, Double d6, Integer num, Integer num2, Long l5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bool = eVar.sessionEnabled;
        }
        if ((i5 & 2) != 0) {
            d6 = eVar.sessionSamplingRate;
        }
        Double d7 = d6;
        if ((i5 & 4) != 0) {
            num = eVar.sessionRestartTimeout;
        }
        Integer num3 = num;
        if ((i5 & 8) != 0) {
            num2 = eVar.cacheDuration;
        }
        Integer num4 = num2;
        if ((i5 & 16) != 0) {
            l5 = eVar.cacheUpdatedTime;
        }
        return eVar.f(bool, d7, num3, num4, l5);
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @d5.e
    /* renamed from: c, reason: from getter */
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @d5.e
    /* renamed from: d, reason: from getter */
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @d5.e
    /* renamed from: e, reason: from getter */
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return l0.g(this.sessionEnabled, eVar.sessionEnabled) && l0.g(this.sessionSamplingRate, eVar.sessionSamplingRate) && l0.g(this.sessionRestartTimeout, eVar.sessionRestartTimeout) && l0.g(this.cacheDuration, eVar.cacheDuration) && l0.g(this.cacheUpdatedTime, eVar.cacheUpdatedTime);
    }

    @d5.d
    public final e f(@d5.e Boolean sessionEnabled, @d5.e Double sessionSamplingRate, @d5.e Integer sessionRestartTimeout, @d5.e Integer cacheDuration, @d5.e Long cacheUpdatedTime) {
        return new e(sessionEnabled, sessionSamplingRate, sessionRestartTimeout, cacheDuration, cacheUpdatedTime);
    }

    @d5.e
    public final Integer h() {
        return this.cacheDuration;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d6 = this.sessionSamplingRate;
        int hashCode2 = (hashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.cacheUpdatedTime;
        return hashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    @d5.e
    public final Long i() {
        return this.cacheUpdatedTime;
    }

    @d5.e
    public final Boolean j() {
        return this.sessionEnabled;
    }

    @d5.e
    public final Integer k() {
        return this.sessionRestartTimeout;
    }

    @d5.e
    public final Double l() {
        return this.sessionSamplingRate;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("᫉") + this.sessionEnabled + ProtectedSandApp.s("᫊") + this.sessionSamplingRate + ProtectedSandApp.s("᫋") + this.sessionRestartTimeout + ProtectedSandApp.s("ᫌ") + this.cacheDuration + ProtectedSandApp.s("ᫍ") + this.cacheUpdatedTime + ')';
    }
}
