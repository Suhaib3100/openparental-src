package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* compiled from: FileDeleteStrategy.java */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f85405b = new g("Normal");

    /* renamed from: c, reason: collision with root package name */
    public static final g f85406c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f85407a;

    /* compiled from: FileDeleteStrategy.java */
    static class a extends g {
        a() {
            super("Force");
        }

        @Override // org.apache.commons.io.g
        protected boolean c(File file) throws IOException {
            i.E(file);
            return true;
        }
    }

    protected g(String str) {
        this.f85407a = str;
    }

    public void a(File file) throws IOException {
        if (file.exists() && !c(file)) {
            throw new IOException(androidx.core.content.g.a("Deletion failed: ", file));
        }
    }

    public boolean b(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        try {
            return c(file);
        } catch (IOException unused) {
            return false;
        }
    }

    protected boolean c(File file) throws IOException {
        return file.delete();
    }

    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder("FileDeleteStrategy["), this.f85407a, "]");
    }
}
