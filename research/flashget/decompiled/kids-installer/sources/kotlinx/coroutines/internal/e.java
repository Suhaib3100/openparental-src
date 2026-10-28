package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007*\u0001\b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/e;", "Lkotlinx/coroutines/internal/k;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "kotlinx/coroutines/internal/e$a", "b", "Lkotlinx/coroutines/internal/e$a;", "cache", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
/* loaded from: classes5.dex */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final e f28699a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final a cache = new a();

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¨\u0006\b"}, d2 = {"kotlinx/coroutines/internal/e$a", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a extends ClassValue<q3.l<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q3.l<Throwable, Throwable> computeValue(@d5.e Class<?> cls) {
            q3.l<Throwable, Throwable> b6;
            if (cls == null) {
                throw new NullPointerException(ProtectedSandApp.s("巑"));
            }
            b6 = n.b(cls);
            return b6;
        }
    }

    private e() {
    }

    @Override // kotlinx.coroutines.internal.k
    @d5.d
    public q3.l<Throwable, Throwable> a(@d5.d Class<? extends Throwable> cls) {
        return (q3.l) cache.get(cls);
    }
}
