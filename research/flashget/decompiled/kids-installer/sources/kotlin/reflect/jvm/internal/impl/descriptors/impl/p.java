package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public abstract class p extends k implements kotlin.reflect.jvm.internal.impl.descriptors.z {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> M;
    private volatile q3.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> N;
    private final kotlin.reflect.jvm.internal.impl.descriptors.z O;
    private final b.a P;

    @d5.e
    private kotlin.reflect.jvm.internal.impl.descriptors.z Q;
    protected Map<a.InterfaceC0274a<?>, Object> R;

    /* renamed from: s, reason: collision with root package name */
    private List<f1> f24247s;

    /* renamed from: t, reason: collision with root package name */
    private List<j1> f24248t;

    /* renamed from: u, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.types.h0 f24249u;

    /* renamed from: v, reason: collision with root package name */
    private List<x0> f24250v;

    /* renamed from: w, reason: collision with root package name */
    private x0 f24251w;

    /* renamed from: x, reason: collision with root package name */
    private x0 f24252x;

    /* renamed from: y, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.e0 f24253y;

    /* renamed from: z, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.u f24254z;

    /* compiled from: FunctionDescriptorImpl.java */
    class a implements q3.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q1 f24255o;

        a(q1 q1Var) {
            this.f24255o = q1Var;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> n() {
            kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
            Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> it = p.this.g().iterator();
            while (it.hasNext()) {
                eVar.add(it.next().d(this.f24255o));
            }
            return eVar;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    static class b implements q3.a<List<l1>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f24257o;

        b(List list) {
            this.f24257o = list;
        }

        public List<l1> a() {
            return this.f24257o;
        }

        @Override // q3.a
        public List<l1> n() {
            return this.f24257o;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    /* loaded from: classes5.dex */
    public class c implements z.a<kotlin.reflect.jvm.internal.impl.descriptors.z> {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        protected o1 f24258a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.m f24259b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.e0 f24260c;

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.u f24261d;

        /* renamed from: e, reason: collision with root package name */
        @d5.e
        protected kotlin.reflect.jvm.internal.impl.descriptors.z f24262e;

        /* renamed from: f, reason: collision with root package name */
        @d5.d
        protected b.a f24263f;

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        protected List<j1> f24264g;

        /* renamed from: h, reason: collision with root package name */
        @d5.d
        protected List<x0> f24265h;

        /* renamed from: i, reason: collision with root package name */
        @d5.e
        protected x0 f24266i;

        /* renamed from: j, reason: collision with root package name */
        @d5.e
        protected x0 f24267j;

        /* renamed from: k, reason: collision with root package name */
        @d5.d
        protected kotlin.reflect.jvm.internal.impl.types.h0 f24268k;

        /* renamed from: l, reason: collision with root package name */
        @d5.e
        protected kotlin.reflect.jvm.internal.impl.name.f f24269l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f24270m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f24271n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f24272o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f24273p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f24274q;

        /* renamed from: r, reason: collision with root package name */
        private List<f1> f24275r;

        /* renamed from: s, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f24276s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f24277t;

        /* renamed from: u, reason: collision with root package name */
        private Map<a.InterfaceC0274a<?>, Object> f24278u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f24279v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f24280w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ p f24281x;

        public c(@d5.d p pVar, @d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @d5.d b.a aVar, @d5.d List<j1> list, @d5.e List<x0> list2, @d5.d x0 x0Var, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var, kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (o1Var == null) {
                u(0);
            }
            if (mVar == null) {
                u(1);
            }
            if (e0Var == null) {
                u(2);
            }
            if (uVar == null) {
                u(3);
            }
            if (aVar == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (h0Var == null) {
                u(7);
            }
            this.f24281x = pVar;
            this.f24262e = null;
            this.f24267j = pVar.f24252x;
            this.f24270m = true;
            this.f24271n = false;
            this.f24272o = false;
            this.f24273p = false;
            this.f24274q = pVar.D0();
            this.f24275r = null;
            this.f24276s = null;
            this.f24277t = pVar.J0();
            this.f24278u = new LinkedHashMap();
            this.f24279v = null;
            this.f24280w = false;
            this.f24258a = o1Var;
            this.f24259b = mVar;
            this.f24260c = e0Var;
            this.f24261d = uVar;
            this.f24263f = aVar;
            this.f24264g = list;
            this.f24265h = list2;
            this.f24266i = x0Var;
            this.f24268k = h0Var;
            this.f24269l = fVar;
        }

        private static /* synthetic */ void u(int i5) {
            String s5;
            int i6;
            switch (i5) {
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
                    s5 = ProtectedSandApp.s("䞸");
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
                    s5 = ProtectedSandApp.s("䞷");
                    break;
            }
            switch (i5) {
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
                    i6 = 2;
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
                    i6 = 3;
                    break;
            }
            Object[] objArr = new Object[i6];
            String s6 = ProtectedSandApp.s("䞹");
            switch (i5) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("䟊");
                    break;
                case 2:
                    objArr[0] = ProtectedSandApp.s("䟉");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("䟈");
                    break;
                case 4:
                case 14:
                    objArr[0] = ProtectedSandApp.s("䟇");
                    break;
                case 5:
                    objArr[0] = ProtectedSandApp.s("䟆");
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("䟅");
                    break;
                case 7:
                    objArr[0] = ProtectedSandApp.s("䟄");
                    break;
                case 8:
                    objArr[0] = ProtectedSandApp.s("䟃");
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
                    objArr[0] = s6;
                    break;
                case 10:
                    objArr[0] = ProtectedSandApp.s("䟂");
                    break;
                case 12:
                    objArr[0] = ProtectedSandApp.s("䟁");
                    break;
                case 17:
                    objArr[0] = ProtectedSandApp.s("䟀");
                    break;
                case 19:
                case 21:
                    objArr[0] = ProtectedSandApp.s("䞿");
                    break;
                case 23:
                    objArr[0] = ProtectedSandApp.s("䞾");
                    break;
                case 25:
                    objArr[0] = ProtectedSandApp.s("䞽");
                    break;
                case 35:
                    objArr[0] = ProtectedSandApp.s("䞼");
                    break;
                case 37:
                default:
                    objArr[0] = ProtectedSandApp.s("䞺");
                    break;
                case 39:
                    objArr[0] = ProtectedSandApp.s("䞻");
                    break;
            }
            String s7 = ProtectedSandApp.s("䟋");
            String s8 = ProtectedSandApp.s("䟌");
            String s9 = ProtectedSandApp.s("䟍");
            String s10 = ProtectedSandApp.s("䟎");
            String s11 = ProtectedSandApp.s("䟏");
            String s12 = ProtectedSandApp.s("䟐");
            String s13 = ProtectedSandApp.s("䟑");
            String s14 = ProtectedSandApp.s("䟒");
            String s15 = ProtectedSandApp.s("䟓");
            String s16 = ProtectedSandApp.s("䟔");
            String s17 = ProtectedSandApp.s("䟕");
            String s18 = ProtectedSandApp.s("䟖");
            switch (i5) {
                case 9:
                    objArr[1] = s18;
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
                    objArr[1] = s6;
                    break;
                case 11:
                    objArr[1] = s17;
                    break;
                case 13:
                    objArr[1] = s16;
                    break;
                case 15:
                    objArr[1] = s15;
                    break;
                case 16:
                    objArr[1] = ProtectedSandApp.s("䟡");
                    break;
                case 18:
                    objArr[1] = s14;
                    break;
                case 20:
                    objArr[1] = s13;
                    break;
                case 22:
                    objArr[1] = s12;
                    break;
                case 24:
                    objArr[1] = s11;
                    break;
                case 26:
                    objArr[1] = s10;
                    break;
                case 27:
                    objArr[1] = ProtectedSandApp.s("䟠");
                    break;
                case 28:
                    objArr[1] = ProtectedSandApp.s("䟟");
                    break;
                case 29:
                    objArr[1] = ProtectedSandApp.s("䟞");
                    break;
                case 30:
                    objArr[1] = ProtectedSandApp.s("䟝");
                    break;
                case 31:
                    objArr[1] = ProtectedSandApp.s("䟜");
                    break;
                case 32:
                    objArr[1] = ProtectedSandApp.s("䟛");
                    break;
                case 33:
                    objArr[1] = ProtectedSandApp.s("䟚");
                    break;
                case 34:
                    objArr[1] = ProtectedSandApp.s("䟙");
                    break;
                case 36:
                    objArr[1] = s9;
                    break;
                case 38:
                    objArr[1] = s8;
                    break;
                case 40:
                    objArr[1] = s7;
                    break;
                case 41:
                    objArr[1] = ProtectedSandApp.s("䟘");
                    break;
                case 42:
                    objArr[1] = ProtectedSandApp.s("䟗");
                    break;
            }
            switch (i5) {
                case 8:
                    objArr[2] = s18;
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
                    objArr[2] = s17;
                    break;
                case 12:
                    objArr[2] = s16;
                    break;
                case 14:
                    objArr[2] = s15;
                    break;
                case 17:
                    objArr[2] = s14;
                    break;
                case 19:
                    objArr[2] = s13;
                    break;
                case 21:
                    objArr[2] = s12;
                    break;
                case 23:
                    objArr[2] = s11;
                    break;
                case 25:
                    objArr[2] = s10;
                    break;
                case 35:
                    objArr[2] = s9;
                    break;
                case 37:
                    objArr[2] = s8;
                    break;
                case 39:
                    objArr[2] = s7;
                    break;
                default:
                    objArr[2] = ProtectedSandApp.s("䟢");
                    break;
            }
            String format = String.format(s5, objArr);
            switch (i5) {
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
        @d5.d
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public c r(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            if (gVar == null) {
                u(35);
            }
            this.f24276s = gVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c i(boolean z5) {
            this.f24270m = z5;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public c d(@d5.e x0 x0Var) {
            this.f24267j = x0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c a() {
            this.f24273p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public c j(@d5.e x0 x0Var) {
            this.f24266i = x0Var;
            return this;
        }

        public c G(boolean z5) {
            this.f24279v = Boolean.valueOf(z5);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public c h() {
            this.f24277t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public c p() {
            this.f24274q = true;
            return this;
        }

        @d5.d
        public c J(boolean z5) {
            this.f24280w = z5;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public c q(@d5.d b.a aVar) {
            if (aVar == null) {
                u(14);
            }
            this.f24263f = aVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public c c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var) {
            if (e0Var == null) {
                u(10);
            }
            this.f24260c = e0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public c s(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                u(17);
            }
            this.f24269l = fVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public c g(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f24262e = (kotlin.reflect.jvm.internal.impl.descriptors.z) bVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public c o(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (mVar == null) {
                u(8);
            }
            this.f24259b = mVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public c e() {
            this.f24272o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c f(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            if (h0Var == null) {
                u(23);
            }
            this.f24268k = h0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public c t() {
            this.f24271n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public c k(@d5.d o1 o1Var) {
            if (o1Var == null) {
                u(37);
            }
            this.f24258a = o1Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public c l(@d5.d List<f1> list) {
            if (list == null) {
                u(21);
            }
            this.f24275r = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public c b(@d5.d List<j1> list) {
            if (list == null) {
                u(19);
            }
            this.f24264g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public c n(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
            if (uVar == null) {
                u(12);
            }
            this.f24261d = uVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.e
        public kotlin.reflect.jvm.internal.impl.descriptors.z build() {
            return this.f24281x.T0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.z.a
        @d5.d
        public <V> z.a<kotlin.reflect.jvm.internal.impl.descriptors.z> m(@d5.d a.InterfaceC0274a<V> interfaceC0274a, V v5) {
            if (interfaceC0274a == null) {
                u(39);
            }
            this.f24278u.put(interfaceC0274a, v5);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected p(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (fVar == null) {
            Q(2);
        }
        if (aVar == null) {
            Q(3);
        }
        if (a1Var == null) {
            Q(4);
        }
        this.f24254z = kotlin.reflect.jvm.internal.impl.descriptors.t.f24444i;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = true;
        this.L = false;
        this.M = null;
        this.N = null;
        this.Q = null;
        this.R = null;
        this.O = zVar == null ? this : zVar;
        this.P = aVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5;
        int i6;
        switch (i5) {
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
                s5 = ProtectedSandApp.s("肌");
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                s5 = ProtectedSandApp.s("肋");
                break;
        }
        switch (i5) {
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
                i6 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("肍");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("肜");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("肛");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("肚");
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("肙");
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("肘");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("肗");
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = ProtectedSandApp.s("肖");
                break;
            case 8:
            case 10:
                objArr[0] = ProtectedSandApp.s("肕");
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
                objArr[0] = s6;
                break;
            case 11:
                objArr[0] = ProtectedSandApp.s("肔");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("肓");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("肒");
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("肑");
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = ProtectedSandApp.s("肐");
                break;
            case 25:
                objArr[0] = ProtectedSandApp.s("肏");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("肎");
                break;
        }
        String s7 = ProtectedSandApp.s("肝");
        String s8 = ProtectedSandApp.s("肞");
        switch (i5) {
            case 9:
                objArr[1] = s8;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = s6;
                break;
            case 13:
                objArr[1] = ProtectedSandApp.s("肨");
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("肧");
                break;
            case 15:
                objArr[1] = ProtectedSandApp.s("肦");
                break;
            case 16:
                objArr[1] = ProtectedSandApp.s("肥");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("肤");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("肣");
                break;
            case 20:
                objArr[1] = ProtectedSandApp.s("肢");
                break;
            case 21:
                objArr[1] = ProtectedSandApp.s("股");
                break;
            case 23:
                objArr[1] = s7;
                break;
            case 26:
                objArr[1] = ProtectedSandApp.s("肠");
                break;
            case 27:
                objArr[1] = ProtectedSandApp.s("肟");
                break;
        }
        switch (i5) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = s8;
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
                objArr[2] = ProtectedSandApp.s("肰");
                break;
            case 11:
                objArr[2] = ProtectedSandApp.s("肯");
                break;
            case 12:
                objArr[2] = ProtectedSandApp.s("肮");
                break;
            case 17:
                objArr[2] = ProtectedSandApp.s("肭");
                break;
            case 22:
                objArr[2] = ProtectedSandApp.s("肬");
                break;
            case 24:
                objArr[2] = s7;
                break;
            case 25:
                objArr[2] = ProtectedSandApp.s("肫");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = ProtectedSandApp.s("肪");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("肩");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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

    @d5.d
    private a1 U0(boolean z5, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        a1 a1Var;
        if (z5) {
            if (zVar == null) {
                zVar = a();
            }
            a1Var = zVar.k();
        } else {
            a1Var = a1.f24103a;
        }
        if (a1Var == null) {
            Q(27);
        }
        return a1Var;
    }

    @d5.e
    public static List<j1> V0(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d List<j1> list, @d5.d q1 q1Var) {
        if (list == null) {
            Q(28);
        }
        if (q1Var == null) {
            Q(29);
        }
        return W0(zVar, list, q1Var, false, false, null);
    }

    @d5.e
    public static List<j1> W0(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d List<j1> list, @d5.d q1 q1Var, boolean z5, boolean z6, @d5.e boolean[] zArr) {
        if (list == null) {
            Q(30);
        }
        if (q1Var == null) {
            Q(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (j1 j1Var : list) {
            kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
            x1 x1Var = x1.IN_VARIANCE;
            kotlin.reflect.jvm.internal.impl.types.h0 p5 = q1Var.p(type, x1Var);
            kotlin.reflect.jvm.internal.impl.types.h0 s02 = j1Var.s0();
            kotlin.reflect.jvm.internal.impl.types.h0 p6 = s02 == null ? null : q1Var.p(s02, x1Var);
            if (p5 == null) {
                return null;
            }
            if ((p5 != j1Var.getType() || s02 != p6) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(l0.S0(zVar, z5 ? null : j1Var, j1Var.getIndex(), j1Var.getAnnotations(), j1Var.getName(), p5, j1Var.B0(), j1Var.i0(), j1Var.f0(), p6, z6 ? j1Var.k() : a1.f24103a, j1Var instanceof l0.b ? new b(((l0.b) j1Var).V0()) : null));
        }
        return arrayList;
    }

    private void a1() {
        q3.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> aVar = this.N;
        if (aVar != null) {
            this.M = aVar.n();
            this.N = null;
        }
    }

    private void h1(boolean z5) {
        this.I = z5;
    }

    private void i1(boolean z5) {
        this.H = z5;
    }

    private void k1(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        this.Q = zVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean B() {
        if (this.A) {
            return true;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> it = a().g().iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean D0() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void E0(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == 0) {
            Q(17);
        }
        this.M = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.z) it.next()).J0()) {
                this.I = true;
                return;
            }
        }
    }

    @d5.d
    public z.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> F() {
        c Z0 = Z0(q1.f26523b);
        if (Z0 == null) {
            Q(23);
        }
        return Z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean H() {
        if (this.B) {
            return true;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> it = a().g().iterator();
        while (it.hasNext()) {
            if (it.next().H()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean J0() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return this.L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    /* renamed from: R0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.z r0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z5) {
        kotlin.reflect.jvm.internal.impl.descriptors.z build = F().o(mVar).c(e0Var).n(uVar).q(aVar).i(z5).build();
        if (build == null) {
            Q(26);
        }
        return build;
    }

    @d5.d
    protected abstract p S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var);

    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.g(this, d6);
    }

    @d5.e
    protected kotlin.reflect.jvm.internal.impl.descriptors.z T0(@d5.d c cVar) {
        f0 f0Var;
        x0 x0Var;
        kotlin.reflect.jvm.internal.impl.types.h0 p5;
        if (cVar == null) {
            Q(25);
        }
        boolean[] zArr = new boolean[1];
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a6 = cVar.f24276s != null ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(getAnnotations(), cVar.f24276s) : getAnnotations();
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = cVar.f24259b;
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = cVar.f24262e;
        p S0 = S0(mVar, zVar, cVar.f24263f, cVar.f24269l, a6, U0(cVar.f24272o, zVar));
        List<f1> typeParameters = cVar.f24275r == null ? getTypeParameters() : cVar.f24275r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        q1 c6 = kotlin.reflect.jvm.internal.impl.types.u.c(typeParameters, cVar.f24258a, S0, arrayList, zArr);
        if (c6 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f24265h.isEmpty()) {
            for (x0 x0Var2 : cVar.f24265h) {
                kotlin.reflect.jvm.internal.impl.types.h0 p6 = c6.p(x0Var2.getType(), x1.IN_VARIANCE);
                if (p6 == null) {
                    return null;
                }
                arrayList2.add(kotlin.reflect.jvm.internal.impl.resolve.d.b(S0, p6, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) x0Var2.getValue()).a(), x0Var2.getAnnotations()));
                zArr[0] = (p6 != x0Var2.getType()) | zArr[0];
            }
        }
        x0 x0Var3 = cVar.f24266i;
        if (x0Var3 != null) {
            kotlin.reflect.jvm.internal.impl.types.h0 p7 = c6.p(x0Var3.getType(), x1.IN_VARIANCE);
            if (p7 == null) {
                return null;
            }
            f0 f0Var2 = new f0(S0, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(S0, p7, cVar.f24266i.getValue()), cVar.f24266i.getAnnotations());
            zArr[0] = (p7 != cVar.f24266i.getType()) | zArr[0];
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        x0 x0Var4 = cVar.f24267j;
        if (x0Var4 != null) {
            x0 d6 = x0Var4.d(c6);
            if (d6 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (d6 != cVar.f24267j);
            x0Var = d6;
        } else {
            x0Var = null;
        }
        List<j1> W0 = W0(S0, cVar.f24264g, c6, cVar.f24273p, cVar.f24272o, zArr);
        if (W0 == null || (p5 = c6.p(cVar.f24268k, x1.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z5 = zArr[0] | (p5 != cVar.f24268k);
        zArr[0] = z5;
        if (!z5 && cVar.f24280w) {
            return this;
        }
        S0.Y0(f0Var, x0Var, arrayList2, arrayList, W0, p5, cVar.f24260c, cVar.f24261d);
        S0.m1(this.A);
        S0.j1(this.B);
        S0.e1(this.C);
        S0.l1(this.D);
        S0.p1(this.E);
        S0.o1(this.J);
        S0.d1(this.F);
        S0.c1(this.G);
        S0.f1(this.K);
        S0.H = cVar.f24274q;
        S0.I = cVar.f24277t;
        S0.g1(cVar.f24279v != null ? cVar.f24279v.booleanValue() : this.L);
        if (!cVar.f24278u.isEmpty() || this.R != null) {
            Map<a.InterfaceC0274a<?>, Object> map = cVar.f24278u;
            Map<a.InterfaceC0274a<?>, Object> map2 = this.R;
            if (map2 != null) {
                for (Map.Entry<a.InterfaceC0274a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                S0.R = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                S0.R = map;
            }
        }
        if (cVar.f24271n || k0() != null) {
            S0.Q = (k0() != null ? k0() : this).d(c6);
        }
        if (cVar.f24270m && !a().g().isEmpty()) {
            if (cVar.f24258a.f()) {
                q3.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.z>> aVar = this.N;
                if (aVar != null) {
                    S0.N = aVar;
                } else {
                    S0.E0(g());
                }
            } else {
                S0.N = new a(c6);
            }
        }
        return S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return this.F;
    }

    public boolean X() {
        return this.E;
    }

    public boolean X0() {
        return this.K;
    }

    @d5.d
    public p Y0(@d5.e x0 x0Var, @d5.e x0 x0Var2, @d5.d List<x0> list, @d5.d List<? extends f1> list2, @d5.d List<j1> list3, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        List<f1> V5;
        List<j1> V52;
        if (list == null) {
            Q(5);
        }
        if (list2 == null) {
            Q(6);
        }
        if (list3 == null) {
            Q(7);
        }
        if (uVar == null) {
            Q(8);
        }
        V5 = kotlin.collections.j0.V5(list2);
        this.f24247s = V5;
        V52 = kotlin.collections.j0.V5(list3);
        this.f24248t = V52;
        this.f24249u = h0Var;
        this.f24253y = e0Var;
        this.f24254z = uVar;
        this.f24251w = x0Var;
        this.f24252x = x0Var2;
        this.f24250v = list;
        int i5 = 0;
        while (true) {
            int size = list2.size();
            String s5 = ProtectedSandApp.s("肱");
            if (i5 >= size) {
                for (int i6 = 0; i6 < list3.size(); i6++) {
                    j1 j1Var = list3.get(i6);
                    if (j1Var.getIndex() != i6 + 0) {
                        throw new IllegalStateException(j1Var + ProtectedSandApp.s("肳") + j1Var.getIndex() + s5 + i6);
                    }
                }
                return this;
            }
            f1 f1Var = list2.get(i5);
            if (f1Var.getIndex() != i5) {
                throw new IllegalStateException(f1Var + ProtectedSandApp.s("育") + f1Var.getIndex() + s5 + i5);
            }
            i5++;
        }
    }

    @d5.d
    protected c Z0(@d5.d q1 q1Var) {
        if (q1Var == null) {
            Q(24);
        }
        return new c(this, q1Var.j(), b(), r(), c(), j(), n(), y0(), t0(), i(), null);
    }

    public <V> void b1(a.InterfaceC0274a<V> interfaceC0274a, Object obj) {
        if (this.R == null) {
            this.R = new LinkedHashMap();
        }
        this.R.put(interfaceC0274a, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = this.f24254z;
        if (uVar == null) {
            Q(16);
        }
        return uVar;
    }

    public void c1(boolean z5) {
        this.G = z5;
    }

    public void d1(boolean z5) {
        this.F = z5;
    }

    public void e1(boolean z5) {
        this.C = z5;
    }

    public void f1(boolean z5) {
        this.K = z5;
    }

    @d5.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> g() {
        a1();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> collection = this.M;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            Q(14);
        }
        return collection;
    }

    public void g1(boolean z5) {
        this.L = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<f1> getTypeParameters() {
        List<f1> list = this.f24247s;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("肴") + this);
    }

    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        return this.f24249u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    public b.a j() {
        b.a aVar = this.P;
        if (aVar == null) {
            Q(21);
        }
        return aVar;
    }

    public void j1(boolean z5) {
        this.B = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.z k0() {
        return this.Q;
    }

    public void l1(boolean z5) {
        this.D = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 m0() {
        return this.f24252x;
    }

    public void m1(boolean z5) {
        this.A = z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<j1> n() {
        List<j1> list = this.f24248t;
        if (list == null) {
            Q(19);
        }
        return list;
    }

    public void n1(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            Q(11);
        }
        this.f24249u = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean o() {
        return this.J;
    }

    public void o1(boolean z5) {
        this.J = z5;
    }

    public boolean p() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        Map<a.InterfaceC0274a<?>, Object> map = this.R;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC0274a);
    }

    public void p1(boolean z5) {
        this.E = z5;
    }

    public boolean q() {
        return this.C;
    }

    public void q1(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (uVar == null) {
            Q(10);
        }
        this.f24254z = uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 r() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var = this.f24253y;
        if (e0Var == null) {
            Q(15);
        }
        return e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 t0() {
        return this.f24251w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<x0> y0() {
        List<x0> list = this.f24250v;
        if (list == null) {
            Q(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.c1
    public kotlin.reflect.jvm.internal.impl.descriptors.z d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            Q(22);
        }
        return q1Var.k() ? this : Z0(q1Var).g(a()).e().J(true).build();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.z a() {
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = this.O;
        kotlin.reflect.jvm.internal.impl.descriptors.z a6 = zVar == this ? this : zVar.a();
        if (a6 == null) {
            Q(20);
        }
        return a6;
    }
}
