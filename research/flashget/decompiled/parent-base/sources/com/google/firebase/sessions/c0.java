package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@t9.a
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/c0;", "", "Lcom/google/firebase/sessions/j;", "eventType", "Lcom/google/firebase/sessions/h0;", "sessionData", "Lcom/google/firebase/sessions/b;", "applicationInfo", "<init>", "(Lcom/google/firebase/sessions/j;Lcom/google/firebase/sessions/h0;Lcom/google/firebase/sessions/b;)V", "a", "()Lcom/google/firebase/sessions/j;", "b", "()Lcom/google/firebase/sessions/h0;", "c", "()Lcom/google/firebase/sessions/b;", "d", "(Lcom/google/firebase/sessions/j;Lcom/google/firebase/sessions/h0;Lcom/google/firebase/sessions/b;)Lcom/google/firebase/sessions/c0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/sessions/j;", "g", "Lcom/google/firebase/sessions/h0;", "h", "Lcom/google/firebase/sessions/b;", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j eventType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 sessionData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b applicationInfo;

    public c0(@fg.l j jVar, @fg.l h0 h0Var, @fg.l b bVar) {
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("ұ\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("Ҳ\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("ҳ\u0001"));
        this.eventType = jVar;
        this.sessionData = h0Var;
        this.applicationInfo = bVar;
    }

    public static /* synthetic */ c0 e(c0 c0Var, j jVar, h0 h0Var, b bVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            jVar = c0Var.eventType;
        }
        if ((i4 & 2) != 0) {
            h0Var = c0Var.sessionData;
        }
        if ((i4 & 4) != 0) {
            bVar = c0Var.applicationInfo;
        }
        return c0Var.d(jVar, h0Var, bVar);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final j getEventType() {
        return this.eventType;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final h0 getSessionData() {
        return this.sessionData;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final b getApplicationInfo() {
        return this.applicationInfo;
    }

    @fg.l
    public final c0 d(@fg.l j eventType, @fg.l h0 sessionData, @fg.l b applicationInfo) {
        kotlin.jvm.internal.l0.p(eventType, ProtectedSandApp.s("ұ\u0001"));
        kotlin.jvm.internal.l0.p(sessionData, ProtectedSandApp.s("Ҳ\u0001"));
        kotlin.jvm.internal.l0.p(applicationInfo, ProtectedSandApp.s("ҳ\u0001"));
        return new c0(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) other;
        return this.eventType == c0Var.eventType && kotlin.jvm.internal.l0.g(this.sessionData, c0Var.sessionData) && kotlin.jvm.internal.l0.g(this.applicationInfo, c0Var.applicationInfo);
    }

    @fg.l
    public final b f() {
        return this.applicationInfo;
    }

    @fg.l
    public final j g() {
        return this.eventType;
    }

    @fg.l
    public final h0 h() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.applicationInfo.hashCode() + ((this.sessionData.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("Ҵ\u0001") + this.eventType + ProtectedSandApp.s("ҵ\u0001") + this.sessionData + ProtectedSandApp.s("Ҷ\u0001") + this.applicationInfo + ')';
    }
}
