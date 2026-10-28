package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static HashSet<Uri> zab = new HashSet<>();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zaq(Looper.getMainLooper());
    private final ExecutorService zaf = zap.zaa().zab(4, 2);
    private final zak zag = new zak();
    private final Map<zag, ImageReceiver> zah = new HashMap();
    private final Map<Uri, ImageReceiver> zai = new HashMap();
    private final Map<Uri, Long> zaj = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepName
    final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        private final ArrayList<zag> zac;

        ImageReceiver(Uri uri) {
            super(new zaq(Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new ArrayList<>();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i5, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable(ProtectedSandApp.s("ଗ"));
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new zaa(imageManager, this.zab, parcelFileDescriptor));
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread(ProtectedSandApp.s("ଘ"));
            this.zac.add(zagVar);
        }

        public final void zac(zag zagVar) {
            Asserts.checkMainThread(ProtectedSandApp.s("ଙ"));
            this.zac.remove(zagVar);
        }

        public final void zad() {
            Intent intent = new Intent(ProtectedSandApp.s("ଚ"));
            intent.setPackage(ProtectedSandApp.s("ଛ"));
            intent.putExtra(ProtectedSandApp.s("ଜ"), this.zab);
            intent.putExtra(ProtectedSandApp.s("ଝ"), this);
            intent.putExtra(ProtectedSandApp.s("ଞ"), 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface OnImageLoadedListener {
        void onImageLoaded(@o0 Uri uri, @q0 Drawable drawable, boolean z5);
    }

    private ImageManager(Context context, boolean z5) {
        this.zad = context.getApplicationContext();
    }

    @o0
    public static ImageManager create(@o0 Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(@o0 ImageView imageView, int i5) {
        zaj(new zae(imageView, i5));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread(ProtectedSandApp.s("ଟ"));
        new zab(this, zagVar).run();
    }

    public void loadImage(@o0 ImageView imageView, @o0 Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@o0 ImageView imageView, @o0 Uri uri, int i5) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i5;
        zaj(zaeVar);
    }

    public void loadImage(@o0 OnImageLoadedListener onImageLoadedListener, @o0 Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@o0 OnImageLoadedListener onImageLoadedListener, @o0 Uri uri, int i5) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i5;
        zaj(zafVar);
    }
}
