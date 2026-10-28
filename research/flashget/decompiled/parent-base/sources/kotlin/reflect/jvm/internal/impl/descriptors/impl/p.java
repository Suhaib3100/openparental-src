package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: FunctionDescriptorImpl.java */
/* loaded from: classes7.dex */
public abstract class p extends k implements kotlin.reflect.jvm.internal.impl.descriptors.z {
    private volatile ld.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> A;
    private final kotlin.reflect.jvm.internal.impl.descriptors.z B;
    private final b.a C;

    @fg.m
    private kotlin.reflect.jvm.internal.impl.descriptors.z D;
    protected Map<a.InterfaceC1077a<?>, Object> E;

    /* renamed from: f, reason: collision with root package name */
    private List<f1> f76077f;

    /* renamed from: g, reason: collision with root package name */
    private List<j1> f76078g;

    /* renamed from: h, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.types.h0 f76079h;

    /* renamed from: i, reason: collision with root package name */
    private List<x0> f76080i;

    /* renamed from: j, reason: collision with root package name */
    private x0 f76081j;

    /* renamed from: k, reason: collision with root package name */
    private x0 f76082k;

    /* renamed from: l, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.e0 f76083l;

    /* renamed from: m, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f76084m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f76085n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f76086o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f76087p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f76088q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f76089r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f76090s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f76091t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f76092u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f76093v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f76094w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f76095x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f76096y;

    /* renamed from: z, reason: collision with root package name */
    private Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> f76097z;

    /* compiled from: FunctionDescriptorImpl.java */
    class a implements ld.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1 f76098b;

