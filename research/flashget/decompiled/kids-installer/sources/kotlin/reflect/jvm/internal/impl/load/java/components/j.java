package kotlin.reflect.jvm.internal.impl.load.java.components;

import b4.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: SignaturePropagator.java */
/* loaded from: classes5.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f24552a = new a();

    /* compiled from: SignaturePropagator.java */
    static class a implements j {
        a() {
        }

        private static /* synthetic */ void c(int i5) {
            Object[] objArr = new Object[3];
            switch (i5) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("䦃");
                    break;
                case 2:
                    objArr[0] = ProtectedSandApp.s("䦂");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("䦁");
                    break;
                case 4:
                    objArr[0] = ProtectedSandApp.s("䦀");
                    break;
                case 5:
                    objArr[0] = ProtectedSandApp.s("䥿");
                    break;
                case 6:
                    objArr[0] = ProtectedSandApp.s("䥾");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("䥽");
                    break;
            }
            objArr[1] = ProtectedSandApp.s("䦄");
            if (i5 == 5 || i5 == 6) {
                objArr[2] = ProtectedSandApp.s("䦆");
            } else {
                objArr[2] = ProtectedSandApp.s("䦅");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䦇"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d List<String> list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("䦈"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        @d5.d
        public b b(@d5.d r rVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d h0 h0Var, @d5.e h0 h0Var2, @d5.d List<j1> list, @d5.d List<f1> list2) {
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
        private final h0 f24553a;

        /* renamed from: b, reason: collision with root package name */
        private final h0 f24554b;

        /* renamed from: c, reason: collision with root package name */
        private final List<j1> f24555c;

        /* renamed from: d, reason: collision with root package name */
        private final List<f1> f24556d;

        /* renamed from: e, reason: collision with root package name */
        private final List<String> f24557e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f24558f;

        public b(@d5.d h0 h0Var, @d5.e h0 h0Var2, @d5.d List<j1> list, @d5.d List<f1> list2, @d5.d List<String> list3, boolean z5) {
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
            this.f24553a = h0Var;
            this.f24554b = h0Var2;
            this.f24555c = list;
            this.f24556d = list2;
            this.f24557e = list3;
            this.f24558f = z5;
        }

        private static /* synthetic */ void a(int i5) {
            String s5 = (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? ProtectedSandApp.s("䦊") : ProtectedSandApp.s("䦉");
            Object[] objArr = new Object[(i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : 3];
            String s6 = ProtectedSandApp.s("䦋");
            switch (i5) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("䦏");
                    break;
                case 2:
                    objArr[0] = ProtectedSandApp.s("䦎");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("䦍");
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = s6;
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("䦌");
                    break;
            }
            if (i5 == 4) {
                objArr[1] = ProtectedSandApp.s("䦓");
            } else if (i5 == 5) {
                objArr[1] = ProtectedSandApp.s("䦒");
            } else if (i5 == 6) {
                objArr[1] = ProtectedSandApp.s("䦑");
            } else if (i5 != 7) {
                objArr[1] = s6;
            } else {
                objArr[1] = ProtectedSandApp.s("䦐");
            }
            if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
                objArr[2] = ProtectedSandApp.s("䦔");
            }
            String format = String.format(s5, objArr);
            if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @d5.d
        public List<String> b() {
            List<String> list = this.f24557e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        @d5.e
        public h0 c() {
            return this.f24554b;
        }

        @d5.d
        public h0 d() {
            h0 h0Var = this.f24553a;
            if (h0Var == null) {
                a(4);
            }
            return h0Var;
        }

        @d5.d
        public List<f1> e() {
            List<f1> list = this.f24556d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        @d5.d
        public List<j1> f() {
            List<j1> list = this.f24555c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f24558f;
        }
    }

    void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d List<String> list);

    @d5.d
    b b(@d5.d r rVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d h0 h0Var, @d5.e h0 h0Var2, @d5.d List<j1> list, @d5.d List<f1> list2);
}
