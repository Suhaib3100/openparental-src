package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import q3.l;

/* compiled from: DFS.java */
/* loaded from: classes5.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: DFS.java */
    /* loaded from: classes6.dex */
    static class a<N> extends AbstractC0396b<N, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f26657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f26658b;

        a(l lVar, boolean[] zArr) {
            this.f26657a = lVar;
            this.f26658b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0396b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean c(N n5) {
            if (((Boolean) this.f26657a.N(n5)).booleanValue()) {
                this.f26658b[0] = true;
            }
            return !this.f26658b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f26658b[0]);
        }
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0396b<N, R> implements e<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public void b(N n5) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean c(N n5) {
            return true;
        }
    }

    /* compiled from: DFS.java */
    /* loaded from: classes6.dex */
    public static abstract class c<N, R, C extends Iterable<R>> extends AbstractC0396b<N, C> {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        protected final C f26659a;

        protected c(@d5.d C c6) {
            if (c6 == null) {
                d(0);
            }
            this.f26659a = c6;
        }

        private static /* synthetic */ void d(int i5) {
            String s5 = i5 != 1 ? ProtectedSandApp.s("罹") : ProtectedSandApp.s("罺");
            Object[] objArr = new Object[i5 != 1 ? 3 : 2];
            String s6 = ProtectedSandApp.s("罻");
            String s7 = ProtectedSandApp.s("罼");
            if (i5 != 1) {
                objArr[0] = s7;
            } else {
                objArr[0] = s6;
            }
            if (i5 != 1) {
                objArr[1] = s6;
            } else {
                objArr[1] = s7;
            }
            if (i5 != 1) {
                objArr[2] = ProtectedSandApp.s("罽");
            }
            String format = String.format(s5, objArr);
            if (i5 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @d5.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C a() {
            C c6 = this.f26659a;
            if (c6 == null) {
                d(1);
            }
            return c6;
        }
    }

    /* compiled from: DFS.java */
    public interface d<N> {
        @d5.d
        Iterable<? extends N> a(N n5);
    }

    /* compiled from: DFS.java */
    public interface e<N, R> {
        R a();

        void b(N n5);

        boolean c(N n5);
    }

    /* compiled from: DFS.java */
    /* loaded from: classes6.dex */
    public static abstract class f<N, R> extends c<N, R, LinkedList<R>> {
        protected f() {
            super(new LinkedList());
        }
    }

    /* compiled from: DFS.java */
    public interface g<N> {
        boolean a(N n5);
    }

    /* compiled from: DFS.java */
    public static class h<N> implements g<N> {

        /* renamed from: a, reason: collision with root package name */
        private final Set<N> f26660a;

        public h() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("备"), ProtectedSandApp.s("处"), ProtectedSandApp.s("夅"), ProtectedSandApp.s("夆")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.g
        public boolean a(N n5) {
            return this.f26660a.add(n5);
        }

        public h(@d5.d Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f26660a = set;
        }
    }

    private static /* synthetic */ void a(int i5) {
        Object[] objArr = new Object[3];
        switch (i5) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = ProtectedSandApp.s("夎");
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = ProtectedSandApp.s("复");
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = ProtectedSandApp.s("夌");
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = ProtectedSandApp.s("夈");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("夋");
                break;
            case 10:
            case 14:
                objArr[0] = ProtectedSandApp.s("夊");
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("変");
                break;
        }
        objArr[1] = ProtectedSandApp.s("夏");
        switch (i5) {
            case 7:
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("夔");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = ProtectedSandApp.s("夓");
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = ProtectedSandApp.s("夒");
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = ProtectedSandApp.s("夑");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("夐");
                break;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("夕"), objArr));
    }

    public static <N, R> R b(@d5.d Collection<N> collection, @d5.d d<N> dVar, @d5.d e<N, R> eVar) {
        if (collection == null) {
            a(4);
        }
        if (dVar == null) {
            a(5);
        }
        if (eVar == null) {
            a(6);
        }
        return (R) c(collection, dVar, new h(), eVar);
    }

    public static <N, R> R c(@d5.d Collection<N> collection, @d5.d d<N> dVar, @d5.d g<N> gVar, @d5.d e<N, R> eVar) {
        if (collection == null) {
            a(0);
        }
        if (dVar == null) {
            a(1);
        }
        if (gVar == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), dVar, gVar, eVar);
        }
        return eVar.a();
    }

    public static <N> void d(@d5.d N n5, @d5.d d<N> dVar, @d5.d g<N> gVar, @d5.d e<N, ?> eVar) {
        if (n5 == null) {
            a(22);
        }
        if (dVar == null) {
            a(23);
        }
        if (gVar == null) {
            a(24);
        }
        if (eVar == null) {
            a(25);
        }
        if (gVar.a(n5) && eVar.c(n5)) {
            Iterator<? extends N> it = dVar.a(n5).iterator();
            while (it.hasNext()) {
                d(it.next(), dVar, gVar, eVar);
            }
            eVar.b(n5);
        }
    }

    public static <N> Boolean e(@d5.d Collection<N> collection, @d5.d d<N> dVar, @d5.d l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
        }
        if (dVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, dVar, new a(lVar, new boolean[1]));
    }
}
