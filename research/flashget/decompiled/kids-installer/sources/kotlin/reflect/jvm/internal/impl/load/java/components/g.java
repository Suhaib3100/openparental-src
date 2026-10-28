package kotlin.reflect.jvm.internal.impl.load.java.components;

import b4.l;
import b4.n;
import b4.q;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: JavaResolverCache.java */
/* loaded from: classes5.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f24545a = new a();

    /* compiled from: JavaResolverCache.java */
    static class a implements g {
        a() {
        }

        private static /* synthetic */ void f(int i5) {
            Object[] objArr = new Object[3];
            switch (i5) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("䥵");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = ProtectedSandApp.s("䥴");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("䥳");
                    break;
                case 5:
                    objArr[0] = ProtectedSandApp.s("䥲");
                    break;
                case 7:
                    objArr[0] = ProtectedSandApp.s("䥱");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("䥰");
                    break;
            }
            objArr[1] = ProtectedSandApp.s("䥶");
            switch (i5) {
                case 1:
                case 2:
                    objArr[2] = ProtectedSandApp.s("䥻");
                    break;
                case 3:
                case 4:
                    objArr[2] = ProtectedSandApp.s("䥺");
                    break;
                case 5:
                case 6:
                    objArr[2] = ProtectedSandApp.s("䥹");
                    break;
                case 7:
                case 8:
                    objArr[2] = ProtectedSandApp.s("䥸");
                    break;
                default:
                    objArr[2] = ProtectedSandApp.s("䥷");
                    break;
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䥼"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        @d5.e
        public kotlin.reflect.jvm.internal.impl.descriptors.e a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void b(@d5.d l lVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void c(@d5.d n nVar, @d5.d u0 u0Var) {
            if (nVar == null) {
                f(5);
            }
            if (u0Var == null) {
                f(6);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void d(@d5.d b4.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void e(@d5.d q qVar, @d5.d z0 z0Var) {
            if (qVar == null) {
                f(1);
            }
            if (z0Var == null) {
                f(2);
            }
        }
    }

    @d5.e
    kotlin.reflect.jvm.internal.impl.descriptors.e a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    void b(@d5.d l lVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.l lVar2);

    void c(@d5.d n nVar, @d5.d u0 u0Var);

    void d(@d5.d b4.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    void e(@d5.d q qVar, @d5.d z0 z0Var);
}
