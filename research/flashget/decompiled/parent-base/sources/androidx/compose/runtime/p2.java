package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010 \u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/runtime/p2;", "N", "Landroidx/compose/runtime/e;", "applier", "", "offset", "<init>", "(Landroidx/compose/runtime/e;I)V", "node", "Lkotlin/k2;", "i", "(Ljava/lang/Object;)V", "k", "()V", "index", "instance", "e", "(ILjava/lang/Object;)V", "h", "count", "a", "(II)V", "from", "to", "c", "(III)V", "clear", "Landroidx/compose/runtime/e;", "b", "I", "nesting", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4178#2,5:290\n4178#2,5:295\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,5\n286#1:295,5\n*E\n"})
/* loaded from: classes.dex */
public final class p2<N> implements e<N> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16874d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e<N> applier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nesting;

    public p2(@fg.l e<N> eVar, int i4) {
        this.applier = eVar;
        this.offset = i4;
    }

    @Override // androidx.compose.runtime.e
    public void a(int index, int count) {
        this.applier.a(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // androidx.compose.runtime.e
    public N b() {
        return this.applier.b();
    }

    @Override // androidx.compose.runtime.e
    public void c(int from, int to, int count) {
        int i4 = this.nesting == 0 ? this.offset : 0;
        this.applier.c(from + i4, to + i4, count);
    }

    @Override // androidx.compose.runtime.e
    public void clear() {
        throw u.a("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.e
    public void e(int index, N instance) {
        this.applier.e(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.e
    public void h(int index, N instance) {
        this.applier.h(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.e
    public void i(N node) {
        this.nesting++;
        this.applier.i(node);
    }

    @Override // androidx.compose.runtime.e
    public void k() {
        int i4 = this.nesting;
        if (!(i4 > 0)) {
            throw u.a("OffsetApplier up called with no corresponding down");
        }
        this.nesting = i4 - 1;
        this.applier.k();
    }
}
