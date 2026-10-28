package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* compiled from: FileDeleteStrategy.java */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f31905b = new g("Normal");

    /* renamed from: c, reason: collision with root package name */
    public static final g f31906c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31907a;

    /* compiled from: FileDeleteStrategy.java */
    /* loaded from: classes6.dex */
    static class a extends g {
        a() {
            super("Force");
        }

        @Override // org.apache.commons.io.g
        protected boolean c(File file) throws IOException {
            j.E(file);
            return true;
        }
    }

    protected g(String str) {
        this.f31907a = str;
    }

    public void a(File file) throws IOException {
        if (!file.exists() || c(file)) {
            return;
        }
        throw new IOException("Deletion failed: " + file);
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
        return androidx.concurrent.futures.a.a(new StringBuilder("FileDeleteStrategy["), this.f31907a, "]");
    }
}
