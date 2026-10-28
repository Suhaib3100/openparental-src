package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.n0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidPreloadedFont.android.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/m1;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/n0$e;", "Landroid/content/Context;", "context", "", "Landroid/graphics/fonts/FontVariationAxis;", "d", "(Landroidx/compose/ui/text/font/n0$e;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "variationSettings", "Landroid/graphics/Typeface;", "a", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/ui/text/font/n0$e;)Landroid/graphics/Typeface;", "Ljava/io/File;", "file", "b", "(Ljava/io/File;Landroid/content/Context;Landroidx/compose/ui/text/font/n0$e;)Landroid/graphics/Typeface;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "c", "(Landroid/os/ParcelFileDescriptor;Landroid/content/Context;Landroidx/compose/ui/text/font/n0$e;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(api = 26)
@kotlin.jvm.internal.r1({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,234:1\n151#2,3:235\n33#2,4:238\n154#2,2:242\n38#2:244\n156#2:245\n37#3,2:246\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n229#1:235,3\n229#1:238,4\n229#1:242,2\n229#1:244\n229#1:245\n231#1:246,2\n*E\n"})
/* loaded from: classes.dex */
final class m1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m1 f20764a = new m1();

    private m1() {
    }

    @androidx.annotation.x0(26)
    @androidx.compose.ui.text.k
    private final FontVariationAxis[] d(n0.e eVar, Context context) {
        androidx.compose.ui.unit.d a5;
        if (context != null) {
            a5 = androidx.compose.ui.unit.a.a(context);
        } else {
            if (eVar.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            a5 = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
        }
        List<n0.a> b5 = eVar.b();
        ArrayList arrayList = new ArrayList(b5.size());
        int size = b5.size();
        for (int i4 = 0; i4 < size; i4++) {
            n0.a aVar = b5.get(i4);
            h1.a();
            arrayList.add(g1.a(aVar.getAxisName(), aVar.b(a5)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @androidx.annotation.u
    @fg.m
    @androidx.compose.ui.text.k
    public final Typeface a(@fg.l AssetManager assetManager, @fg.l String path, @fg.m Context context, @fg.l n0.e variationSettings) {
        Typeface.Builder fontVariationSettings;
        Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = j1.a(assetManager, path).setFontVariationSettings(d(variationSettings, context));
        build = fontVariationSettings.build();
        return build;
    }

    @androidx.annotation.u
    @fg.m
    @androidx.compose.ui.text.k
    public final Typeface b(@fg.l File file, @fg.m Context context, @fg.l n0.e variationSettings) {
        Typeface.Builder fontVariationSettings;
        Typeface build;
        if (context == null) {
            return null;
        }
        fontVariationSettings = i1.a(file).setFontVariationSettings(d(variationSettings, context));
        build = fontVariationSettings.build();
        return build;
    }

    @androidx.annotation.u
    @fg.m
    @androidx.compose.ui.text.k
    public final Typeface c(@fg.l ParcelFileDescriptor fileDescriptor, @fg.m Context context, @fg.l n0.e variationSettings) {
        Typeface.Builder fontVariationSettings;
        Typeface build;
        if (context == null) {
            return null;
        }
        l1.a();
        fontVariationSettings = k1.a(fileDescriptor.getFileDescriptor()).setFontVariationSettings(d(variationSettings, context));
        build = fontVariationSettings.build();
        return build;
    }
}
