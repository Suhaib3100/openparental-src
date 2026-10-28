package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import java.util.List;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: MemberComparator.java */
/* loaded from: classes7.dex */
public class i implements Comparator<kotlin.reflect.jvm.internal.impl.descriptors.m> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f77916b = new i();

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.renderer.c f77917c = kotlin.reflect.jvm.internal.impl.renderer.c.f77792a.b(new a());

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f77918d = false;

    /* compiled from: MemberComparator.java */
    static class a implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {
        a() {
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            fVar.c(false);
            fVar.n(true);
            fVar.h(kotlin.reflect.jvm.internal.impl.renderer.a.UNLESS_EMPTY);
            fVar.m(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
            return k2.f75408a;
        }
    }

    /* compiled from: MemberComparator.java */
    public static class b implements Comparator<kotlin.reflect.jvm.internal.impl.descriptors.m> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f77919b = new b();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @fg.m
        public static Integer e(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            int g4 = g(mVar2) - g(mVar);
            if (g4 != 0) {
                return Integer.valueOf(g4);
            }
            if (f.B(mVar) && f.B(mVar2)) {
                return 0;
            }
            int compareTo = mVar.getName().compareTo(mVar2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        private static int g(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (f.B(mVar)) {
                return 8;
            }
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                return 7;
            }
            if (mVar instanceof u0) {
                return ((u0) mVar).S() == null ? 6 : 5;
            }
            if (mVar instanceof z) {
                return ((z) mVar).S() == null ? 4 : 3;
            }
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return 2;
            }
            return mVar instanceof e1 ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            Integer e4 = e(mVar, mVar2);
            if (e4 != null) {
                return e4.intValue();
            }
            return 0;
        }
    }

    private i() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
        Integer e4 = b.e(mVar, mVar2);
        if (e4 != null) {
            return e4.intValue();
        }
        if ((mVar instanceof e1) && (mVar2 instanceof e1)) {
            kotlin.reflect.jvm.internal.impl.renderer.c cVar = f77917c;
            int compareTo = cVar.y(((e1) mVar).v0()).compareTo(cVar.y(((e1) mVar2).v0()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar2;
            x0 S = aVar.S();
            x0 S2 = aVar2.S();
            if (S != null) {
                kotlin.reflect.jvm.internal.impl.renderer.c cVar2 = f77917c;
                int compareTo2 = cVar2.y(S.getType()).compareTo(cVar2.y(S2.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List<j1> i4 = aVar.i();
            List<j1> i5 = aVar2.i();
            for (int i6 = 0; i6 < Math.min(i4.size(), i5.size()); i6++) {
                kotlin.reflect.jvm.internal.impl.renderer.c cVar3 = f77917c;
                int compareTo3 = cVar3.y(i4.get(i6).getType()).compareTo(cVar3.y(i5.get(i6).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            int size = i4.size() - i5.size();
            if (size != 0) {
                return size;
            }
            List<f1> typeParameters = aVar.getTypeParameters();
            List<f1> typeParameters2 = aVar2.getTypeParameters();
            for (int i7 = 0; i7 < Math.min(typeParameters.size(), typeParameters2.size()); i7++) {
                List<h0> upperBounds = typeParameters.get(i7).getUpperBounds();
                List<h0> upperBounds2 = typeParameters2.get(i7).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i10 = 0; i10 < upperBounds.size(); i10++) {
                    kotlin.reflect.jvm.internal.impl.renderer.c cVar4 = f77917c;
                    int compareTo4 = cVar4.y(upperBounds.get(i10)).compareTo(cVar4.y(upperBounds2.get(i10)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
                int ordinal = ((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar).b().ordinal() - ((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar2).b().ordinal();
                if (ordinal != 0) {
                    return ordinal;
                }
            }
        } else {
            if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) || !(mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                throw new AssertionError(String.format(ProtectedSandApp.s("禖\u0001"), mVar, mVar.getClass(), mVar2, mVar2.getClass()));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar2;
            if (eVar.b().ordinal() != eVar2.b().ordinal()) {
                return eVar.b().ordinal() - eVar2.b().ordinal();
            }
            if (eVar.e0() != eVar2.e0()) {
                return eVar.e0() ? 1 : -1;
            }
        }
        kotlin.reflect.jvm.internal.impl.renderer.c cVar5 = f77917c;
        int compareTo5 = cVar5.s(mVar).compareTo(cVar5.s(mVar2));
        return compareTo5 != 0 ? compareTo5 : f.g(mVar).getName().compareTo(f.g(mVar2).getName());
    }
}
