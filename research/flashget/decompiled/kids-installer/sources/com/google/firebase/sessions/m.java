package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/m;", "", "", "a", "sessionId", "b", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String sessionId;

    public m(@d5.e String str) {
        this.sessionId = str;
    }

    public static m c(m mVar, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = mVar.sessionId;
        }
        mVar.getClass();
        return new m(str);
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @d5.d
    public final m b(@d5.e String sessionId) {
        return new m(sessionId);
    }

    @d5.e
    public final String d() {
        return this.sessionId;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof m) && kotlin.jvm.internal.l0.g(this.sessionId, ((m) other).sessionId);
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("᫈")), this.sessionId, ')');
    }
}
