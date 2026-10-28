package com.google.common.hash;

import java.nio.Buffer;

/* compiled from: Java8Compatibility.java */
@k
@d9.c
/* loaded from: classes6.dex */
final class w {
    private w() {
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

    static void d(Buffer buffer, int i4) {
        buffer.position(i4);
    }
}
