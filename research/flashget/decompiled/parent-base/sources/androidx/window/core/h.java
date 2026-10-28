package androidx.window.core;

import androidx.window.core.g;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\u00052\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Landroidx/window/core/h;", "", "T", "Landroidx/window/core/g;", "value", "", "tag", "Landroidx/window/core/g$b;", "verificationMode", "Landroidx/window/core/f;", "logger", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/g$b;Landroidx/window/core/f;)V", "message", "Lkotlin/Function1;", "", "Lkotlin/u;", "condition", "c", "(Ljava/lang/String;Lld/l;)Landroidx/window/core/g;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "f", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "Landroidx/window/core/g$b;", "g", "()Landroidx/window/core/g$b;", "Landroidx/window/core/f;", "()Landroidx/window/core/f;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class h<T> extends g<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final T value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String tag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final g.b verificationMode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final f logger;

    public h(@l T value, @l String tag, @l g.b verificationMode, @l f logger) {
        l0.p(value, "value");
        l0.p(tag, "tag");
        l0.p(verificationMode, "verificationMode");
        l0.p(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.g
    @l
    public T a() {
        return this.value;
    }

    @Override // androidx.window.core.g
    @l
    public g<T> c(@l String message, @l ld.l<? super T, Boolean> condition) {
        l0.p(message, "message");
        l0.p(condition, "condition");
        return condition.invoke(this.value).booleanValue() ? this : new e(this.value, this.tag, message, this.logger, this.verificationMode);
    }

    @l
    /* renamed from: d, reason: from getter */
    public final f getLogger() {
        return this.logger;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @l
    public final T f() {
        return this.value;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final g.b getVerificationMode() {
        return this.verificationMode;
    }
}
