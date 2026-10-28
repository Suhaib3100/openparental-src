package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: JSONParserInputStream.java */
/* loaded from: classes7.dex */
class i extends l {

    /* renamed from: x, reason: collision with root package name */
    private InputStream f81797x;

    public i(int i4) {
        super(i4);
    }

    @Override // net.minidev.json.parser.g
    protected void f() throws IOException {
        int read = this.f81797x.read();
        this.f81778a = read == -1 ? (char) 26 : (char) read;
        this.f81784g++;
    }

    @Override // net.minidev.json.parser.g
    protected void j() throws ParseException, IOException {
        int read = this.f81797x.read();
        if (read == -1) {
            throw new ParseException(this.f81784g - 1, 3, ProtectedSandApp.s("襯\u0001"));
        }
        this.f81778a = (char) read;
    }

    @Override // net.minidev.json.parser.g
    protected void m() throws IOException {
        this.f81781d.a(this.f81778a);
        int read = this.f81797x.read();
        if (read == -1) {
            this.f81778a = (char) 26;
        } else {
            this.f81778a = (char) read;
            this.f81784g++;
        }
    }

    public Object t(InputStream inputStream) throws ParseException {
        return v(inputStream, a.f81743a, d.f81749a);
    }

    public Object u(InputStream inputStream, a aVar) throws ParseException {
        return v(inputStream, aVar, d.f81749a);
    }

    public Object v(InputStream inputStream, a aVar, b bVar) throws ParseException {
        this.f81797x = inputStream;
        return super.d(aVar, bVar);
    }
}
