package com.google.firebase.sessions.api;

import c1.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SessionSubscriber.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/sessions/api/b;", "", "Lcom/google/firebase/sessions/api/b$b;", "sessionDetails", "Lkotlin/m2;", "c", "", "a", "()Z", "isDataCollectionEnabled", "Lcom/google/firebase/sessions/api/b$a;", "b", "()Lcom/google/firebase/sessions/api/b$a;", "sessionSubscriberName", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: SessionSubscriber.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/api/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* compiled from: SessionSubscriber.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/api/b$b;", "", "", "a", "sessionId", "b", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.api.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0231b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final String sessionId;

        public C0231b(@d String str) {
            l0.p(str, ProtectedSandApp.s("ᩦ"));
            this.sessionId = str;
        }

        public static /* synthetic */ C0231b c(C0231b c0231b, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = c0231b.sessionId;
            }
            return c0231b.b(str);
        }

        @d
        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @d
        public final C0231b b(@d String sessionId) {
            l0.p(sessionId, ProtectedSandApp.s("ᩧ"));
            return new C0231b(sessionId);
        }

        @d
        public final String d() {
            return this.sessionId;
        }

        public boolean equals(@e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C0231b) && l0.g(this.sessionId, ((C0231b) other).sessionId);
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @d
        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("ᩨ")), this.sessionId, ')');
        }
    }

    boolean a();

    @d
    a b();

    void c(@d C0231b c0231b);
}
