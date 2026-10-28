package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.decode.h;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* compiled from: GraphicControlExtension.java */
/* loaded from: classes5.dex */
public class i extends f {

    /* renamed from: a, reason: collision with root package name */
    private int f50809a;

    /* renamed from: b, reason: collision with root package name */
    private byte f50810b;

    /* renamed from: c, reason: collision with root package name */
    public int f50811c;

    /* renamed from: d, reason: collision with root package name */
    public int f50812d;

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        this.f50809a = gifReader.peek() & 255;
        this.f50810b = gifReader.peek();
        this.f50811c = gifReader.readUInt16();
        this.f50812d = gifReader.peek() & 255;
        if (gifReader.peek() != 0) {
            throw new h.a();
        }
    }

    public int c() {
        return (this.f50810b >> 2) & 7;
    }

    public boolean d() {
        return (this.f50810b & 1) == 1;
    }

    public boolean e() {
        return (this.f50810b & 2) == 2;
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return this.f50809a + 1;
    }
}
