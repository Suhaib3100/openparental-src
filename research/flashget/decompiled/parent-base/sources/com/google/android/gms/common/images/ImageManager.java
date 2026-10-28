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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static final HashSet zab = new HashSet();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zau(Looper.getMainLooper());
    private final ExecutorService zaf = zat.zaa().zab(4, 2);
    private final zam zag = new zam();
    private final Map zah = new HashMap();
    private final Map zai = new HashMap();
    private final Map zaj = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepName
    final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        private final ArrayList zac;

        ImageReceiver(Uri uri) {
            super(new zau(Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i4, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable(ProtectedSandApp.s("쪭"));
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new zaa(imageManager, this.zab, parcelFileDescriptor));
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread(ProtectedSandApp.s("쪮"));
            this.zac.add(zagVar);
        }

        public final void zac(zag zagVar) {
            Asserts.checkMainThread(ProtectedSandApp.s("쪯"));
            this.zac.remove(zagVar);
        }

        public final void zad() {
            Intent intent = new Intent(ProtectedSandApp.s("쪰"));
            intent.setPackage(ProtectedSandApp.s("쪱"));
            intent.putExtra(ProtectedSandApp.s("쪲"), this.zab);
            intent.putExtra(ProtectedSandApp.s("쪳"), this);
            intent.putExtra(ProtectedSandApp.s("쪴"), 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface OnImageLoadedListener {
        void onImageLoaded(@o0 Uri uri, @q0 Drawable drawable, boolean z4);
    }

    private ImageManager(Context context, boolean z4) {
        this.zad = context.getApplicationContext();
    }

    @o0
    public static ImageManager create(@o0 Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(@o0 ImageView imageView, int i4) {
        zaj(new zae(imageView, i4));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread(ProtectedSandApp.s("쪵"));
        new zab(this, zagVar).run();
    }

    public void loadImage(@o0 ImageView imageView, @o0 Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@o0 ImageView imageView, @o0 Uri uri, int i4) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i4;
        zaj(zaeVar);
    }

    public void loadImage(@o0 OnImageLoadedListener onImageLoadedListener, @o0 Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@o0 OnImageLoadedListener onImageLoadedListener, @o0 Uri uri, int i4) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i4;
        zaj(zafVar);
    }
}
