package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Random;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.m;
import kotlin.jvm.internal.l0;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0010\u0010\u0006\u001a\u00020\u0000H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/random/f;", "Ljava/util/Random;", "a", "(Lkotlin/random/f;)Ljava/util/Random;", "b", "(Ljava/util/Random;)Lkotlin/random/f;", "c", "()Lkotlin/random/f;", "", "hi26", "low27", "", "d", "(II)D", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    @l
    @c1(version = "1.3")
    public static final Random a(@l f fVar) {
        Random impl;
        l0.p(fVar, ProtectedSandApp.s("斥\u0001"));
        a aVar = fVar instanceof a ? (a) fVar : null;
        return (aVar == null || (impl = aVar.getImpl()) == null) ? new c(fVar) : impl;
    }

    @l
    @c1(version = "1.3")
    public static final f b(@l Random random) {
        f impl;
        l0.p(random, ProtectedSandApp.s("斥\u0001"));
        c cVar = random instanceof c ? (c) random : null;
        return (cVar == null || (impl = cVar.getImpl()) == null) ? new d(random) : impl;
    }

    @kotlin.internal.f
    private static final f c() {
        return m.f75110a.b();
    }

    public static final double d(int i4, int i5) {
        return ((i4 << 27) + i5) / 9.007199254740992E15d;
    }
}
