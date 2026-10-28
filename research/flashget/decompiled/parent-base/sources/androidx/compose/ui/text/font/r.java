package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.x;
import kotlin.Metadata;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/r;", "Landroidx/compose/ui/text/font/u0;", "Landroidx/compose/ui/text/font/x$b;", "loader", "<init>", "(Landroidx/compose/ui/text/font/x$b;)V", "Landroidx/compose/ui/text/font/x;", "font", "", "a", "(Landroidx/compose/ui/text/font/x;)Ljava/lang/Object;", "c", "(Landroidx/compose/ui/text/font/x;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/x$b;", "d", "()Landroidx/compose/ui/text/font/x$b;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r implements u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20861c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x.b loader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object cacheKey = new Object();

    public r(@fg.l x.b bVar) {
        this.loader = bVar;
    }

    @Override // androidx.compose.ui.text.font.u0
    @fg.l
    public Object a(@fg.l x font) {
        return this.loader.a(font);
    }

    @Override // androidx.compose.ui.text.font.u0
    @fg.l
    /* renamed from: b, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.u0
    @fg.m
    public Object c(@fg.l x xVar, @fg.l kotlin.coroutines.d<Object> dVar) {
        return this.loader.a(xVar);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final x.b getLoader() {
        return this.loader;
    }
}
