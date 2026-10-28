package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import androidx.core.view.h0;
import java.nio.ByteBuffer;

/* compiled from: BitWriterBuffer.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f63964d = false;

    /* renamed from: a, reason: collision with root package name */
    int f63965a;

    /* renamed from: b, reason: collision with root package name */
    int f63966b = 0;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer f63967c;

    public d(ByteBuffer byteBuffer) {
        this.f63967c = byteBuffer;
        this.f63965a = byteBuffer.position();
    }

    public void a(int i4, int i5) {
        int i6 = this.f63966b;
        int i7 = 8 - (i6 % 8);
        if (i5 <= i7) {
            int i10 = this.f63967c.get((i6 / 8) + this.f63965a);
            if (i10 < 0) {
                i10 += 256;
            }
            int i11 = i10 + (i4 << (i7 - i5));
            ByteBuffer byteBuffer = this.f63967c;
            int i12 = (this.f63966b / 8) + this.f63965a;
            if (i11 > 127) {
                i11 += h0.f27194u;
            }
            byteBuffer.put(i12, (byte) i11);
            this.f63966b += i5;
        } else {
            int i13 = i5 - i7;
            a(i4 >> i13, i7);
            a(i4 & ((1 << i13) - 1), i13);
        }
        ByteBuffer byteBuffer2 = this.f63967c;
        int i14 = this.f63965a;
        int i15 = this.f63966b;
        byteBuffer2.position((i15 / 8) + i14 + (i15 % 8 <= 0 ? 0 : 1));
    }

    public void b(boolean z4) {
        a(z4 ? 1 : 0, 1);
    }
}
