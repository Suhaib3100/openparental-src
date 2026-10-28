package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* compiled from: MoreObjects.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class d0 {

    /* compiled from: MoreObjects.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f54893a;

        /* renamed from: b, reason: collision with root package name */
        private final C0827b f54894b;

        /* renamed from: c, reason: collision with root package name */
        private C0827b f54895c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f54896d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f54897e;

        /* compiled from: MoreObjects.java */
        private static final class a extends C0827b {
            private a() {
            }

            a(a aVar) {
            }
        }

        /* compiled from: MoreObjects.java */
        /* renamed from: com.google.common.base.d0$b$b, reason: collision with other inner class name */
        private static class C0827b {

            /* renamed from: a, reason: collision with root package name */
            @zc.a
            String f54898a;

            /* renamed from: b, reason: collision with root package name */
            @zc.a
            Object f54899b;

            /* renamed from: c, reason: collision with root package name */
            @zc.a
            C0827b f54900c;

            private C0827b() {
            }

            C0827b(a aVar) {
            }
        }

        private C0827b h() {
            C0827b c0827b = new C0827b();
            this.f54895c.f54900c = c0827b;
            this.f54895c = c0827b;
            return c0827b;
        }

        private b i(@zc.a Object obj) {
            h().f54899b = obj;
            return this;
        }

        private b j(String str, @zc.a Object obj) {
            C0827b h4 = h();
            h4.f54899b = obj;
            str.getClass();
            h4.f54898a = str;
            return this;
        }

        private a k() {
            a aVar = new a();
            this.f54895c.f54900c = aVar;
            this.f54895c = aVar;
            return aVar;
        }

        private b l(Object obj) {
            k().f54899b = obj;
            return this;
        }

        private b m(String str, Object obj) {
            a k4 = k();
            k4.f54899b = obj;
            str.getClass();
            k4.f54898a = str;
            return this;
        }

        private static boolean u(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof g0 ? !((g0) obj).e() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        @f9.a
        public b a(String str, char c5) {
            return m(str, String.valueOf(c5));
        }

        @f9.a
        public b b(String str, double d5) {
            return m(str, String.valueOf(d5));
        }

        @f9.a
        public b c(String str, float f4) {
            return m(str, String.valueOf(f4));
        }

        @f9.a
        public b d(String str, int i4) {
            return m(str, String.valueOf(i4));
        }

        @f9.a
        public b e(String str, long j4) {
            return m(str, String.valueOf(j4));
        }

        @f9.a
        public b f(String str, @zc.a Object obj) {
            return j(str, obj);
        }

        @f9.a
        public b g(String str, boolean z4) {
            return m(str, String.valueOf(z4));
        }

        @f9.a
        public b n(char c5) {
            k().f54899b = String.valueOf(c5);
            return this;
        }

        @f9.a
        public b o(double d5) {
            k().f54899b = String.valueOf(d5);
            return this;
        }

        @f9.a
        public b p(float f4) {
            k().f54899b = String.valueOf(f4);
            return this;
        }

        @f9.a
        public b q(int i4) {
            k().f54899b = String.valueOf(i4);
            return this;
        }

        @f9.a
        public b r(long j4) {
            k().f54899b = String.valueOf(j4);
            return this;
        }

        @f9.a
        public b s(@zc.a Object obj) {
            h().f54899b = obj;
            return this;
        }

        @f9.a
        public b t(boolean z4) {
            k().f54899b = String.valueOf(z4);
            return this;
        }

        public String toString() {
            boolean z4 = this.f54896d;
            boolean z5 = this.f54897e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f54893a);
            sb.append('{');
            String str = "";
            for (C0827b c0827b = this.f54894b.f54900c; c0827b != null; c0827b = c0827b.f54900c) {
                Object obj = c0827b.f54899b;
                if (!(c0827b instanceof a)) {
                    if (obj == null) {
                        if (z4) {
                        }
                    } else if (z5 && u(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c0827b.f54898a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ProtectedSandApp.s("\uf2ce");
            }
            sb.append('}');
            return sb.toString();
        }

        @f9.a
        public b v() {
            this.f54896d = true;
            return this;
        }

        private b(String str) {
            C0827b c0827b = new C0827b();
            this.f54894b = c0827b;
            this.f54895c = c0827b;
            this.f54896d = false;
            this.f54897e = false;
            str.getClass();
            this.f54893a = str;
        }
    }

    private d0() {
    }

    public static <T> T a(@zc.a T t4, T t5) {
        if (t4 != null) {
            return t4;
        }
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(ProtectedSandApp.s("\uf2cf"));
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b d(String str) {
        return new b(str);
    }
}
