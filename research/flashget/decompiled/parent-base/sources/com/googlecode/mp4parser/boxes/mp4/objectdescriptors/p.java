package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: UnknownDescriptor.java */
/* loaded from: classes6.dex */
public class p extends b {

    /* renamed from: f, reason: collision with root package name */
    private static Logger f64014f = Logger.getLogger(p.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f64015e;

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        throw new RuntimeException(ProtectedSandApp.s("፡\u0001"));
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f64015e = byteBuffer.slice();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        throw new RuntimeException(ProtectedSandApp.s("፡\u0001"));
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return ProtectedSandApp.s("።\u0001") + this.f63958a + ProtectedSandApp.s("፣\u0001") + this.f63959b + ProtectedSandApp.s("፤\u0001") + this.f64015e + '}';
    }
}
