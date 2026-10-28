package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: TextMeasurer.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/l0;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/m0;", "key", "Landroidx/compose/ui/text/n0;", "a", "(Landroidx/compose/ui/text/m0;)Landroidx/compose/ui/text/n0;", "value", "b", "(Landroidx/compose/ui/text/m0;Landroidx/compose/ui/text/n0;)Landroidx/compose/ui/text/n0;", "c", "Landroidx/compose/ui/text/caches/b;", "Landroidx/compose/ui/text/h;", "Landroidx/compose/ui/text/caches/b;", "lruCache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21170b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.caches.b<h, n0> lruCache;

    public l0() {
        this(0, 1, null);
    }

    @fg.m
    public final n0 a(@fg.l m0 key) {
        n0 g4 = this.lruCache.g(new h(key));
        if (g4 == null || g4.getMultiParagraph().getIntrinsics().c()) {
            return null;
        }
        return g4;
    }

    @fg.m
    public final n0 b(@fg.l m0 key, @fg.l n0 value) {
        return this.lruCache.k(new h(key), value);
    }

    @fg.m
    public final n0 c(@fg.l m0 key) {
        return this.lruCache.m(new h(key));
    }

    public l0(int i4) {
        this.lruCache = new androidx.compose.ui.text.caches.b<>(i4);
    }

    public /* synthetic */ l0(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? q0.f21294a : i4);
    }
}
