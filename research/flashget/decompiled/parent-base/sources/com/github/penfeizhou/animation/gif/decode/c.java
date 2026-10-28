package com.github.penfeizhou.animation.gif.decode;

import androidx.core.view.x1;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* compiled from: ColorTable.java */
/* loaded from: classes5.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private int[] f50801a;

    public c(int i4) {
        this.f50801a = new int[i4];
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        for (int i4 = 0; i4 < this.f50801a.length; i4++) {
            byte peek = gifReader.peek();
            byte peek2 = gifReader.peek();
            int i5 = (peek2 & 255) << 8;
            int i6 = peek & 255;
            this.f50801a[i4] = i6 | i5 | ((gifReader.peek() & 255) << 16) | x1.f27484y;
        }
    }

    public int[] b() {
        return this.f50801a;
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return this.f50801a.length * 3;
    }
}
