package com.google.firebase.sessions;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.time.e;

/* compiled from: TimeProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/n0;", "Lcom/google/firebase/sessions/m0;", "<init>", "()V", "Lkotlin/time/e;", "a", "()J", "", "b", "J", "US_PER_MILLIS", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class n0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final n0 f60934a = new n0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long US_PER_MILLIS = 1000;

    private n0() {
    }

    @Override // com.google.firebase.sessions.m0
    public long a() {
        e.Companion companion = kotlin.time.e.INSTANCE;
        return kotlin.time.g.n0(SystemClock.elapsedRealtime(), kotlin.time.h.MILLISECONDS);
    }

    @Override // com.google.firebase.sessions.m0
    public long b() {
        return System.currentTimeMillis() * 1000;
    }
}
