package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@x4
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH ¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0012\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/d0;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lld/a;)V", "value", "Landroidx/compose/runtime/b5;", "previous", "d", "(Ljava/lang/Object;Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/x1;", "a", "Landroidx/compose/runtime/x1;", "c", "()Landroidx/compose/runtime/x1;", "defaultValueHolder", "(Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "b", "()V", "current", "Landroidx/compose/runtime/a3;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d0<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16146b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x1<T> defaultValueHolder;

    public /* synthetic */ d0(ld.a aVar, kotlin.jvm.internal.w wVar) {
        this(aVar);
    }

    public static /* synthetic */ void b() {
    }

    @d3
    @i
    @kd.i(name = "getCurrent")
    public final T a(@fg.m t tVar, int i4) {
        return (T) tVar.x(this);
    }

    @fg.l
    public final x1<T> c() {
        return this.defaultValueHolder;
    }

    @fg.l
    public abstract b5<T> d(T value, @fg.m b5<? extends T> previous);

    private d0(ld.a<? extends T> aVar) {
        this.defaultValueHolder = new x1<>(aVar);
    }
}
