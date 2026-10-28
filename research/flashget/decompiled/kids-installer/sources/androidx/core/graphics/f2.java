package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;

/* compiled from: Picture.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/m2;", "Lkotlin/u;", "block", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class f2 {
    @d5.d
    public static final Picture a(@d5.d Picture picture, int i5, int i6, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(picture, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        Canvas beginRecording = picture.beginRecording(i5, i6);
        kotlin.jvm.internal.l0.o(beginRecording, "beginRecording(width, height)");
        try {
            block.N(beginRecording);
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
