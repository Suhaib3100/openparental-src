package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import wd.r;

/* compiled from: SignaturePropagator.java */
/* loaded from: classes7.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f76406a = new a();

    /* compiled from: SignaturePropagator.java */
    static class a implements j {
        a() {
        }

        private static /* synthetic */ void c(int i4) {
            Object[] objArr = new Object[3];
            switch (i4) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("瀪\u0001");
                    break;
                case 2:
                    objArr[0] = ProtectedSandApp.s("瀩\u0001");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("瀨\u0001");
                    break;
                case 4:
                    objArr[0] = ProtectedSandApp.s("瀧\u0001");
                    break;
                case 5:
                    objArr[0] = ProtectedSandApp.s("瀦\u0001");
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("瀥\u0001");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("瀤\u0001");
                    break;
            }
            objArr[1] = ProtectedSandApp.s("瀫\u0001");
            if (i4 == 5 || i4 == 6) {
                objArr[2] = ProtectedSandApp.s("瀭\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("瀬\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瀮\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        public void a(@l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @l List<String> list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("瀯\u0001"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        @l
        public b b(@l r rVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l h0 h0Var, @m h0 h0Var2, @l List<j1> list, @l List<f1> list2) {
            if (rVar == null) {
                c(0);
            }
            if (eVar == null) {
                c(1);
            }
            if (h0Var == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(h0Var, h0Var2, list, list2, Collections.emptyList(), false);
        }
    }

    /* compiled from: SignaturePropagator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final h0 f76407a;

        /* renamed from: b, reason: collision with root package name */
        private final h0 f76408b;

        /* renamed from: c, reason: collision with root package name */
        private final List<j1> f76409c;

        /* renamed from: d, reason: collision with root package name */
        private final List<f1> f76410d;

        /* renamed from: e, reason: collision with root package name */
        private final List<String> f76411e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f76412f;

        public b(@l h0 h0Var, @m h0 h0Var2, @l List<j1> list, @l List<f1> list2, @l List<String> list3, boolean z4) {
            if (h0Var == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f76407a = h0Var;
            this.f76408b = h0Var2;
            this.f76409c = list;
            this.f76410d = list2;
            this.f76411e = list3;
            this.f76412f = z4;
        }

        private static /* synthetic */ void a(int i4) {
            String s4 = (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? ProtectedSandApp.s("瀱\u0001") : ProtectedSandApp.s("瀰\u0001");
            Object[] objArr = new Object[(i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : 3];
            String s5 = ProtectedSandApp.s("瀲\u0001");
            switch (i4) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("瀶\u0001");
                    break;
                case 2:
                    objArr[0] = ProtectedSandApp.s("瀵\u0001");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("瀴\u0001");
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = s5;
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("瀳\u0001");
                    break;
            }
            if (i4 == 4) {
                objArr[1] = ProtectedSandApp.s("瀺\u0001");
            } else if (i4 == 5) {
                objArr[1] = ProtectedSandApp.s("瀹\u0001");
            } else if (i4 == 6) {
                objArr[1] = ProtectedSandApp.s("瀸\u0001");
            } else if (i4 != 7) {
                objArr[1] = s5;
            } else {
                objArr[1] = ProtectedSandApp.s("瀷\u0001");
            }
            if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
                objArr[2] = ProtectedSandApp.s("瀻\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @l
        public List<String> b() {
            List<String> list = this.f76411e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        @m
        public h0 c() {
            return this.f76408b;
        }

        @l
        public h0 d() {
            h0 h0Var = this.f76407a;
            if (h0Var == null) {
                a(4);
            }
            return h0Var;
        }

        @l
        public List<f1> e() {
            List<f1> list = this.f76410d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        @l
        public List<j1> f() {
            List<j1> list = this.f76409c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f76412f;
        }
    }

    void a(@l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @l List<String> list);

    @l
    b b(@l r rVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l h0 h0Var, @m h0 h0Var2, @l List<j1> list, @l List<f1> list2);
}
