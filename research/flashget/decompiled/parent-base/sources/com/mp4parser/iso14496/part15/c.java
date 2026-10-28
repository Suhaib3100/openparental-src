package com.mp4parser.iso14496.part15;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: StepwiseTemporalLayerEntry.java */
/* loaded from: classes6.dex */
public class c extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f70066a = ProtectedSandApp.s("ᦈ\u0001");

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        return ByteBuffer.allocate(0);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("ᦈ\u0001");
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
        return 37;
    }
}
