package com.github.penfeizhou.animation.loader;

import com.github.penfeizhou.animation.io.Reader;
import java.io.File;
import java.io.IOException;

/* compiled from: FileLoader.java */
/* loaded from: classes5.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final File f50854a;

    /* renamed from: b, reason: collision with root package name */
    private Reader f50855b;

    public c(String str) {
        this.f50854a = new File(str);
    }

    @Override // com.github.penfeizhou.animation.loader.d
    public synchronized Reader a() throws IOException {
        return new com.github.penfeizhou.animation.io.c(this.f50854a);
    }
}
