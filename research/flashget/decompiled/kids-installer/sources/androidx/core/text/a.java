package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.Typography;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final b0 f5103d;

    /* renamed from: e, reason: collision with root package name */
    private static final char f5104e = 8234;

    /* renamed from: f, reason: collision with root package name */
    private static final char f5105f = 8235;

    /* renamed from: g, reason: collision with root package name */
    private static final char f5106g = 8236;

    /* renamed from: h, reason: collision with root package name */
    private static final char f5107h = 8206;

    /* renamed from: i, reason: collision with root package name */
    private static final char f5108i = 8207;

    /* renamed from: j, reason: collision with root package name */
    private static final String f5109j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f5110k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f5111l = "";

    /* renamed from: m, reason: collision with root package name */
    private static final int f5112m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f5113n = 2;

    /* renamed from: o, reason: collision with root package name */
    static final a f5114o;

    /* renamed from: p, reason: collision with root package name */
    static final a f5115p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f5116q = -1;

    /* renamed from: r, reason: collision with root package name */
    private static final int f5117r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f5118s = 1;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5119a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5120b;

    /* renamed from: c, reason: collision with root package name */
    private final b0 f5121c;

    /* compiled from: BidiFormatter.java */
    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final int f5125f = 1792;

        /* renamed from: g, reason: collision with root package name */
        private static final byte[] f5126g = new byte[f5125f];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f5127a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5128b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5129c;

        /* renamed from: d, reason: collision with root package name */
        private int f5130d;

        /* renamed from: e, reason: collision with root package name */
        private char f5131e;

        static {
            for (int i5 = 0; i5 < f5125f; i5++) {
                f5126g[i5] = Character.getDirectionality(i5);
            }
        }

        b(CharSequence charSequence, boolean z5) {
            this.f5127a = charSequence;
            this.f5128b = z5;
            this.f5129c = charSequence.length();
        }

        private static byte c(char c6) {
            return c6 < f5125f ? f5126g[c6] : Character.getDirectionality(c6);
        }

        private byte f() {
            char charAt;
            int i5 = this.f5130d;
            do {
                int i6 = this.f5130d;
                if (i6 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5127a;
                int i7 = i6 - 1;
                this.f5130d = i7;
                charAt = charSequence.charAt(i7);
                this.f5131e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f5130d = i5;
            this.f5131e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i5 = this.f5130d;
                if (i5 >= this.f5129c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f5127a;
                this.f5130d = i5 + 1;
                charAt = charSequence.charAt(i5);
                this.f5131e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i5 = this.f5130d;
            while (true) {
                int i6 = this.f5130d;
                if (i6 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5127a;
                int i7 = i6 - 1;
                this.f5130d = i7;
                char charAt2 = charSequence.charAt(i7);
                this.f5131e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i8 = this.f5130d;
                        if (i8 > 0) {
                            CharSequence charSequence2 = this.f5127a;
                            int i9 = i8 - 1;
                            this.f5130d = i9;
                            charAt = charSequence2.charAt(i9);
                            this.f5131e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f5130d = i5;
            this.f5131e = Typography.f27130f;
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i5 = this.f5130d;
            while (true) {
                int i6 = this.f5130d;
                if (i6 >= this.f5129c) {
                    this.f5130d = i5;
                    this.f5131e = Typography.f27129e;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f5127a;
                this.f5130d = i6 + 1;
                char charAt2 = charSequence.charAt(i6);
                this.f5131e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f5130d;
                        if (i7 < this.f5129c) {
                            CharSequence charSequence2 = this.f5127a;
                            this.f5130d = i7 + 1;
                            charAt = charSequence2.charAt(i7);
                            this.f5131e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f5127a.charAt(this.f5130d - 1);
            this.f5131e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f5127a, this.f5130d);
                this.f5130d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f5130d--;
            byte c6 = c(this.f5131e);
            if (!this.f5128b) {
                return c6;
            }
            char c7 = this.f5131e;
            return c7 == '>' ? h() : c7 == ';' ? f() : c6;
        }

        byte b() {
            char charAt = this.f5127a.charAt(this.f5130d);
            this.f5131e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f5127a, this.f5130d);
                this.f5130d = Character.charCount(codePointAt) + this.f5130d;
                return Character.getDirectionality(codePointAt);
            }
            this.f5130d++;
            byte c6 = c(this.f5131e);
            if (!this.f5128b) {
                return c6;
            }
            char c7 = this.f5131e;
            return c7 == '<' ? i() : c7 == '&' ? g() : c6;
        }

        int d() {
            this.f5130d = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (this.f5130d < this.f5129c && i5 == 0) {
                byte b6 = b();
                if (b6 != 0) {
                    if (b6 == 1 || b6 == 2) {
                        if (i7 == 0) {
                            return 1;
                        }
                    } else if (b6 != 9) {
                        switch (b6) {
                            case 14:
                            case 15:
                                i7++;
                                i6 = -1;
                                continue;
                            case 16:
                            case 17:
                                i7++;
                                i6 = 1;
                                continue;
                            case 18:
                                i7--;
                                i6 = 0;
                                continue;
                        }
                    }
                } else if (i7 == 0) {
                    return -1;
                }
                i5 = i7;
            }
            if (i5 == 0) {
                return 0;
            }
            if (i6 != 0) {
                return i6;
            }
            while (this.f5130d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i5 == i7) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i5 == i7) {
                            return 1;
                        }
                        break;
                    case 18:
                        i7++;
                        continue;
                }
                i7--;
            }
            return 0;
        }

        int e() {
            this.f5130d = this.f5129c;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                while (this.f5130d > 0) {
                    byte a6 = a();
                    if (a6 != 0) {
                        if (a6 == 1 || a6 == 2) {
                            if (i5 == 0) {
                                return 1;
                            }
                            if (i6 == 0) {
                                break;
                            }
                        } else if (a6 != 9) {
                            switch (a6) {
                                case 14:
                                case 15:
                                    if (i6 == i5) {
                                        return -1;
                                    }
                                    i5--;
                                    break;
                                case 16:
                                case 17:
                                    if (i6 == i5) {
                                        return 1;
                                    }
                                    i5--;
                                    break;
                                case 18:
                                    i5++;
                                    break;
                                default:
                                    if (i6 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i5 == 0) {
                            return -1;
                        }
                        if (i6 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        b0 b0Var = c0.f5145c;
        f5103d = b0Var;
        f5109j = Character.toString(f5107h);
        f5110k = Character.toString(f5108i);
        f5114o = new a(false, 2, b0Var);
        f5115p = new a(true, 2, b0Var);
    }

    a(boolean z5, int i5, b0 b0Var) {
        this.f5119a = z5;
        this.f5120b = i5;
        this.f5121c = b0Var;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0048a().a();
    }

    public static a d(Locale locale) {
        return new C0048a(locale).a();
    }

    public static a e(boolean z5) {
        return new C0048a(z5).a();
    }

    static boolean j(Locale locale) {
        return d0.b(locale) == 1;
    }

    private String k(CharSequence charSequence, b0 b0Var) {
        boolean isRtl = b0Var.isRtl(charSequence, 0, charSequence.length());
        return (this.f5119a || !(isRtl || b(charSequence) == 1)) ? this.f5119a ? (!isRtl || b(charSequence) == -1) ? f5110k : "" : "" : f5109j;
    }

    private String l(CharSequence charSequence, b0 b0Var) {
        boolean isRtl = b0Var.isRtl(charSequence, 0, charSequence.length());
        return (this.f5119a || !(isRtl || a(charSequence) == 1)) ? this.f5119a ? (!isRtl || a(charSequence) == -1) ? f5110k : "" : "" : f5109j;
    }

    public boolean f() {
        return (this.f5120b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f5121c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f5119a;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f5121c, true);
    }

    public CharSequence n(CharSequence charSequence, b0 b0Var) {
        return o(charSequence, b0Var, true);
    }

    public CharSequence o(CharSequence charSequence, b0 b0Var, boolean z5) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = b0Var.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z5) {
            spannableStringBuilder.append((CharSequence) l(charSequence, isRtl ? c0.f5144b : c0.f5143a));
        }
        if (isRtl != this.f5119a) {
            spannableStringBuilder.append(isRtl ? f5105f : f5104e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f5106g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z5) {
            spannableStringBuilder.append((CharSequence) k(charSequence, isRtl ? c0.f5144b : c0.f5143a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z5) {
        return o(charSequence, this.f5121c, z5);
    }

    public String q(String str) {
        return s(str, this.f5121c, true);
    }

    public String r(String str, b0 b0Var) {
        return s(str, b0Var, true);
    }

    public String s(String str, b0 b0Var, boolean z5) {
        if (str == null) {
            return null;
        }
        return o(str, b0Var, z5).toString();
    }

    public String t(String str, boolean z5) {
        return s(str, this.f5121c, z5);
    }

    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0048a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5122a;

        /* renamed from: b, reason: collision with root package name */
        private int f5123b;

        /* renamed from: c, reason: collision with root package name */
        private b0 f5124c;

        public C0048a() {
            c(a.j(Locale.getDefault()));
        }

        private static a b(boolean z5) {
            return z5 ? a.f5115p : a.f5114o;
        }

        private void c(boolean z5) {
            this.f5122a = z5;
            this.f5124c = a.f5103d;
            this.f5123b = 2;
        }

        public a a() {
            return (this.f5123b == 2 && this.f5124c == a.f5103d) ? b(this.f5122a) : new a(this.f5122a, this.f5123b, this.f5124c);
        }

        public C0048a d(b0 b0Var) {
            this.f5124c = b0Var;
            return this;
        }

        public C0048a e(boolean z5) {
            if (z5) {
                this.f5123b |= 2;
            } else {
                this.f5123b &= -3;
            }
            return this;
        }

        public C0048a(boolean z5) {
            c(z5);
        }

        public C0048a(Locale locale) {
            c(a.j(locale));
        }
    }
}
