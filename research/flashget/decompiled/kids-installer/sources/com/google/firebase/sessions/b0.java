package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@j2.a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/b0;", "", "Lcom/google/firebase/sessions/j;", "a", "Lcom/google/firebase/sessions/g0;", "b", "Lcom/google/firebase/sessions/b;", "c", "eventType", "sessionData", "applicationInfo", "d", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/google/firebase/sessions/j;", "g", "()Lcom/google/firebase/sessions/j;", "Lcom/google/firebase/sessions/g0;", "h", "()Lcom/google/firebase/sessions/g0;", "Lcom/google/firebase/sessions/b;", "f", "()Lcom/google/firebase/sessions/b;", "<init>", "(Lcom/google/firebase/sessions/j;Lcom/google/firebase/sessions/g0;Lcom/google/firebase/sessions/b;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final j eventType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0 sessionData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final b applicationInfo;

    public b0(@d5.d j jVar, @d5.d g0 g0Var, @d5.d b bVar) {
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("ᩩ"));
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("ᩪ"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("ᩫ"));
        this.eventType = jVar;
        this.sessionData = g0Var;
        this.applicationInfo = bVar;
    }

    public static /* synthetic */ b0 e(b0 b0Var, j jVar, g0 g0Var, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            jVar = b0Var.eventType;
        }
        if ((i5 & 2) != 0) {
            g0Var = b0Var.sessionData;
        }
        if ((i5 & 4) != 0) {
            bVar = b0Var.applicationInfo;
        }
        return b0Var.d(jVar, g0Var, bVar);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final j getEventType() {
        return this.eventType;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final g0 getSessionData() {
        return this.sessionData;
    }

    @d5.d
    /* renamed from: c, reason: from getter */
    public final b getApplicationInfo() {
        return this.applicationInfo;
    }

    @d5.d
    public final b0 d(@d5.d j eventType, @d5.d g0 sessionData, @d5.d b applicationInfo) {
        kotlin.jvm.internal.l0.p(eventType, ProtectedSandApp.s("ᩬ"));
        kotlin.jvm.internal.l0.p(sessionData, ProtectedSandApp.s("ᩭ"));
        kotlin.jvm.internal.l0.p(applicationInfo, ProtectedSandApp.s("ᩮ"));
        return new b0(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) other;
        return this.eventType == b0Var.eventType && kotlin.jvm.internal.l0.g(this.sessionData, b0Var.sessionData) && kotlin.jvm.internal.l0.g(this.applicationInfo, b0Var.applicationInfo);
    }

    @d5.d
    public final b f() {
        return this.applicationInfo;
    }

    @d5.d
    public final j g() {
        return this.eventType;
    }

    @d5.d
    public final g0 h() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.applicationInfo.hashCode() + ((this.sessionData.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("ᩯ") + this.eventType + ProtectedSandApp.s("ᩰ") + this.sessionData + ProtectedSandApp.s("ᩱ") + this.applicationInfo + ')';
    }
}
