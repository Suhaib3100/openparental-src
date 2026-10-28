package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CharStreams.java */
@p
@d9.c
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int f57140a = 2048;

    /* compiled from: CharStreams.java */
    private static final class a extends Writer {

        /* renamed from: b, reason: collision with root package name */
        private static final a f57141b = new a();

        private a() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c5) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return ProtectedSandApp.s("\uf6b2");
        }

        @Override // java.io.Writer
        public void write(int i4) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@zc.a CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) {
            l0.f0(i4, i5 + i4, cArr.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Appendable append(char c5) throws IOException {
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i4, int i5) {
            l0.f0(i4, i5 + i4, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Appendable append(@zc.a CharSequence charSequence) throws IOException {
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            str.getClass();
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            cArr.getClass();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@zc.a CharSequence charSequence, int i4, int i5) {
            l0.f0(i4, i5, charSequence == null ? 4 : charSequence.length());
            return this;
        }
    }

    private k() {
    }

    @d9.a
    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new com.google.common.io.a(appendable);
    }

    @f9.a
    public static long b(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? c((Reader) readable, (StringBuilder) appendable) : d((Reader) readable, a(appendable));
        }
        readable.getClass();
        appendable.getClass();
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j4 = 0;
        while (readable.read(allocate) != -1) {
            allocate.flip();
            appendable.append(allocate);
            j4 += allocate.remaining();
            allocate.clear();
        }
        return j4;
    }

    @f9.a
    static long c(Reader reader, StringBuilder sb) throws IOException {
        reader.getClass();
        sb.getClass();
        char[] cArr = new char[2048];
        long j4 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read == -1) {
                return j4;
            }
            sb.append(cArr, 0, read);
            j4 += read;
        }
    }

    @f9.a
    static long d(Reader reader, Writer writer) throws IOException {
        reader.getClass();
        writer.getClass();
        char[] cArr = new char[2048];
        long j4 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read == -1) {
                return j4;
            }
            writer.write(cArr, 0, read);
            j4 += read;
        }
    }

    static CharBuffer e() {
        return CharBuffer.allocate(2048);
    }

    @d9.a
    @f9.a
    public static long f(Readable readable) throws IOException {
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j4 = 0;
        while (true) {
            long read = readable.read(allocate);
            if (read == -1) {
                return j4;
            }
            j4 += read;
            allocate.clear();
        }
    }

    @d9.a
    public static Writer g() {
        return a.f57141b;
    }

    @f9.a
    @d9.a
    @c0
    public static <T> T h(Readable readable, w<T> wVar) throws IOException {
        String b5;
        readable.getClass();
        wVar.getClass();
        x xVar = new x(readable);
        do {
            b5 = xVar.b();
            if (b5 == null) {
                break;
            }
        } while (wVar.b(b5));
        return wVar.a();
    }

    @d9.a
    public static List<String> i(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        x xVar = new x(readable);
        while (true) {
            String b5 = xVar.b();
            if (b5 == null) {
                return arrayList;
            }
            arrayList.add(b5);
        }
    }

    @d9.a
    public static void j(Reader reader, long j4) throws IOException {
        reader.getClass();
        while (j4 > 0) {
            long skip = reader.skip(j4);
            if (skip == 0) {
                throw new EOFException();
            }
            j4 -= skip;
        }
    }

    public static String k(Readable readable) throws IOException {
        return l(readable).toString();
    }

    private static StringBuilder l(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (readable instanceof Reader) {
            c((Reader) readable, sb);
        } else {
            b(readable, sb);
        }
        return sb;
    }
}
