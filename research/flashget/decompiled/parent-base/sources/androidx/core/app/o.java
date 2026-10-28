package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.c1;
import androidx.core.os.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: GrammaticalInflectionManagerCompat.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25851a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f25852b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25853c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f25854d = 3;

    /* compiled from: GrammaticalInflectionManagerCompat.java */
    @androidx.annotation.x0(34)
    static class a {
        private a() {
        }

        static int a(Context context) {
            return b(context).getApplicationGrammaticalGender();
        }

        private static GrammaticalInflectionManager b(Context context) {
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }

        static void c(Context context, int i4) {
            b(context).setRequestedApplicationGrammaticalGender(i4);
        }
    }

    /* compiled from: GrammaticalInflectionManagerCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private o() {
    }

    @androidx.annotation.d
    @androidx.annotation.s0(markerClass = {b.InterfaceC0422b.class})
    public static int a(@androidx.annotation.o0 Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(context);
        }
        return 0;
    }

    @androidx.annotation.d
    @androidx.annotation.s0(markerClass = {b.InterfaceC0422b.class})
    public static void b(@androidx.annotation.o0 Context context, int i4) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.c(context, i4);
        }
    }
}
