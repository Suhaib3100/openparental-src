package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;

/* compiled from: MemberSignature.kt */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f25075b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f25076a;

    /* compiled from: MemberSignature.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        @p3.n
        public final u a(@d5.d String str, @d5.d String str2) {
            l0.p(str, ProtectedSandApp.s("䲰"));
            l0.p(str2, ProtectedSandApp.s("䲱"));
            return new u(str + '#' + str2, null);
        }

        @d5.d
        @p3.n
        public final u b(@d5.d kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("䲲"));
            if (dVar instanceof d.b) {
                return d(dVar.c(), dVar.b());
            }
            if (dVar instanceof d.a) {
                return a(dVar.c(), dVar.b());
            }
            throw new NoWhenBranchMatchedException();
        }

        @d5.d
        @p3.n
        public final u c(@d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d a.c cVar2) {
            l0.p(cVar, ProtectedSandApp.s("䲳"));
            l0.p(cVar2, ProtectedSandApp.s("䲴"));
            return d(cVar.getString(cVar2.w()), cVar.getString(cVar2.v()));
        }

        @d5.d
        @p3.n
        public final u d(@d5.d String str, @d5.d String str2) {
            l0.p(str, ProtectedSandApp.s("䲵"));
            l0.p(str2, ProtectedSandApp.s("䲶"));
            return new u(androidx.concurrent.futures.b.a(str, str2), null);
        }

        @d5.d
        @p3.n
        public final u e(@d5.d u uVar, int i5) {
            l0.p(uVar, ProtectedSandApp.s("䲷"));
            return new u(uVar.a() + '@' + i5, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ u(String str, kotlin.jvm.internal.w wVar) {
        this(str);
    }

    @d5.d
    public final String a() {
        return this.f25076a;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && l0.g(this.f25076a, ((u) obj).f25076a);
    }

    public int hashCode() {
        return this.f25076a.hashCode();
    }

    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("䲸")), this.f25076a, ')');
    }

    private u(String str) {
        this.f25076a = str;
    }
}
