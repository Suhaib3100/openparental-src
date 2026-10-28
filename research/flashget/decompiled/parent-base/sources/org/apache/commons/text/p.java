package org.apache.commons.text;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.translate.d;
import org.apache.commons.text.translate.i;

/* compiled from: StringEscapeUtils.java */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86595a;

    /* renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86596b;

    /* renamed from: c, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86597c;

    /* renamed from: d, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86598d;

    /* renamed from: e, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86599e;

    /* renamed from: f, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86600f;

    /* renamed from: g, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86601g;

    /* renamed from: h, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86602h;

    /* renamed from: i, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86603i;

    /* renamed from: j, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86604j;

    /* renamed from: k, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86605k;

    /* renamed from: l, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86606l;

    /* renamed from: m, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86607m;

    /* renamed from: n, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86608n;

    /* renamed from: o, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86609o;

    /* renamed from: p, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86610p;

    /* renamed from: q, reason: collision with root package name */
    public static final org.apache.commons.text.translate.b f86611q;

    /* compiled from: StringEscapeUtils.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final StringBuilder f86612a;

        /* renamed from: b, reason: collision with root package name */
        private final org.apache.commons.text.translate.b f86613b;

        public b a(String str) {
            this.f86612a.append(str);
            return this;
        }

        public b b(String str) {
            this.f86612a.append(this.f86613b.c(str));
            return this;
        }

        public String toString() {
            return this.f86612a.toString();
        }

        private b(org.apache.commons.text.translate.b bVar) {
            this.f86612a = new StringBuilder();
            this.f86613b = bVar;
        }
    }

    /* compiled from: StringEscapeUtils.java */
    static class c extends org.apache.commons.text.translate.b {

        /* renamed from: b, reason: collision with root package name */
        private static final char f86614b = '\\';

        c() {
        }

        @Override // org.apache.commons.text.translate.b
        public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
            if (i4 != 0) {
                throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
            }
            String charSequence2 = charSequence.toString();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int indexOf = charSequence2.indexOf(92, i5);
                if (indexOf == -1) {
                    break;
                }
                if (indexOf > i6) {
                    writer.write(charSequence2.substring(i6, indexOf));
                }
                i6 = indexOf + 1;
                i5 = indexOf + 2;
            }
            if (i6 < charSequence2.length()) {
                writer.write(charSequence2.substring(i6));
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        org.apache.commons.text.translate.g gVar = new org.apache.commons.text.translate.g(Collections.unmodifiableMap(com.coremedia.iso.boxes.d.a("\"", "\\\"", "\\", "\\\\")));
        Map<CharSequence, CharSequence> map = org.apache.commons.text.translate.e.f86701i;
        f86595a = new org.apache.commons.text.translate.a(gVar, new org.apache.commons.text.translate.g(map), org.apache.commons.text.translate.f.o(32, 127));
        HashMap a5 = com.coremedia.iso.boxes.d.a("'", "\\'", "\"", "\\\"");
        a5.put("\\", "\\\\");
        a5.put("/", "\\/");
        f86596b = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.g(Collections.unmodifiableMap(a5)), new org.apache.commons.text.translate.g(map), org.apache.commons.text.translate.f.o(32, 127));
        HashMap a6 = com.coremedia.iso.boxes.d.a("\"", "\\\"", "\\", "\\\\");
        a6.put("/", "\\/");
        f86597c = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.g(Collections.unmodifiableMap(a6)), new org.apache.commons.text.translate.g(map), org.apache.commons.text.translate.f.o(32, 126));
        HashMap a7 = com.coremedia.iso.boxes.d.a("\u0000", "", "\u0001", "");
        a7.put("\u0002", "");
        a7.put("\u0003", "");
        a7.put("\u0004", "");
        a7.put("\u0005", "");
        a7.put("\u0006", "");
        a7.put("\u0007", "");
        a7.put("\b", "");
        a7.put("\u000b", "");
        a7.put("\f", "");
        a7.put("\u000e", "");
        a7.put("\u000f", "");
        a7.put("\u0010", "");
        a7.put("\u0011", "");
        a7.put("\u0012", "");
        a7.put("\u0013", "");
        a7.put("\u0014", "");
        a7.put("\u0015", "");
        a7.put("\u0016", "");
        a7.put("\u0017", "");
        a7.put("\u0018", "");
        a7.put("\u0019", "");
        a7.put("\u001a", "");
        a7.put("\u001b", "");
        a7.put("\u001c", "");
        a7.put("\u001d", "");
        a7.put("\u001e", "");
        a7.put("\u001f", "");
        a7.put("\ufffe", "");
        a7.put("\uffff", "");
        Map<CharSequence, CharSequence> map2 = org.apache.commons.text.translate.e.f86697e;
        org.apache.commons.text.translate.g gVar2 = new org.apache.commons.text.translate.g(map2);
        Map<CharSequence, CharSequence> map3 = org.apache.commons.text.translate.e.f86699g;
        f86598d = new org.apache.commons.text.translate.a(gVar2, new org.apache.commons.text.translate.g(map3), new org.apache.commons.text.translate.g(Collections.unmodifiableMap(a7)), org.apache.commons.text.translate.h.i(127, UserData.IS91_MSG_TYPE_CLI), org.apache.commons.text.translate.h.i(SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 159), new org.apache.commons.text.translate.n());
        HashMap a8 = com.coremedia.iso.boxes.d.a("\u0000", "", "\u000b", "&#11;");
        a8.put("\f", "&#12;");
        a8.put("\ufffe", "");
        a8.put("\uffff", "");
        f86599e = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.g(map2), new org.apache.commons.text.translate.g(map3), new org.apache.commons.text.translate.g(Collections.unmodifiableMap(a8)), org.apache.commons.text.translate.h.i(1, 8), org.apache.commons.text.translate.h.i(14, 31), org.apache.commons.text.translate.h.i(127, UserData.IS91_MSG_TYPE_CLI), org.apache.commons.text.translate.h.i(SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 159), new org.apache.commons.text.translate.n());
        org.apache.commons.text.translate.g gVar3 = new org.apache.commons.text.translate.g(map2);
        Map<CharSequence, CharSequence> map4 = org.apache.commons.text.translate.e.f86693a;
        f86600f = new org.apache.commons.text.translate.a(gVar3, new org.apache.commons.text.translate.g(map4));
        f86601g = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.g(map2), new org.apache.commons.text.translate.g(map4), new org.apache.commons.text.translate.g(org.apache.commons.text.translate.e.f86695c));
        f86602h = new d.a();
        HashMap a10 = com.coremedia.iso.boxes.d.a("|", "\\|", "&", "\\&");
        a10.put(";", "\\;");
        a10.put("<", "\\<");
        a10.put(">", "\\>");
        a10.put("(", "\\(");
        a10.put(")", "\\)");
        a10.put("$", "\\$");
        a10.put("`", "\\`");
        a10.put("\\", "\\\\");
        a10.put("\"", "\\\"");
        a10.put("'", "\\'");
        a10.put(" ", "\\ ");
        a10.put("\t", "\\\t");
        a10.put("\r\n", "");
        a10.put("\n", "");
        a10.put("*", "\\*");
        a10.put("?", "\\?");
        a10.put("[", "\\[");
        a10.put("#", "\\#");
        a10.put("~", "\\~");
        a10.put("=", "\\=");
        a10.put("%", "\\%");
        f86603i = new org.apache.commons.text.translate.g(Collections.unmodifiableMap(a10));
        HashMap a11 = com.coremedia.iso.boxes.d.a("\\\\", "\\", "\\\"", "\"");
        a11.put("\\'", "'");
        a11.put("\\", "");
        org.apache.commons.text.translate.a aVar = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.j(), new org.apache.commons.text.translate.m(), new org.apache.commons.text.translate.g(org.apache.commons.text.translate.e.f86702j), new org.apache.commons.text.translate.g(Collections.unmodifiableMap(a11)));
        f86604j = aVar;
        f86605k = aVar;
        f86606l = aVar;
        Map<CharSequence, CharSequence> map5 = org.apache.commons.text.translate.e.f86698f;
        org.apache.commons.text.translate.g gVar4 = new org.apache.commons.text.translate.g(map5);
        Map<CharSequence, CharSequence> map6 = org.apache.commons.text.translate.e.f86694b;
        f86607m = new org.apache.commons.text.translate.a(gVar4, new org.apache.commons.text.translate.g(map6), new org.apache.commons.text.translate.i(new i.a[0]));
        f86608n = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.g(map5), new org.apache.commons.text.translate.g(map6), new org.apache.commons.text.translate.g(org.apache.commons.text.translate.e.f86696d), new org.apache.commons.text.translate.i(new i.a[0]));
        f86609o = new org.apache.commons.text.translate.a(new org.apache.commons.text.translate.g(map5), new org.apache.commons.text.translate.g(org.apache.commons.text.translate.e.f86700h), new org.apache.commons.text.translate.i(new i.a[0]));
        f86610p = new d.b();
        f86611q = new c();
    }

    public static b a(org.apache.commons.text.translate.b bVar) {
        return new b(bVar);
    }

    public static final String b(String str) {
        return f86602h.c(str);
    }

    public static final String c(String str) {
        return f86596b.c(str);
    }

    public static final String d(String str) {
        return f86600f.c(str);
    }

    public static final String e(String str) {
        return f86601g.c(str);
    }

    public static final String f(String str) {
        return f86595a.c(str);
    }

    public static final String g(String str) {
        return f86597c.c(str);
    }

    public static final String h(String str) {
        return f86603i.c(str);
    }

    public static String i(String str) {
        return f86598d.c(str);
    }

    public static String j(String str) {
        return f86599e.c(str);
    }

    public static final String k(String str) {
        return f86610p.c(str);
    }

    public static final String l(String str) {
        return f86605k.c(str);
    }

    public static final String m(String str) {
        return f86607m.c(str);
    }

    public static final String n(String str) {
        return f86608n.c(str);
    }

    public static final String o(String str) {
        return f86604j.c(str);
    }

    public static final String p(String str) {
        return f86606l.c(str);
    }

    public static final String q(String str) {
        return f86611q.c(str);
    }

    public static final String r(String str) {
        return f86609o.c(str);
    }
}
