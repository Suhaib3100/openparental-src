package net.minidev.json.parser;

import java.io.IOException;

/* compiled from: JSONParserStream.java */
/* loaded from: classes7.dex */
abstract class l extends g {
    public l(int i4) {
        super(i4);
    }

    @Override // net.minidev.json.parser.g
    protected void i(boolean[] zArr) throws IOException {
        this.f81781d.c();
        r(zArr);
        this.f81783f = this.f81781d.toString().trim();
    }

    @Override // net.minidev.json.parser.g
    protected Object k(boolean[] zArr) throws ParseException, IOException {
        this.f81781d.c();
        this.f81781d.a(this.f81778a);
        f();
        q();
        char c5 = this.f81778a;
        if (c5 != '.' && c5 != 'E' && c5 != 'e') {
            s();
            char c6 = this.f81778a;
            if (c6 < 0 || c6 >= '~' || zArr[c6] || c6 == 26) {
                String trim = this.f81781d.toString().trim();
                this.f81783f = trim;
                return e(trim);
            }
            r(zArr);
            String trim2 = this.f81781d.toString().trim();
            this.f81783f = trim2;
            if (this.f81787j) {
                return trim2;
            }
            throw new ParseException(this.f81784g, 1, this.f81783f);
        }
        if (c5 == '.') {
            this.f81781d.a(c5);
            f();
            q();
        }
        char c7 = this.f81778a;
        if (c7 != 'E' && c7 != 'e') {
            s();
            char c10 = this.f81778a;
            if (c10 < 0 || c10 >= '~' || zArr[c10] || c10 == 26) {
                this.f81783f = this.f81781d.toString().trim();
                return c();
            }
            r(zArr);
            String trim3 = this.f81781d.toString().trim();
            this.f81783f = trim3;
            if (this.f81787j) {
                return trim3;
            }
            throw new ParseException(this.f81784g, 1, this.f81783f);
        }
        this.f81781d.a('E');
        f();
        char c11 = this.f81778a;
        if (c11 != '+' && c11 != '-' && (c11 < '0' || c11 > '9')) {
            r(zArr);
            this.f81783f = this.f81781d.toString().trim();
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
            this.f81783f = this.f81781d.toString().trim();
            return c();
        }
        r(zArr);
        String trim4 = this.f81781d.toString().trim();
        this.f81783f = trim4;
        if (this.f81787j) {
            return trim4;
        }
        throw new ParseException(this.f81784g, 1, this.f81783f);
    }

    @Override // net.minidev.json.parser.g
    protected void n() throws ParseException, IOException {
        if (this.f81788k || this.f81778a != '\'') {
            this.f81781d.c();
            o();
        } else {
            if (!this.f81787j) {
                throw new ParseException(this.f81784g, 0, Character.valueOf(this.f81778a));
            }
            i(g.f81773s);
        }
    }
}
