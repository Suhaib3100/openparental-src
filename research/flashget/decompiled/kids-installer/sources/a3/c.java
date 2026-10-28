package a3;

import android.os.Trace;

/* compiled from: FirebaseTrace.java */
/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static void a() {
        Trace.endSection();
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }
}
