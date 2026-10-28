package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Comparator;
import java.util.List;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: MemberComparator.java */
/* loaded from: classes5.dex */
public class h implements Comparator<kotlin.reflect.jvm.internal.impl.descriptors.m> {

    /* renamed from: o, reason: collision with root package name */
    public static final h f25933o = new h();

    /* renamed from: p, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.renderer.c f25934p = kotlin.reflect.jvm.internal.impl.renderer.c.f25810a.b(new a());

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f25935q = false;

    /* compiled from: MemberComparator.java */
    /* loaded from: classes6.dex */
    static class a implements q3.l<kotlin.reflect.jvm.internal.impl.renderer.f, m2> {
        a() {
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m2 N(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            fVar.e(false);
            fVar.f(true);
            fVar.n(kotlin.reflect.jvm.internal.impl.renderer.a.UNLESS_EMPTY);
            fVar.c(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
            return m2.f23662a;
        }
    }

    /* compiled from: MemberComparator.java */
    public static class b implements Comparator<kotlin.reflect.jvm.internal.impl.descriptors.m> {

        /* renamed from: o, reason: collision with root package name */
        public static final b f25936o = new b();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @d5.e
        public static Integer c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            int d6 = d(mVar2) - d(mVar);
            if (d6 != 0) {
                return Integer.valueOf(d6);
            }
            if (e.B(mVar) && e.B(mVar2)) {
                return 0;
            }
            int compareTo = mVar.getName().compareTo(mVar2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        private static int d(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (e.B(mVar)) {
                return 8;
            }
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                return 7;
            }
            if (mVar instanceof u0) {
                return ((u0) mVar).t0() == null ? 6 : 5;
            }
            if (mVar instanceof z) {
                return ((z) mVar).t0() == null ? 4 : 3;
            }
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return 2;
            }
            return mVar instanceof e1 ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
            Integer c6 = c(mVar, mVar2);
            if (c6 != null) {
                return c6.intValue();
            }
            return 0;
        }
    }

    private h() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
        int ordinal;
        Integer c6 = b.c(mVar, mVar2);
        if (c6 != null) {
            return c6.intValue();
        }
        if ((mVar instanceof e1) && (mVar2 instanceof e1)) {
            kotlin.reflect.jvm.internal.impl.renderer.c cVar = f25934p;
            int compareTo = cVar.y(((e1) mVar).n0()).compareTo(cVar.y(((e1) mVar2).n0()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar2;
            x0 t02 = aVar.t0();
            x0 t03 = aVar2.t0();
            if (t02 != null) {
                kotlin.reflect.jvm.internal.impl.renderer.c cVar2 = f25934p;
                int compareTo2 = cVar2.y(t02.getType()).compareTo(cVar2.y(t03.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List<j1> n5 = aVar.n();
            List<j1> n6 = aVar2.n();
            for (int i5 = 0; i5 < Math.min(n5.size(), n6.size()); i5++) {
                kotlin.reflect.jvm.internal.impl.renderer.c cVar3 = f25934p;
                int compareTo3 = cVar3.y(n5.get(i5).getType()).compareTo(cVar3.y(n6.get(i5).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            int size = n5.size() - n6.size();
            if (size != 0) {
                return size;
            }
            List<f1> typeParameters = aVar.getTypeParameters();
            List<f1> typeParameters2 = aVar2.getTypeParameters();
            for (int i6 = 0; i6 < Math.min(typeParameters.size(), typeParameters2.size()); i6++) {
                List<h0> upperBounds = typeParameters.get(i6).getUpperBounds();
                List<h0> upperBounds2 = typeParameters2.get(i6).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i7 = 0; i7 < upperBounds.size(); i7++) {
                    kotlin.reflect.jvm.internal.impl.renderer.c cVar4 = f25934p;
                    int compareTo4 = cVar4.y(upperBounds.get(i7)).compareTo(cVar4.y(upperBounds2.get(i7)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && (ordinal = ((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar).j().ordinal() - ((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar2).j().ordinal()) != 0) {
                return ordinal;
            }
        } else {
            if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) || !(mVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                throw new AssertionError(String.format(ProtectedSandApp.s("剆"), mVar, mVar.getClass(), mVar2, mVar2.getClass()));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar2;
            if (eVar.j().ordinal() != eVar2.j().ordinal()) {
                return eVar.j().ordinal() - eVar2.j().ordinal();
            }
            if (eVar.L() != eVar2.L()) {
                return eVar.L() ? 1 : -1;
            }
        }
        kotlin.reflect.jvm.internal.impl.renderer.c cVar5 = f25934p;
        int compareTo5 = cVar5.s(mVar).compareTo(cVar5.s(mVar2));
        return compareTo5 != 0 ? compareTo5 : e.g(mVar).getName().compareTo(e.g(mVar2).getName());
    }
}
