package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: AndroidFont.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/i0;", "loadingStrategy", "Landroidx/compose/ui/text/font/d$a;", "typefaceLoader", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/d$a;Landroidx/compose/ui/text/font/n0$e;Lkotlin/jvm/internal/w;)V", "(ILandroidx/compose/ui/text/font/d$a;Lkotlin/jvm/internal/w;)V", "c", "I", "b", "()I", "d", "Landroidx/compose/ui/text/font/d$a;", "()Landroidx/compose/ui/text/font/d$a;", "e", "Landroidx/compose/ui/text/font/n0$e;", "()Landroidx/compose/ui/text/font/n0$e;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d implements x {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20699f = 0;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int loadingStrategy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a typefaceLoader;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n0.e variationSettings;

    /* compiled from: AndroidFont.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/d$a;", "", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/d;", "font", "Landroid/graphics/Typeface;", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;)Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        @fg.m
        Object a(@fg.l Context context, @fg.l d dVar, @fg.l kotlin.coroutines.d<? super Typeface> dVar2);

        @fg.m
        Typeface b(@fg.l Context context, @fg.l d font);
    }

    public /* synthetic */ d(int i4, a aVar, n0.e eVar, kotlin.jvm.internal.w wVar) {
        this(i4, aVar, eVar);
    }

    @Override // androidx.compose.ui.text.font.x
    /* renamed from: b, reason: from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final a getTypefaceLoader() {
        return this.typefaceLoader;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final n0.e getVariationSettings() {
        return this.variationSettings;
    }

    @kotlin.k(message = "Replaced with fontVariation constructor", replaceWith = @kotlin.x0(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ d(int i4, a aVar, kotlin.jvm.internal.w wVar) {
        this(i4, aVar);
    }

    private d(int i4, a aVar, n0.e eVar) {
        this.loadingStrategy = i4;
        this.typefaceLoader = aVar;
        this.variationSettings = eVar;
    }

    private d(int i4, a aVar) {
        this(i4, aVar, new n0.e(new n0.a[0]));
    }
}
