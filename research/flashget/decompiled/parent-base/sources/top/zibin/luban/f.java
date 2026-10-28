package top.zibin.luban;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamAdapter.java */
/* loaded from: classes9.dex */
public abstract class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f91936a;

    public abstract InputStream a() throws IOException;

    @Override // top.zibin.luban.g
    public void close() {
        InputStream inputStream = this.f91936a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f91936a = null;
                throw th;
            }
            this.f91936a = null;
        }
    }

    @Override // top.zibin.luban.g
    public InputStream open() throws IOException {
        close();
        InputStream a5 = a();
        this.f91936a = a5;
        return a5;
    }
}
