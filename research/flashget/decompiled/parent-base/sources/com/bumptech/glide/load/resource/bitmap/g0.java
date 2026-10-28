package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.x0;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
@x0(21)
/* loaded from: classes3.dex */
public final class g0 implements com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f44477b = 536870912;

    /* renamed from: a, reason: collision with root package name */
    private final w f44478a;

    public g0(w wVar) {
        this.f44478a = wVar;
    }

    private boolean e(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !(ProtectedSandApp.s("\u09a9").equalsIgnoreCase(str) || ProtectedSandApp.s("প").equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // com.bumptech.glide.load.k
    @androidx.annotation.q0
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return this.f44478a.d(parcelFileDescriptor, i4, i5, iVar);
    }

    @androidx.annotation.q0
    public com.bumptech.glide.load.engine.u<Bitmap> c(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return this.f44478a.d(parcelFileDescriptor, i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        if (e(parcelFileDescriptor)) {
            this.f44478a.getClass();
            if (ParcelFileDescriptorRewinder.c()) {
                return true;
            }
        }
        return false;
    }
}
