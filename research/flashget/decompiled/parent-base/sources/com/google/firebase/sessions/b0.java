package com.google.firebase.sessions;

import androidx.collection.y0;
import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionGenerator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/b0;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "a", "()Ljava/lang/String;", "b", "c", "()I", "d", "()J", "e", "(Ljava/lang/String;Ljava/lang/String;IJ)Lcom/google/firebase/sessions/b0;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "g", "I", "i", "J", "j", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String firstSessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sessionIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long sessionStartTimestampUs;

    public b0(@fg.l String str, @fg.l String str2, int i4, long j4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("҂\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("҃\u0001"));
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i4;
        this.sessionStartTimestampUs = j4;
    }

    public static /* synthetic */ b0 f(b0 b0Var, String str, String str2, int i4, long j4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = b0Var.sessionId;
        }
        if ((i5 & 2) != 0) {
            str2 = b0Var.firstSessionId;
        }
        String str3 = str2;
        if ((i5 & 4) != 0) {
            i4 = b0Var.sessionIndex;
        }
        int i6 = i4;
        if ((i5 & 8) != 0) {
            j4 = b0Var.sessionStartTimestampUs;
        }
        return b0Var.e(str, str3, i6, j4);
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
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    @fg.l
    public final b0 e(@fg.l String sessionId, @fg.l String firstSessionId, int sessionIndex, long sessionStartTimestampUs) {
        kotlin.jvm.internal.l0.p(sessionId, ProtectedSandApp.s("҂\u0001"));
        kotlin.jvm.internal.l0.p(firstSessionId, ProtectedSandApp.s("҃\u0001"));
        return new b0(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) other;
        return kotlin.jvm.internal.l0.g(this.sessionId, b0Var.sessionId) && kotlin.jvm.internal.l0.g(this.firstSessionId, b0Var.firstSessionId) && this.sessionIndex == b0Var.sessionIndex && this.sessionStartTimestampUs == b0Var.sessionStartTimestampUs;
    }

    @fg.l
    public final String g() {
        return this.firstSessionId;
    }

    @fg.l
    public final String h() {
        return this.sessionId;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionStartTimestampUs) + w1.a(this.sessionIndex, androidx.compose.foundation.text.modifiers.n.a(this.firstSessionId, this.sessionId.hashCode() * 31, 31), 31);
    }

    public final int i() {
        return this.sessionIndex;
    }

    public final long j() {
        return this.sessionStartTimestampUs;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("҄\u0001"));
        sb.append(this.sessionId);
        sb.append(ProtectedSandApp.s("҅\u0001"));
        sb.append(this.firstSessionId);
        sb.append(ProtectedSandApp.s("҆\u0001"));
        sb.append(this.sessionIndex);
        sb.append(ProtectedSandApp.s("҇\u0001"));
        return y0.a(sb, this.sessionStartTimestampUs, ')');
    }
}
