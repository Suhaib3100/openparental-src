package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import ld.l;

/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a, reason: collision with other inner class name */
    static class C1085a extends kotlin.reflect.jvm.internal.impl.resolve.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f76374a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f76375b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76376c;

        /* compiled from: DescriptorResolverUtils.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a, reason: collision with other inner class name */
        class C1086a implements l<kotlin.reflect.jvm.internal.impl.descriptors.b, k2> {
            C1086a() {
            }

            private static /* synthetic */ void a(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("濐\u0001"), ProtectedSandApp.s("濏\u0001"), ProtectedSandApp.s("濍\u0001"), ProtectedSandApp.s("濎\u0001")));
            }

            @Override // ld.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k2 invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                if (bVar == null) {
                    a(0);
                }
                C1085a.this.f76374a.a(bVar);
                return k2.f75408a;
            }
        }

        C1085a(r rVar, Set set, boolean z4) {
            this.f76374a = rVar;
            this.f76375b = set;
            this.f76376c = z4;
        }

        private static /* synthetic */ void f(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("濕\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("濔\u0001");
            } else if (i4 == 3) {
                objArr[0] = ProtectedSandApp.s("濓\u0001");
            } else if (i4 != 4) {
                objArr[0] = ProtectedSandApp.s("濑\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("濒\u0001");
            }
            objArr[1] = ProtectedSandApp.s("濖\u0001");
            if (i4 == 1 || i4 == 2) {
                objArr[2] = ProtectedSandApp.s("濙\u0001");
            } else if (i4 == 3 || i4 == 4) {
                objArr[2] = ProtectedSandApp.s("濘\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("濗\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("濚\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.k
        public void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            if (bVar == null) {
                f(0);
            }
            kotlin.reflect.jvm.internal.impl.resolve.l.K(bVar, new C1086a());
            this.f76375b.add(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.k
        public void d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f76376c || bVar.b() == b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.j
        public void e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = i4 != 18 ? ProtectedSandApp.s("濛\u0001") : ProtectedSandApp.s("濜\u0001");
        Object[] objArr = new Object[i4 != 18 ? 3 : 2];
        String s5 = ProtectedSandApp.s("濝\u0001");
        switch (i4) {
            case 1:
            case 7:
            case 13:
                objArr[0] = ProtectedSandApp.s("濤\u0001");
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = ProtectedSandApp.s("濣\u0001");
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = ProtectedSandApp.s("濢\u0001");
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = ProtectedSandApp.s("濡\u0001");
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = ProtectedSandApp.s("濠\u0001");
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ProtectedSandApp.s("濞\u0001");
                break;
            case 18:
                objArr[0] = s5;
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("濟\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("濥\u0001");
        if (i4 != 18) {
            objArr[1] = s5;
        } else {
            objArr[1] = s6;
        }
        switch (i4) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = ProtectedSandApp.s("濨\u0001");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = s6;
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = ProtectedSandApp.s("濧\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("濦\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 == 18) {
            throw new IllegalStateException(format);
        }
    }

    @m
    public static j1 b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h4 = eVar.h();
        if (h4.size() != 1) {
            return null;
        }
        for (j1 j1Var : h4.iterator().next().i()) {
            if (j1Var.getName().equals(fVar)) {
                return j1Var;
            }
        }
        return null;
    }

    @fg.l
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> c(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<D> collection, @fg.l Collection<D> collection2, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l r rVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.l lVar, boolean z4) {
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
        if (lVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lVar.v(fVar, collection, collection2, eVar, new C1085a(rVar, linkedHashSet, z4));
        return linkedHashSet;
    }

    @fg.l
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> d(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<D> collection, @fg.l Collection<D> collection2, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l r rVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.l lVar) {
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
        if (lVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, rVar, lVar, false);
    }

    @fg.l
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<D> collection, @fg.l Collection<D> collection2, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l r rVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.l lVar) {
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
        if (lVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, rVar, lVar, true);
    }
}
