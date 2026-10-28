package com.google.firebase.sessions;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/sessions/m;", "", "", "sessionId", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)Lcom/google/firebase/sessions/m;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String sessionId;

    public m(@fg.m String str) {
        this.sessionId = str;
    }

    public static m c(m mVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = mVar.sessionId;
        }
        mVar.getClass();
        return new m(str);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @fg.l
    public final m b(@fg.m String sessionId) {
        return new m(sessionId);
    }

    @fg.m
    public final String d() {
        return this.sessionId;
    }

    public boolean equals(@fg.m Object other) {
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

    @fg.l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("Ԕ\u0001")), this.sessionId, ')');
    }
}
