package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import kotlin.text.m0;

/* compiled from: GeneralAppIdDecoder.java */
/* loaded from: classes6.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.a f63140a;

    /* renamed from: b, reason: collision with root package name */
    private final m f63141b = new m();

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f63142c = new StringBuilder();

    s(com.google.zxing.common.a aVar) {
        this.f63140a = aVar;
    }

    private n b(int i4) {
        char c5;
        int g4 = g(this.f63140a, i4, 5);
        if (g4 == 15) {
            return new n(i4 + 5, '$');
        }
        if (g4 >= 5 && g4 < 15) {
            return new n(i4 + 5, (char) (g4 + 43));
        }
        int g5 = g(this.f63140a, i4, 6);
        if (g5 >= 32 && g5 < 58) {
            return new n(i4 + 6, (char) (g5 + 33));
        }
        switch (g5) {
            case 58:
                c5 = '*';
                break;
            case 59:
                c5 = ',';
                break;
            case 60:
                c5 = '-';
                break;
            case 61:
                c5 = '.';
                break;
            case 62:
                c5 = '/';
                break;
            default:
                throw new IllegalStateException(ProtectedSandApp.s("\u0bfd\u0001").concat(String.valueOf(g5)));
        }
        return new n(i4 + 6, c5);
    }

    private n d(int i4) throws FormatException {
        int g4 = g(this.f63140a, i4, 5);
        if (g4 == 15) {
            return new n(i4 + 5, '$');
        }
        char c5 = '+';
        if (g4 >= 5 && g4 < 15) {
            return new n(i4 + 5, (char) (g4 + 43));
        }
        int g5 = g(this.f63140a, i4, 7);
        if (g5 >= 64 && g5 < 90) {
            return new n(i4 + 7, (char) (g5 + 1));
        }
        if (g5 >= 90 && g5 < 116) {
            return new n(i4 + 7, (char) (g5 + 7));
        }
        switch (g(this.f63140a, i4, 8)) {
            case 232:
                c5 = '!';
                break;
            case 233:
                c5 = m0.quote;
                break;
            case 234:
                c5 = '%';
                break;
            case 235:
                c5 = m0.amp;
                break;
            case 236:
                c5 = '\'';
                break;
            case 237:
                c5 = '(';
                break;
            case 238:
                c5 = ')';
                break;
            case 239:
                c5 = '*';
                break;
            case 240:
                break;
            case 241:
                c5 = ',';
                break;
            case 242:
                c5 = '-';
                break;
            case 243:
                c5 = '.';
                break;
            case 244:
                c5 = '/';
                break;
            case 245:
                c5 = ':';
                break;
            case 246:
                c5 = ';';
                break;
            case 247:
                c5 = m0.less;
                break;
            case 248:
                c5 = '=';
                break;
            case 249:
                c5 = m0.greater;
                break;
            case 250:
                c5 = '?';
                break;
            case 251:
                c5 = '_';
                break;
            case 252:
                c5 = ' ';
                break;
            default:
                throw FormatException.a();
        }
        return new n(i4 + 8, c5);
    }

    private p e(int i4) throws FormatException {
        int i5 = i4 + 7;
        if (i5 > this.f63140a.o()) {
            int g4 = g(this.f63140a, i4, 4);
            return g4 == 0 ? new p(this.f63140a.o(), 10, 10) : new p(this.f63140a.o(), g4 - 1, 10);
        }
        int g5 = g(this.f63140a, i4, 7) - 8;
        return new p(i5, g5 / 11, g5 % 11);
    }

    static int g(com.google.zxing.common.a aVar, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            if (aVar.k(i4 + i7)) {
                i6 |= 1 << ((i5 - i7) - 1);
            }
        }
        return i6;
    }

    private boolean h(int i4) {
        int i5 = i4 + 3;
        if (i5 > this.f63140a.o()) {
            return false;
        }
        while (i4 < i5) {
            if (this.f63140a.k(i4)) {
                return false;
            }
            i4++;
        }
        return true;
    }

    private boolean i(int i4) {
        int i5;
        if (i4 + 1 > this.f63140a.o()) {
            return false;
        }
        for (int i6 = 0; i6 < 5 && (i5 = i6 + i4) < this.f63140a.o(); i6++) {
            if (i6 == 2) {
                if (!this.f63140a.k(i4 + 2)) {
                    return false;
                }
            } else if (this.f63140a.k(i5)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int i4) {
        int i5;
        if (i4 + 1 > this.f63140a.o()) {
            return false;
        }
        for (int i6 = 0; i6 < 4 && (i5 = i6 + i4) < this.f63140a.o(); i6++) {
            if (this.f63140a.k(i5)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(int i4) {
        int g4;
        if (i4 + 5 > this.f63140a.o()) {
            return false;
        }
        int g5 = g(this.f63140a, i4, 5);
        if (g5 < 5 || g5 >= 16) {
            return i4 + 6 <= this.f63140a.o() && (g4 = g(this.f63140a, i4, 6)) >= 16 && g4 < 63;
        }
        return true;
    }

    private boolean l(int i4) {
        int g4;
        if (i4 + 5 > this.f63140a.o()) {
            return false;
        }
        int g5 = g(this.f63140a, i4, 5);
        if (g5 >= 5 && g5 < 16) {
            return true;
        }
        if (i4 + 7 > this.f63140a.o()) {
            return false;
        }
        int g6 = g(this.f63140a, i4, 7);
        if (g6 < 64 || g6 >= 116) {
            return i4 + 8 <= this.f63140a.o() && (g4 = g(this.f63140a, i4, 8)) >= 232 && g4 < 253;
        }
        return true;
    }

    private boolean m(int i4) {
        if (i4 + 7 > this.f63140a.o()) {
            return i4 + 4 <= this.f63140a.o();
        }
        int i5 = i4;
        while (true) {
            int i6 = i4 + 3;
            if (i5 >= i6) {
                return this.f63140a.k(i6);
            }
            if (this.f63140a.k(i5)) {
                return true;
            }
            i5++;
        }
    }

    private l n() {
        while (k(this.f63141b.a())) {
            n b5 = b(this.f63141b.a());
            this.f63141b.i(b5.a());
            if (b5.c()) {
                return new l(new o(this.f63141b.a(), this.f63142c.toString()), true);
            }
            this.f63142c.append(b5.b());
        }
        if (h(this.f63141b.a())) {
            this.f63141b.b(3);
            this.f63141b.h();
        } else if (i(this.f63141b.a())) {
            if (this.f63141b.a() + 5 < this.f63140a.o()) {
                this.f63141b.b(5);
            } else {
                this.f63141b.i(this.f63140a.o());
            }
            this.f63141b.g();
        }
        return new l(null, false);
    }

    private o o() throws FormatException {
        l q4;
        boolean b5;
        do {
            int a5 = this.f63141b.a();
            if (this.f63141b.c()) {
                q4 = n();
                b5 = q4.b();
            } else if (this.f63141b.d()) {
                q4 = p();
                b5 = q4.b();
            } else {
                q4 = q();
                b5 = q4.b();
            }
            if (a5 == this.f63141b.a() && !b5) {
                break;
            }
        } while (!b5);
        return q4.a();
    }

    private l p() throws FormatException {
        while (l(this.f63141b.a())) {
            n d5 = d(this.f63141b.a());
            this.f63141b.i(d5.a());
            if (d5.c()) {
                return new l(new o(this.f63141b.a(), this.f63142c.toString()), true);
            }
            this.f63142c.append(d5.b());
        }
        if (h(this.f63141b.a())) {
            this.f63141b.b(3);
            this.f63141b.h();
        } else if (i(this.f63141b.a())) {
            if (this.f63141b.a() + 5 < this.f63140a.o()) {
                this.f63141b.b(5);
            } else {
                this.f63141b.i(this.f63140a.o());
            }
            this.f63141b.f();
        }
        return new l(null, false);
    }

    private l q() throws FormatException {
        while (m(this.f63141b.a())) {
            p e4 = e(this.f63141b.a());
            this.f63141b.i(e4.a());
            if (e4.e()) {
                return new l(e4.f() ? new o(this.f63141b.a(), this.f63142c.toString()) : new o(this.f63141b.a(), this.f63142c.toString(), e4.c()), true);
            }
            this.f63142c.append(e4.b());
            if (e4.f()) {
                return new l(new o(this.f63141b.a(), this.f63142c.toString()), true);
            }
            this.f63142c.append(e4.c());
        }
        if (j(this.f63141b.a())) {
            this.f63141b.f();
            this.f63141b.b(4);
        }
        return new l(null, false);
    }

    String a(StringBuilder sb, int i4) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            o c5 = c(i4, str);
            String a5 = r.a(c5.b());
            if (a5 != null) {
                sb.append(a5);
            }
            String valueOf = c5.d() ? String.valueOf(c5.c()) : null;
            if (i4 == c5.a()) {
                return sb.toString();
            }
            i4 = c5.a();
            str = valueOf;
        }
    }

    o c(int i4, String str) throws FormatException {
        this.f63142c.setLength(0);
        if (str != null) {
            this.f63142c.append(str);
        }
        this.f63141b.i(i4);
        o o4 = o();
        return (o4 == null || !o4.d()) ? new o(this.f63141b.a(), this.f63142c.toString()) : new o(this.f63141b.a(), this.f63142c.toString(), o4.c());
    }

    int f(int i4, int i5) {
        return g(this.f63140a, i4, i5);
    }
}
