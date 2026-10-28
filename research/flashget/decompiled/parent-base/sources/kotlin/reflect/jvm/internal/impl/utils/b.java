package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ld.l;

/* compiled from: DFS.java */
/* loaded from: classes7.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: DFS.java */
    static class a<N> extends AbstractC1200b<N, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f78665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f78666b;

        a(l lVar, boolean[] zArr) {
            this.f78665a = lVar;
            this.f78666b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1200b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean b(N n4) {
            if (((Boolean) this.f78665a.invoke(n4)).booleanValue()) {
                this.f78666b[0] = true;
            }
            return !this.f78666b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean result() {
            return Boolean.valueOf(this.f78666b[0]);
        }
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1200b<N, R> implements e<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public void a(N n4) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean b(N n4) {
            return true;
        }
    }

    /* compiled from: DFS.java */
    public static abstract class c<N, R, C extends Iterable<R>> extends AbstractC1200b<N, C> {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        protected final C f78667a;

        protected c(@fg.l C c5) {
            if (c5 == null) {
                c(0);
            }
            this.f78667a = c5;
        }

        private static /* synthetic */ void c(int i4) {
            String s4 = i4 != 1 ? ProtectedSandApp.s("昧\u0001") : ProtectedSandApp.s("昨\u0001");
            Object[] objArr = new Object[i4 != 1 ? 3 : 2];
            String s5 = ProtectedSandApp.s("昩\u0001");
            String s6 = ProtectedSandApp.s("昪\u0001");
            if (i4 != 1) {
                objArr[0] = s6;
            } else {
                objArr[0] = s5;
            }
            if (i4 != 1) {
                objArr[1] = s5;
            } else {
                objArr[1] = s6;
            }
            if (i4 != 1) {
                objArr[2] = ProtectedSandApp.s("昫\u0001");
            }
            String format = String.format(s4, objArr);
            if (i4 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @fg.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C result() {
            C c5 = this.f78667a;
            if (c5 == null) {
                c(1);
            }
            return c5;
        }
    }

    /* compiled from: DFS.java */
    public interface d<N> {
        @fg.l
        Iterable<? extends N> a(N n4);
    }

    /* compiled from: DFS.java */
    public interface e<N, R> {
        void a(N n4);

        boolean b(N n4);

        R result();
    }

    /* compiled from: DFS.java */
    public static abstract class f<N, R> extends c<N, R, LinkedList<R>> {
        protected f() {
            super(new LinkedList());
        }
    }

    /* compiled from: DFS.java */
    public interface g<N> {
        boolean a(N n4);
    }

    /* compiled from: DFS.java */
    public static class h<N> implements g<N> {

        /* renamed from: a, reason: collision with root package name */
        private final Set<N> f78668a;

        public h() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("脾\u0001"), ProtectedSandApp.s("脽\u0001"), ProtectedSandApp.s("脻\u0001"), ProtectedSandApp.s("脼\u0001")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.g
        public boolean a(N n4) {
            return this.f78668a.add(n4);
        }

        public h(@fg.l Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f78668a = set;
        }
    }

    private static /* synthetic */ void a(int i4) {
        Object[] objArr = new Object[3];
        switch (i4) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = ProtectedSandApp.s("腅\u0001");
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = ProtectedSandApp.s("腄\u0001");
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = ProtectedSandApp.s("腃\u0001");
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = ProtectedSandApp.s("脿\u0001");
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("腂\u0001");
                break;
            case 10:
            case 14:
                objArr[0] = ProtectedSandApp.s("腁\u0001");
                break;
            case 22:
                objArr[0] = ProtectedSandApp.s("腀\u0001");
                break;
        }
        objArr[1] = ProtectedSandApp.s("腆\u0001");
        switch (i4) {
            case 7:
            case 8:
            case 9:
                objArr[2] = ProtectedSandApp.s("腋\u0001");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = ProtectedSandApp.s("腊\u0001");
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = ProtectedSandApp.s("腉\u0001");
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = ProtectedSandApp.s("腈\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("腇\u0001");
                break;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("腌\u0001"), objArr));
    }

    public static <N, R> R b(@fg.l Collection<N> collection, @fg.l d<N> dVar, @fg.l e<N, R> eVar) {
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

    public static <N, R> R c(@fg.l Collection<N> collection, @fg.l d<N> dVar, @fg.l g<N> gVar, @fg.l e<N, R> eVar) {
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
        return eVar.result();
    }

    public static <N> void d(@fg.l N n4, @fg.l d<N> dVar, @fg.l g<N> gVar, @fg.l e<N, ?> eVar) {
        if (n4 == null) {
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
        if (gVar.a(n4) && eVar.b(n4)) {
            Iterator<? extends N> it = dVar.a(n4).iterator();
            while (it.hasNext()) {
                d(it.next(), dVar, gVar, eVar);
            }
            eVar.a(n4);
        }
    }

    public static <N> Boolean e(@fg.l Collection<N> collection, @fg.l d<N> dVar, @fg.l l<N, Boolean> lVar) {
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
