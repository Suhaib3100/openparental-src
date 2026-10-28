package androidx.tracing;

import android.os.Trace;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: TraceApi29Impl.java */
@x0(29)
/* loaded from: classes3.dex */
final class d {
    private d() {
    }

    public static void a(@o0 String str, int i4) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void b(@o0 String str, int i4) {
        Trace.endAsyncSection(str, i4);
    }

    @u
    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(@o0 String str, int i4) {
        Trace.setCounter(str, i4);
    }
}
