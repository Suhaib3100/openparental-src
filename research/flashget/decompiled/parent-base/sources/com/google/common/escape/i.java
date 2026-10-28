package com.google.common.escape;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.r;

/* compiled from: Escapers.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final h f56701a = new a();

    /* compiled from: Escapers.java */
    class a extends d {
        a() {
        }

        @Override // com.google.common.escape.d, com.google.common.escape.h
        public String b(String str) {
            str.getClass();
            return str;
        }

        @Override // com.google.common.escape.d
        @zc.a
        protected char[] c(char c5) {
            return null;
        }
    }

    /* compiled from: Escapers.java */
    class b extends l {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f56702c;

        b(d dVar) {
            this.f56702c = dVar;
        }

        @Override // com.google.common.escape.l
        @zc.a
        protected char[] d(int i4) {
            if (i4 < 65536) {
                return this.f56702c.c((char) i4);
            }
            char[] cArr = new char[2];
            Character.toChars(i4, cArr, 0);
            char[] c5 = this.f56702c.c(cArr[0]);
            char[] c6 = this.f56702c.c(cArr[1]);
            if (c5 == null && c6 == null) {
                return null;
            }
            int length = c5 != null ? c5.length : 1;
            char[] cArr2 = new char[(c6 != null ? c6.length : 1) + length];
            if (c5 != null) {
                for (int i5 = 0; i5 < c5.length; i5++) {
                    cArr2[i5] = c5[i5];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (c6 != null) {
                for (int i6 = 0; i6 < c6.length; i6++) {
                    cArr2[length + i6] = c6[i6];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    /* compiled from: Escapers.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Character, String> f56703a;

        /* renamed from: b, reason: collision with root package name */
        private char f56704b;

        /* renamed from: c, reason: collision with root package name */
        private char f56705c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private String f56706d;

        /* compiled from: Escapers.java */
        class a extends com.google.common.escape.a {

            /* renamed from: g, reason: collision with root package name */
            @zc.a
            private final char[] f56707g;

            a(Map map, char c5, char c6) {
                super((Map<Character, String>) map, c5, c6);
                this.f56707g = c.this.f56706d != null ? c.this.f56706d.toCharArray() : null;
            }

            @Override // com.google.common.escape.a
            @zc.a
            protected char[] f(char c5) {
                return this.f56707g;
            }
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @f9.a
        public c b(char c5, String str) {
            str.getClass();
            this.f56703a.put(Character.valueOf(c5), str);
            return this;
        }

        public h c() {
            return new a(this.f56703a, this.f56704b, this.f56705c);
        }

        @f9.a
        public c d(char c5, char c6) {
            this.f56704b = c5;
            this.f56705c = c6;
            return this;
        }

        @f9.a
        public c e(String str) {
            this.f56706d = str;
            return this;
        }

        private c() {
            this.f56703a = new HashMap();
            this.f56704b = (char) 0;
            this.f56705c = r.MAX_VALUE;
            this.f56706d = null;
        }
    }

    private i() {
    }

    static l a(h hVar) {
        hVar.getClass();
        if (hVar instanceof l) {
            return (l) hVar;
        }
        if (hVar instanceof d) {
            return new b((d) hVar);
        }
        String name = hVar.getClass().getName();
        int length = name.length();
        String s4 = ProtectedSandApp.s("\uf595");
        throw new IllegalArgumentException(length != 0 ? s4.concat(name) : new String(s4));
    }

    public static c b() {
        return new c(null);
    }

    @zc.a
    public static String c(d dVar, char c5) {
        return f(dVar.c(c5));
    }

    @zc.a
    public static String d(l lVar, int i4) {
        return f(lVar.d(i4));
    }

    public static h e() {
        return f56701a;
    }

    @zc.a
    private static String f(@zc.a char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    private static l g(d dVar) {
        return new b(dVar);
    }
}
