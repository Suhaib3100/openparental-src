package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@x4
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/a3;", "T", "Landroidx/compose/runtime/d0;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lld/a;)V", "value", "Landroidx/compose/runtime/b3;", "e", "(Ljava/lang/Object;)Landroidx/compose/runtime/b3;", "f", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a3<T> extends d0<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f15907c = 0;

    public a3(@fg.l ld.a<? extends T> aVar) {
        super(aVar, null);
    }

    @fg.l
    public final b3<T> e(T value) {
        return new b3<>(this, value, true);
    }

    @fg.l
    public final b3<T> f(T value) {
        return new b3<>(this, value, false);
    }
}
