package androidx.window.core;

import androidx.window.core.g;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006("}, d2 = {"Landroidx/window/core/e;", "", "T", "Landroidx/window/core/g;", "value", "", "tag", "message", "Landroidx/window/core/f;", "logger", "Landroidx/window/core/g$b;", "verificationMode", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/f;Landroidx/window/core/g$b;)V", "Lkotlin/Function1;", "", "Lkotlin/u;", "condition", "c", "(Ljava/lang/String;Lld/l;)Landroidx/window/core/g;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "h", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "d", "f", "e", "Landroidx/window/core/f;", "()Landroidx/window/core/f;", "Landroidx/window/core/g$b;", "i", "()Landroidx/window/core/g$b;", "Landroidx/window/core/WindowStrictModeException;", "Landroidx/window/core/WindowStrictModeException;", "()Landroidx/window/core/WindowStrictModeException;", "exception", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class e<T> extends g<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final T value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String tag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final String message;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final f logger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final g.b verificationMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final WindowStrictModeException exception;

    /* compiled from: SpecificationComputer.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35697a;

        static {
            int[] iArr = new int[g.b.values().length];
            iArr[g.b.STRICT.ordinal()] = 1;
            iArr[g.b.LOG.ordinal()] = 2;
            iArr[g.b.QUIET.ordinal()] = 3;
            f35697a = iArr;
        }
    }

    public e(@l T value, @l String tag, @l String message, @l f logger, @l g.b verificationMode) {
        l0.p(value, "value");
        l0.p(tag, "tag");
        l0.p(message, "message");
        l0.p(logger, "logger");
        l0.p(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        l0.o(stackTrace, "stackTrace");
        Object[] array = kotlin.collections.l.l9(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.exception = windowStrictModeException;
    }

    @Override // androidx.window.core.g
    @m
    public T a() {
        int i4 = a.f35697a[this.verificationMode.ordinal()];
        if (i4 == 1) {
            throw this.exception;
        }
        if (i4 == 2) {
            this.logger.a(this.tag, b(this.value, this.message));
            return null;
        }
        if (i4 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.window.core.g
    @l
    public g<T> c(@l String message, @l ld.l<? super T, Boolean> condition) {
        l0.p(message, "message");
        l0.p(condition, "condition");
        return this;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final WindowStrictModeException getException() {
        return this.exception;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getLogger() {
        return this.logger;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @l
    public final T h() {
        return this.value;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final g.b getVerificationMode() {
        return this.verificationMode;
    }
}