        a(q1 q1Var) {
            this.f76098b = q1Var;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> invoke() {
            kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
            Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> it = p.this.e().iterator();
            while (it.hasNext()) {
                fVar.add(it.next().d(this.f76098b));
            }
            return fVar;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    static class b implements ld.a<List<l1>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f76100b;

        b(List list) {
            this.f76100b = list;
        }

        public List<l1> a() {
            return this.f76100b;
        }

        @Override // ld.a
        public List<l1> invoke() {
            return this.f76100b;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    public class c implements z.a<kotlin.reflect.jvm.internal.impl.descriptors.z> {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        protected o1 f76101a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        protected kotlin.reflect.jvm.internal.impl.descriptors.m f76102b;

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        protected kotlin.reflect.jvm.internal.impl.descriptors.e0 f76103c;

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        protected kotlin.reflect.jvm.internal.impl.descriptors.u f76104d;

        /* renamed from: e, reason: collision with root package name */
        @fg.m
        protected kotlin.reflect.jvm.internal.impl.descriptors.z f76105e;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        protected b.a f76106f;

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        protected List<j1> f76107g;

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        protected List<x0> f76108h;

        /* renamed from: i, reason: collision with root package name */
        @fg.m
        protected x0 f76109i;

        /* renamed from: j, reason: collision with root package name */
        @fg.m
        protected x0 f76110j;

        /* renamed from: k, reason: collision with root package name */
        @fg.l
        protected kotlin.reflect.jvm.internal.impl.types.h0 f76111k;

        /* renamed from: l, reason: collision with root package name */
        @fg.m
        protected kotlin.reflect.jvm.internal.impl.name.f f76112l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f76113m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f76114n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f76115o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f76116p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f76117q;

        /* renamed from: r, reason: collision with root package name */
        private List<f1> f76118r;

        /* renamed from: s, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f76119s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f76120t;

        /* renamed from: u, reason: collision with root package name */
        private Map<a.InterfaceC1077a<?>, Object> f76121u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f76122v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f76123w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ p f76124x;

        public c(@fg.l p pVar, @fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @fg.l b.a aVar, @fg.l List<j1> list, @fg.m List<x0> list2, @fg.l x0 x0Var, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var, kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (o1Var == null) {
                v(0);
            }
            if (mVar == null) {
                v(1);
            }
            if (e0Var == null) {
                v(2);
            }
            if (uVar == null) {
                v(3);
            }
            if (aVar == null) {
                v(4);
            }
            if (list == null) {
                v(5);
            }
            if (list2 == null) {
                v(6);
            }
            if (h0Var == null) {
                v(7);
            }
            this.f76124x = pVar;
            this.f76105e = null;
            this.f76110j = pVar.f76082k;
            this.f76113m = true;
            this.f76114n = false;
            this.f76115o = false;
            this.f76116p = false;
            this.f76117q = pVar.E0();
            this.f76118r = null;
            this.f76119s = null;
            this.f76120t = pVar.H0();
            this.f76121u = new LinkedHashMap();
            this.f76122v = null;
            this.f76123w = false;
            this.f76101a = o1Var;
            this.f76102b = mVar;
            this.f76103c = e0Var;
            this.f76104d = uVar;
            this.f76106f = aVar;
            this.f76107g = list;
            this.f76108h = list2;
            this.f76109i = x0Var;
            this.f76111k = h0Var;
            this.f76112l = fVar;
        }

        private static /* synthetic */ void v(int i4) {
            String s4;
            int i5;
            switch (i4) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    s4 = ProtectedSandApp.s("浯\u0001");
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    s4 = ProtectedSandApp.s("浮\u0001");
                    break;
            }
            switch (i4) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i5 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i5 = 3;
                    break;
            }
            Object[] objArr = new Object[i5];
            String s5 = ProtectedSandApp.s("浰\u0001");
            switch (i4) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("涁\u0001");
                    break;
                case 2:
                    objArr[0] = ProtectedSandApp.s("涀\u0001");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("浿\u0001");
                    break;
                case 4:
                case 14:
                    objArr[0] = ProtectedSandApp.s("浾\u0001");
                    break;
                case 5:
                    objArr[0] = ProtectedSandApp.s("浽\u0001");
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("浼\u0001");
                    break;
                case 7:
                    objArr[0] = ProtectedSandApp.s("浻\u0001");
                    break;
                case 8:
                    objArr[0] = ProtectedSandApp.s("浺\u0001");
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = s5;
                    break;
                case 10:
                    objArr[0] = ProtectedSandApp.s("浹\u0001");
                    break;
                case 12:
                    objArr[0] = ProtectedSandApp.s("浸\u0001");
                    break;
                case 17:
                    objArr[0] = ProtectedSandApp.s("海\u0001");
                    break;
                case 19:
                case 21:
                    objArr[0] = ProtectedSandApp.s("浶\u0001");
                    break;
                case 23:
                    objArr[0] = ProtectedSandApp.s("浵\u0001");
                    break;
                case 25:
                    objArr[0] = ProtectedSandApp.s("浴\u0001");
                    break;
                case 35:
                    objArr[0] = ProtectedSandApp.s("浳\u0001");
                    break;
                case 37:
                default:
                    objArr[0] = ProtectedSandApp.s("浱\u0001");
                    break;
                case 39:
                    objArr[0] = ProtectedSandApp.s("浲\u0001");
                    break;
            }
            String s6 = ProtectedSandApp.s("涂\u0001");
            String s7 = ProtectedSandApp.s("涃\u0001");
            String s10 = ProtectedSandApp.s("涄\u0001");
            String s11 = ProtectedSandApp.s("涅\u0001");
            String s12 = ProtectedSandApp.s("涆\u0001");
            String s13 = ProtectedSandApp.s("涇\u0001");
            String s14 = ProtectedSandApp.s("消\u0001");
            String s15 = ProtectedSandApp.s("涉\u0001");
            String s16 = ProtectedSandApp.s("涊\u0001");
            String s17 = ProtectedSandApp.s("涋\u0001");
            String s18 = ProtectedSandApp.s("涌\u0001");
            String s19 = ProtectedSandApp.s("涍\u0001");
            switch (i4) {
                case 9:
                    objArr[1] = s6;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = s5;
                    break;
                case 11:
                    objArr[1] = s7;
                    break;
                case 13:
                    objArr[1] = s10;
                    break;
                case 15:
                    objArr[1] = s11;
                    break;
                case 16:
                    objArr[1] = ProtectedSandApp.s("涘\u0001");
                    break;
                case 18:
                    objArr[1] = s12;
                    break;
                case 20:
                    objArr[1] = s13;
                    break;
                case 22:
                    objArr[1] = s14;
                    break;
                case 24:
                    objArr[1] = s15;
                    break;
                case 26:
                    objArr[1] = s16;
                    break;
                case 27:
                    objArr[1] = ProtectedSandApp.s("涗\u0001");
                    break;
                case 28:
                    objArr[1] = ProtectedSandApp.s("涖\u0001");
                    break;
                case 29:
                    objArr[1] = ProtectedSandApp.s("涕\u0001");
                    break;
                case 30:
                    objArr[1] = ProtectedSandApp.s("涔\u0001");
                    break;
                case 31:
                    objArr[1] = ProtectedSandApp.s("涓\u0001");
                    break;
                case 32:
                    objArr[1] = ProtectedSandApp.s("涒\u0001");
                    break;
                case 33:
                    objArr[1] = ProtectedSandApp.s("涑\u0001");
                    break;
                case 34:
                    objArr[1] = ProtectedSandApp.s("涐\u0001");
                    break;
                case 36:
                    objArr[1] = s17;
                    break;
                case 38:
                    objArr[1] = s18;
                    break;
                case 40:
                    objArr[1] = s19;
                    break;
                case 41:
                    objArr[1] = ProtectedSandApp.s("涏\u0001");
                    break;
                case 42:
                    objArr[1] = ProtectedSandApp.s("涎\u0001");
                    break;
            }
            switch (i4) {
                case 8:
                    objArr[2] = s6;
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = s7;
                    break;
                case 12:
                    objArr[2] = s10;
                    break;
                case 14:
                    objArr[2] = s11;
                    break;
                case 17:
                    objArr[2] = s12;
                    break;
                case 19:
                    objArr[2] = s13;
                    break;
                case 21:
                    objArr[2] = s14;
                    break;
                case 23:
                    objArr[2] = s15;
                    break;
                case 25:
                    objArr[2] = s16;
                    break;
                case 35:
                    objArr[2] = s17;
                    break;
                case 37:
                    objArr[2] = s18;
                    break;
                case 39:
                    objArr[2] = s19;
                    break;
                default:
                    objArr[2] = ProtectedSandApp.s("涙\u0001");
                    break;
            }
            String format = String.format(s4, objArr);
            switch (i4) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            if (gVar == null) {
                v(35);
            }
            this.f76119s = gVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public c p(boolean z4) {
            this.f76113m = z4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c d(@fg.m x0 x0Var) {
            this.f76110j = x0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public c b() {
            this.f76116p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public c f(@fg.m x0 x0Var) {
            this.f76109i = x0Var;
            return this;
        }

        public c H(boolean z4) {
            this.f76122v = Boolean.valueOf(z4);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public c e() {
            this.f76120t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public c j() {
            this.f76117q = true;
            return this;
        }

        @fg.l
        public c K(boolean z4) {
            this.f76123w = z4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public c s(@fg.l b.a aVar) {
            if (aVar == null) {
                v(14);
            }
            this.f76106f = aVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public c l(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var) {
            if (e0Var == null) {
                v(10);
            }
            this.f76103c = e0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public c k(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                v(17);
            }
            this.f76112l = fVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public c o(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f76105e = (kotlin.reflect.jvm.internal.impl.descriptors.z) bVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public c r(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (mVar == null) {
                v(8);
            }
            this.f76102b = mVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c m() {
            this.f76115o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public c n(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            if (h0Var == null) {
                v(23);
            }
            this.f76111k = h0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public c u() {
            this.f76114n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public c g(@fg.l o1 o1Var) {
            if (o1Var == null) {
                v(37);
            }
            this.f76101a = o1Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public c q(@fg.l List<f1> list) {
            if (list == null) {
                v(21);
            }
            this.f76118r = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public c c(@fg.l List<j1> list) {
            if (list == null) {
                v(19);
            }
            this.f76107g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public c i(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
            if (uVar == null) {
                v(12);
            }
            this.f76104d = uVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.m
        public kotlin.reflect.jvm.internal.impl.descriptors.z a() {
            return this.f76124x.N0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @fg.l
        public <V> z.a<kotlin.reflect.jvm.internal.impl.descriptors.z> h(@fg.l a.InterfaceC1077a<V> interfaceC1077a, V v4) {
            if (interfaceC1077a == null) {
                v(39);
            }
            this.f76121u.put(interfaceC1077a, v4);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected p(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, @fg.l a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (fVar == null) {
            j0(2);
        }
        if (aVar == null) {
            j0(3);
        }
        if (a1Var == null) {
            j0(4);
        }
        this.f76084m = kotlin.reflect.jvm.internal.impl.descriptors.t.f76294i;
        this.f76085n = false;
        this.f76086o = false;
        this.f76087p = false;
        this.f76088q = false;
        this.f76089r = false;
        this.f76090s = false;
        this.f76091t = false;
        this.f76092u = false;
        this.f76093v = false;
        this.f76094w = false;
        this.f76095x = true;
        this.f76096y = false;
        this.f76097z = null;
        this.A = null;
        this.D = null;
        this.E = null;
        this.B = zVar == null ? this : zVar;
        this.C = aVar;
    }

    @fg.l
    private a1 O0(boolean z4, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        a1 a1Var;
        if (z4) {
            if (zVar == null) {
                zVar = a();
            }
            a1Var = zVar.f();
        } else {
            a1Var = a1.f75900a;
        }
        if (a1Var == null) {
            j0(27);
        }
        return a1Var;
    }

    @fg.m
    public static List<j1> P0(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l List<j1> list, @fg.l q1 q1Var) {
        if (list == null) {
            j0(28);
        }
        if (q1Var == null) {
            j0(29);
        }
        return Q0(zVar, list, q1Var, false, false, null);
    }

    @fg.m
    public static List<j1> Q0(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l List<j1> list, @fg.l q1 q1Var, boolean z4, boolean z5, @fg.m boolean[] zArr) {
        if (list == null) {
            j0(30);
        }
        if (q1Var == null) {
            j0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (j1 j1Var : list) {
            kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
            x1 x1Var = x1.IN_VARIANCE;
            kotlin.reflect.jvm.internal.impl.types.h0 p4 = q1Var.p(type, x1Var);
            kotlin.reflect.jvm.internal.impl.types.h0 x02 = j1Var.x0();
            kotlin.reflect.jvm.internal.impl.types.h0 p5 = x02 == null ? null : q1Var.p(x02, x1Var);
            if (p4 == null) {
                return null;
            }
            if ((p4 != j1Var.getType() || x02 != p5) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(l0.M0(zVar, z4 ? null : j1Var, j1Var.getIndex(), j1Var.getAnnotations(), j1Var.getName(), p4, j1Var.C0(), j1Var.t0(), j1Var.r0(), p5, z5 ? j1Var.f() : a1.f75900a, j1Var instanceof l0.b ? new b(((l0.b) j1Var).P0()) : null));
        }
        return arrayList;
    }

    private void U0() {
        ld.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> aVar = this.A;
        if (aVar != null) {
            this.f76097z = aVar.invoke();
            this.A = null;
        }
    }

    private void b1(boolean z4) {
        this.f76093v = z4;
    }

    private void c1(boolean z4) {
        this.f76092u = z4;
    }

    private void e1(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        this.D = zVar;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                s4 = ProtectedSandApp.s("梚\u0001");
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                s4 = ProtectedSandApp.s("梙\u0001");
                break;
        }
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i5 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("梛\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("梪\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("梩\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("梨\u0001");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("梧\u0001");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("梦\u0001");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("梥\u0001");
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = ProtectedSandApp.s("梤\u0001");
                break;
            case 8:
            case 10:
                objArr[0] = ProtectedSandApp.s("梣\u0001");
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = s5;
                break;
            case 11:
                objArr[0] = ProtectedSandApp.s("梢\u0001");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("梡\u0001");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("梠\u0001");
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("梟\u0001");
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = ProtectedSandApp.s("梞\u0001");
                break;
            case 25:
                objArr[0] = ProtectedSandApp.s("條\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("梜\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("梫\u0001");
        String s7 = ProtectedSandApp.s("梬\u0001");
        switch (i4) {
            case 9:
                objArr[1] = s6;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = s5;
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("梶\u0001");
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("梵\u0001");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("梴\u0001");
                break;
            case 16:
                objArr[1] = ProtectedSandApp.s("梳\u0001");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("梲\u0001");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("梱\u0001");
                break;
            case 20:
                objArr[1] = ProtectedSandApp.s("械\u0001");
                break;
            case 21:
                objArr[1] = ProtectedSandApp.s("梯\u0001");
                break;
            case 23:
                objArr[1] = s7;
                break;
            case 26:
                objArr[1] = ProtectedSandApp.s("梮\u0001");
                break;
            case 27:
                objArr[1] = ProtectedSandApp.s("梭\u0001");
                break;
        }
        switch (i4) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = s6;
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = ProtectedSandApp.s("梾\u0001");
                break;
            case 11:
                objArr[2] = ProtectedSandApp.s("梽\u0001");
                break;
            case 12:
                objArr[2] = ProtectedSandApp.s("梼\u0001");
                break;
            case 17:
                objArr[2] = ProtectedSandApp.s("梻\u0001");
                break;
            case 22:
                objArr[2] = ProtectedSandApp.s("梺\u0001");
                break;
            case 24:
                objArr[2] = s7;
                break;
            case 25:
                objArr[2] = ProtectedSandApp.s("梹\u0001");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = ProtectedSandApp.s("梸\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("梷\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @fg.l
    public z.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> A() {
        c T0 = T0(q1.f78532b);
        if (T0 == null) {
            j0(23);
        }
        return T0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean B() {
        if (this.f76086o) {
            return true;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> it = a().e().iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.i(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean E0() {
        return this.f76092u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F0(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == 0) {
            j0(17);
        }
        this.f76097z = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.z) it.next()).H0()) {
                this.f76093v = true;
                return;
            }
        }
    }

    public boolean G() {
        return this.f76089r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean H0() {
        return this.f76093v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    /* renamed from: L0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.z R(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z4) {
        kotlin.reflect.jvm.internal.impl.descriptors.z a5 = A().r(mVar).l(e0Var).i(uVar).s(aVar).p(z4).a();
        if (a5 == null) {
            j0(26);
        }
        return a5;
    }

    @fg.l
    protected abstract p M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var);

    @fg.m
    protected kotlin.reflect.jvm.internal.impl.descriptors.z N0(@fg.l c cVar) {
        f0 f0Var;
        x0 x0Var;
        kotlin.reflect.jvm.internal.impl.types.h0 p4;
        if (cVar == null) {
            j0(25);
        }
        boolean[] zArr = new boolean[1];
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a5 = cVar.f76119s != null ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(getAnnotations(), cVar.f76119s) : getAnnotations();
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = cVar.f76102b;
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = cVar.f76105e;
        p M0 = M0(mVar, zVar, cVar.f76106f, cVar.f76112l, a5, O0(cVar.f76115o, zVar));
        List<f1> typeParameters = cVar.f76118r == null ? getTypeParameters() : cVar.f76118r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        q1 c5 = kotlin.reflect.jvm.internal.impl.types.u.c(typeParameters, cVar.f76101a, M0, arrayList, zArr);
        if (c5 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f76108h.isEmpty()) {
            int i4 = 0;
            for (x0 x0Var2 : cVar.f76108h) {
                kotlin.reflect.jvm.internal.impl.types.h0 p5 = c5.p(x0Var2.getType(), x1.IN_VARIANCE);
                if (p5 == null) {
                    return null;
                }
                int i5 = i4 + 1;
                arrayList2.add(kotlin.reflect.jvm.internal.impl.resolve.e.b(M0, p5, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) x0Var2.getValue()).a(), x0Var2.getAnnotations(), i4));
                zArr[0] = zArr[0] | (p5 != x0Var2.getType());
                i4 = i5;
            }
        }
        x0 x0Var3 = cVar.f76109i;
        if (x0Var3 != null) {
            kotlin.reflect.jvm.internal.impl.types.h0 p6 = c5.p(x0Var3.getType(), x1.IN_VARIANCE);
            if (p6 == null) {
                return null;
            }
            f0 f0Var2 = new f0(M0, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(M0, p6, cVar.f76109i.getValue()), cVar.f76109i.getAnnotations());
            zArr[0] = (p6 != cVar.f76109i.getType()) | zArr[0];
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        x0 x0Var4 = cVar.f76110j;
        if (x0Var4 != null) {
            x0 d5 = x0Var4.d(c5);
            if (d5 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (d5 != cVar.f76110j);
            x0Var = d5;
        } else {
            x0Var = null;
        }
        List<j1> Q0 = Q0(M0, cVar.f76107g, c5, cVar.f76116p, cVar.f76115o, zArr);
        if (Q0 == null || (p4 = c5.p(cVar.f76111k, x1.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z4 = zArr[0] | (p4 != cVar.f76111k);
        zArr[0] = z4;
        if (!z4 && cVar.f76123w) {
            return this;
        }
        M0.S0(f0Var, x0Var, arrayList2, arrayList, Q0, p4, cVar.f76103c, cVar.f76104d);
        M0.g1(this.f76085n);
        M0.d1(this.f76086o);
        M0.Y0(this.f76087p);
        M0.f1(this.f76088q);
        M0.j1(this.f76089r);
        M0.i1(this.f76094w);
        M0.X0(this.f76090s);
        M0.W0(this.f76091t);
        M0.Z0(this.f76095x);
        M0.f76092u = cVar.f76117q;
        M0.f76093v = cVar.f76120t;
        M0.a1(cVar.f76122v != null ? cVar.f76122v.booleanValue() : this.f76096y);
        if (!cVar.f76121u.isEmpty() || this.E != null) {
            Map<a.InterfaceC1077a<?>, Object> map = cVar.f76121u;
            Map<a.InterfaceC1077a<?>, Object> map2 = this.E;
            if (map2 != null) {
                for (Map.Entry<a.InterfaceC1077a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                M0.E = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                M0.E = map;
            }
        }
        if (cVar.f76114n || u0() != null) {
            M0.D = (u0() != null ? u0() : this).d(c5);
        }
        if (cVar.f76113m && !a().e().isEmpty()) {
            if (cVar.f76101a.f()) {
                ld.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> aVar = this.A;
                if (aVar != null) {
                    M0.A = aVar;
                } else {
                    M0.F0(e());
                }
            } else {
                M0.A = new a(c5);
            }
        }
        return M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 O() {
        return this.f76082k;
    }

    public boolean R0() {
        return this.f76095x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 S() {
        return this.f76081j;
    }

    @fg.l
    public p S0(@fg.m x0 x0Var, @fg.m x0 x0Var2, @fg.l List<x0> list, @fg.l List<? extends f1> list2, @fg.l List<j1> list3, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (list == null) {
            j0(5);
        }
        if (list2 == null) {
            j0(6);
        }
        if (list3 == null) {
            j0(7);
        }
        if (uVar == null) {
            j0(8);
        }
        this.f76077f = kotlin.collections.w.V5(list2);
        this.f76078g = kotlin.collections.w.V5(list3);
        this.f76079h = h0Var;
        this.f76083l = e0Var;
        this.f76084m = uVar;
        this.f76081j = x0Var;
        this.f76082k = x0Var2;
        this.f76080i = list;
        int i4 = 0;
        while (true) {
            int size = list2.size();
            String s4 = ProtectedSandApp.s("梿\u0001");
            if (i4 >= size) {
                for (int i5 = 0; i5 < list3.size(); i5++) {
                    j1 j1Var = list3.get(i5);
                    if (j1Var.getIndex() != i5) {
                        throw new IllegalStateException(j1Var + ProtectedSandApp.s("棁\u0001") + j1Var.getIndex() + s4 + i5);
                    }
                }
                return this;
            }
            f1 f1Var = list2.get(i4);
            if (f1Var.getIndex() != i4) {
                throw new IllegalStateException(f1Var + ProtectedSandApp.s("检\u0001") + f1Var.getIndex() + s4 + i4);
            }
            i4++;
        }
    }

    @fg.l
    protected c T0(@fg.l q1 q1Var) {
        if (q1Var == null) {
            j0(24);
        }
        return new c(this, q1Var.j(), c(), u(), getVisibility(), b(), i(), z0(), S(), getReturnType(), null);
    }

    public <V> void V0(a.InterfaceC1077a<V> interfaceC1077a, Object obj) {
        if (this.E == null) {
            this.E = new LinkedHashMap();
        }
        this.E.put(interfaceC1077a, obj);
    }

    public void W0(boolean z4) {
        this.f76091t = z4;
    }

    public void X0(boolean z4) {
        this.f76090s = z4;
    }

    public void Y0(boolean z4) {
        this.f76087p = z4;
    }

    public void Z0(boolean z4) {
        this.f76095x = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return this.f76091t;
    }

    public void a1(boolean z4) {
        this.f76096y = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    public b.a b() {
        b.a aVar = this.C;
        if (aVar == null) {
            j0(21);
        }
        return aVar;
    }

    public void d1(boolean z4) {
        this.f76086o = z4;
    }

    @fg.l
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> e() {
        U0();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> collection = this.f76097z;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            j0(14);
        }
        return collection;
    }

    public void f1(boolean z4) {
        this.f76088q = z4;
    }

    public void g1(boolean z4) {
        this.f76085n = z4;
    }

    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        return this.f76079h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<f1> getTypeParameters() {
        List<f1> list = this.f76077f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("棂\u0001") + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f76084m;
        if (uVar == null) {
            j0(16);
        }
        return uVar;
    }

    public void h1(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            j0(11);
        }
        this.f76079h = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<j1> i() {
        List<j1> list = this.f76078g;
        if (list == null) {
            j0(19);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return this.f76096y;
    }

    public void i1(boolean z4) {
        this.f76094w = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean isSuspend() {
        return this.f76094w;
    }

    public void j1(boolean z4) {
        this.f76089r = z4;
    }

    public boolean k() {
        return this.f76088q;
    }

    public void k1(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (uVar == null) {
            j0(10);
        }
        this.f76084m = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return this.f76090s;
    }

    public boolean t() {
        return this.f76087p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f76083l;
        if (e0Var == null) {
            j0(15);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.z u0() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        Map<a.InterfaceC1077a<?>, Object> map = this.E;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC1077a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean x() {
        if (this.f76085n) {
            return true;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> it = a().e().iterator();
        while (it.hasNext()) {
            if (it.next().x()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<x0> z0() {
        List<x0> list = this.f76080i;
        if (list == null) {
            j0(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.c1
    public kotlin.reflect.jvm.internal.impl.descriptors.z d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            j0(22);
        }
        return q1Var.k() ? this : T0(q1Var).o(a()).m().K(true).a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.z a() {
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = this.B;
        kotlin.reflect.jvm.internal.impl.descriptors.z a5 = zVar == this ? this : zVar.a();
        if (a5 == null) {
            j0(20);
        }
        return a5;
    }
}
