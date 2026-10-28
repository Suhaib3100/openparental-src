package androidx.core.text;

import android.text.TextUtils;
import java.nio.CharBuffer;
import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f26717a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26718b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f26719c;

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f26720d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f26721e;

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f26722f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f26723g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f26724h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f26725i = 2;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f26726b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26727a;

        private a(boolean z4) {
            this.f26727a = z4;
        }

        @Override // androidx.core.text.f0.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z4 = false;
            while (i4 < i6) {
                int a5 = f0.a(Character.getDirectionality(charSequence.charAt(i4)));
                if (a5 != 0) {
                    if (a5 != 1) {
                        continue;
                        i4++;
                        z4 = z4;
                    } else if (!this.f26727a) {
                        return 1;
                    }
                } else if (this.f26727a) {
                    return 0;
                }
                z4 = true;
                i4++;
                z4 = z4;
            }
            if (z4) {
                return this.f26727a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f26728a = new b();

        private b() {
        }

        @Override // androidx.core.text.f0.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int i7 = 2;
            while (i4 < i6 && i7 == 2) {
                i7 = f0.b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return i7;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private interface c {
        int a(CharSequence charSequence, int i4, int i5);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static abstract class d implements e0 {

        /* renamed from: a, reason: collision with root package name */
        private final c f26729a;

        d(c cVar) {
            this.f26729a = cVar;
        }

        private boolean d(CharSequence charSequence, int i4, int i5) {
            int a5 = this.f26729a.a(charSequence, i4, i5);
            if (a5 == 0) {
                return true;
            }
            if (a5 != 1) {
                return c();
            }
            return false;
        }

        @Override // androidx.core.text.e0
        public boolean a(CharSequence charSequence, int i4, int i5) {
            if (charSequence == null || i4 < 0 || i5 < 0 || charSequence.length() - i5 < i4) {
                throw new IllegalArgumentException();
            }
            return this.f26729a == null ? c() : d(charSequence, i4, i5);
        }

        @Override // androidx.core.text.e0
        public boolean b(char[] cArr, int i4, int i5) {
            return a(CharBuffer.wrap(cArr), i4, i5);
        }

        protected abstract boolean c();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26730b;

        e(c cVar, boolean z4) {
            super(cVar);
            this.f26730b = z4;
        }

        @Override // androidx.core.text.f0.d
        protected boolean c() {
            return this.f26730b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f26731b = new f(null);

        f() {
            super(null);
        }

        @Override // androidx.core.text.f0.d
        protected boolean c() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f26728a;
        f26719c = new e(bVar, false);
        f26720d = new e(bVar, true);
        f26721e = new e(a.f26726b, false);
        f26722f = f.f26731b;
    }

    private f0() {
    }

    static int a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
