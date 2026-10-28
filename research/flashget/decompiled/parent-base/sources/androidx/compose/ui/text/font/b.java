package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: AndroidPreloadedFont.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/k;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "<init>", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;Lkotlin/jvm/internal/w;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "toString", "()Ljava/lang/String;", "l", "Landroid/os/ParcelFileDescriptor;", "k", "()Landroid/os/ParcelFileDescriptor;", "m", "Ljava/lang/String;", "g", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: n, reason: collision with root package name */
    public static final int f20684n = 0;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ParcelFileDescriptor fileDescriptor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String cacheKey;

    public /* synthetic */ b(ParcelFileDescriptor parcelFileDescriptor, o0 o0Var, int i4, n0.e eVar, kotlin.jvm.internal.w wVar) {
        this(parcelFileDescriptor, o0Var, i4, eVar);
    }

    @Override // androidx.compose.ui.text.font.k
    @fg.m
    public Typeface f(@fg.m Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return m1.f20764a.c(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    @Override // androidx.compose.ui.text.font.k
    @fg.m
    /* renamed from: g, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @fg.l
    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) k0.i(getStyle())) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.ParcelFileDescriptor r1, androidx.compose.ui.text.font.o0 r2, int r3, androidx.compose.ui.text.font.n0.e r4, int r5, kotlin.jvm.internal.w r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Ld
            androidx.compose.ui.text.font.o0$a r2 = androidx.compose.ui.text.font.o0.INSTANCE
            r2.getClass()
            androidx.compose.ui.text.font.o0 r2 = androidx.compose.ui.text.font.o0.g()
        Ld:
            r5 = r5 & 4
            if (r5 == 0) goto L1a
            androidx.compose.ui.text.font.k0$a r3 = androidx.compose.ui.text.font.k0.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.font.k0.b()
        L1a:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.b.<init>(android.os.ParcelFileDescriptor, androidx.compose.ui.text.font.o0, int, androidx.compose.ui.text.font.n0$e, int, kotlin.jvm.internal.w):void");
    }

    private b(ParcelFileDescriptor parcelFileDescriptor, o0 o0Var, int i4, n0.e eVar) {
        super(o0Var, i4, eVar, null);
        this.fileDescriptor = parcelFileDescriptor;
        j(f(null));
    }
}
