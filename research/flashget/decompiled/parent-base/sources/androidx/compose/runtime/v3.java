package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@kd.g
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\t2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/v3;", "T", "", "Landroidx/compose/runtime/t;", "composer", "b", "(Landroidx/compose/runtime/t;)Landroidx/compose/runtime/t;", "Lkotlin/Function1;", "Landroidx/compose/runtime/m5;", "Lkotlin/k2;", "Lkotlin/u;", "block", "i", "(Landroidx/compose/runtime/t;Lld/l;)V", "", "g", "(Landroidx/compose/runtime/t;)Ljava/lang/String;", "", "f", "(Landroidx/compose/runtime/t;)I", "other", "", "c", "(Landroidx/compose/runtime/t;Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/t;", "e", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v3<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t composer;

    private /* synthetic */ v3(t tVar) {
        this.composer = tVar;
    }

    public static final /* synthetic */ v3 a(t tVar) {
        return new v3(tVar);
    }

    @fg.l
    public static <T> t b(@fg.l t tVar) {
        return tVar;
    }

    public static boolean c(t tVar, Object obj) {
        return (obj instanceof v3) && kotlin.jvm.internal.l0.g(tVar, ((v3) obj).composer);
    }

    public static final boolean d(t tVar, t tVar2) {
        return kotlin.jvm.internal.l0.g(tVar, tVar2);
    }

    @kotlin.w0
    public static /* synthetic */ void e() {
    }

    public static int f(t tVar) {
        return tVar.hashCode();
    }

    public static String g(t tVar) {
        return "SkippableUpdater(composer=" + tVar + ')';
    }

    public static final void i(t tVar, @fg.l ld.l<? super m5<T>, kotlin.k2> lVar) {
        tVar.P(509942095);
        lVar.invoke(m5.a(tVar));
        tVar.p0();
    }

    public boolean equals(Object obj) {
        return c(this.composer, obj);
    }

    /* renamed from: h, reason: from getter */
    public final /* synthetic */ t getComposer() {
        return this.composer;
    }

    public int hashCode() {
        return this.composer.hashCode();
    }

    public String toString() {
        return g(this.composer);
    }
}
