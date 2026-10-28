package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.n6;
import kotlin.Metadata;

/* compiled from: AndroidTileMode.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/n6;", "", "a", "(I)Z", "Landroid/graphics/Shader$TileMode;", "b", "(I)Landroid/graphics/Shader$TileMode;", "c", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f1 {

    /* compiled from: AndroidTileMode.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17813a;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17813a = iArr;
        }
    }

    public static final boolean a(int i4) {
        if (Build.VERSION.SDK_INT < 31) {
            n6.INSTANCE.getClass();
            if (n6.h(i4, n6.f17976f)) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public static final Shader.TileMode b(int i4) {
        n6.Companion companion = n6.INSTANCE;
        companion.getClass();
        if (n6.h(i4, n6.f17973c)) {
            return Shader.TileMode.CLAMP;
        }
        companion.getClass();
        if (n6.h(i4, n6.f17974d)) {
            return Shader.TileMode.REPEAT;
        }
        companion.getClass();
        if (n6.h(i4, n6.f17975e)) {
            return Shader.TileMode.MIRROR;
        }
        companion.getClass();
        return n6.h(i4, n6.f17976f) ? Build.VERSION.SDK_INT >= 31 ? o6.f17978a.b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int c(@fg.l Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        int i4 = a.f17813a[tileMode.ordinal()];
        if (i4 == 1) {
            n6.INSTANCE.getClass();
            return n6.f17973c;
        }
        if (i4 == 2) {
            n6.INSTANCE.getClass();
            return n6.f17975e;
        }
        if (i4 == 3) {
            n6.INSTANCE.getClass();
            return n6.f17974d;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            tileMode2 = Shader.TileMode.DECAL;
            if (tileMode == tileMode2) {
                return o6.f17978a.a();
            }
        }
        n6.INSTANCE.getClass();
        return n6.f17973c;
    }
}
