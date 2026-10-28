package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.z;

/* compiled from: ResolutionScope.kt */
/* loaded from: classes7.dex */
public interface k {

    /* compiled from: ResolutionScope.kt */
    @r1({"SMAP\nResolutionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionScope.kt\norg/jetbrains/kotlin/resolve/scopes/ResolutionScope$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(k kVar, d dVar, ld.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("窠\u0001"));
            }
            if ((i4 & 1) != 0) {
                dVar = d.f77973o;
            }
            if ((i4 & 2) != 0) {
                lVar = h.f77998a.a();
            }
            return kVar.g(dVar, lVar);
        }

        public static void b(@fg.l k kVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("窡\u0001"));
            l0.p(bVar, ProtectedSandApp.s("窢\u0001"));
            kVar.a(fVar, bVar);
        }
    }

    @fg.l
    Collection<? extends z> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

    void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

    @fg.m
    kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

    @fg.l
    Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);
}
