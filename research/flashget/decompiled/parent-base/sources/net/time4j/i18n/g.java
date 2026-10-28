package net.time4j.i18n;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;

/* compiled from: UTF8ResourceReader.java */
/* loaded from: classes7.dex */
class g extends Reader {

    /* renamed from: b, reason: collision with root package name */
    private final PushbackInputStream f83290b;

    /* renamed from: c, reason: collision with root package name */
    private BufferedReader f83291c = null;

    g(InputStream inputStream) {
        this.f83290b = new PushbackInputStream(inputStream, 3);
    }

    private void a() throws IOException {
        if (this.f83291c != null) {
            return;
        }
        byte[] bArr = new byte[3];
        int read = this.f83290b.read(bArr, 0, 3);
        if ((read != 3 || bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) && read > 0) {
            this.f83290b.unread(bArr, 0, read);
        }
        this.f83291c = new BufferedReader(new InputStreamReader(this.f83290b, ProtectedSandApp.s("靆\u0001")));
    }

    public String b() throws IOException {
        a();
        return this.f83291c.readLine();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        BufferedReader bufferedReader = this.f83291c;
        if (bufferedReader == null) {
            this.f83290b.close();
        } else {
            bufferedReader.close();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i4, int i5) throws IOException {
        a();
        return this.f83291c.read(cArr, i4, i5);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        a();
        return this.f83291c.ready();
    }
}
