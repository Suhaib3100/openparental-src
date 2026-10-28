package androidx.tracing;

import android.os.Trace;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: TraceApi18Impl.java */
@x0(18)
/* loaded from: classes3.dex */
final class c {
    private c() {
    }

    public static void a(@o0 String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
