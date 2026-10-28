package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.w0;
import kotlin.z0;

/* compiled from: SafeContinuationJvm.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 !*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lkotlin/coroutines/k;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "delegate", "", "initialResult", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "(Lkotlin/coroutines/d;)V", "Lkotlin/z0;", "result", "Lkotlin/k2;", "resumeWith", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/d;", "Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.3")
@w0
/* loaded from: classes7.dex */
public final class k<T> implements d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final a f75083c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<k<?>, Object> f75084d = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, ProtectedSandApp.s("捁\u0001"));

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d<T> delegate;

    @m
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rj\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lkotlin/coroutines/k$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/k;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        private static /* synthetic */ void a() {
        }

        public a(w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@l d<? super T> dVar, @m Object obj) {
        l0.p(dVar, ProtectedSandApp.s("捂\u0001"));
        this.delegate = dVar;
        this.result = obj;
    }

    @m
    @w0
    public final Object a() {
        Object obj = this.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<k<?>, Object> atomicReferenceFieldUpdater = f75084d;
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, aVar, aVar2)) {
                return aVar2;
            }
            obj = this.result;
        }
        if (obj == kotlin.coroutines.intrinsics.a.RESUMED) {
            return kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof z0.b) {
            throw ((z0.b) obj).exception;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d<T> dVar = this.delegate;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @l
    public g getContext() {
        return this.delegate.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@l Object result) {
        while (true) {
            Object obj = this.result;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.UNDECIDED;
            if (obj != aVar) {
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (obj != aVar2) {
                    throw new IllegalStateException(ProtectedSandApp.s("捃\u0001"));
                }
                if (androidx.concurrent.futures.c.a(f75084d, this, aVar2, kotlin.coroutines.intrinsics.a.RESUMED)) {
                    this.delegate.resumeWith(result);
                    return;
                }
            } else if (androidx.concurrent.futures.c.a(f75084d, this, aVar, result)) {
                return;
            }
        }
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("捄\u0001") + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w0
    public k(@l d<? super T> dVar) {
        this(dVar, kotlin.coroutines.intrinsics.a.UNDECIDED);
        l0.p(dVar, ProtectedSandApp.s("捂\u0001"));
    }
}
