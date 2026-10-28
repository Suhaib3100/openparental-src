package com.google.common.io;

import java.nio.Buffer;

/* compiled from: Java8Compatibility.java */
@p
@d9.c
/* loaded from: classes6.dex */
final class u {
    private u() {
    }

    static void a(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer) {
        buffer.flip();
    }

    static void c(Buffer buffer, int i4) {
        buffer.limit(i4);
    }

    static void d(Buffer buffer) {
        buffer.mark();
    }

    static void e(Buffer buffer, int i4) {
        buffer.position(i4);
    }

    static void f(Buffer buffer) {
        buffer.reset();
    }
}
