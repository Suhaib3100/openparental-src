package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;

/* compiled from: MemberSignature.kt */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f76957b = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final String f76958a;

    /* compiled from: MemberSignature.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        @kd.n
        public final w a(@fg.l String str, @fg.l String str2) {
            l0.p(str, ProtectedSandApp.s("環\u0001"));
            l0.p(str2, ProtectedSandApp.s("璱\u0001"));
            return new w(str + '#' + str2, null);
        }

        @fg.l
        @kd.n
        public final w b(@fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("璲\u0001"));
            if (dVar instanceof d.b) {
                return d(dVar.c(), dVar.b());
            }
            if (dVar instanceof d.a) {
                return a(dVar.c(), dVar.b());
            }
            throw new NoWhenBranchMatchedException();
        }

        @fg.l
        @kd.n
        public final w c(@fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l a.c cVar2) {
            l0.p(cVar, ProtectedSandApp.s("璳\u0001"));
            l0.p(cVar2, ProtectedSandApp.s("璲\u0001"));
            return d(cVar.getString(cVar2.x()), cVar.getString(cVar2.v()));
        }

        @fg.l
        @kd.n
        public final w d(@fg.l String str, @fg.l String str2) {
            l0.p(str, ProtectedSandApp.s("環\u0001"));
            l0.p(str2, ProtectedSandApp.s("璱\u0001"));
            return new w(androidx.compose.runtime.changelist.j.a(str, str2), null);
        }

        @fg.l
        @kd.n
        public final w e(@fg.l w wVar, int i4) {
            l0.p(wVar, ProtectedSandApp.s("璲\u0001"));
            return new w(wVar.a() + '@' + i4, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ w(String str, kotlin.jvm.internal.w wVar) {
        this(str);
    }

    @fg.l
    public final String a() {
        return this.f76958a;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && l0.g(this.f76958a, ((w) obj).f76958a);
    }

    public int hashCode() {
        return this.f76958a.hashCode();
    }

    @fg.l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("璴\u0001")), this.f76958a, ')');
    }

    private w(String str) {
        this.f76958a = str;
    }
}
