package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: ImageDecoder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u001aU\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/r0;", "name", "info", "source", "Lkotlin/m2;", "Lkotlin/u;", "action", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/drawable/Drawable;", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class u1 {

    /* compiled from: ImageDecoder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, kotlin.m2> f4810a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q3.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, kotlin.m2> qVar) {
            this.f4810a = qVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@d5.d ImageDecoder decoder, @d5.d ImageDecoder.ImageInfo info, @d5.d ImageDecoder.Source source) {
            kotlin.jvm.internal.l0.p(decoder, "decoder");
            kotlin.jvm.internal.l0.p(info, "info");
            kotlin.jvm.internal.l0.p(source, "source");
            this.f4810a.G(decoder, info, source);
        }
    }

    /* compiled from: ImageDecoder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, kotlin.m2> f4811a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(q3.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, kotlin.m2> qVar) {
            this.f4811a = qVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@d5.d ImageDecoder decoder, @d5.d ImageDecoder.ImageInfo info, @d5.d ImageDecoder.Source source) {
            kotlin.jvm.internal.l0.p(decoder, "decoder");
            kotlin.jvm.internal.l0.p(info, "info");
            kotlin.jvm.internal.l0.p(source, "source");
            this.f4811a.G(decoder, info, source);
        }
    }

    @androidx.annotation.x0(28)
    @d5.d
    public static final Bitmap a(@d5.d ImageDecoder.Source source, @d5.d q3.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, kotlin.m2> action) {
        Bitmap decodeBitmap;
        kotlin.jvm.internal.l0.p(source, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        decodeBitmap = ImageDecoder.decodeBitmap(source, new a(action));
        kotlin.jvm.internal.l0.o(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @androidx.annotation.x0(28)
    @d5.d
    public static final Drawable b(@d5.d ImageDecoder.Source source, @d5.d q3.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, kotlin.m2> action) {
        Drawable decodeDrawable;
        kotlin.jvm.internal.l0.p(source, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        decodeDrawable = ImageDecoder.decodeDrawable(source, new b(action));
        kotlin.jvm.internal.l0.o(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
