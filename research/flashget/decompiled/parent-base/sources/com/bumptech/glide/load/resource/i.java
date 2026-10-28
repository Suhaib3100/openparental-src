package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.bumptech.glide.load.resource.bitmap.c0;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.w;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DefaultOnHeaderDecodedListener.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class i implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: h, reason: collision with root package name */
    private static final String f44653h = ProtectedSandApp.s("ਡ");

    /* renamed from: a, reason: collision with root package name */
    private final c0 f44654a = c0.c();

    /* renamed from: b, reason: collision with root package name */
    private final int f44655b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44656c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.b f44657d;

    /* renamed from: e, reason: collision with root package name */
    private final q f44658e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f44659f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.j f44660g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(@o0 ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public i(int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        this.f44655b = i4;
        this.f44656c = i5;
        this.f44657d = (com.bumptech.glide.load.b) iVar.c(w.f44549g);
        this.f44658e = (q) iVar.c(q.f44530h);
        com.bumptech.glide.load.h<Boolean> hVar = w.f44553k;
        this.f44659f = iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue();
        this.f44660g = (com.bumptech.glide.load.j) iVar.c(w.f44550h);
    }

    public void onHeaderDecoded(@o0 ImageDecoder imageDecoder, @o0 ImageDecoder.ImageInfo imageInfo, @o0 ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.f44654a.g(this.f44655b, this.f44656c, this.f44659f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f44657d == com.bumptech.glide.load.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i4 = this.f44655b;
        if (i4 == Integer.MIN_VALUE) {
            i4 = size.getWidth();
        }
        int i5 = this.f44656c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = size.getHeight();
        }
        float b5 = this.f44658e.b(size.getWidth(), size.getHeight(), i4, i5);
        int round = Math.round(size.getWidth() * b5);
        int round2 = Math.round(b5 * size.getHeight());
        if (Log.isLoggable(ProtectedSandApp.s("ਡ"), 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        com.bumptech.glide.load.j jVar = this.f44660g;
        if (jVar != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 28) {
                if (i6 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (jVar == com.bumptech.glide.load.j.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
