package com.googlecode.mp4parser.contentprotection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: GenericHeader.java */
/* loaded from: classes6.dex */
public class a extends com.googlecode.mp4parser.boxes.piff.a {

    /* renamed from: c, reason: collision with root package name */
    public static UUID f64056c;

    /* renamed from: b, reason: collision with root package name */
    ByteBuffer f64057b;

    static {
        UUID fromString = UUID.fromString(ProtectedSandApp.s("ᐨ\u0001"));
        f64056c = fromString;
        com.googlecode.mp4parser.boxes.piff.a.f64044a.put(fromString, a.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public ByteBuffer b() {
        return this.f64057b;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public UUID c() {
        return f64056c;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public void d(ByteBuffer byteBuffer) {
        this.f64057b = byteBuffer;
    }
}
