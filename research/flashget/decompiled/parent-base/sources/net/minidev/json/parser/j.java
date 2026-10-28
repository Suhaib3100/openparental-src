package net.minidev.json.parser;

import java.io.IOException;

/* compiled from: JSONParserMemory.java */
/* loaded from: classes7.dex */
abstract class j extends g {

    /* renamed from: x, reason: collision with root package name */
    protected int f81798x;

    public j(int i4) {
        super(i4);
    }

    @Override // net.minidev.json.parser.g
    protected void i(boolean[] zArr) throws IOException {
        int i4 = this.f81784g;
        r(zArr);
        u(i4, this.f81784g);
    }

    @Override // net.minidev.json.parser.g
    protected Object k(boolean[] zArr) throws ParseException, IOException {
        int i4 = this.f81784g;
        f();
        q();
        char c5 = this.f81778a;
        if (c5 != '.' && c5 != 'E' && c5 != 'e') {
            s();
            char c6 = this.f81778a;
            if (c6 < 0 || c6 >= '~' || zArr[c6] || c6 == 26) {
                u(i4, this.f81784g);
                return e(this.f81783f);
            }
            r(zArr);
            u(i4, this.f81784g);
            if (this.f81787j) {
                return this.f81783f;
            }
            throw new ParseException(this.f81784g, 1, this.f81783f);
        }
        if (c5 == '.') {
            f();
            q();
        }
        char c7 = this.f81778a;
        if (c7 != 'E' && c7 != 'e') {
            s();
            char c10 = this.f81778a;
            if (c10 < 0 || c10 >= '~' || zArr[c10] || c10 == 26) {
                u(i4, this.f81784g);
                return c();
            }
            r(zArr);
            u(i4, this.f81784g);
            if (this.f81787j) {
                return this.f81783f;
            }
            throw new ParseException(this.f81784g, 1, this.f81783f);
        }
        this.f81781d.a('E');
        f();
        char c11 = this.f81778a;
        if (c11 != '+' && c11 != '-' && (c11 < '0' || c11 > '9')) {
            r(zArr);
            u(i4, this.f81784g);
            if (!this.f81787j) {
                throw new ParseException(this.f81784g, 1, this.f81783f);
            }
            if (!this.f81785h) {
                b();
            }
            return this.f81783f;
        }
        this.f81781d.a(c11);
        f();
        q();
        s();
        char c12 = this.f81778a;
        if (c12 < 0 || c12 >= '~' || zArr[c12] || c12 == 26) {
            u(i4, this.f81784g);
            return c();
        }
        r(zArr);
        u(i4, this.f81784g);
        if (this.f81787j) {
            return this.f81783f;
        }
        throw new ParseException(this.f81784g, 1, this.f81783f);
    }

    @Override // net.minidev.json.parser.g
    protected void n() throws ParseException, IOException {
        if (!this.f81788k && this.f81778a == '\'') {
            if (!this.f81787j) {
                throw new ParseException(this.f81784g, 0, Character.valueOf(this.f81778a));
            }
            i(g.f81773s);
            return;
        }
        int v4 = v(this.f81778a, this.f81784g + 1);
        if (v4 == -1) {
            throw new ParseException(this.f81798x, 3, null);
        }
        t(this.f81784g + 1, v4);
        if (this.f81783f.indexOf(92) != -1) {
            this.f81781d.c();
            o();
        } else {
            a();
            this.f81784g = v4;
            f();
        }
    }

    protected abstract void t(int i4, int i5);

    protected void u(int i4, int i5) {
        t(i4, i5);
        this.f81783f = this.f81783f.trim();
    }

    protected abstract int v(char c5, int i4);
}
