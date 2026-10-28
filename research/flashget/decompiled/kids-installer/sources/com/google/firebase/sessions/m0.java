package com.google.firebase.sessions;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;

/* compiled from: TimeProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/m0;", "Lcom/google/firebase/sessions/l0;", "Lkotlin/time/e;", "a", "()J", "", "b", "J", "US_PER_MILLIS", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class m0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final m0 f18661a = new m0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long US_PER_MILLIS = 1000;

    private m0() {
    }

    @Override // com.google.firebase.sessions.l0
    public long a() {
        Duration.a aVar = Duration.f27196p;
        return kotlin.time.g.n0(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }

    @Override // com.google.firebase.sessions.l0
    public long b() {
        return System.currentTimeMillis() * US_PER_MILLIS;
    }
}
