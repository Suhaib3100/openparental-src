package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.b;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.model.d;
import com.google.firebase.crashlytics.internal.model.e;
import com.google.firebase.crashlytics.internal.model.f;
import com.google.firebase.crashlytics.internal.model.g;
import com.google.firebase.crashlytics.internal.model.h;
import com.google.firebase.crashlytics.internal.model.i;
import com.google.firebase.crashlytics.internal.model.j;
import com.google.firebase.crashlytics.internal.model.k;
import com.google.firebase.crashlytics.internal.model.l;
import com.google.firebase.crashlytics.internal.model.m;
import com.google.firebase.crashlytics.internal.model.n;
import com.google.firebase.crashlytics.internal.model.o;
import com.google.firebase.crashlytics.internal.model.p;
import com.google.firebase.crashlytics.internal.model.q;
import com.google.firebase.crashlytics.internal.model.r;
import com.google.firebase.crashlytics.internal.model.s;
import com.google.firebase.crashlytics.internal.model.t;
import com.google.firebase.crashlytics.internal.model.u;
import com.google.firebase.crashlytics.internal.model.v;
import com.google.firebase.crashlytics.internal.model.w;
import com.google.firebase.crashlytics.internal.model.x;
import com.google.firebase.crashlytics.internal.model.y;
import com.google.firebase.crashlytics.internal.model.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;
import t9.a;

