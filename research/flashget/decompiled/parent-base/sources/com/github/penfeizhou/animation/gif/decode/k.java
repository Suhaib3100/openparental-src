package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* compiled from: LogicalScreenDescriptor.java */
/* loaded from: classes5.dex */
public class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f50821a;

    /* renamed from: b, reason: collision with root package name */
    public int f50822b;

    /* renamed from: c, reason: collision with root package name */
    byte f50823c;

    /* renamed from: d, reason: collision with root package name */
    public byte f50824d;

    /* renamed from: e, reason: collision with root package name */
    byte f50825e;

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        this.f50821a = gifReader.readUInt16();
        this.f50822b = gifReader.readUInt16();
        this.f50823c = gifReader.peek();
        this.f50824d = gifReader.peek();
        this.f50825e = gifReader.peek();
    }

    public int b() {
        return ((this.f50823c & 112) >> 4) + 1;
    }

    public boolean c() {
        return (this.f50823c & 128) == 128;
    }

    public int d() {
        return 2 << (this.f50823c & 7);
    }

    public boolean e() {
        return (this.f50823c & 8) == 8;
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return 7;
    }
}
