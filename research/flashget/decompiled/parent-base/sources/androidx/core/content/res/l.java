package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.i1;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TypedArray.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/core/content/res/l;", "", "<init>", "()V", "Landroid/content/res/TypedArray;", "typedArray", "", "index", "Landroid/graphics/Typeface;", "a", "(Landroid/content/res/TypedArray;I)Landroid/graphics/Typeface;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(26)
/* loaded from: classes3.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l f26151a = new l();

    private l() {
    }

    @fg.l
    @kd.n
    public static final Typeface a(@fg.l TypedArray typedArray, @i1 int index) {
        Typeface font = typedArray.getFont(index);
        l0.m(font);
        return font;
    }
}
