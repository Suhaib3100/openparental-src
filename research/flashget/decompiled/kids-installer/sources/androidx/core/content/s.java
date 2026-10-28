package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.o0;

/* compiled from: SharedPreferencesCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class s {

    /* compiled from: SharedPreferencesCompat.java */
    @Deprecated
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static a f4674b;

        /* renamed from: a, reason: collision with root package name */
        private final C0036a f4675a = new C0036a();

        /* compiled from: SharedPreferencesCompat.java */
        /* renamed from: androidx.core.content.s$a$a, reason: collision with other inner class name */
        private static class C0036a {
            C0036a() {
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
            if (f4674b == null) {
                f4674b = new a();
            }
            return f4674b;
        }

        @Deprecated
        public void a(@o0 SharedPreferences.Editor editor) {
            this.f4675a.a(editor);
        }
    }

    private s() {
    }
}
