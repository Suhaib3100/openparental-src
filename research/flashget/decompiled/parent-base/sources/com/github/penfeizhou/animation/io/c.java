package com.github.penfeizhou.animation.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: FileReader.java */
/* loaded from: classes5.dex */
public class c extends d {

    /* renamed from: b, reason: collision with root package name */
    private final File f50850b;

    public c(File file) throws IOException {
        super(new e(new FileInputStream(file)));
        this.f50850b = file;
    }

    @Override // com.github.penfeizhou.animation.io.d, com.github.penfeizhou.animation.io.Reader
    public void reset() throws IOException {
        this.reader.close();
        this.reader = new e(new FileInputStream(this.f50850b));
    }
}
