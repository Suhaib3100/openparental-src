package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.io.GifReader;
import com.google.common.primitives.u;
import java.io.IOException;

/* compiled from: ImageDescriptor.java */
/* loaded from: classes5.dex */
public class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f50813a;

    /* renamed from: b, reason: collision with root package name */
    public int f50814b;

    /* renamed from: c, reason: collision with root package name */
    public int f50815c;

    /* renamed from: d, reason: collision with root package name */
    public int f50816d;

    /* renamed from: e, reason: collision with root package name */
    private byte f50817e;

    /* renamed from: f, reason: collision with root package name */
    public c f50818f;

    /* renamed from: g, reason: collision with root package name */
    public int f50819g;

    /* renamed from: h, reason: collision with root package name */
    public int f50820h;

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        this.f50813a = gifReader.readUInt16();
        this.f50814b = gifReader.readUInt16();
        this.f50815c = gifReader.readUInt16();
        this.f50816d = gifReader.readUInt16();
        this.f50817e = gifReader.peek();
        if (c()) {
            c cVar = new c(d());
            this.f50818f = cVar;
            cVar.a(gifReader);
        }
        this.f50819g = gifReader.peek() & 255;
        this.f50820h = gifReader.position();
        while (true) {
            if (gifReader.peek() == 0) {
                return;
            } else {
                gifReader.skip(r0 & 255);
            }
        }
    }

    public boolean b() {
        return (this.f50817e & u.f57540a) == 64;
    }

    public boolean c() {
        return (this.f50817e & 128) == 128;
    }

    public int d() {
        return 2 << (this.f50817e & com.google.common.base.c.f54871q);
    }

    public boolean e() {
        return (this.f50817e & 32) == 32;
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return 0;
    }
}
