package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.text.m0;

/* compiled from: BidiFormatter.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final e0 f26674d;

    /* renamed from: e, reason: collision with root package name */
    private static final char f26675e = 8234;

    /* renamed from: f, reason: collision with root package name */
    private static final char f26676f = 8235;

    /* renamed from: g, reason: collision with root package name */
    private static final char f26677g = 8236;

    /* renamed from: h, reason: collision with root package name */
    private static final char f26678h = 8206;

    /* renamed from: i, reason: collision with root package name */
    private static final char f26679i = 8207;

    /* renamed from: j, reason: collision with root package name */
    private static final String f26680j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f26681k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f26682l = "";

    /* renamed from: m, reason: collision with root package name */
    private static final int f26683m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f26684n = 2;

    /* renamed from: o, reason: collision with root package name */
    static final a f26685o;

    /* renamed from: p, reason: collision with root package name */
    static final a f26686p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f26687q = -1;

    /* renamed from: r, reason: collision with root package name */
    private static final int f26688r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f26689s = 1;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26690a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26691b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f26692c;

    /* compiled from: BidiFormatter.java */
    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final int f26696f = 1792;

        /* renamed from: g, reason: collision with root package name */
        private static final byte[] f26697g = new byte[f26696f];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f26698a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26699b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26700c;

        /* renamed from: d, reason: collision with root package name */
        private int f26701d;

        /* renamed from: e, reason: collision with root package name */
        private char f26702e;

        static {
            for (int i4 = 0; i4 < f26696f; i4++) {
                f26697g[i4] = Character.getDirectionality(i4);
            }
        }

        b(CharSequence charSequence, boolean z4) {
            this.f26698a = charSequence;
            this.f26699b = z4;
            this.f26700c = charSequence.length();
        }

        private static byte c(char c5) {
            return c5 < f26696f ? f26697g[c5] : Character.getDirectionality(c5);
        }

        private byte f() {
            char charAt;
            int i4 = this.f26701d;
            do {
                int i5 = this.f26701d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f26698a;
                int i6 = i5 - 1;
                this.f26701d = i6;
                charAt = charSequence.charAt(i6);
                this.f26702e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f26701d = i4;
            this.f26702e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i4 = this.f26701d;
                if (i4 >= this.f26700c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f26698a;
                this.f26701d = i4 + 1;
                charAt = charSequence.charAt(i4);
                this.f26702e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i4 = this.f26701d;
            while (true) {
                int i5 = this.f26701d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f26698a;
                int i6 = i5 - 1;
                this.f26701d = i6;
                char charAt2 = charSequence.charAt(i6);
                this.f26702e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f26701d;
                        if (i7 > 0) {
                            CharSequence charSequence2 = this.f26698a;
                            int i10 = i7 - 1;
                            this.f26701d = i10;
                            charAt = charSequence2.charAt(i10);
                            this.f26702e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f26701d = i4;
            this.f26702e = m0.greater;
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i4 = this.f26701d;
            while (true) {
                int i5 = this.f26701d;
                if (i5 >= this.f26700c) {
                    this.f26701d = i4;
                    this.f26702e = m0.less;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f26698a;
                this.f26701d = i5 + 1;
                char charAt2 = charSequence.charAt(i5);
                this.f26702e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i6 = this.f26701d;
                        if (i6 < this.f26700c) {
                            CharSequence charSequence2 = this.f26698a;
                            this.f26701d = i6 + 1;
                            charAt = charSequence2.charAt(i6);
                            this.f26702e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f26698a.charAt(this.f26701d - 1);
            this.f26702e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f26698a, this.f26701d);
                this.f26701d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f26701d--;
            byte c5 = c(this.f26702e);
            if (!this.f26699b) {
                return c5;
            }
            char c6 = this.f26702e;
            return c6 == '>' ? h() : c6 == ';' ? f() : c5;
        }

        byte b() {
            char charAt = this.f26698a.charAt(this.f26701d);
            this.f26702e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f26698a, this.f26701d);
                this.f26701d = Character.charCount(codePointAt) + this.f26701d;
                return Character.getDirectionality(codePointAt);
            }
            this.f26701d++;
            byte c5 = c(this.f26702e);
            if (!this.f26699b) {
                return c5;
            }
            char c6 = this.f26702e;
            return c6 == '<' ? i() : c6 == '&' ? g() : c5;
        }

        int d() {
            this.f26701d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f26701d < this.f26700c && i4 == 0) {
                byte b5 = b();
                if (b5 != 0) {
                    if (b5 == 1 || b5 == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (b5 != 9) {
                        switch (b5) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f26701d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        int e() {
            this.f26701d = this.f26700c;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (this.f26701d > 0) {
                    byte a5 = a();
                    if (a5 != 0) {
                        if (a5 == 1 || a5 == 2) {
                            if (i4 == 0) {
                                return 1;
                            }
                            if (i5 == 0) {
                                break;
                            }
                        } else if (a5 != 9) {
                            switch (a5) {
                                case 14:
                                case 15:
                                    if (i5 == i4) {
                                        return -1;
                                    }
                                    i4--;
                                    break;
                                case 16:
                                case 17:
                                    if (i5 == i4) {
                                        return 1;
                                    }
                                    i4--;
                                    break;
                                case 18:
                                    i4++;
                                    break;
                                default:
                                    if (i5 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i4 == 0) {
                            return -1;
                        }
                        if (i5 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        e0 e0Var = f0.f26719c;
        f26674d = e0Var;
        f26680j = Character.toString(f26678h);
        f26681k = Character.toString(f26679i);
        f26685o = new a(false, 2, e0Var);
        f26686p = new a(true, 2, e0Var);
    }

    a(boolean z4, int i4, e0 e0Var) {
        this.f26690a = z4;
        this.f26691b = i4;
        this.f26692c = e0Var;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0431a().a();
    }

    public static a d(Locale locale) {
        return new C0431a(locale).a();
    }

    public static a e(boolean z4) {
        return new C0431a(z4).a();
    }

    static boolean j(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    private String k(CharSequence charSequence, e0 e0Var) {
        boolean a5 = e0Var.a(charSequence, 0, charSequence.length());
        return (this.f26690a || !(a5 || b(charSequence) == 1)) ? this.f26690a ? (!a5 || b(charSequence) == -1) ? f26681k : "" : "" : f26680j;
    }

    private String l(CharSequence charSequence, e0 e0Var) {
        boolean a5 = e0Var.a(charSequence, 0, charSequence.length());
        return (this.f26690a || !(a5 || a(charSequence) == 1)) ? this.f26690a ? (!a5 || a(charSequence) == -1) ? f26681k : "" : "" : f26680j;
    }

    public boolean f() {
        return (this.f26691b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f26692c.a(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f26690a;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f26692c, true);
    }

    public CharSequence n(CharSequence charSequence, e0 e0Var) {
        return o(charSequence, e0Var, true);
    }

    public CharSequence o(CharSequence charSequence, e0 e0Var, boolean z4) {
        if (charSequence == null) {
            return null;
        }
        boolean a5 = e0Var.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z4) {
            spannableStringBuilder.append((CharSequence) l(charSequence, a5 ? f0.f26718b : f0.f26717a));
        }
        if (a5 != this.f26690a) {
            spannableStringBuilder.append(a5 ? f26676f : f26675e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f26677g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z4) {
            spannableStringBuilder.append((CharSequence) k(charSequence, a5 ? f0.f26718b : f0.f26717a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z4) {
        return o(charSequence, this.f26692c, z4);
    }

    public String q(String str) {
        return s(str, this.f26692c, true);
    }

    public String r(String str, e0 e0Var) {
        return s(str, e0Var, true);
    }

    public String s(String str, e0 e0Var, boolean z4) {
        if (str == null) {
            return null;
        }
        return o(str, e0Var, z4).toString();
    }

    public String t(String str, boolean z4) {
        return s(str, this.f26692c, z4);
    }

    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0431a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26693a;

        /* renamed from: b, reason: collision with root package name */
        private int f26694b;

        /* renamed from: c, reason: collision with root package name */
        private e0 f26695c;

        public C0431a() {
            c(a.j(Locale.getDefault()));
        }

        private static a b(boolean z4) {
            return z4 ? a.f26686p : a.f26685o;
        }

        private void c(boolean z4) {
            this.f26693a = z4;
            this.f26695c = a.f26674d;
            this.f26694b = 2;
        }

        public a a() {
            return (this.f26694b == 2 && this.f26695c == a.f26674d) ? b(this.f26693a) : new a(this.f26693a, this.f26694b, this.f26695c);
        }

        public C0431a d(e0 e0Var) {
            this.f26695c = e0Var;
            return this;
        }

        public C0431a e(boolean z4) {
            if (z4) {
                this.f26694b |= 2;
            } else {
                this.f26694b &= -3;
            }
            return this;
        }

        public C0431a(boolean z4) {
            c(z4);
        }

        public C0431a(Locale locale) {
            c(a.j(locale));
        }
    }
}
