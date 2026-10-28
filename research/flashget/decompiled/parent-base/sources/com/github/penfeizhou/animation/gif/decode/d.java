package com.github.penfeizhou.animation.gif.decode;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommentExtension.java */
/* loaded from: classes5.dex */
public class d extends f {

    /* renamed from: a, reason: collision with root package name */
    private List<e> f50802a = new ArrayList();

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public void a(GifReader gifReader) throws IOException {
        while (true) {
            e c5 = e.c(gifReader);
            if (c5.b()) {
                return;
            } else {
                this.f50802a.add(c5);
            }
        }
    }

    @Override // com.github.penfeizhou.animation.gif.decode.b
    public int size() {
        return 0;
    }
}
