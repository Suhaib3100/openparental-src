package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
final class zaa implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;

    @q0
    private final ParcelFileDescriptor zac;

    public zaa(ImageManager imageManager, @q0 Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Asserts.checkNotMainThread(ProtectedSandApp.s("쫀"));
        ParcelFileDescriptor parcelFileDescriptor = this.zac;
        Bitmap bitmap = null;
        boolean z4 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                ProtectedSandApp.s("쫁").concat(String.valueOf(this.zab));
                z4 = true;
            }
            try {
                this.zac.close();
            } catch (IOException unused2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.zaa;
        Uri uri = this.zab;
        handler = imageManager.zae;
        handler.post(new zac(imageManager, uri, bitmap, z4, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            ProtectedSandApp.s("쫂").concat(String.valueOf(this.zab));
        }
    }
}
