package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: JSONParserByteArray.java */
/* loaded from: classes7.dex */
class h extends j {

    /* renamed from: y, reason: collision with root package name */
    private byte[] f81796y;

    public h(int i4) {
        super(i4);
    }

    @Override // net.minidev.json.parser.g
    protected void f() {
        int i4 = this.f81784g + 1;
        this.f81784g = i4;
        if (i4 >= this.f81798x) {
            this.f81778a = (char) 26;
        } else {
            this.f81778a = (char) this.f81796y[i4];
        }
    }

    @Override // net.minidev.json.parser.g
    protected void j() throws ParseException {
        int i4 = this.f81784g + 1;
        this.f81784g = i4;
        if (i4 < this.f81798x) {
            this.f81778a = (char) this.f81796y[i4];
        } else {
            this.f81778a = (char) 26;
            throw new ParseException(this.f81784g - 1, 3, ProtectedSandApp.s("襮\u0001"));
        }
    }

    @Override // net.minidev.json.parser.g
    protected void m() {
        int i4 = this.f81784g + 1;
        this.f81784g = i4;
        if (i4 >= this.f81798x) {
            this.f81778a = (char) 26;
        } else {
            this.f81778a = (char) this.f81796y[i4];
        }
    }

    @Override // net.minidev.json.parser.j
    protected void t(int i4, int i5) {
        this.f81783f = new String(this.f81796y, i4, i5 - i4);
    }

    @Override // net.minidev.json.parser.j
    protected int v(char c5, int i4) {
        int i5 = i4;
        while (i4 < this.f81798x) {
            if (this.f81796y[i5] == ((byte) c5)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public Object w(byte[] bArr) throws ParseException {
        return y(bArr, a.f81743a, d.f81749a);
    }

    public Object x(byte[] bArr, a aVar) throws ParseException {
        return y(bArr, aVar, d.f81749a);
    }

    public Object y(byte[] bArr, a aVar, b bVar) throws ParseException {
        this.f81796y = bArr;
        this.f81798x = bArr.length;
        return d(aVar, bVar);
    }
}
