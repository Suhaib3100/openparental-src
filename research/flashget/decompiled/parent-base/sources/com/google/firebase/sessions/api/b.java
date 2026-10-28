package com.google.firebase.sessions.api;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SessionSubscriber.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\b\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/api/b;", "", "Lcom/google/firebase/sessions/api/b$b;", "sessionDetails", "Lkotlin/k2;", "c", "(Lcom/google/firebase/sessions/api/b$b;)V", "", "a", "()Z", "isDataCollectionEnabled", "Lcom/google/firebase/sessions/api/b$a;", "b", "()Lcom/google/firebase/sessions/api/b$a;", "sessionSubscriberName", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: SessionSubscriber.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/api/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* compiled from: SessionSubscriber.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/sessions/api/b$b;", "", "", "sessionId", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)Lcom/google/firebase/sessions/api/b$b;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.api.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0938b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String sessionId;

        public C0938b(@l String str) {
            l0.p(str, ProtectedSandApp.s("Ҁ\u0001"));
            this.sessionId = str;
        }

        public static /* synthetic */ C0938b c(C0938b c0938b, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = c0938b.sessionId;
            }
            return c0938b.b(str);
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @l
        public final C0938b b(@l String sessionId) {
            l0.p(sessionId, ProtectedSandApp.s("Ҁ\u0001"));
            return new C0938b(sessionId);
        }

        @l
        public final String d() {
            return this.sessionId;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C0938b) && l0.g(this.sessionId, ((C0938b) other).sessionId);
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @l
        public String toString() {
            return f3.a(new StringBuilder(ProtectedSandApp.s("ҁ\u0001")), this.sessionId, ')');
        }
    }

    boolean a();

    @l
    a b();

    void c(@l C0938b sessionDetails);
}
