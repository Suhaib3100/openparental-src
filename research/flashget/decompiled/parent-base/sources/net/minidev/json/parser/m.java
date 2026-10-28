package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: JSONParserString.java */
/* loaded from: classes7.dex */
class m extends j {

    /* renamed from: y, reason: collision with root package name */
    private String f81800y;

    public m(int i4) {
        super(i4);
    }

    @Override // net.minidev.json.parser.g
    protected void f() {
        int i4 = this.f81784g + 1;
        this.f81784g = i4;
        if (i4 >= this.f81798x) {
            this.f81778a = (char) 26;
        } else {
            this.f81778a = this.f81800y.charAt(i4);
        }
    }

    @Override // net.minidev.json.parser.g
    protected void j() throws ParseException {
        int i4 = this.f81784g + 1;
        this.f81784g = i4;
        if (i4 < this.f81798x) {
            this.f81778a = this.f81800y.charAt(i4);
        } else {
            this.f81778a = (char) 26;
            throw new ParseException(this.f81784g - 1, 3, ProtectedSandApp.s("襱\u0001"));
        }
    }

    @Override // net.minidev.json.parser.g
    protected void m() {
        int i4 = this.f81784g + 1;
        this.f81784g = i4;
        if (i4 >= this.f81798x) {
            this.f81778a = (char) 26;
        } else {
            this.f81778a = this.f81800y.charAt(i4);
        }
    }

    @Override // net.minidev.json.parser.j
    protected void t(int i4, int i5) {
        this.f81783f = this.f81800y.substring(i4, i5);
    }

    @Override // net.minidev.json.parser.j
    protected int v(char c5, int i4) {
        return this.f81800y.indexOf(c5, i4);
    }

    public Object w(String str) throws ParseException {
        return y(str, a.f81743a, d.f81749a);
    }

    public Object x(String str, a aVar) throws ParseException {
        return y(str, aVar, d.f81749a);
    }

    public Object y(String str, a aVar, b bVar) throws ParseException {
        this.f81800y = str;
        this.f81798x = str.length();
        return d(aVar, bVar);
    }
}
