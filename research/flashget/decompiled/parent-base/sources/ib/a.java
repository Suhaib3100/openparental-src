package ib;

import android.os.SystemClock;
import kotlin.Metadata;

/* compiled from: AndroidSystemClock.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lib/a;", "Lhb/c;", "<init>", "()V", "", "a", "()J", "f", "kronos-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a implements hb.c {
    @Override // hb.c
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // hb.c
    public long f() {
        return SystemClock.elapsedRealtime();
    }
}
