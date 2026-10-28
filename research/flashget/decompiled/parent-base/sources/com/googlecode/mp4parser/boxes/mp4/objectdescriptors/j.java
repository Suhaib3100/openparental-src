package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ExtensionProfileLevelDescriptor.java */
@g(tags = {19})
/* loaded from: classes6.dex */
public class j extends b {

    /* renamed from: e, reason: collision with root package name */
    byte[] f63996e;

    public j() {
        this.f63958a = 19;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        throw new RuntimeException(ProtectedSandApp.s("ፊ\u0001"));
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        if (b() > 0) {
            byte[] bArr = new byte[b()];
            this.f63996e = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        throw new RuntimeException(ProtectedSandApp.s("ፊ\u0001"));
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ፋ\u0001"));
        byte[] bArr = this.f63996e;
        return f3.a(sb, bArr == null ? ProtectedSandApp.s("ፌ\u0001") : com.coremedia.iso.e.b(bArr), '}');
    }
}
