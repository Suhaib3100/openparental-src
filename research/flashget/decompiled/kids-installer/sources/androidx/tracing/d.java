package androidx.tracing;

import android.os.Trace;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: TraceApi29Impl.java */
@x0(29)
/* loaded from: classes.dex */
final class d {
    private d() {
    }

    public static void a(@o0 String str, int i5) {
        Trace.beginAsyncSection(str, i5);
    }

    public static void b(@o0 String str, int i5) {
        Trace.endAsyncSection(str, i5);
    }

    public static void c(@o0 String str, int i5) {
        Trace.setCounter(str, i5);
    }
}
