package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: UnknownEntry.java */
/* loaded from: classes6.dex */
public class f extends b {

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f64036a;

    /* renamed from: b, reason: collision with root package name */
    private String f64037b;

    public f(String str) {
        this.f64037b = str;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        return this.f64036a.duplicate();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return this.f64037b;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        this.f64036a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public ByteBuffer e() {
        return this.f64036a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f64036a;
        ByteBuffer byteBuffer2 = ((f) obj).f64036a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public void f(ByteBuffer byteBuffer) {
        this.f64036a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f64036a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer duplicate = this.f64036a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return ProtectedSandApp.s("Ꭹ\u0001") + com.coremedia.iso.e.b(bArr) + '}';
    }
}
