package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.b;
import com.google.firebase.crashlytics.internal.model.c;
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
import j2.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: CrashlyticsReport.java */
@j2.a
@AutoValue
/* loaded from: classes2.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f16096a = Charset.forName(ProtectedSandApp.s("ᔑ"));

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class a {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0198a {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.f0$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0199a {
                @o0
                public abstract AbstractC0198a a();

                @o0
                public abstract AbstractC0199a b(@o0 String str);

                @o0
                public abstract AbstractC0199a c(@o0 String str);

                @o0
                public abstract AbstractC0199a d(@o0 String str);
            }

            @o0
            public static AbstractC0199a a() {
                return new d.b();
            }

            @o0
            public abstract String b();

            @o0
            public abstract String c();

            @o0
            public abstract String d();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
        public static abstract class b {
            @o0
            public abstract a a();

            @o0
            public abstract b b(@q0 List<AbstractC0198a> list);

            @o0
            public abstract b c(@o0 int i5);

            @o0
            public abstract b d(@o0 int i5);

            @o0
            public abstract b e(@o0 String str);

            @o0
            public abstract b f(@o0 long j5);

            @o0
            public abstract b g(@o0 int i5);

            @o0
            public abstract b h(@o0 long j5);

            @o0
            public abstract b i(@o0 long j5);

            @o0
            public abstract b j(@q0 String str);
        }

        @o0
        public static b a() {
            return new c.b();
        }

        @q0
        public abstract List<AbstractC0198a> b();

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

        /* renamed from: t, reason: collision with root package name */
        public static final int f16097t = 5;

        /* renamed from: u, reason: collision with root package name */
        public static final int f16098u = 6;

        /* renamed from: v, reason: collision with root package name */
        public static final int f16099v = 9;

        /* renamed from: w, reason: collision with root package name */
        public static final int f16100w = 0;

        /* renamed from: x, reason: collision with root package name */
        public static final int f16101x = 1;

        /* renamed from: y, reason: collision with root package name */
        public static final int f16102y = 7;
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue.Builder
    public static abstract class c {
        @o0
        public abstract f0 a();

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
        public abstract c g(@o0 String str);

        @o0
        public abstract c h(@o0 String str);

        @o0
        public abstract c i(e eVar);

        @o0
        public abstract c j(int i5);

        @o0
        public abstract c k(@o0 String str);

        @o0
        public abstract c l(@o0 f fVar);
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class d {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
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
            return new e.b();
        }

        @o0
        public abstract String b();

        @o0
        public abstract String c();
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class e {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
        public static abstract class a {
            public abstract e a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class b {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @o0
            public static a a() {
                return new g.b();
            }

            @o0
            public abstract byte[] b();

            @o0
            public abstract String c();
        }

        @o0
        public static a a() {
            return new f.b();
        }

        @o0
        public abstract List<b> b();

        @q0
        public abstract String c();

        abstract a d();
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class f {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class a {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0200a {
                @o0
                public abstract a a();

                @o0
                public abstract AbstractC0200a b(@q0 String str);

                @o0
                public abstract AbstractC0200a c(@q0 String str);

                @o0
                public abstract AbstractC0200a d(@o0 String str);

                @o0
                public abstract AbstractC0200a e(@o0 String str);

                @o0
                public abstract AbstractC0200a f(@o0 String str);

                @o0
                public abstract AbstractC0200a g(@o0 b bVar);

                @o0
                public abstract AbstractC0200a h(@o0 String str);
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            public static abstract class b {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$a$b$a, reason: collision with other inner class name */
                public static abstract class AbstractC0201a {
                    @o0
                    public abstract b a();

                    @o0
                    public abstract AbstractC0201a b(@o0 String str);
                }

                @o0
                public static AbstractC0201a a() {
                    return new j.b();
                }

                @o0
                public abstract String b();

                @o0
                protected abstract AbstractC0201a c();
            }

            @o0
            public static AbstractC0200a a() {
                return new i.b();
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
            protected abstract AbstractC0200a i();

            @o0
            a j(@o0 String str) {
                b g5 = g();
                return i().g((g5 != null ? g5.c() : new j.b()).b(str).a()).a();
            }
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
        public static abstract class b {
            @o0
            public abstract f a();

            @o0
            public abstract b b(@o0 a aVar);

            @o0
            public abstract b c(@q0 String str);

            @o0
            public abstract b d(boolean z5);

            @o0
            public abstract b e(@o0 c cVar);

            @o0
            public abstract b f(@o0 Long l5);

            @o0
            public abstract b g(@o0 List<d> list);

            @o0
            public abstract b h(@o0 String str);

            @o0
            public abstract b i(int i5);

            @o0
            public abstract b j(@o0 String str);

            @o0
            public b k(@o0 byte[] bArr) {
                return j(new String(bArr, f0.f16096a));
            }

            @o0
            public abstract b l(@o0 e eVar);

            @o0
            public abstract b m(long j5);

            @o0
            public abstract b n(@o0 AbstractC0215f abstractC0215f);
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class c {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                @o0
                public abstract c a();

                @o0
                public abstract a b(int i5);

                @o0
                public abstract a c(int i5);

                @o0
                public abstract a d(long j5);

                @o0
                public abstract a e(@o0 String str);

                @o0
                public abstract a f(@o0 String str);

                @o0
                public abstract a g(@o0 String str);

                @o0
                public abstract a h(long j5);

                @o0
                public abstract a i(boolean z5);

                @o0
                public abstract a j(int i5);
            }

            @o0
            public static a a() {
                return new k.b();
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
        @AutoValue
        public static abstract class d {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            public static abstract class a {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC0202a {
                    @o0
                    public abstract a a();

                    @o0
                    public abstract AbstractC0202a b(@q0 List<c> list);

                    @o0
                    public abstract AbstractC0202a c(@q0 Boolean bool);

                    @o0
                    public abstract AbstractC0202a d(@q0 c cVar);

                    @o0
                    public abstract AbstractC0202a e(@o0 List<d> list);

                    @o0
                    public abstract AbstractC0202a f(@o0 b bVar);

                    @o0
                    public abstract AbstractC0202a g(@o0 List<d> list);

                    @o0
                    public abstract AbstractC0202a h(int i5);
                }

                /* compiled from: CrashlyticsReport.java */
                @AutoValue
                public static abstract class b {

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0203a {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0204a {
                            @o0
                            public abstract AbstractC0203a a();

                            @o0
                            public abstract AbstractC0204a b(long j5);

                            @o0
                            public abstract AbstractC0204a c(@o0 String str);

                            @o0
                            public abstract AbstractC0204a d(long j5);

                            @o0
                            public abstract AbstractC0204a e(@q0 String str);

                            @o0
                            public AbstractC0204a f(@o0 byte[] bArr) {
                                return e(new String(bArr, f0.f16096a));
                            }
                        }

                        @o0
                        public static AbstractC0204a a() {
                            return new o.b();
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
                        @a.InterfaceC0250a(name = "uuid")
                        public byte[] f() {
                            String e6 = e();
                            if (e6 != null) {
                                return e6.getBytes(f0.f16096a);
                            }
                            return null;
                        }
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC0205b {
                        @o0
                        public abstract b a();

                        @o0
                        public abstract AbstractC0205b b(@o0 a aVar);

                        @o0
                        public abstract AbstractC0205b c(@o0 List<AbstractC0203a> list);

                        @o0
                        public abstract AbstractC0205b d(@o0 c cVar);

                        @o0
                        public abstract AbstractC0205b e(@o0 AbstractC0207d abstractC0207d);

                        @o0
                        public abstract AbstractC0205b f(@o0 List<e> list);
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    public static abstract class c {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0206a {
                            @o0
                            public abstract c a();

                            @o0
                            public abstract AbstractC0206a b(@o0 c cVar);

                            @o0
                            public abstract AbstractC0206a c(@o0 List<e.AbstractC0210b> list);

                            @o0
                            public abstract AbstractC0206a d(int i5);

                            @o0
                            public abstract AbstractC0206a e(@o0 String str);

                            @o0
                            public abstract AbstractC0206a f(@o0 String str);
                        }

                        @o0
                        public static AbstractC0206a a() {
                            return new p.b();
                        }

                        @q0
                        public abstract c b();

                        @o0
                        public abstract List<e.AbstractC0210b> c();

                        public abstract int d();

                        @q0
                        public abstract String e();

                        @o0
                        public abstract String f();
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC0207d {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0208a {
                            @o0
                            public abstract AbstractC0207d a();

                            @o0
                            public abstract AbstractC0208a b(long j5);

                            @o0
                            public abstract AbstractC0208a c(@o0 String str);

                            @o0
                            public abstract AbstractC0208a d(@o0 String str);
                        }

                        @o0
                        public static AbstractC0208a a() {
                            return new q.b();
                        }

                        @o0
                        public abstract long b();

                        @o0
                        public abstract String c();

                        @o0
                        public abstract String d();
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    public static abstract class e {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0209a {
                            @o0
                            public abstract e a();

                            @o0
                            public abstract AbstractC0209a b(@o0 List<AbstractC0210b> list);

                            @o0
                            public abstract AbstractC0209a c(int i5);

                            @o0
                            public abstract AbstractC0209a d(@o0 String str);
                        }

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue
                        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC0210b {

                            /* compiled from: CrashlyticsReport.java */
                            @AutoValue.Builder
                            /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC0211a {
                                @o0
                                public abstract AbstractC0210b a();

                                @o0
                                public abstract AbstractC0211a b(@o0 String str);

                                @o0
                                public abstract AbstractC0211a c(int i5);

                                @o0
                                public abstract AbstractC0211a d(long j5);

                                @o0
                                public abstract AbstractC0211a e(long j5);

                                @o0
                                public abstract AbstractC0211a f(@o0 String str);
                            }

                            @o0
                            public static AbstractC0211a a() {
                                return new s.b();
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
                        public static AbstractC0209a a() {
                            return new r.b();
                        }

                        @o0
                        public abstract List<AbstractC0210b> b();

                        public abstract int c();

                        @o0
                        public abstract String d();
                    }

                    @o0
                    public static AbstractC0205b a() {
                        return new n.b();
                    }

                    @q0
                    public abstract a b();

                    @o0
                    public abstract List<AbstractC0203a> c();

                    @q0
                    public abstract c d();

                    @o0
                    public abstract AbstractC0207d e();

                    @q0
                    public abstract List<e> f();
                }

                /* compiled from: CrashlyticsReport.java */
                @AutoValue
                public static abstract class c {

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0212a {
                        @o0
                        public abstract c a();

                        @o0
                        public abstract AbstractC0212a b(boolean z5);

                        @o0
                        public abstract AbstractC0212a c(int i5);

                        @o0
                        public abstract AbstractC0212a d(int i5);

                        @o0
                        public abstract AbstractC0212a e(@o0 String str);
                    }

                    @o0
                    public static AbstractC0212a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    @o0
                    public abstract String d();

                    public abstract boolean e();
                }

                @o0
                public static AbstractC0202a a() {
                    return new m.b();
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
                public abstract AbstractC0202a i();
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class b {
                @o0
                public abstract d a();

                @o0
                public abstract b b(@o0 a aVar);

                @o0
                public abstract b c(@o0 c cVar);

                @o0
                public abstract b d(@o0 AbstractC0213d abstractC0213d);

                @q0
                public abstract b e(@o0 AbstractC0214f abstractC0214f);

                @o0
                public abstract b f(long j5);

                @o0
                public abstract b g(@o0 String str);
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            public static abstract class c {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                public static abstract class a {
                    @o0
                    public abstract c a();

                    @o0
                    public abstract a b(Double d6);

                    @o0
                    public abstract a c(int i5);

                    @o0
                    public abstract a d(long j5);

                    @o0
                    public abstract a e(int i5);

                    @o0
                    public abstract a f(boolean z5);

                    @o0
                    public abstract a g(long j5);
                }

                @o0
                public static a a() {
                    return new u.b();
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
            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC0213d {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$d$a */
                public static abstract class a {
                    @o0
                    public abstract AbstractC0213d a();

                    @o0
                    public abstract a b(@o0 String str);
                }

                @o0
                public static a a() {
                    return new v.b();
                }

                @o0
                public abstract String b();
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            public static abstract class e {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
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
                    public abstract a e(@o0 long j5);
                }

                /* compiled from: CrashlyticsReport.java */
                @AutoValue
                public static abstract class b {

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue.Builder
                    public static abstract class a {
                        @o0
                        public abstract b a();

                        @o0
                        public abstract a b(@o0 String str);

                        @o0
                        public abstract a c(@o0 String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    @o0
                    public abstract String b();

                    @o0
                    public abstract String c();
                }

                @o0
                public static a a() {
                    return new w.b();
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
            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$f, reason: collision with other inner class name */
            public static abstract class AbstractC0214f {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$f$a */
                public static abstract class a {
                    @o0
                    public abstract AbstractC0214f a();

                    @o0
                    public abstract a b(@q0 List<e> list);
                }

                @o0
                public static a a() {
                    return new y.b();
                }

                @o0
                @a.InterfaceC0250a(name = "assignments")
                public abstract List<e> b();
            }

            @o0
            public static b a() {
                return new l.b();
            }

            @o0
            public abstract a b();

            @o0
            public abstract c c();

            @q0
            public abstract AbstractC0213d d();

            @q0
            public abstract AbstractC0214f e();

            public abstract long f();

            @o0
            public abstract String g();

            @o0
            public abstract b h();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class e {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                @o0
                public abstract e a();

                @o0
                public abstract a b(@o0 String str);

                @o0
                public abstract a c(boolean z5);

                @o0
                public abstract a d(int i5);

                @o0
                public abstract a e(@o0 String str);
            }

            @o0
            public static a a() {
                return new z.b();
            }

            @o0
            public abstract String b();

            public abstract int c();

            @o0
            public abstract String d();

            public abstract boolean e();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$f, reason: collision with other inner class name */
        public static abstract class AbstractC0215f {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.internal.model.f0$f$f$a */
            public static abstract class a {
                @o0
                public abstract AbstractC0215f a();

                @o0
                public abstract a b(@o0 String str);
            }

            @o0
            public static a a() {
                return new a0.b();
            }

            @o0
            public abstract String b();
        }

        @o0
        public static b a() {
            return new h.b().d(false);
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

        @o0
        @a.InterfaceC0250a(name = "identifier")
        public byte[] j() {
            return i().getBytes(f0.f16096a);
        }

        @q0
        public abstract e k();

        public abstract long l();

        @q0
        public abstract AbstractC0215f m();

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
        f s(long j5, boolean z5, @q0 String str) {
            b o5 = o();
            o5.f(Long.valueOf(j5));
            o5.d(z5);
            if (str != null) {
                o5.n(new a0.b().b(str).a());
            }
            return o5.a();
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
        return new b.C0197b();
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

    @o0
    public abstract String h();

    @o0
    public abstract String i();

    @q0
    public abstract e j();

    public abstract int k();

    @o0
    public abstract String l();

    @q0
    public abstract f m();

    @a.b
    public g n() {
        return m() != null ? g.JAVA : j() != null ? g.NATIVE : g.INCOMPLETE;
    }

    @o0
    protected abstract c o();

    @o0
    public f0 p(@q0 String str) {
        c c6 = o().c(str);
        if (m() != null) {
            c6.l(m().p(str));
        }
        return c6.a();
    }

    @o0
    public f0 q(a aVar) {
        return aVar == null ? this : o().b(aVar).a();
    }

    @o0
    public f0 r(@o0 List<f.d> list) {
        if (m() != null) {
            return o().l(m().q(list)).a();
        }
        throw new IllegalStateException(ProtectedSandApp.s("ᔒ"));
    }

    @o0
    public f0 s(@q0 String str) {
        return o().f(str).a();
    }

    @o0
    public f0 t(@o0 e eVar) {
        return o().l(null).i(eVar).a();
    }

    @o0
    public f0 u(@o0 String str) {
        c o5 = o();
        e j5 = j();
        if (j5 != null) {
            o5.i(j5.d().c(str).a());
        }
        f m5 = m();
        if (m5 != null) {
            o5.l(m5.r(str));
        }
        return o5.a();
    }

    @o0
    public f0 v(long j5, boolean z5, @q0 String str) {
        c o5 = o();
        if (m() != null) {
            o5.l(m().s(j5, z5, str));
        }
        return o5.a();
    }
}
