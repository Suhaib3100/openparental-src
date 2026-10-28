package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionGenerator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/sessions/a0;", "", "", "a", "b", "", "c", "", "d", "sessionId", "firstSessionId", "sessionIndex", "sessionStartTimestampUs", "e", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "g", "I", "i", "()I", "J", "j", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String firstSessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sessionIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long sessionStartTimestampUs;

    public a0(@d5.d String str, @d5.d String str2, int i5, long j5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("ᨷ"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("ᨸ"));
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i5;
        this.sessionStartTimestampUs = j5;
    }

    public static /* synthetic */ a0 f(a0 a0Var, String str, String str2, int i5, long j5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = a0Var.sessionId;
        }
        if ((i6 & 2) != 0) {
            str2 = a0Var.firstSessionId;
        }
        String str3 = str2;
        if ((i6 & 4) != 0) {
            i5 = a0Var.sessionIndex;
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            j5 = a0Var.sessionStartTimestampUs;
        }
        return a0Var.e(str, str3, i7, j5);
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
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    @d5.d
    public final a0 e(@d5.d String sessionId, @d5.d String firstSessionId, int sessionIndex, long sessionStartTimestampUs) {
        kotlin.jvm.internal.l0.p(sessionId, ProtectedSandApp.s("ᨹ"));
        kotlin.jvm.internal.l0.p(firstSessionId, ProtectedSandApp.s("ᨺ"));
        return new a0(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) other;
        return kotlin.jvm.internal.l0.g(this.sessionId, a0Var.sessionId) && kotlin.jvm.internal.l0.g(this.firstSessionId, a0Var.firstSessionId) && this.sessionIndex == a0Var.sessionIndex && this.sessionStartTimestampUs == a0Var.sessionStartTimestampUs;
    }

    @d5.d
    public final String g() {
        return this.firstSessionId;
    }

    @d5.d
    public final String h() {
        return this.sessionId;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionStartTimestampUs) + ((Integer.hashCode(this.sessionIndex) + ((this.firstSessionId.hashCode() + (this.sessionId.hashCode() * 31)) * 31)) * 31);
    }

    public final int i() {
        return this.sessionIndex;
    }

    public final long j() {
        return this.sessionStartTimestampUs;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("ᨻ") + this.sessionId + ProtectedSandApp.s("ᨼ") + this.firstSessionId + ProtectedSandApp.s("ᨽ") + this.sessionIndex + ProtectedSandApp.s("ᨾ") + this.sessionStartTimestampUs + ')';
    }
}
