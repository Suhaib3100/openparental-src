package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: LineReader.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Readable f57170a;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private final Reader f57171b;

    /* renamed from: c, reason: collision with root package name */
    private final CharBuffer f57172c;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f57173d;

    /* renamed from: e, reason: collision with root package name */
    private final Queue<String> f57174e;

    /* renamed from: f, reason: collision with root package name */
    private final v f57175f;

    /* compiled from: LineReader.java */
    class a extends v {
        a() {
        }

        @Override // com.google.common.io.v
        protected void d(String str, String str2) {
            x.this.f57174e.add(str);
        }
    }

    public x(Readable readable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        this.f57172c = allocate;
        this.f57173d = allocate.array();
        this.f57174e = new ArrayDeque();
        this.f57175f = new a();
        readable.getClass();
        this.f57170a = readable;
        this.f57171b = readable instanceof Reader ? (Reader) readable : null;
    }

    @zc.a
    @f9.a
    public String b() throws IOException {
        int read;
        while (true) {
            if (this.f57174e.peek() != null) {
                break;
            }
            this.f57172c.clear();
            Reader reader = this.f57171b;
            if (reader != null) {
                char[] cArr = this.f57173d;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.f57170a.read(this.f57172c);
            }
            if (read == -1) {
                this.f57175f.b();
                break;
            }
            this.f57175f.a(this.f57173d, 0, read);
        }
        return this.f57174e.poll();
    }
}
