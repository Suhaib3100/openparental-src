package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.x;
import kotlin.Metadata;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/q;", "Landroidx/compose/ui/text/font/u0;", "Landroidx/compose/ui/text/font/x$b;", "loader", "Landroid/content/Context;", "context", "<init>", "(Landroidx/compose/ui/text/font/x$b;Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/x;", "font", "", "a", "(Landroidx/compose/ui/text/font/x;)Ljava/lang/Object;", "c", "(Landroidx/compose/ui/text/font/x;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/x$b;", "d", "()Landroidx/compose/ui/text/font/x$b;", "b", "Landroid/content/Context;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q implements u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20848d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x.b loader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object cacheKey = new Object();

    public q(@fg.l x.b bVar, @fg.l Context context) {
        this.loader = bVar;
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.u0
    @fg.m
    public Object a(@fg.l x font) {
        if (!(font instanceof d)) {
            return this.loader.a(font);
        }
        d dVar = (d) font;
        return dVar.getTypefaceLoader().b(this.context, dVar);
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
        if (!(xVar instanceof d)) {
            return this.loader.a(xVar);
        }
        d dVar2 = (d) xVar;
        return dVar2.getTypefaceLoader().a(this.context, dVar2, dVar);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final x.b getLoader() {
        return this.loader;
    }
}
