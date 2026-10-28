package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: Paint.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u001e8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010$\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\"\u0010(\u001a\u00020%8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\"\u0010,\u001a\u00020)8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010/\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00103\u001a\u0002008&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR$\u0010:\u001a\n\u0018\u000104j\u0004\u0018\u0001`58&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010@\u001a\u0004\u0018\u00010;8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010F\u001a\u0004\u0018\u00010A8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010Eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006GÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/d5;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "r", "()Landroid/graphics/Paint;", "", "g", "()F", "k", "(F)V", "alpha", "", "x", "()Z", "b", "(Z)V", "isAntiAlias", "Landroidx/compose/ui/graphics/d2;", "a", "()J", "m", "(J)V", "color", "Landroidx/compose/ui/graphics/k1;", "o", "()I", "e", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/f5;", "d", "y", "style", "A", "z", "strokeWidth", "Landroidx/compose/ui/graphics/i6;", "i", "c", "strokeCap", "Landroidx/compose/ui/graphics/j6;", "p", "l", "strokeJoin", "q", "v", "strokeMiterLimit", "Landroidx/compose/ui/graphics/m4;", "w", "h", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "t", "()Landroid/graphics/Shader;", "s", "(Landroid/graphics/Shader;)V", "shader", "Landroidx/compose/ui/graphics/e2;", "f", "()Landroidx/compose/ui/graphics/e2;", "u", "(Landroidx/compose/ui/graphics/e2;)V", "colorFilter", "Landroidx/compose/ui/graphics/h5;", "n", "()Landroidx/compose/ui/graphics/h5;", "j", "(Landroidx/compose/ui/graphics/h5;)V", "pathEffect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d5 {
    float A();

    long a();

    void b(boolean z4);

    void c(int i4);

    int d();

    void e(int i4);

    @fg.m
    e2 f();

    float g();

    void h(int i4);

    int i();

    void j(@fg.m h5 h5Var);

    void k(float f4);

    void l(int i4);

    void m(long j4);

    @fg.m
    h5 n();

    int o();

    int p();

    float q();

    @fg.l
    Paint r();

    void s(@fg.m Shader shader);

    @fg.m
    Shader t();

    void u(@fg.m e2 e2Var);

    void v(float f4);

    int w();

    boolean x();

    void y(int i4);

    void z(float f4);
}
