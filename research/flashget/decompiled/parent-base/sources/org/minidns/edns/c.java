package org.minidns.edns;

import androidx.compose.material3.j4;
import java.nio.charset.StandardCharsets;
import org.minidns.edns.a;
import org.minidns.util.f;

/* compiled from: Nsid.java */
/* loaded from: classes9.dex */
public class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final c f87333f = new c();

    private c() {
        super(new byte[0]);
    }

    @Override // org.minidns.edns.b
    protected CharSequence b() {
        return f.a(this.f87329c);
    }

    @Override // org.minidns.edns.b
    public a.c c() {
        return a.c.NSID;
    }

    @Override // org.minidns.edns.b
    protected CharSequence e() {
        StringBuilder a5 = j4.a(a.c.NSID + ": ");
        a5.append(new String(this.f87329c, StandardCharsets.US_ASCII));
        return a5.toString();
    }

    public c(byte[] bArr) {
        super(bArr);
    }
}
