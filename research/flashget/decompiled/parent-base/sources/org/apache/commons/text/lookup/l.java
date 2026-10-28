package org.apache.commons.text.lookup;

/* compiled from: IllegalArgumentExceptions.java */
/* loaded from: classes3.dex */
final class l {
    private l() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    static IllegalArgumentException b(Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr), th);
    }
}
