package com.bumptech.glide.load.resource;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.v;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: ImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public abstract class j<T> implements com.bumptech.glide.load.k<ImageDecoder.Source, T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11873b = ProtectedSandApp.s("ᵚ");

    /* renamed from: a, reason: collision with root package name */
    final b0 f11874a = b0.d();

    /* compiled from: ImageDecoderResourceDecoder.java */
    /* loaded from: classes.dex */
    class a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.b f11878d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f11879e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.j f11880f;

        /* compiled from: ImageDecoderResourceDecoder.java */
        /* renamed from: com.bumptech.glide.load.resource.j$a$a, reason: collision with other inner class name */
        class C0151a implements ImageDecoder.OnPartialImageListener {
            C0151a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(@o0 ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        a(int i5, int i6, boolean z5, com.bumptech.glide.load.b bVar, p pVar, com.bumptech.glide.load.j jVar) {
            this.f11875a = i5;
            this.f11876b = i6;
            this.f11877c = z5;
            this.f11878d = bVar;
            this.f11879e = pVar;
            this.f11880f = jVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size;
            ColorSpace.Named named;
            ColorSpace colorSpace;
            ColorSpace colorSpace2;
            ColorSpace colorSpace3;
            ColorSpace colorSpace4;
            boolean isWideGamut;
            boolean z5 = false;
            if (j.this.f11874a.g(this.f11875a, this.f11876b, this.f11877c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f11878d == com.bumptech.glide.load.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0151a());
            size = imageInfo.getSize();
            int i5 = this.f11875a;
            if (i5 == Integer.MIN_VALUE) {
                i5 = size.getWidth();
            }
            int i6 = this.f11876b;
            if (i6 == Integer.MIN_VALUE) {
                i6 = size.getHeight();
            }
            float b6 = this.f11879e.b(size.getWidth(), size.getHeight(), i5, i6);
            int round = Math.round(size.getWidth() * b6);
            int round2 = Math.round(b6 * size.getHeight());
            if (Log.isLoggable(ProtectedSandApp.s("Ǩ"), 2)) {
                size.getWidth();
                size.getHeight();
            }
            imageDecoder.setTargetSize(round, round2);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 28) {
                if (i7 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (this.f11880f == com.bumptech.glide.load.j.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        z5 = true;
                    }
                }
            }
            colorSpace2 = ColorSpace.get(z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }

    protected abstract u<T> c(ImageDecoder.Source source, int i5, int i6, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // com.bumptech.glide.load.k
    @q0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final u<T> b(@o0 ImageDecoder.Source source, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        com.bumptech.glide.load.b bVar = (com.bumptech.glide.load.b) iVar.c(v.f11782g);
        p pVar = (p) iVar.c(p.f11765h);
        com.bumptech.glide.load.h<Boolean> hVar = v.f11786k;
        return c(source, i5, i6, new a(i5, i6, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), bVar, pVar, (com.bumptech.glide.load.j) iVar.c(v.f11783h)));
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean a(@o0 ImageDecoder.Source source, @o0 com.bumptech.glide.load.i iVar) {
        return true;
    }
}
