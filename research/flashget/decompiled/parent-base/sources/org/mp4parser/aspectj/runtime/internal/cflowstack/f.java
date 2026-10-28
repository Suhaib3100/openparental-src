package org.mp4parser.aspectj.runtime.internal.cflowstack;

import java.util.Stack;

/* compiled from: ThreadStackFactoryImpl.java */
/* loaded from: classes9.dex */
public class f implements d {

    /* compiled from: ThreadStackFactoryImpl.java */
    private static class a extends ThreadLocal implements org.mp4parser.aspectj.runtime.internal.cflowstack.a {

        /* compiled from: ThreadStackFactoryImpl.java */
        /* renamed from: org.mp4parser.aspectj.runtime.internal.cflowstack.f$a$a, reason: collision with other inner class name */
        static class C1364a {

            /* renamed from: a, reason: collision with root package name */
            protected int f87725a = 0;

            C1364a() {
            }
        }

        private a() {
        }

        @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
        public void a() {
            C1364a e4 = e();
            e4.f87725a--;
        }

        @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
        public void b() {
            remove();
        }

        @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
        public void c() {
            e().f87725a++;
        }

        @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
        public boolean d() {
            return e().f87725a != 0;
        }

        public C1364a e() {
            return (C1364a) get();
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new C1364a();
        }

        a(e eVar) {
        }
    }

    /* compiled from: ThreadStackFactoryImpl.java */
    private static class b extends ThreadLocal implements c {
        private b() {
        }

        @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.c
        public Stack a() {
            return (Stack) get();
        }

        @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.c
        public void b() {
            remove();
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new Stack();
        }

        b(e eVar) {
        }
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.d
    public org.mp4parser.aspectj.runtime.internal.cflowstack.a a() {
        return new a();
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.d
    public c b() {
        return new b();
    }
}
