package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Runnable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006*\n\u0010\u0007\"\u00020\u00032\u00020\u0003¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "a", "(Lld/a;)Ljava/lang/Runnable;", "Runnable", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f3 {

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n*L\n1#1,18:1\n*E\n"})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f79753b;

        public a(ld.a<kotlin.k2> aVar) {
            this.f79753b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f79753b.invoke();
        }
    }

    @fg.l
    public static final Runnable a(@fg.l ld.a<kotlin.k2> aVar) {
        return new a(aVar);
    }
}
