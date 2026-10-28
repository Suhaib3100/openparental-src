package org.minidns.record;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.minidns.record.u;

/* compiled from: Data.java */
/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f87432b;

    /* renamed from: c, reason: collision with root package name */
    private transient Integer f87433c;

    private void d() {
        if (this.f87432b != null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(new DataOutputStream(byteArrayOutputStream));
            this.f87432b = byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract u.c a();

    public final int b() {
        d();
        return this.f87432b.length;
    }

    protected abstract void c(DataOutputStream dataOutputStream) throws IOException;

    public final byte[] e() {
        d();
        return (byte[]) this.f87432b.clone();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        hVar.d();
        d();
        return Arrays.equals(this.f87432b, hVar.f87432b);
    }

    public final void f(DataOutputStream dataOutputStream) throws IOException {
        d();
        dataOutputStream.write(this.f87432b);
    }

    public final void g(OutputStream outputStream) throws IOException {
        f(new DataOutputStream(outputStream));
    }

    public final int hashCode() {
        if (this.f87433c == null) {
            d();
            this.f87433c = Integer.valueOf(Arrays.hashCode(this.f87432b));
        }
        return this.f87433c.intValue();
    }
}
