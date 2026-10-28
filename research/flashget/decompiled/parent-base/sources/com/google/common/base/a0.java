package com.google.common.base;

import java.nio.Buffer;

/* compiled from: Java8Compatibility.java */
@d9.c
@o
/* loaded from: classes6.dex */
final class a0 {
    private a0() {
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
