package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f5143a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f5144b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f5145c;

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f5146d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f5147e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f5148f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f5149g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f5150h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f5151i = 2;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes3.dex */
    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f5152b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f5153a;

        private a(boolean z5) {
            this.f5153a = z5;
        }

        @Override // androidx.core.text.c0.c
        public int a(CharSequence charSequence, int i5, int i6) {
            int i7 = i6 + i5;
            boolean z5 = false;
            while (i5 < i7) {
                int a6 = c0.a(Character.getDirectionality(charSequence.charAt(i5)));
                if (a6 != 0) {
                    if (a6 != 1) {
                        continue;
                        i5++;
                        z5 = z5;
                    } else if (!this.f5153a) {
                        return 1;
                    }
                } else if (this.f5153a) {
                    return 0;
                }
                z5 = true;
                i5++;
                z5 = z5;
            }
            if (z5) {
                return this.f5153a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes3.dex */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f5154a = new b();

        private b() {
        }

        @Override // androidx.core.text.c0.c
        public int a(CharSequence charSequence, int i5, int i6) {
            int i7 = i6 + i5;
            int i8 = 2;
            while (i5 < i7 && i8 == 2) {
                i8 = c0.b(Character.getDirectionality(charSequence.charAt(i5)));
                i5++;
            }
            return i8;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private interface c {
        int a(CharSequence charSequence, int i5, int i6);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes3.dex */
    private static abstract class d implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final c f5155a;

        d(c cVar) {
            this.f5155a = cVar;
        }

        private boolean b(CharSequence charSequence, int i5, int i6) {
            int a6 = this.f5155a.a(charSequence, i5, i6);
            if (a6 == 0) {
                return true;
            }
            if (a6 != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // androidx.core.text.b0
        public boolean isRtl(char[] cArr, int i5, int i6) {
            return isRtl(CharBuffer.wrap(cArr), i5, i6);
        }

        @Override // androidx.core.text.b0
        public boolean isRtl(CharSequence charSequence, int i5, int i6) {
            if (charSequence == null || i5 < 0 || i6 < 0 || charSequence.length() - i6 < i5) {
                throw new IllegalArgumentException();
            }
            return this.f5155a == null ? a() : b(charSequence, i5, i6);
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes3.dex */
    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5156b;

        e(c cVar, boolean z5) {
            super(cVar);
            this.f5156b = z5;
        }

        @Override // androidx.core.text.c0.d
        protected boolean a() {
            return this.f5156b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes3.dex */
    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f5157b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.c0.d
        protected boolean a() {
            return d0.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f5154a;
        f5145c = new e(bVar, false);
        f5146d = new e(bVar, true);
        f5147e = new e(a.f5152b, false);
        f5148f = f.f5157b;
    }

    private c0() {
    }

    static int a(int i5) {
        if (i5 != 0) {
            return (i5 == 1 || i5 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i5) {
        if (i5 != 0) {
            if (i5 == 1 || i5 == 2) {
                return 0;
            }
            switch (i5) {
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
