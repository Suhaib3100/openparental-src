package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;

/* compiled from: LiteralProcessor.java */
/* loaded from: classes7.dex */
final class o implements i<Void> {

    /* renamed from: b, reason: collision with root package name */
    private final char f83004b;

    /* renamed from: c, reason: collision with root package name */
    private final char f83005c;

    /* renamed from: d, reason: collision with root package name */
    private final String f83006d;

    /* renamed from: e, reason: collision with root package name */
    private final net.time4j.engine.c<Character> f83007e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f83008f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f83009g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f83010h;

    o(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("锉\u0001"));
        }
        char charAt = str.charAt(0);
        this.f83004b = charAt;
        this.f83005c = charAt;
        this.f83007e = null;
        this.f83006d = str;
        if (charAt < ' ') {
            throw new IllegalArgumentException(ProtectedSandApp.s("锈\u0001"));
        }
        this.f83008f = true;
        this.f83009g = str.length() == 1 && d(charAt);
        this.f83010h = false;
    }

    private static boolean a(char c5, char c6) {
        return c5 == c6 || Character.toUpperCase(c5) == Character.toUpperCase(c6) || Character.toLowerCase(c5) == Character.toLowerCase(c6);
    }

    private static boolean c(char c5) {
        return c5 == 8206 || c5 == 8207 || c5 == 1564;
    }

    private static boolean d(char c5) {
        return (Character.isLetter(c5) || Character.isDigit(c5) || c(c5)) ? false : true;
    }

    private void e(CharSequence charSequence, w wVar) {
        int f4 = wVar.f();
        wVar.l(f4, ProtectedSandApp.s("锋\u0001") + charSequence + ProtectedSandApp.s("锌\u0001") + this.f83006d + ProtectedSandApp.s("锍\u0001") + charSequence.subSequence(f4, Math.min(this.f83006d.length() + f4, charSequence.length())) + ProtectedSandApp.s("锎\u0001"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (a(r2, r5) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.lang.CharSequence r9, net.time4j.format.expert.w r10, net.time4j.engine.d r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.f()
            char r1 = r8.f83004b
            net.time4j.engine.c<java.lang.Character> r2 = r8.f83007e
            r3 = 0
            if (r2 == 0) goto L19
            java.lang.Character r1 = java.lang.Character.valueOf(r3)
            java.lang.Object r1 = r11.b(r2, r1)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
        L19:
            int r2 = r9.length()
            r4 = 1
            if (r0 >= r2) goto L8d
            if (r1 == 0) goto L8d
            boolean r2 = java.lang.Character.isDigit(r1)
            if (r2 == 0) goto L2a
            goto L8d
        L2a:
            char r2 = r9.charAt(r0)
            char r5 = r8.f83005c
            net.time4j.engine.c<java.lang.Character> r6 = r8.f83007e
            if (r6 == 0) goto L60
            net.time4j.engine.c<java.lang.Character> r6 = net.time4j.format.a.f82793o
            java.lang.String r6 = r6.name()
            net.time4j.engine.c<java.lang.Character> r7 = r8.f83007e
            java.lang.String r7 = r7.name()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            java.util.Locale r6 = java.util.Locale.ROOT
            net.time4j.engine.c<java.util.Locale> r7 = net.time4j.format.a.f82781c
            java.lang.Object r7 = r11.b(r7, r6)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            r5 = 46
            r6 = 44
            if (r1 != r6) goto L5b
            goto L60
        L5b:
            if (r1 != r5) goto L5f
            r5 = r6
            goto L60
        L5f:
            r5 = r1
        L60:
            if (r2 == r1) goto L66
            if (r2 == r5) goto L66
            r6 = r4
            goto L67
        L66:
            r6 = r3
        L67:
            if (r6 == 0) goto L8b
            if (r12 == 0) goto L6e
            boolean r11 = r8.f83008f
            goto L7c
        L6e:
            net.time4j.engine.c<java.lang.Boolean> r12 = net.time4j.format.a.f82787i
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r11.b(r12, r7)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
        L7c:
            if (r11 == 0) goto L8b
            boolean r11 = a(r2, r1)
            if (r11 != 0) goto L8f
            boolean r11 = a(r2, r5)
            if (r11 == 0) goto L8b
            goto L8f
        L8b:
            r3 = r6
            goto L8f
        L8d:
            r2 = r3
            r3 = r4
        L8f:
            if (r3 == 0) goto Lce
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "锋\u0001"
            java.lang.String r12 = com.flashget.parentalcontrol.ProtectedSandApp.s(r12)
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "锌\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r11.append(r9)
            r11.append(r1)
            java.lang.String r9 = "锍\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r11.append(r9)
            if (r2 == 0) goto Lbc
            r11.append(r2)
        Lbc:
            java.lang.String r9 = "锎\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.l(r0, r9)
            goto Ld2
        Lce:
            int r0 = r0 + r4
            r10.m(r0)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.o.f(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, boolean):void");
    }

    private void g(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, boolean z4) {
        int f4 = wVar.f();
        int h4 = h(charSequence, f4, this.f83006d, z4 ? this.f83008f : ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue(), z4 ? this.f83010h : net.time4j.format.b.s((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)));
        if (h4 == -1) {
            e(charSequence, wVar);
        } else {
            wVar.m(f4 + h4);
        }
    }

    static int h(CharSequence charSequence, int i4, CharSequence charSequence2, boolean z4, boolean z5) {
        char charAt;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length2; i6++) {
            char charAt2 = charSequence2.charAt(i6);
            if (!c(charAt2)) {
                if (z5) {
                    charAt = 0;
                    while (true) {
                        int i7 = i5 + i4;
                        if (i7 >= length) {
                            break;
                        }
                        charAt = charSequence.charAt(i7);
                        if (!c(charAt)) {
                            break;
                        }
                        i5++;
                    }
                } else {
                    int i10 = i5 + i4;
                    charAt = i10 < length ? charSequence.charAt(i10) : (char) 0;
                }
                if (i5 + i4 >= length) {
                    return -1;
                }
                i5++;
                if (z4) {
                    if (!a(charAt, charAt2)) {
                        return -1;
                    }
                } else if (charAt != charAt2) {
                    return -1;
                }
            }
        }
        if (z5) {
            while (true) {
                int i11 = i5 + i4;
                if (i11 >= length || !c(charSequence.charAt(i11))) {
                    break;
                }
                i5++;
            }
        }
        return i5;
    }

    int b() {
        String str = this.f83006d;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length && Character.isDigit(this.f83006d.charAt(i5)); i5++) {
            i4++;
        }
        return i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        net.time4j.engine.c<Character> cVar = this.f83007e;
        if (cVar != null) {
            return cVar.equals(oVar.f83007e);
        }
        String str = this.f83006d;
        return str == null ? oVar.f83006d == null && this.f83004b == oVar.f83004b && this.f83005c == oVar.f83005c : str.equals(oVar.f83006d) && this.f83009g == oVar.f83009g;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<Void> getElement() {
        return null;
    }

    public int hashCode() {
        String name;
        net.time4j.engine.c<Character> cVar = this.f83007e;
        if (cVar == null) {
            name = this.f83006d;
            if (name == null) {
                name = "";
            }
        } else {
            name = cVar.name();
        }
        return name.hashCode() ^ this.f83004b;
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return this.f83006d != null && b() == this.f83006d.length();
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        if (!z4 || !this.f83009g) {
            if (this.f83006d == null) {
                f(charSequence, wVar, dVar, z4);
                return;
            } else {
                g(charSequence, wVar, dVar, z4);
                return;
            }
        }
        int f4 = wVar.f();
        if (f4 < charSequence.length() && charSequence.charAt(f4) == this.f83004b) {
            wVar.m(f4 + 1);
        } else {
            if (this.f83004b == '.' && ((Boolean) dVar.b(net.time4j.format.a.f82789k, Boolean.TRUE)).booleanValue()) {
                return;
            }
            e(charSequence, wVar);
        }
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        net.time4j.engine.c<Character> cVar = this.f83007e;
        if (cVar != null) {
            appendable.append(((Character) dVar.b(cVar, null)).charValue());
            return 1;
        }
        String str = this.f83006d;
        if (str == null) {
            appendable.append(this.f83004b);
            return 1;
        }
        appendable.append(str);
        return this.f83006d.length();
    }

    @Override // net.time4j.format.expert.i
    public i<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        boolean s4 = net.time4j.format.b.s((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT));
        return new o(this.f83004b, this.f83005c, this.f83006d, this.f83007e, ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue(), this.f83009g && !s4, s4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(o.class, sb, ProtectedSandApp.s("锏\u0001"));
        if (this.f83007e != null) {
            sb.append('{');
            sb.append(this.f83007e);
            sb.append('}');
        } else {
            String str = this.f83006d;
            if (str == null) {
                sb.append(this.f83004b);
                if (this.f83005c != this.f83004b) {
                    sb.append(ProtectedSandApp.s("锐\u0001"));
                    sb.append(this.f83005c);
                }
            } else {
                sb.append(str);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<Void> withElement(net.time4j.engine.q<Void> qVar) {
        return this;
    }

    o(char c5, char c6) {
        this.f83004b = c5;
        this.f83005c = c6;
        this.f83007e = null;
        this.f83006d = null;
        if (c5 >= ' ' && c6 >= ' ') {
            if (!Character.isDigit(c5) && !Character.isDigit(c6)) {
                this.f83008f = true;
                this.f83009g = false;
                this.f83010h = false;
                return;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("锇\u0001"));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("锈\u0001"));
    }

    o(net.time4j.engine.c<Character> cVar) {
        if (cVar != null) {
            this.f83004b = (char) 0;
            this.f83005c = (char) 0;
            this.f83007e = cVar;
            this.f83006d = null;
            this.f83008f = true;
            this.f83009g = false;
            this.f83010h = false;
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("锊\u0001"));
    }

    private o(char c5, char c6, String str, net.time4j.engine.c<Character> cVar, boolean z4, boolean z5, boolean z6) {
        this.f83004b = c5;
        this.f83005c = c6;
        this.f83006d = str;
        this.f83007e = cVar;
        this.f83008f = z4;
        this.f83009g = z5;
        this.f83010h = z6;
    }
}
