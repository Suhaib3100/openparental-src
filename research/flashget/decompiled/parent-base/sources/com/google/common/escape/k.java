package com.google.common.escape;

/* compiled from: Platform.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<char[]> f56709a = new a();

    /* compiled from: Platform.java */
    class a extends ThreadLocal<char[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private k() {
    }

    static char[] a() {
        return f56709a.get();
    }
}
