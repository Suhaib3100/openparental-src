package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.resolve.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import q3.l;

/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class C0281a extends kotlin.reflect.jvm.internal.impl.resolve.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f24520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f24521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24522c;

        /* compiled from: DescriptorResolverUtils.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a, reason: collision with other inner class name */
        class C0282a implements l<kotlin.reflect.jvm.internal.impl.descriptors.b, m2> {
            C0282a() {
            }

            private static /* synthetic */ void a(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("菻"), ProtectedSandApp.s("菸"), ProtectedSandApp.s("菹"), ProtectedSandApp.s("菺")));
            }

            @Override // q3.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m2 N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                if (bVar == null) {
                    a(0);
                }
                C0281a.this.f24520a.a(bVar);
                return m2.f23662a;
            }
        }

        C0281a(r rVar, Set set, boolean z5) {
            this.f24520a = rVar;
            this.f24521b = set;
            this.f24522c = z5;
        }

        private static /* synthetic */ void f(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("萀");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("菿");
            } else if (i5 == 3) {
                objArr[0] = ProtectedSandApp.s("菾");
            } else if (i5 != 4) {
                objArr[0] = ProtectedSandApp.s("菼");
            } else {
                objArr[0] = ProtectedSandApp.s("菽");
            }
            objArr[1] = ProtectedSandApp.s("萁");
            if (i5 == 1 || i5 == 2) {
                objArr[2] = ProtectedSandApp.s("萄");
            } else if (i5 == 3 || i5 == 4) {
                objArr[2] = ProtectedSandApp.s("萃");
            } else {
                objArr[2] = ProtectedSandApp.s("萂");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("萅"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.j
        public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            if (bVar == null) {
                f(0);
            }
            k.K(bVar, new C0282a());
            this.f24521b.add(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.j
        public void d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f24522c || bVar.j() == b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.i
        public void e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i5) {
        String s5 = i5 != 18 ? ProtectedSandApp.s("䥂") : ProtectedSandApp.s("䥃");
        Object[] objArr = new Object[i5 != 18 ? 3 : 2];
        String s6 = ProtectedSandApp.s("䥄");
        switch (i5) {
            case 1:
            case 7:
            case 13:
                objArr[0] = ProtectedSandApp.s("䥋");
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = ProtectedSandApp.s("䥊");
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = ProtectedSandApp.s("䥉");
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = ProtectedSandApp.s("䥈");
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = ProtectedSandApp.s("䥇");
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ProtectedSandApp.s("䥅");
                break;
            case 18:
                objArr[0] = s6;
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("䥆");
                break;
        }
        String s7 = ProtectedSandApp.s("䥌");
        if (i5 != 18) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = ProtectedSandApp.s("䥏");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = s7;
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = ProtectedSandApp.s("䥎");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("䥍");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 == 18) {
            throw new IllegalStateException(format);
        }
    }

    @d5.e
    public static j1 b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l5 = eVar.l();
        if (l5.size() != 1) {
            return null;
        }
        for (j1 j1Var : l5.iterator().next().n()) {
            if (j1Var.getName().equals(fVar)) {
                return j1Var;
            }
        }
        return null;
    }

    @d5.d
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> c(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<D> collection, @d5.d Collection<D> collection2, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d r rVar, @d5.d k kVar, boolean z5) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (eVar == null) {
            a(15);
        }
        if (rVar == null) {
            a(16);
        }
        if (kVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kVar.v(fVar, collection, collection2, eVar, new C0281a(rVar, linkedHashSet, z5));
        return linkedHashSet;
    }

    @d5.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<D> collection, @d5.d Collection<D> collection2, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d r rVar, @d5.d k kVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        if (rVar == null) {
            a(4);
        }
        if (kVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, rVar, kVar, false);
    }

    @d5.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<D> collection, @d5.d Collection<D> collection2, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d r rVar, @d5.d k kVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (eVar == null) {
            a(9);
        }
        if (rVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, rVar, kVar, true);
    }
}
