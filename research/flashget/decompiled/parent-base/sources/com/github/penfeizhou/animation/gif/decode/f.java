package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.decode.h;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* compiled from: ExtensionBlock.java */
/* loaded from: classes5.dex */
public abstract class f implements b {
    public static f b(GifReader gifReader) throws IOException {
        byte peek = gifReader.peek();
        if (peek == -7) {
            return new i();
        }
        if (peek == 1) {
            return new l();
        }
        if (peek == -2) {
            return new d();
        }
        if (peek == -1) {
            return new a();
        }
        throw new h.a();
    }
}
