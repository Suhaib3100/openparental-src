package com.google.firebase.sessions;

import androidx.compose.foundation.layout.f3;
import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b+\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b,\u0010\u0010¨\u0006-"}, d2 = {"Lcom/google/firebase/sessions/h0;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "eventTimestampUs", "Lcom/google/firebase/sessions/f;", "dataCollectionStatus", "firebaseInstallationId", "firebaseAuthenticationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/f;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "c", "()I", "d", "()J", "e", "()Lcom/google/firebase/sessions/f;", "f", "g", "h", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/f;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/sessions/h0;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "o", "n", "I", "p", "J", "k", "Lcom/google/firebase/sessions/f;", "j", "m", "l", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String firstSessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sessionIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long eventTimestampUs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f dataCollectionStatus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String firebaseInstallationId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String firebaseAuthenticationToken;

    public h0(@fg.l String str, @fg.l String str2, int i4, long j4, @fg.l f fVar, @fg.l String str3, @fg.l String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("Ӧ\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("ӧ\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("Ө\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("ө\u0001"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("Ӫ\u0001"));
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i4;
        this.eventTimestampUs = j4;
        this.dataCollectionStatus = fVar;
        this.firebaseInstallationId = str3;
        this.firebaseAuthenticationToken = str4;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* renamed from: c, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* renamed from: d, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final f getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) other;
        return kotlin.jvm.internal.l0.g(this.sessionId, h0Var.sessionId) && kotlin.jvm.internal.l0.g(this.firstSessionId, h0Var.firstSessionId) && this.sessionIndex == h0Var.sessionIndex && this.eventTimestampUs == h0Var.eventTimestampUs && kotlin.jvm.internal.l0.g(this.dataCollectionStatus, h0Var.dataCollectionStatus) && kotlin.jvm.internal.l0.g(this.firebaseInstallationId, h0Var.firebaseInstallationId) && kotlin.jvm.internal.l0.g(this.firebaseAuthenticationToken, h0Var.firebaseAuthenticationToken);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @fg.l
    public final h0 h(@fg.l String sessionId, @fg.l String firstSessionId, int sessionIndex, long eventTimestampUs, @fg.l f dataCollectionStatus, @fg.l String firebaseInstallationId, @fg.l String firebaseAuthenticationToken) {
        kotlin.jvm.internal.l0.p(sessionId, ProtectedSandApp.s("Ӧ\u0001"));
        kotlin.jvm.internal.l0.p(firstSessionId, ProtectedSandApp.s("ӧ\u0001"));
        kotlin.jvm.internal.l0.p(dataCollectionStatus, ProtectedSandApp.s("Ө\u0001"));
        kotlin.jvm.internal.l0.p(firebaseInstallationId, ProtectedSandApp.s("ө\u0001"));
        kotlin.jvm.internal.l0.p(firebaseAuthenticationToken, ProtectedSandApp.s("Ӫ\u0001"));
        return new h0(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public int hashCode() {
        return this.firebaseAuthenticationToken.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.firebaseInstallationId, (this.dataCollectionStatus.hashCode() + i0.k.a(this.eventTimestampUs, w1.a(this.sessionIndex, androidx.compose.foundation.text.modifiers.n.a(this.firstSessionId, this.sessionId.hashCode() * 31, 31), 31), 31)) * 31, 31);
    }

    @fg.l
    public final f j() {
        return this.dataCollectionStatus;
    }

    public final long k() {
        return this.eventTimestampUs;
    }

    @fg.l
    public final String l() {
        return this.firebaseAuthenticationToken;
    }

    @fg.l
    public final String m() {
        return this.firebaseInstallationId;
    }

    @fg.l
    public final String n() {
        return this.firstSessionId;
    }

    @fg.l
    public final String o() {
        return this.sessionId;
    }

    public final int p() {
        return this.sessionIndex;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ӫ\u0001"));
        sb.append(this.sessionId);
        sb.append(ProtectedSandApp.s("Ӭ\u0001"));
        sb.append(this.firstSessionId);
        sb.append(ProtectedSandApp.s("ӭ\u0001"));
        sb.append(this.sessionIndex);
        sb.append(ProtectedSandApp.s("Ӯ\u0001"));
        sb.append(this.eventTimestampUs);
        sb.append(ProtectedSandApp.s("ӯ\u0001"));
        sb.append(this.dataCollectionStatus);
        sb.append(ProtectedSandApp.s("Ӱ\u0001"));
        sb.append(this.firebaseInstallationId);
        sb.append(ProtectedSandApp.s("ӱ\u0001"));
        return f3.a(sb, this.firebaseAuthenticationToken, ')');
    }
}
