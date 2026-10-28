package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import wd.n;
import wd.q;

/* compiled from: JavaResolverCache.java */
/* loaded from: classes7.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f76399a = new a();

    /* compiled from: JavaResolverCache.java */
    static class a implements g {
        a() {
        }

        private static /* synthetic */ void f(int i4) {
            Object[] objArr = new Object[3];
            switch (i4) {
                case 1:
                    objArr[0] = ProtectedSandApp.s("瀔\u0001");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = ProtectedSandApp.s("瀓\u0001");
                    break;
                case 3:
                    objArr[0] = ProtectedSandApp.s("瀒\u0001");
                    break;
                case 5:
                    objArr[0] = ProtectedSandApp.s("瀑\u0001");
                    break;
                case 7:
                    objArr[0] = ProtectedSandApp.s("瀐\u0001");
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("瀏\u0001");
                    break;
            }
            objArr[1] = ProtectedSandApp.s("瀕\u0001");
            switch (i4) {
                case 1:
                case 2:
                    objArr[2] = ProtectedSandApp.s("瀚\u0001");
                    break;
                case 3:
                case 4:
                    objArr[2] = ProtectedSandApp.s("瀙\u0001");
                    break;
                case 5:
                case 6:
                    objArr[2] = ProtectedSandApp.s("瀘\u0001");
                    break;
                case 7:
                case 8:
                    objArr[2] = ProtectedSandApp.s("瀗\u0001");
                    break;
                default:
                    objArr[2] = ProtectedSandApp.s("瀖\u0001");
                    break;
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瀛\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void a(@l q qVar, @l z0 z0Var) {
            if (qVar == null) {
                f(1);
            }
            if (z0Var == null) {
                f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        @m
        public kotlin.reflect.jvm.internal.impl.descriptors.e b(@l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void c(@l wd.l lVar, @l kotlin.reflect.jvm.internal.impl.descriptors.l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void d(@l n nVar, @l u0 u0Var) {
            if (nVar == null) {
                f(5);
            }
            if (u0Var == null) {
                f(6);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.g
        public void e(@l wd.g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }
    }

    void a(@l q qVar, @l z0 z0Var);

    @m
    kotlin.reflect.jvm.internal.impl.descriptors.e b(@l kotlin.reflect.jvm.internal.impl.name.c cVar);

    void c(@l wd.l lVar, @l kotlin.reflect.jvm.internal.impl.descriptors.l lVar2);

    void d(@l n nVar, @l u0 u0Var);

    void e(@l wd.g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
