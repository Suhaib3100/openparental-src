package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/random/b;", "Lkotlin/random/a;", "<init>", "()V", "kotlin/random/b$a", "d", "Lkotlin/random/b$a;", "implStorage", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends kotlin.random.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final a implStorage = new a();

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/random/b$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        @l
        protected Random a() {
            return new Random();
        }

        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.a
    @l
    public Random r() {
        Random random = this.implStorage.get();
        l0.o(random, ProtectedSandApp.s("斠\u0001"));
        return random;
    }
}
