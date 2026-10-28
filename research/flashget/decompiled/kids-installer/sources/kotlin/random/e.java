package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Random;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.m;
import kotlin.jvm.internal.l0;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\n"}, d2 = {"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    @SinceKotlin(version = "1.3")
    @d5.d
    public static final Random a(@d5.d Random random) {
        Random f23690q;
        l0.p(random, ProtectedSandApp.s("䇂"));
        AbstractPlatformRandom abstractPlatformRandom = random instanceof AbstractPlatformRandom ? (AbstractPlatformRandom) random : null;
        return (abstractPlatformRandom == null || (f23690q = abstractPlatformRandom.getF23690q()) == null) ? new KotlinRandom(random) : f23690q;
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final Random b(@d5.d Random random) {
        Random f23686o;
        l0.p(random, ProtectedSandApp.s("䇃"));
        KotlinRandom kotlinRandom = random instanceof KotlinRandom ? (KotlinRandom) random : null;
        return (kotlinRandom == null || (f23686o = kotlinRandom.getF23686o()) == null) ? new PlatformRandom(random) : f23686o;
    }

    @InlineOnly
    private static final Random c() {
        return m.f23351a.b();
    }

    public static final double d(int i5, int i6) {
        return ((i5 << 27) + i6) / 9.007199254740992E15d;
    }
}
