package org.apache.commons.lang3;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.h;

/* compiled from: StringEscapeUtils.java */
@Deprecated
/* loaded from: classes6.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85632a = new org.apache.commons.lang3.text.translate.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}).e(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.i())).e(org.apache.commons.lang3.text.translate.e.o(32, 127));

    /* renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85633b = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.i()), org.apache.commons.lang3.text.translate.e.o(32, 127));

    /* renamed from: c, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85634c = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.i()), org.apache.commons.lang3.text.translate.e.o(32, 127));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final org.apache.commons.lang3.text.translate.b f85635d = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.c()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.a()));

    /* renamed from: e, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85636e = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.c()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.a()), new org.apache.commons.lang3.text.translate.f(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), org.apache.commons.lang3.text.translate.g.i(127, UserData.IS91_MSG_TYPE_CLI), org.apache.commons.lang3.text.translate.g.i(SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 159), new org.apache.commons.lang3.text.translate.l());

    /* renamed from: f, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85637f = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.c()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.a()), new org.apache.commons.lang3.text.translate.f(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), org.apache.commons.lang3.text.translate.g.i(1, 8), org.apache.commons.lang3.text.translate.g.i(14, 31), org.apache.commons.lang3.text.translate.g.i(127, UserData.IS91_MSG_TYPE_CLI), org.apache.commons.lang3.text.translate.g.i(SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 159), new org.apache.commons.lang3.text.translate.l());

    /* renamed from: g, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85638g = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.c()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.g()));

    /* renamed from: h, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85639h = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.c()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.g()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.e()));

    /* renamed from: i, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85640i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85641j;

    /* renamed from: k, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85642k;

    /* renamed from: l, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85643l;

    /* renamed from: m, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85644m;

    /* renamed from: n, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85645n;

    /* renamed from: o, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85646o;

    /* renamed from: p, reason: collision with root package name */
    public static final org.apache.commons.lang3.text.translate.b f85647p;

    /* compiled from: StringEscapeUtils.java */
    static class a extends org.apache.commons.lang3.text.translate.b {

        /* renamed from: c, reason: collision with root package name */
        private static final char f85649c = '\"';

        /* renamed from: d, reason: collision with root package name */
        private static final String f85650d = String.valueOf('\"');

        /* renamed from: b, reason: collision with root package name */
        private static final char f85648b = ',';

        /* renamed from: e, reason: collision with root package name */
        private static final char[] f85651e = {f85648b, '\"', m.f86065d, '\n'};

        a() {
        }

        @Override // org.apache.commons.lang3.text.translate.b
        public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
            if (i4 != 0) {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            if (b1.A(charSequence.toString(), f85651e)) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String charSequence2 = charSequence.toString();
                String str = f85650d;
                writer.write(b1.b2(charSequence2, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    /* compiled from: StringEscapeUtils.java */
    static class b extends org.apache.commons.lang3.text.translate.b {

        /* renamed from: c, reason: collision with root package name */
        private static final char f85653c = '\"';

        /* renamed from: d, reason: collision with root package name */
        private static final String f85654d = String.valueOf('\"');

        /* renamed from: b, reason: collision with root package name */
        private static final char f85652b = ',';

        /* renamed from: e, reason: collision with root package name */
        private static final char[] f85655e = {f85652b, '\"', m.f86065d, '\n'};

        b() {
        }

        @Override // org.apache.commons.lang3.text.translate.b
        public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
            if (i4 != 0) {
                throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
            }
            if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
                writer.write(charSequence.toString());
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
            if (b1.w(charSequence2, f85655e)) {
                StringBuilder sb = new StringBuilder();
                String str = f85654d;
                sb.append(str);
                sb.append(str);
                writer.write(b1.b2(charSequence2, sb.toString(), str));
            } else {
                writer.write(charSequence.toString());
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        org.apache.commons.lang3.text.translate.a aVar = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.i(), new org.apache.commons.lang3.text.translate.k(), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.j()), new org.apache.commons.lang3.text.translate.f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        f85641j = aVar;
        f85642k = aVar;
        f85643l = aVar;
        f85644m = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.d()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.h()), new org.apache.commons.lang3.text.translate.h(new h.a[0]));
        f85645n = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.d()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.h()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.f()), new org.apache.commons.lang3.text.translate.h(new h.a[0]));
        f85646o = new org.apache.commons.lang3.text.translate.a(new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.d()), new org.apache.commons.lang3.text.translate.f(org.apache.commons.lang3.text.translate.d.b()), new org.apache.commons.lang3.text.translate.h(new h.a[0]));
        f85647p = new b();
    }

    public static final String a(String str) {
        return f85640i.c(str);
    }

    public static final String b(String str) {
        return f85633b.c(str);
    }

    public static final String c(String str) {
        return f85638g.c(str);
    }

    public static final String d(String str) {
        return f85639h.c(str);
    }

    public static final String e(String str) {
        return f85632a.c(str);
    }

    public static final String f(String str) {
        return f85634c.c(str);
    }

    @Deprecated
    public static final String g(String str) {
        return f85635d.c(str);
    }

    public static String h(String str) {
        return f85636e.c(str);
    }

    public static String i(String str) {
        return f85637f.c(str);
    }

    public static final String j(String str) {
        return f85647p.c(str);
    }

    public static final String k(String str) {
        return f85642k.c(str);
    }

    public static final String l(String str) {
        return f85644m.c(str);
    }

    public static final String m(String str) {
        return f85645n.c(str);
    }

    public static final String n(String str) {
        return f85641j.c(str);
    }

    public static final String o(String str) {
        return f85643l.c(str);
    }

    public static final String p(String str) {
        return f85646o.c(str);
    }
}
