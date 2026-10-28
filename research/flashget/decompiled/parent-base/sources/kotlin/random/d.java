package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Serializable;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/random/d;", "Lkotlin/random/a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "impl", "<init>", "(Ljava/util/Random;)V", "d", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d extends kotlin.random.a implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final a f75437e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final long f75438f = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Random impl;

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/random/d$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public d(@l Random random) {
        l0.p(random, ProtectedSandApp.s("斤\u0001"));
        this.impl = random;
    }

    @Override // kotlin.random.a
    @l
    /* renamed from: r, reason: from getter */
    public Random getImpl() {
        return this.impl;
    }
}
