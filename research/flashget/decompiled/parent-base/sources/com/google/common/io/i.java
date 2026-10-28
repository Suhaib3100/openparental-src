package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* compiled from: CharSink.java */
@p
@d9.c
/* loaded from: classes6.dex */
public abstract class i {
    protected i() {
    }

    public Writer a() throws IOException {
        Writer b5 = b();
        return b5 instanceof BufferedWriter ? (BufferedWriter) b5 : new BufferedWriter(b5);
    }

    public abstract Writer b() throws IOException;

    public void c(CharSequence charSequence) throws IOException {
        charSequence.getClass();
        try {
            Writer writer = (Writer) m.a().b(b());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    @f9.a
    public long d(Readable readable) throws IOException {
        readable.getClass();
        try {
            Writer writer = (Writer) m.a().b(b());
            long b5 = k.b(readable, writer);
            writer.flush();
            return b5;
        } finally {
        }
    }

    public void e(Iterable<? extends CharSequence> iterable) throws IOException {
        f(iterable, System.getProperty(ProtectedSandApp.s("\uf682")));
    }

    public void f(Iterable<? extends CharSequence> iterable, String str) throws IOException {
        iterable.getClass();
        str.getClass();
        try {
            Writer writer = (Writer) m.a().b(a());
            Iterator<? extends CharSequence> it = iterable.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) str);
            }
            writer.flush();
        } finally {
        }
    }
}
