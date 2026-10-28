package com.github.penfeizhou.animation.gif.decode;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* compiled from: ApplicationExtension.java */
/* loaded from: classes5.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public int f50799a = -1;

    /* renamed from: b, reason: collision with root package name */
    public String f50800b;

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        byte peek = gifReader.peek();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < peek; i4++) {
            sb.append((char) gifReader.peek());
        }
        String sb2 = sb.toString();
        this.f50800b = sb2;
        if (!ProtectedSandApp.s("쑼").equals(sb2)) {
            while (!e.c(gifReader).b()) {
            }
            return;
        }
        if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
            this.f50799a = gifReader.readUInt16();
        }
        while (!e.c(gifReader).b()) {
        }
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return 0;
    }
}
