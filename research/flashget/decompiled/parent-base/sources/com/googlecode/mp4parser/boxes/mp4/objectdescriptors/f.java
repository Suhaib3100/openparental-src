package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: DecoderSpecificInfo.java */
@g(tags = {5})
/* loaded from: classes6.dex */
public class f extends b {

    /* renamed from: e, reason: collision with root package name */
    byte[] f63979e;

    public f() {
        this.f63958a = 5;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        return this.f63979e.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f63979e, ((f) obj).f63979e);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.f63979e = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        com.coremedia.iso.i.m(allocate, this.f63958a);
        h(allocate, a());
        allocate.put(this.f63979e);
        return (ByteBuffer) allocate.rewind();
    }

    public int hashCode() {
        byte[] bArr = this.f63979e;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public void i(byte[] bArr) {
        this.f63979e = bArr;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ጸ\u0001"));
        byte[] bArr = this.f63979e;
        return f3.a(sb, bArr == null ? ProtectedSandApp.s("ጹ\u0001") : com.coremedia.iso.e.b(bArr), '}');
    }
}
