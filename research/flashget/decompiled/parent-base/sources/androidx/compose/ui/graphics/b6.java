package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Shader.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aN\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aN\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a0\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Li0/f;", "from", "to", "", "Landroidx/compose/ui/graphics/d2;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/n6;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "radius", "e", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "g", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/s4;", "image", "tileModeX", "tileModeY", "a", "(Landroidx/compose/ui/graphics/s4;II)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b6 {
    @fg.l
    public static final Shader a(@fg.l s4 s4Var, int i4, int i5) {
        return d1.a(s4Var, i4, i5);
    }

    public static Shader b(s4 s4Var, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            n6.INSTANCE.getClass();
            i4 = n6.f17973c;
        }
        if ((i6 & 4) != 0) {
            n6.INSTANCE.getClass();
            i5 = n6.f17973c;
        }
        return d1.a(s4Var, i4, i5);
    }

    @fg.l
    public static final Shader c(long j4, long j5, @fg.l List<d2> list, @fg.m List<Float> list2, int i4) {
        return d1.b(j4, j5, list, list2, i4);
    }

    public static Shader d(long j4, long j5, List list, List list2, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i5 & 16) != 0) {
            n6.INSTANCE.getClass();
            i4 = n6.f17973c;
        }
        return d1.b(j4, j5, list, list3, i4);
    }

    @fg.l
    public static final Shader e(long j4, float f4, @fg.l List<d2> list, @fg.m List<Float> list2, int i4) {
        return d1.c(j4, f4, list, list2, i4);
    }

    public static Shader f(long j4, float f4, List list, List list2, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i5 & 16) != 0) {
            n6.INSTANCE.getClass();
            i4 = n6.f17973c;
        }
        return d1.c(j4, f4, list, list3, i4);
    }

    @fg.l
    public static final Shader g(long j4, @fg.l List<d2> list, @fg.m List<Float> list2) {
        return d1.d(j4, list, list2);
    }

    public static Shader h(long j4, List list, List list2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list2 = null;
        }
        return d1.d(j4, list, list2);
    }
}
