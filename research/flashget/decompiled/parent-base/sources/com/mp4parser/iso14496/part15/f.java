package com.mp4parser.iso14496.part15;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: TemporalSubLayerSampleGroup.java */
/* loaded from: classes6.dex */
public class f extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f70082b = ProtectedSandApp.s("ᦘ\u0001");

    /* renamed from: a, reason: collision with root package name */
    int f70083a;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        return ByteBuffer.allocate(0);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("ᦘ\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return 41;
    }
}
