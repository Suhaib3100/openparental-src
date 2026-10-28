package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006("}, d2 = {"Lcom/google/firebase/sessions/g0;", "", "", "a", "b", "", "c", "", "d", "Lcom/google/firebase/sessions/f;", "e", "f", "sessionId", "firstSessionId", "sessionIndex", "eventTimestampUs", "dataCollectionStatus", "firebaseInstallationId", "g", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "l", "I", "n", "()I", "J", "j", "()J", "Lcom/google/firebase/sessions/f;", "i", "()Lcom/google/firebase/sessions/f;", "k", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/f;Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String firstSessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sessionIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long eventTimestampUs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final f dataCollectionStatus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String firebaseInstallationId;

    public g0(@d5.d String str, @d5.d String str2, int i5, long j5, @d5.d f fVar, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("᪦"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("ᪧ"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("᪨"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("᪩"));
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i5;
        this.eventTimestampUs = j5;
        this.dataCollectionStatus = fVar;
        this.firebaseInstallationId = str3;
    }

    public static /* synthetic */ g0 h(g0 g0Var, String str, String str2, int i5, long j5, f fVar, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = g0Var.sessionId;
        }
        if ((i6 & 2) != 0) {
            str2 = g0Var.firstSessionId;
        }
        String str4 = str2;
        if ((i6 & 4) != 0) {
            i5 = g0Var.sessionIndex;
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            j5 = g0Var.eventTimestampUs;
        }
        long j6 = j5;
        if ((i6 & 16) != 0) {
            fVar = g0Var.dataCollectionStatus;
        }
        f fVar2 = fVar;
        if ((i6 & 32) != 0) {
            str3 = g0Var.firebaseInstallationId;
        }
        return g0Var.g(str, str4, i7, j6, fVar2, str3);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @d5.d
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

    @d5.d
    /* renamed from: e, reason: from getter */
    public final f getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) other;
        return kotlin.jvm.internal.l0.g(this.sessionId, g0Var.sessionId) && kotlin.jvm.internal.l0.g(this.firstSessionId, g0Var.firstSessionId) && this.sessionIndex == g0Var.sessionIndex && this.eventTimestampUs == g0Var.eventTimestampUs && kotlin.jvm.internal.l0.g(this.dataCollectionStatus, g0Var.dataCollectionStatus) && kotlin.jvm.internal.l0.g(this.firebaseInstallationId, g0Var.firebaseInstallationId);
    }

    @d5.d
    /* renamed from: f, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @d5.d
    public final g0 g(@d5.d String sessionId, @d5.d String firstSessionId, int sessionIndex, long eventTimestampUs, @d5.d f dataCollectionStatus, @d5.d String firebaseInstallationId) {
        kotlin.jvm.internal.l0.p(sessionId, ProtectedSandApp.s("᪪"));
        kotlin.jvm.internal.l0.p(firstSessionId, ProtectedSandApp.s("᪫"));
        kotlin.jvm.internal.l0.p(dataCollectionStatus, ProtectedSandApp.s("᪬"));
        kotlin.jvm.internal.l0.p(firebaseInstallationId, ProtectedSandApp.s("᪭"));
        return new g0(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId);
    }

    public int hashCode() {
        return this.firebaseInstallationId.hashCode() + ((this.dataCollectionStatus.hashCode() + ((Long.hashCode(this.eventTimestampUs) + ((Integer.hashCode(this.sessionIndex) + ((this.firstSessionId.hashCode() + (this.sessionId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @d5.d
    public final f i() {
        return this.dataCollectionStatus;
    }

    public final long j() {
        return this.eventTimestampUs;
    }

    @d5.d
    public final String k() {
        return this.firebaseInstallationId;
    }

    @d5.d
    public final String l() {
        return this.firstSessionId;
    }

    @d5.d
    public final String m() {
        return this.sessionId;
    }

    public final int n() {
        return this.sessionIndex;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u1aae"));
        sb.append(this.sessionId);
        sb.append(ProtectedSandApp.s("\u1aaf"));
        sb.append(this.firstSessionId);
        sb.append(ProtectedSandApp.s("᪰"));
        sb.append(this.sessionIndex);
        sb.append(ProtectedSandApp.s("᪱"));
        sb.append(this.eventTimestampUs);
        sb.append(ProtectedSandApp.s("᪲"));
        sb.append(this.dataCollectionStatus);
        sb.append(ProtectedSandApp.s("᪳"));
        return c1.c.a(sb, this.firebaseInstallationId, ')');
    }

    public /* synthetic */ g0(String str, String str2, int i5, long j5, f fVar, String str3, int i6, kotlin.jvm.internal.w wVar) {
        this(str, str2, i5, j5, (i6 & 16) != 0 ? new f(null, null, com.google.firebase.remoteconfig.p.f18289o, 7, null) : fVar, (i6 & 32) != 0 ? "" : str3);
    }
}
