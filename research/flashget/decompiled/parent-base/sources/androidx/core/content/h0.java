package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.o0;

/* compiled from: SharedPreferencesCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class h0 {

    /* compiled from: SharedPreferencesCompat.java */
    @Deprecated
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static a f25984b;

        /* renamed from: a, reason: collision with root package name */
        private final C0411a f25985a = new C0411a();

        /* compiled from: SharedPreferencesCompat.java */
        /* renamed from: androidx.core.content.h0$a$a, reason: collision with other inner class name */
        private static class C0411a {
            C0411a() {
            }

            public void a(@o0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        @Deprecated
        public static a b() {
            if (f25984b == null) {
                f25984b = new a();
            }
            return f25984b;
        }

        @Deprecated
        public void a(@o0 SharedPreferences.Editor editor) {
            this.f25985a.a(editor);
        }
    }

    private h0() {
    }
}
