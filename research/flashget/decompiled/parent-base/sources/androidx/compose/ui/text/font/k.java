package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: AndroidPreloadedFont.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d\"\u0004\b\u001b\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010!\u0082\u0001\u0003#$%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/k;", "Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "<init>", "(Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "i", "g", "Landroidx/compose/ui/text/font/o0;", "a", "()Landroidx/compose/ui/text/font/o0;", "h", "I", "c", "()I", "", "Z", "didInitWithContext", "j", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", "typeface", "", "()Ljava/lang/String;", "cacheKey", "Landroidx/compose/ui/text/font/a;", "Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/c;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class k extends d {

    /* renamed from: k, reason: collision with root package name */
    public static final int f20748k = 0;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0 weight;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int style;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean didInitWithContext;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Typeface typeface;

    public /* synthetic */ k(o0 o0Var, int i4, n0.e eVar, kotlin.jvm.internal.w wVar) {
        this(o0Var, i4, eVar);
    }

    @Override // androidx.compose.ui.text.font.x
    @fg.l
    /* renamed from: a, reason: from getter */
    public final o0 getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.x
    /* renamed from: c, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    @fg.m
    public abstract Typeface f(@fg.m Context context);

    @fg.m
    public abstract String g();

    @fg.m
    /* renamed from: h, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @fg.m
    public final Typeface i(@fg.l Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = f(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void j(@fg.m Typeface typeface) {
        this.typeface = typeface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k(o0 o0Var, int i4, n0.e eVar) {
        super(i0.f20743c, l.f20757a, eVar, null);
        i0.INSTANCE.getClass();
        this.weight = o0Var;
        this.style = i4;
    }
}
