package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public class SkiaImageDecoder implements ImageDecoder {
    private final Bitmap.Config bitmapConfig;
    private static final String RESOURCE_PREFIX = ProtectedSandApp.s("ᔀ");
    private static final String FILE_PREFIX = ProtectedSandApp.s("ᔃ");
    private static final String ASSET_PREFIX = ProtectedSandApp.s("ᔂ");

    @Keep
    public SkiaImageDecoder() {
        this(null);
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageDecoder
    @o0
    public Bitmap decode(Context context, @o0 Uri uri) throws Exception {
        Bitmap bitmap;
        String uri2 = uri.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.bitmapConfig;
        if (uri2.startsWith(ProtectedSandApp.s("ᔀ"))) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            int i4 = 0;
            if (size == 2) {
                String str = pathSegments.get(0);
                String s4 = ProtectedSandApp.s("ᔁ");
                if (str.equals(s4)) {
                    i4 = resources.getIdentifier(pathSegments.get(1), s4, authority);
                    bitmap = BitmapFactory.decodeResource(context.getResources(), i4, options);
                }
            }
            if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    i4 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            bitmap = BitmapFactory.decodeResource(context.getResources(), i4, options);
        } else {
            InputStream inputStream = null;
            if (uri2.startsWith(ProtectedSandApp.s("ᔂ"))) {
                bitmap = BitmapFactory.decodeStream(context.getAssets().open(uri2.substring(22)), null, options);
            } else if (uri2.startsWith(ProtectedSandApp.s("ᔃ"))) {
                bitmap = BitmapFactory.decodeFile(uri2.substring(7), options);
            } else {
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        bitmap = decodeStream;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = openInputStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        throw new RuntimeException(ProtectedSandApp.s("ᔄ"));
    }

    public SkiaImageDecoder(@q0 Bitmap.Config config) {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = Bitmap.Config.RGB_565;
        }
    }
}
