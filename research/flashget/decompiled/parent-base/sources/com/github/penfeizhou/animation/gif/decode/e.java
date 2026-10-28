package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* compiled from: DataSubBlock.java */
/* loaded from: classes5.dex */
public class e implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final e f50803c = new e(0);

    /* renamed from: a, reason: collision with root package name */
    private final int f50804a;

    /* renamed from: b, reason: collision with root package name */
    private int f50805b;

    public e(int i4) {
        this.f50804a = i4;
    }

    public static e c(GifReader gifReader) throws IOException {
        int peek = gifReader.peek() & 255;
        if (peek == 0) {
            return f50803c;
        }
        e eVar = new e(peek);
        eVar.f50805b = gifReader.position();
        eVar.a(gifReader);
        return eVar;
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        gifReader.skip(this.f50804a);
    }

    public boolean b() {
        return this == f50803c;
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return this.f50804a + 1;
    }
}
