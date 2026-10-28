package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.t0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzca;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40570a;

    /* renamed from: b, reason: collision with root package name */
    private String f40571b;

    /* renamed from: c, reason: collision with root package name */
    private String f40572c;

    /* renamed from: d, reason: collision with root package name */
    private c f40573d;

    /* renamed from: e, reason: collision with root package name */
    private zzca f40574e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f40575f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40576g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.q0
    private c0 f40577h;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40578a;

        /* renamed from: b, reason: collision with root package name */
        private String f40579b;

        /* renamed from: c, reason: collision with root package name */
        private List f40580c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f40581d;

        /* renamed from: e, reason: collision with root package name */
        private c.a f40582e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.q0
        private c0 f40583f;

        private a() {
            c.a a5 = c.a();
            c.a.e(a5);
            this.f40582e = a5;
        }

        @androidx.annotation.o0
        public q a() {
            List list = this.f40580c;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Ֆ"));
            }
            List list2 = this.f40580c;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()) == null) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("Օ"));
                    }
                }
            }
            q qVar = new q();
            qVar.f40570a = !((b) this.f40580c.get(0)).c().i().isEmpty();
            qVar.f40571b = this.f40578a;
            qVar.f40572c = this.f40579b;
            qVar.f40573d = this.f40582e.a();
            qVar.f40575f = new ArrayList();
            qVar.f40576g = this.f40581d;
            List list3 = this.f40580c;
            qVar.f40574e = list3 != null ? zzca.zzj(list3) : zzca.zzk();
            qVar.f40577h = this.f40583f;
            return qVar;
        }

        @androidx.annotation.o0
        @j6
        public a b(@androidx.annotation.o0 c0 c0Var) {
            this.f40583f = c0Var;
            return this;
        }

        @androidx.annotation.o0
        public a c(boolean z4) {
            this.f40581d = z4;
            return this;
        }

        @androidx.annotation.o0
        public a d(@androidx.annotation.o0 String str) {
            this.f40578a = str;
            return this;
        }

        @androidx.annotation.o0
        public a e(@androidx.annotation.o0 String str) {
            this.f40579b = str;
            return this;
        }

        @androidx.annotation.o0
        public a f(@androidx.annotation.o0 List<b> list) {
            this.f40580c = new ArrayList(list);
            return this;
        }

        @androidx.annotation.o0
        public a g(@androidx.annotation.o0 c cVar) {
            this.f40582e = c.c(cVar);
            return this;
        }

        /* synthetic */ a(h4 h4Var) {
            c.a a5 = c.a();
            c.a.e(a5);
            this.f40582e = a5;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        @w6
        private final C0666b f40584a;

        /* renamed from: b, reason: collision with root package name */
        private final t0 f40585b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40586c;

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @androidx.annotation.q0
            @w6
            private C0666b f40587a;

            /* renamed from: b, reason: collision with root package name */
            private t0 f40588b;

            /* renamed from: c, reason: collision with root package name */
            @androidx.annotation.q0
            private String f40589c;

            private a() {
                throw null;
            }

            @androidx.annotation.o0
            public b a() {
                zzbl.zzc(this.f40588b, ProtectedSandApp.s("\u0557"));
                return new b(this, null);
            }

            @androidx.annotation.o0
            public a b(@androidx.annotation.o0 String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("\u0558"));
                }
                this.f40589c = str;
                return this;
            }

            @androidx.annotation.o0
            public a c(@androidx.annotation.o0 t0 t0Var) {
                this.f40588b = t0Var;
                if (t0Var.c() != null) {
                    t0Var.c().getClass();
                    t0.b c5 = t0Var.c();
                    if (c5.g() != null) {
                        this.f40589c = c5.g();
                    }
                }
                return this;
            }

            @w6
            @androidx.annotation.o0
            public a d(@androidx.annotation.o0 C0666b c0666b) {
                this.f40587a = c0666b;
                return this;
            }

            /* synthetic */ a(h4 h4Var) {
            }
        }

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @w6
        /* renamed from: com.android.billingclient.api.q$b$b, reason: collision with other inner class name */
        public static class C0666b {

            /* renamed from: a, reason: collision with root package name */
            private String f40590a;

            /* renamed from: b, reason: collision with root package name */
            @w6
            private int f40591b;

            /* compiled from: com.android.billingclient:billing@@9.1.0 */
            @w6
            /* renamed from: com.android.billingclient.api.q$b$b$a */
            public static class a {

                /* renamed from: a, reason: collision with root package name */
                private String f40592a;

                /* renamed from: b, reason: collision with root package name */
                private int f40593b;

                private a() {
                    this.f40593b = 0;
                }

                @w6
                @androidx.annotation.o0
                public C0666b a() {
                    C0666b c0666b = new C0666b();
                    c0666b.f40590a = this.f40592a;
                    c0666b.f40591b = this.f40593b;
                    return c0666b;
                }

                @w6
                @androidx.annotation.o0
                public a b(@androidx.annotation.o0 String str) {
                    this.f40592a = str;
                    return this;
                }

                @w6
                @androidx.annotation.o0
                public a c(int i4) {
                    this.f40593b = i4;
                    return this;
                }
            }

            /* compiled from: com.android.billingclient:billing@@9.1.0 */
            @Retention(RetentionPolicy.SOURCE)
            /* renamed from: com.android.billingclient.api.q$b$b$b, reason: collision with other inner class name */
            public @interface InterfaceC0667b {
                public static final int A0 = 6;

                /* renamed from: u0, reason: collision with root package name */
                public static final int f40594u0 = 0;

                /* renamed from: v0, reason: collision with root package name */
                public static final int f40595v0 = 1;

                /* renamed from: w0, reason: collision with root package name */
                public static final int f40596w0 = 2;

                /* renamed from: x0, reason: collision with root package name */
                public static final int f40597x0 = 3;

                /* renamed from: y0, reason: collision with root package name */
                public static final int f40598y0 = 4;

                /* renamed from: z0, reason: collision with root package name */
                public static final int f40599z0 = 5;
            }

            @androidx.annotation.o0
            public static a f() {
                return new a();
            }

            @w6
            @androidx.annotation.o0
            public String d() {
                return this.f40590a;
            }

            @w6
            public int e() {
                return this.f40591b;
            }
        }

        /* synthetic */ b(a aVar, h4 h4Var) {
            this.f40585b = aVar.f40588b;
            this.f40586c = aVar.f40589c;
            this.f40584a = aVar.f40587a;
        }

        @androidx.annotation.o0
        public static a b() {
            return new a();
        }

        @androidx.annotation.q0
        @w6
        public C0666b a() {
            return this.f40584a;
        }

        @androidx.annotation.o0
        public final t0 c() {
            return this.f40585b;
        }

        @androidx.annotation.q0
        public final String d() {
            return this.f40586c;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f40600a;

        /* renamed from: b, reason: collision with root package name */
        private String f40601b;

        /* renamed from: c, reason: collision with root package name */
        private int f40602c = 0;

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f40603a;

            /* renamed from: b, reason: collision with root package name */
            private String f40604b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f40605c;

            /* renamed from: d, reason: collision with root package name */
            private int f40606d = 0;

            private a() {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f40605c = true;
                return aVar;
            }

            @androidx.annotation.o0
            public c a() {
                boolean z4 = true;
                h4 h4Var = null;
                if (TextUtils.isEmpty(this.f40603a) && TextUtils.isEmpty(null)) {
                    z4 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.f40604b);
                if (z4 && !isEmpty) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ՙ"));
                }
                if (!this.f40605c && !z4 && isEmpty) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("՚"));
                }
                c cVar = new c(h4Var);
                cVar.f40600a = this.f40603a;
                cVar.f40602c = this.f40606d;
                cVar.f40601b = this.f40604b;
                return cVar;
            }

            @androidx.annotation.o0
            public a b(@androidx.annotation.o0 String str) {
                this.f40603a = str;
                return this;
            }

            @androidx.annotation.o0
            @i2
            public a c(@androidx.annotation.o0 String str) {
                this.f40604b = str;
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public a d(int i4) {
                this.f40606d = i4;
                return this;
            }

            /* synthetic */ a(h4 h4Var) {
            }
        }

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
            public static final int B0 = 0;
            public static final int C0 = 1;
            public static final int D0 = 2;
            public static final int E0 = 3;
            public static final int F0 = 5;
            public static final int G0 = 6;
        }

        private c() {
        }

        @androidx.annotation.o0
        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a a5 = a();
            a5.b(cVar.f40600a);
            a5.d(cVar.f40602c);
            a5.c(cVar.f40601b);
            return a5;
        }

        final int b() {
            return this.f40602c;
        }

        final String d() {
            return this.f40600a;
        }

        final String e() {
            return this.f40601b;
        }

        /* synthetic */ c(h4 h4Var) {
        }
    }

    private q() {
        throw null;
    }

    @androidx.annotation.o0
    public static a b() {
        return new a(null);
    }

    @androidx.annotation.q0
    @j6
    public c0 a() {
        return this.f40577h;
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.f40573d.b();
    }

    public long e() {
        return 0L;
    }

    final y f() {
        t0.b bVar;
        b.C0666b a5;
        if (this.f40574e.isEmpty()) {
            return n4.f40521i;
        }
        b bVar2 = (b) this.f40574e.get(0);
        int i4 = 1;
        while (true) {
            int size = this.f40574e.size();
            String s4 = ProtectedSandApp.s("յ");
            if (i4 >= size) {
                String i5 = bVar2.c().i();
                HashMap hashMap = new HashMap();
                HashSet hashSet = new HashSet();
                zzca zzcaVar = this.f40574e;
                int size2 = zzcaVar.size();
                boolean z4 = false;
                for (int i6 = 0; i6 < size2; i6++) {
                    b bVar3 = (b) zzcaVar.get(i6);
                    b.C0666b a6 = bVar3.a();
                    if (a6 != null) {
                        y a7 = !bVar3.c().f().equals(ProtectedSandApp.s("շ")) ? n4.a(5, String.format(ProtectedSandApp.s("ո"), bVar3.c().e())) : a6.e() <= 0 ? n4.a(5, String.format(ProtectedSandApp.s("չ"), bVar3.c().e())) : zzbo.zzd(a6.f40590a) ? n4.a(5, String.format(ProtectedSandApp.s("պ"), bVar3.c().e())) : n4.f40521i;
                        if (a7 != n4.f40521i) {
                            return a7;
                        }
                    }
                    if (a6 != null && a6.e() == 6) {
                        y a8 = bVar3.d() != null ? n4.a(5, String.format(ProtectedSandApp.s("ջ"), bVar3.c().e())) : !a6.d().equals(bVar3.c().e()) ? n4.a(5, String.format(ProtectedSandApp.s("ռ"), bVar3.c().e())) : n4.f40521i;
                        if (a8 != n4.f40521i) {
                            return a8;
                        }
                    }
                    if (bVar3.c().g() != null && bVar3.d() == null && (a6 == null || a6.e() != 6)) {
                        return n4.a(5, String.format(ProtectedSandApp.s("ս"), bVar3.c().e()));
                    }
                    if (hashMap.containsKey(bVar3.c().e())) {
                        return n4.a(5, String.format(ProtectedSandApp.s("վ"), bVar3.c().e()));
                    }
                    hashMap.put(bVar3.c().e(), bVar3);
                    if (a6 != null) {
                        if (hashSet.contains(a6.d())) {
                            return n4.a(5, String.format(ProtectedSandApp.s("տ"), a6.d()));
                        }
                        hashSet.add(a6.d());
                        z4 = true;
                    }
                    if (!bVar2.c().f().equals(s4) && !bVar3.c().f().equals(s4) && !i5.equals(bVar3.c().i())) {
                        return n4.a(5, ProtectedSandApp.s("ր"));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (hashMap.containsKey(str) && ((a5 = ((b) hashMap.get(str)).a()) == null || !a5.d().equals(str))) {
                        return n4.a(5, String.format(ProtectedSandApp.s("ց"), str));
                    }
                }
                if (z4 && this.f40573d.b() != 0) {
                    return n4.a(5, ProtectedSandApp.s("ւ"));
                }
                List<t0.b> d5 = bVar2.c().d();
                String d6 = bVar2.d();
                if (d6 != null && d5 != null) {
                    Iterator<t0.b> it2 = d5.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            bVar = null;
                            break;
                        }
                        bVar = it2.next();
                        if (d6.equals(bVar.g())) {
                            break;
                        }
                    }
                    if (bVar != null && bVar.n() != null) {
                        return n4.a(5, ProtectedSandApp.s("փ"));
                    }
                }
                return n4.f40521i;
            }
            b bVar4 = (b) this.f40574e.get(i4);
            if (!bVar4.c().f().equals(bVar2.c().f()) && !bVar4.c().f().equals(s4)) {
                return n4.a(5, ProtectedSandApp.s("ն"));
            }
            i4++;
        }
    }

    @androidx.annotation.q0
    public final String g() {
        return this.f40571b;
    }

    @androidx.annotation.q0
    public final String h() {
        return this.f40572c;
    }

    @androidx.annotation.q0
    @Deprecated
    public String i() {
        return null;
    }

    @androidx.annotation.q0
    @Deprecated
    public final String j() {
        return this.f40573d.d();
    }

    @androidx.annotation.q0
    public final String k() {
        return this.f40573d.e();
    }

    @androidx.annotation.o0
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f40575f);
        return arrayList;
    }

    @androidx.annotation.o0
    public final List m() {
        return this.f40574e;
    }

    public final boolean v() {
        return this.f40576g;
    }

    final boolean w() {
        if (this.f40571b != null || this.f40572c != null || this.f40573d.e() != null || this.f40573d.b() != 0 || this.f40570a || this.f40576g) {
            return true;
        }
        zzca zzcaVar = this.f40574e;
        if (zzcaVar != null) {
            int size = zzcaVar.size();
            int i4 = 0;
            while (i4 < size) {
                b.C0666b a5 = ((b) zzcaVar.get(i4)).a();
                i4++;
                if (a5 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* synthetic */ q(h4 h4Var) {
    }
}