/* compiled from: CrashlyticsReport.java */
@t9.a
@b9.c
/* loaded from: classes6.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f59216a = Charset.forName(ProtectedSandApp.s("\ufdd8"));

    /* compiled from: CrashlyticsReport.java */
    @b9.c
    public static abstract class a {

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0901a {

            /* compiled from: CrashlyticsReport.java */
            @c.a
            /* renamed from: com.google.firebase.crashlytics.internal.model.g0$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0902a {
                @o0
                public abstract AbstractC0901a a();

                @o0
                public abstract AbstractC0902a b(@o0 String str);

                @o0
                public abstract AbstractC0902a c(@o0 String str);

                @o0
                public abstract AbstractC0902a d(@o0 String str);
            }

            @o0
            public static AbstractC0902a a() {
                return new e.b();
            }

            @o0
            public abstract String b();

            @o0
            public abstract String c();

            @o0
            public abstract String d();
        }

        /* compiled from: CrashlyticsReport.java */
        @c.a
        public static abstract class b {
            @o0
            public abstract a a();

            @o0
            public abstract b b(@q0 List<AbstractC0901a> list);

            @o0
            public abstract b c(@o0 int i4);

            @o0
            public abstract b d(@o0 int i4);

            @o0
            public abstract b e(@o0 String str);

            @o0
            public abstract b f(@o0 long j4);

            @o0
            public abstract b g(@o0 int i4);

            @o0
            public abstract b h(@o0 long j4);

            @o0
            public abstract b i(@o0 long j4);

            @o0
            public abstract b j(@q0 String str);
        }

        @o0
        public static b a() {
            return new d.b();
        }

        @q0
        public abstract List<AbstractC0901a> b();

        @o0
        public abstract int c();

        @o0
        public abstract int d();

        @o0
        public abstract String e();

        @o0
        public abstract long f();

        @o0
        public abstract int g();

        @o0
        public abstract long h();

        @o0
        public abstract long i();

        @q0
        public abstract String j();
    }

    /* compiled from: CrashlyticsReport.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int A2 = 7;

        /* renamed from: v2, reason: collision with root package name */
        public static final int f59217v2 = 5;

        /* renamed from: w2, reason: collision with root package name */
        public static final int f59218w2 = 6;

        /* renamed from: x2, reason: collision with root package name */
        public static final int f59219x2 = 9;

        /* renamed from: y2, reason: collision with root package name */
        public static final int f59220y2 = 0;

        /* renamed from: z2, reason: collision with root package name */
        public static final int f59221z2 = 1;
    }

    /* compiled from: CrashlyticsReport.java */
    @c.a
    public static abstract class c {
        @o0
        public abstract g0 a();

        @o0
        public abstract c b(a aVar);

        @o0
        public abstract c c(@q0 String str);

        @o0
        public abstract c d(@o0 String str);

        @o0
        public abstract c e(@o0 String str);

        @o0
        public abstract c f(@q0 String str);

        @o0
        public abstract c g(@q0 String str);

        @o0
        public abstract c h(@o0 String str);

        @o0
        public abstract c i(@o0 String str);

        @o0
        public abstract c j(e eVar);

        @o0
        public abstract c k(int i4);

        @o0
        public abstract c l(@o0 String str);

        @o0
        public abstract c m(@o0 f fVar);
    }

    /* compiled from: CrashlyticsReport.java */
    @b9.c
    public static abstract class d {

        /* compiled from: CrashlyticsReport.java */
        @c.a
        public static abstract class a {
            @o0
            public abstract d a();

            @o0
            public abstract a b(@o0 String str);

            @o0
            public abstract a c(@o0 String str);
        }

        @o0
        public static a a() {
            return new f.b();
        }

        @o0
        public abstract String b();

        @o0
        public abstract String c();
    }

    /* compiled from: CrashlyticsReport.java */
    @b9.c
    public static abstract class e {

        /* compiled from: CrashlyticsReport.java */
        @c.a
        public static abstract class a {
            public abstract e a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        public static abstract class b {

            /* compiled from: CrashlyticsReport.java */
            @c.a
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @o0
            public static a a() {
                return new h.b();
            }

            @o0
            public abstract byte[] b();

            @o0
            public abstract String c();
        }

        @o0
        public static a a() {
            return new g.b();
        }

        @o0
        public abstract List<b> b();

        @q0
        public abstract String c();

        abstract a d();
    }

    /* compiled from: CrashlyticsReport.java */
    @b9.c
    public static abstract class f {

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        public static abstract class a {

            /* compiled from: CrashlyticsReport.java */
            @c.a
            /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0903a {
                @o0
                public abstract a a();

                @o0
                public abstract AbstractC0903a b(@q0 String str);

                @o0
                public abstract AbstractC0903a c(@q0 String str);

                @o0
                public abstract AbstractC0903a d(@o0 String str);

                @o0
                public abstract AbstractC0903a e(@o0 String str);

                @o0
                public abstract AbstractC0903a f(@o0 String str);

                @o0
                public abstract AbstractC0903a g(@o0 b bVar);

                @o0
                public abstract AbstractC0903a h(@o0 String str);
            }

            /* compiled from: CrashlyticsReport.java */
            @b9.c
            public static abstract class b {

                /* compiled from: CrashlyticsReport.java */
                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$a$b$a, reason: collision with other inner class name */
                public static abstract class AbstractC0904a {
                    @o0
                    public abstract b a();

                    @o0
                    public abstract AbstractC0904a b(@o0 String str);
                }

                @o0
                public static AbstractC0904a a() {
                    return new k.b();
                }

                @o0
                public abstract String b();

                @o0
                protected abstract AbstractC0904a c();
            }

            @o0
            public static AbstractC0903a a() {
                return new j.b();
            }

            @q0
            public abstract String b();

            @q0
            public abstract String c();

            @q0
            public abstract String d();

            @o0
            public abstract String e();

            @q0
            public abstract String f();

            @q0
            public abstract b g();

            @o0
            public abstract String h();

            @o0
            protected abstract AbstractC0903a i();

            @o0
            a j(@o0 String str) {
                b g4 = g();
                return i().g((g4 != null ? g4.c() : new k.b()).b(str).a()).a();
            }
        }

        /* compiled from: CrashlyticsReport.java */
        @c.a
        public static abstract class b {
            @o0
            public abstract f a();

            @o0
            public abstract b b(@o0 a aVar);

            @o0
            public abstract b c(@q0 String str);

            @o0
            public abstract b d(boolean z4);

            @o0
            public abstract b e(@o0 c cVar);

            @o0
            public abstract b f(@o0 Long l4);

            @o0
            public abstract b g(@o0 List<d> list);

            @o0
            public abstract b h(@o0 String str);

            @o0
            public abstract b i(int i4);

            @o0
            public abstract b j(@o0 String str);

            @o0
            public b k(@o0 byte[] bArr) {
                return j(new String(bArr, g0.f59216a));
            }

            @o0
            public abstract b l(@o0 e eVar);

            @o0
            public abstract b m(long j4);

            @o0
            public abstract b n(@o0 AbstractC0918f abstractC0918f);
        }

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        public static abstract class c {

            /* compiled from: CrashlyticsReport.java */
            @c.a
            public static abstract class a {
                @o0
                public abstract c a();

                @o0
                public abstract a b(int i4);

                @o0
                public abstract a c(int i4);

                @o0
                public abstract a d(long j4);

                @o0
                public abstract a e(@o0 String str);

                @o0
                public abstract a f(@o0 String str);

                @o0
                public abstract a g(@o0 String str);

                @o0
                public abstract a h(long j4);

                @o0
                public abstract a i(boolean z4);

                @o0
                public abstract a j(int i4);
            }

            @o0
            public static a a() {
                return new l.b();
            }

            @o0
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @o0
            public abstract String e();

            @o0
            public abstract String f();

            @o0
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        public static abstract class d {

            /* compiled from: CrashlyticsReport.java */
            @b9.c
            public static abstract class a {

                /* compiled from: CrashlyticsReport.java */
                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC0905a {
                    @o0
                    public abstract a a();

                    @o0
                    public abstract AbstractC0905a b(@q0 List<c> list);

                    @o0
                    public abstract AbstractC0905a c(@q0 Boolean bool);

                    @o0
                    public abstract AbstractC0905a d(@q0 c cVar);

                    @o0
                    public abstract AbstractC0905a e(@o0 List<d> list);

                    @o0
                    public abstract AbstractC0905a f(@o0 b bVar);

                    @o0
                    public abstract AbstractC0905a g(@o0 List<d> list);

                    @o0
                    public abstract AbstractC0905a h(int i4);
                }

                /* compiled from: CrashlyticsReport.java */
                @b9.c
                public static abstract class b {

                    /* compiled from: CrashlyticsReport.java */
                    @b9.c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0906a {

                        /* compiled from: CrashlyticsReport.java */
                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0907a {
                            @o0
                            public abstract AbstractC0906a a();

                            @o0
                            public abstract AbstractC0907a b(long j4);

                            @o0
                            public abstract AbstractC0907a c(@o0 String str);

                            @o0
                            public abstract AbstractC0907a d(long j4);

                            @o0
                            public abstract AbstractC0907a e(@q0 String str);

                            @o0
                            public AbstractC0907a f(@o0 byte[] bArr) {
                                return e(new String(bArr, g0.f59216a));
                            }
                        }

                        @o0
                        public static AbstractC0907a a() {
                            return new p.b();
                        }

                        @o0
                        public abstract long b();

                        @o0
                        public abstract String c();

                        public abstract long d();

                        @q0
                        @a.b
                        public abstract String e();

                        @q0
                        @a.InterfaceC1396a(name = "uuid")
                        public byte[] f() {
                            String e4 = e();
                            if (e4 != null) {
                                return e4.getBytes(g0.f59216a);
                            }
                            return null;
                        }
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @c.a
                    /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC0908b {
                        @o0
                        public abstract b a();

                        @o0
                        public abstract AbstractC0908b b(@o0 a aVar);

                        @o0
                        public abstract AbstractC0908b c(@o0 List<AbstractC0906a> list);

                        @o0
                        public abstract AbstractC0908b d(@o0 c cVar);

                        @o0
                        public abstract AbstractC0908b e(@o0 AbstractC0910d abstractC0910d);

                        @o0
                        public abstract AbstractC0908b f(@o0 List<e> list);
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @b9.c
                    public static abstract class c {

                        /* compiled from: CrashlyticsReport.java */
                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0909a {
                            @o0
                            public abstract c a();

                            @o0
                            public abstract AbstractC0909a b(@o0 c cVar);

                            @o0
                            public abstract AbstractC0909a c(@o0 List<e.AbstractC0913b> list);

                            @o0
                            public abstract AbstractC0909a d(int i4);

                            @o0
                            public abstract AbstractC0909a e(@o0 String str);

                            @o0
                            public abstract AbstractC0909a f(@o0 String str);
                        }

                        @o0
                        public static AbstractC0909a a() {
                            return new q.b();
                        }

                        @q0
                        public abstract c b();

                        @o0
                        public abstract List<e.AbstractC0913b> c();

                        public abstract int d();

                        @q0
                        public abstract String e();

                        @o0
                        public abstract String f();
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @b9.c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC0910d {

                        /* compiled from: CrashlyticsReport.java */
                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0911a {
                            @o0
                            public abstract AbstractC0910d a();

                            @o0
                            public abstract AbstractC0911a b(long j4);

                            @o0
                            public abstract AbstractC0911a c(@o0 String str);

                            @o0
                            public abstract AbstractC0911a d(@o0 String str);
                        }

                        @o0
                        public static AbstractC0911a a() {
                            return new r.b();
                        }

                        @o0
                        public abstract long b();

                        @o0
                        public abstract String c();

                        @o0
                        public abstract String d();
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @b9.c
                    public static abstract class e {

                        /* compiled from: CrashlyticsReport.java */
                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0912a {
                            @o0
                            public abstract e a();

                            @o0
                            public abstract AbstractC0912a b(@o0 List<AbstractC0913b> list);

                            @o0
                            public abstract AbstractC0912a c(int i4);

                            @o0
                            public abstract AbstractC0912a d(@o0 String str);
                        }

                        /* compiled from: CrashlyticsReport.java */
                        @b9.c
                        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC0913b {

                            /* compiled from: CrashlyticsReport.java */
                            @c.a
                            /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC0914a {
                                @o0
                                public abstract AbstractC0913b a();

                                @o0
                                public abstract AbstractC0914a b(@o0 String str);

                                @o0
                                public abstract AbstractC0914a c(int i4);

                                @o0
                                public abstract AbstractC0914a d(long j4);

                                @o0
                                public abstract AbstractC0914a e(long j4);

                                @o0
                                public abstract AbstractC0914a f(@o0 String str);
                            }

                            @o0
                            public static AbstractC0914a a() {
                                return new t.b();
                            }

                            @q0
                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @o0
                            public abstract String f();
                        }

                        @o0
                        public static AbstractC0912a a() {
                            return new s.b();
                        }

                        @o0
                        public abstract List<AbstractC0913b> b();

                        public abstract int c();

                        @o0
                        public abstract String d();
                    }

                    @o0
                    public static AbstractC0908b a() {
                        return new o.b();
                    }

                    @q0
                    public abstract a b();

                    @o0
                    public abstract List<AbstractC0906a> c();

                    @q0
                    public abstract c d();

                    @o0
                    public abstract AbstractC0910d e();

                    @q0
                    public abstract List<e> f();
                }

                /* compiled from: CrashlyticsReport.java */
                @b9.c
                public static abstract class c {

                    /* compiled from: CrashlyticsReport.java */
                    @c.a
                    /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0915a {
                        @o0
                        public abstract c a();

                        @o0
                        public abstract AbstractC0915a b(boolean z4);

                        @o0
                        public abstract AbstractC0915a c(int i4);

                        @o0
                        public abstract AbstractC0915a d(int i4);

                        @o0
                        public abstract AbstractC0915a e(@o0 String str);
                    }

                    @o0
                    public static AbstractC0915a a() {
                        return new u.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    @o0
                    public abstract String d();

                    public abstract boolean e();
                }

                @o0
                public static AbstractC0905a a() {
                    return new n.b();
                }

                @q0
                public abstract List<c> b();

                @q0
                public abstract Boolean c();

                @q0
                public abstract c d();

                @q0
                public abstract List<d> e();

                @o0
                public abstract b f();

                @q0
                public abstract List<d> g();

                public abstract int h();

                @o0
                public abstract AbstractC0905a i();
            }

            /* compiled from: CrashlyticsReport.java */
            @c.a
            public static abstract class b {
                @o0
                public abstract d a();

                @o0
                public abstract b b(@o0 a aVar);

                @o0
                public abstract b c(@o0 c cVar);

                @o0
                public abstract b d(@o0 AbstractC0916d abstractC0916d);

                @o0
                public abstract b e(@o0 AbstractC0917f abstractC0917f);

                @o0
                public abstract b f(long j4);

                @o0
                public abstract b g(@o0 String str);
            }

            /* compiled from: CrashlyticsReport.java */
            @b9.c
            public static abstract class c {

                /* compiled from: CrashlyticsReport.java */
                @c.a
                public static abstract class a {
                    @o0
                    public abstract c a();

                    @o0
                    public abstract a b(Double d5);

                    @o0
                    public abstract a c(int i4);

                    @o0
                    public abstract a d(long j4);

                    @o0
                    public abstract a e(int i4);

                    @o0
                    public abstract a f(boolean z4);

                    @o0
                    public abstract a g(long j4);
                }

                @o0
                public static a a() {
                    return new v.b();
                }

                @q0
                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* compiled from: CrashlyticsReport.java */
            @b9.c
            /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC0916d {

                /* compiled from: CrashlyticsReport.java */
                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$d$a */
                public static abstract class a {
                    @o0
                    public abstract AbstractC0916d a();

                    @o0
                    public abstract a b(@o0 String str);
                }

                @o0
                public static a a() {
                    return new w.b();
                }

                @o0
                public abstract String b();
            }

            /* compiled from: CrashlyticsReport.java */
            @b9.c
            public static abstract class e {

                /* compiled from: CrashlyticsReport.java */
                @c.a
                public static abstract class a {
                    @o0
                    public abstract e a();

                    @o0
                    public abstract a b(@o0 String str);

                    @o0
                    public abstract a c(@o0 String str);

                    @o0
                    public abstract a d(@o0 b bVar);

                    @o0
                    public abstract a e(@o0 long j4);
                }

                /* compiled from: CrashlyticsReport.java */
                @b9.c
                public static abstract class b {

                    /* compiled from: CrashlyticsReport.java */
                    @c.a
                    public static abstract class a {
                        @o0
                        public abstract b a();

                        @o0
                        public abstract a b(@o0 String str);

                        @o0
                        public abstract a c(@o0 String str);
                    }

                    public static a a() {
                        return new y.b();
                    }

                    @o0
                    public abstract String b();

                    @o0
                    public abstract String c();
                }

                @o0
                public static a a() {
                    return new x.b();
                }

                @o0
                public abstract String b();

                @o0
                public abstract String c();

                @o0
                public abstract b d();

                @o0
                public abstract long e();
            }

            /* compiled from: CrashlyticsReport.java */
            @b9.c
            /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$f, reason: collision with other inner class name */
            public static abstract class AbstractC0917f {

                /* compiled from: CrashlyticsReport.java */
                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$d$f$a */
                public static abstract class a {
                    @o0
                    public abstract AbstractC0917f a();

                    @o0
                    public abstract a b(@o0 List<e> list);
                }

                @o0
                public static a a() {
                    return new z.b();
                }

                @a.InterfaceC1396a(name = "assignments")
                @o0
                public abstract List<e> b();
            }

            @o0
            public static b a() {
                return new m.b();
            }

            @o0
            public abstract a b();

            @o0
            public abstract c c();

            @q0
            public abstract AbstractC0916d d();

            @q0
            public abstract AbstractC0917f e();

            public abstract long f();

            @o0
            public abstract String g();

            @o0
            public abstract b h();
        }

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        public static abstract class e {

            /* compiled from: CrashlyticsReport.java */
            @c.a
            public static abstract class a {
                @o0
                public abstract e a();

                @o0
                public abstract a b(@o0 String str);

                @o0
                public abstract a c(boolean z4);

                @o0
                public abstract a d(int i4);

                @o0
                public abstract a e(@o0 String str);
            }

            @o0
            public static a a() {
                return new a0.b();
            }

            @o0
            public abstract String b();

            public abstract int c();

            @o0
            public abstract String d();

            public abstract boolean e();
        }

        /* compiled from: CrashlyticsReport.java */
        @b9.c
        /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$f, reason: collision with other inner class name */
        public static abstract class AbstractC0918f {

            /* compiled from: CrashlyticsReport.java */
            @c.a
            /* renamed from: com.google.firebase.crashlytics.internal.model.g0$f$f$a */
            public static abstract class a {
                @o0
                public abstract AbstractC0918f a();

                @o0
                public abstract a b(@o0 String str);
            }

            @o0
            public static a a() {
                return new b0.b();
            }

            @o0
            public abstract String b();
        }

        @o0
        public static b a() {
            return new i.b().d(false);
        }

        @o0
        public abstract a b();

        @q0
        public abstract String c();

        @q0
        public abstract c d();

        @q0
        public abstract Long e();

        @q0
        public abstract List<d> f();

        @o0
        public abstract String g();

        public abstract int h();

        @a.b
        @o0
        public abstract String i();

        @a.InterfaceC1396a(name = "identifier")
        @o0
        public byte[] j() {
            return i().getBytes(g0.f59216a);
        }

        @q0
        public abstract e k();

        public abstract long l();

        @q0
        public abstract AbstractC0918f m();

        public abstract boolean n();

        @o0
        public abstract b o();

        @o0
        f p(@q0 String str) {
            return o().c(str).a();
        }

        @o0
        f q(@o0 List<d> list) {
            return o().g(list).a();
        }

        @o0
        f r(@o0 String str) {
            return o().b(b().j(str)).a();
        }

        @o0
        f s(long j4, boolean z4, @q0 String str) {
            b o4 = o();
            o4.f(Long.valueOf(j4));
            o4.d(z4);
            if (str != null) {
                o4.n(new b0.b().b(str).a());
            }
            return o4.a();
        }
    }

    /* compiled from: CrashlyticsReport.java */
    public enum g {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @o0
    public static c b() {
        return new b.C0900b();
    }

    @q0
    public abstract a c();

    @q0
    public abstract String d();

    @o0
    public abstract String e();

    @o0
    public abstract String f();

    @q0
    public abstract String g();

    @q0
    public abstract String h();

    @o0
    public abstract String i();

    @o0
    public abstract String j();

    @q0
    public abstract e k();

    public abstract int l();

    @o0
    public abstract String m();

    @q0
    public abstract f n();

    @a.b
    public g o() {
        return n() != null ? g.JAVA : k() != null ? g.NATIVE : g.INCOMPLETE;
    }

    @o0
    protected abstract c p();

    @o0
    public g0 q(@q0 String str) {
        c c5 = p().c(str);
        if (n() != null) {
            c5.m(n().p(str));
        }
        return c5.a();
    }

    @o0
    public g0 r(a aVar) {
        return aVar == null ? this : p().b(aVar).a();
    }

    @o0
    public g0 s(@o0 List<f.d> list) {
        if (n() != null) {
            return p().m(n().q(list)).a();
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ufdd9"));
    }

    @o0
    public g0 t(@q0 String str) {
        return p().f(str).a();
    }

    @o0
    public g0 u(@q0 String str) {
        return p().g(str).a();
    }

    @o0
    public g0 v(@o0 e eVar) {
        return p().m(null).j(eVar).a();
    }

    @o0
    public g0 w(@o0 String str) {
        c p4 = p();
        e k4 = k();
        if (k4 != null) {
            p4.j(k4.d().c(str).a());
        }
        f n4 = n();
        if (n4 != null) {
            p4.m(n4.r(str));
        }
        return p4.a();
    }

    @o0
    public g0 x(long j4, boolean z4, @q0 String str) {
        c p4 = p();
        if (n() != null) {
            p4.m(n().s(j4, z4, str));
        }
        return p4.a();
    }
}
