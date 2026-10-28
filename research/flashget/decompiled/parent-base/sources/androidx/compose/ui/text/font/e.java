package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.x4;
import androidx.compose.ui.text.font.n0;
import java.io.File;
import kotlin.Metadata;

/* compiled from: AndroidFont.android.kt */
@kd.i(name = "AndroidFontKt")
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a8\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"", "path", "Landroid/content/res/AssetManager;", "assetManager", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "Landroidx/compose/ui/text/font/x;", "e", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;)Landroidx/compose/ui/text/font/x;", "Ljava/io/File;", "file", "b", "(Ljava/io/File;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;)Landroidx/compose/ui/text/font/x;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "a", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/o0;ILandroidx/compose/ui/text/font/n0$e;)Landroidx/compose/ui/text/font/x;", "Lkotlin/k2;", "g", "()V", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    @x4
    @fg.l
    @androidx.annotation.x0(26)
    public static final x a(@fg.l ParcelFileDescriptor parcelFileDescriptor, @fg.l o0 o0Var, int i4, @fg.l n0.e eVar) {
        return new b(parcelFileDescriptor, o0Var, i4, eVar, null);
    }

    @x4
    @fg.l
    public static final x b(@fg.l File file, @fg.l o0 o0Var, int i4, @fg.l n0.e eVar) {
        return new c(file, o0Var, i4, eVar, null);
    }

    public static x c(ParcelFileDescriptor parcelFileDescriptor, o0 o0Var, int i4, n0.e eVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i5 & 4) != 0) {
            k0.INSTANCE.getClass();
            i4 = k0.f20754c;
        }
        if ((i5 & 8) != 0) {
            eVar = n0.f20791a.b(o0Var, i4, new n0.a[0]);
        }
        return a(parcelFileDescriptor, o0Var, i4, eVar);
    }

    public static x d(File file, o0 o0Var, int i4, n0.e eVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i5 & 4) != 0) {
            k0.INSTANCE.getClass();
            i4 = k0.f20754c;
        }
        if ((i5 & 8) != 0) {
            eVar = n0.f20791a.b(o0Var, i4, new n0.a[0]);
        }
        return b(file, o0Var, i4, eVar);
    }

    @x4
    @fg.l
    public static final x e(@fg.l String str, @fg.l AssetManager assetManager, @fg.l o0 o0Var, int i4, @fg.l n0.e eVar) {
        return new a(assetManager, str, o0Var, i4, eVar, null);
    }

    public static x f(String str, AssetManager assetManager, o0 o0Var, int i4, n0.e eVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i5 & 8) != 0) {
            k0.INSTANCE.getClass();
            i4 = k0.f20754c;
        }
        if ((i5 & 16) != 0) {
            eVar = n0.f20791a.b(o0Var, i4, new n0.a[0]);
        }
        return e(str, assetManager, o0Var, i4, eVar);
    }

    private static final void g() {
    }
}
