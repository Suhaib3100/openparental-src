package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u000b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/internal/k;", "<init>", "()V", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "(Ljava/lang/Class;)Lld/l;", "kotlinx/coroutines/internal/d$a", "b", "Lkotlinx/coroutines/internal/d$a;", "cache", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@IgnoreJRERequirement
/* loaded from: classes7.dex */
final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f80753a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a cache = new a();

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J/\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlinx/coroutines/internal/d$a", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", "a", "(Ljava/lang/Class;)Lld/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ClassValue<ld.l<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ld.l<Throwable, Throwable> computeValue(@fg.m Class<?> type) {
            ld.l<Throwable, Throwable> b5;
            kotlin.jvm.internal.l0.n(type, ProtectedSandApp.s("蟘\u0001"));
            b5 = n.b(type);
            return b5;
        }
    }

    private d() {
    }

    @Override // kotlinx.coroutines.internal.k
    @fg.l
    public ld.l<Throwable, Throwable> a(@fg.l Class<? extends Throwable> key) {
        Object obj;
        obj = cache.get(key);
        return (ld.l) obj;
    }
}
