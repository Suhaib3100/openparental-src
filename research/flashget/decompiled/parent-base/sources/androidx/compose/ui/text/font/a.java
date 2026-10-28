package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: AndroidPreloadedFont.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010%\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0014¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/a;", "Landroidx/compose/ui/text/font/k;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;Lkotlin/jvm/internal/w;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "l", "Landroid/content/res/AssetManager;", "k", "()Landroid/content/res/AssetManager;", "m", "Ljava/lang/String;", "n", "g", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: o, reason: collision with root package name */
    public static final int f20662o = 0;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AssetManager assetManager;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String path;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String cacheKey;

    public /* synthetic */ a(AssetManager assetManager, String str, o0 o0Var, int i4, n0.e eVar, kotlin.jvm.internal.w wVar) {
        this(assetManager, str, o0Var, i4, eVar);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return kotlin.jvm.internal.l0.g(this.path, aVar.path) && kotlin.jvm.internal.l0.g(getVariationSettings(), aVar.getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.k
    @fg.m
    public Typeface f(@fg.m Context context) {
        return Build.VERSION.SDK_INT >= 26 ? m1.f20764a.a(this.assetManager, this.path, context, getVariationSettings()) : Typeface.createFromAsset(this.assetManager, this.path);
    }

    @Override // androidx.compose.ui.text.font.k
    @fg.l
    /* renamed from: g, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    public int hashCode() {
        return getVariationSettings().hashCode() + (this.path.hashCode() * 31);
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @fg.l
    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) k0.i(getStyle())) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.res.AssetManager r7, java.lang.String r8, androidx.compose.ui.text.font.o0 r9, int r10, androidx.compose.ui.text.font.n0.e r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto Ld
            androidx.compose.ui.text.font.o0$a r9 = androidx.compose.ui.text.font.o0.INSTANCE
            r9.getClass()
            androidx.compose.ui.text.font.o0 r9 = androidx.compose.ui.text.font.o0.g()
        Ld:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L1b
            androidx.compose.ui.text.font.k0$a r9 = androidx.compose.ui.text.font.k0.INSTANCE
            r9.getClass()
            int r10 = androidx.compose.ui.text.font.k0.b()
        L1b:
            r4 = r10
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.a.<init>(android.content.res.AssetManager, java.lang.String, androidx.compose.ui.text.font.o0, int, androidx.compose.ui.text.font.n0$e, int, kotlin.jvm.internal.w):void");
    }

    private a(AssetManager assetManager, String str, o0 o0Var, int i4, n0.e eVar) {
        super(o0Var, i4, eVar, null);
        this.assetManager = assetManager;
        this.path = str;
        j(f(null));
        this.cacheKey = "asset:" + str;
    }
}
