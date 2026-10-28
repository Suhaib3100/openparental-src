package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.constraintlayout.motion.widget.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class ImageSource {
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;
    static final String FILE_SCHEME = ProtectedSandApp.s("ɇ");
    static final String ASSET_SCHEME = ProtectedSandApp.s("Ɉ");

    private ImageSource(Bitmap bitmap, boolean z5) {
        this.bitmap = bitmap;
        this.uri = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = z5;
    }

    @o0
    public static ImageSource asset(@o0 String str) {
        if (str != null) {
            return uri(ProtectedSandApp.s("Ⱦ").concat(str));
        }
        throw new NullPointerException(ProtectedSandApp.s("ȿ"));
    }

    @o0
    public static ImageSource bitmap(@o0 Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, false);
        }
        throw new NullPointerException(ProtectedSandApp.s("ɀ"));
    }

    @o0
    public static ImageSource cachedBitmap(@o0 Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, true);
        }
        throw new NullPointerException(ProtectedSandApp.s("Ɂ"));
    }

    @o0
    public static ImageSource resource(int i5) {
        return new ImageSource(i5);
    }

    private void setInvariants() {
        Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    @o0
    public static ImageSource uri(@o0 String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("Ɇ"));
        }
        if (!str.contains(ProtectedSandApp.s("Ƀ"))) {
            if (str.startsWith(ProtectedSandApp.s("Ʉ"))) {
                str = str.substring(1);
            }
            str = g.a(ProtectedSandApp.s("Ʌ"), str);
        }
        return new ImageSource(Uri.parse(str));
    }

    @o0
    public ImageSource dimensions(int i5, int i6) {
        if (this.bitmap == null) {
            this.sWidth = i5;
            this.sHeight = i6;
        }
        setInvariants();
        return this;
    }

    protected final Bitmap getBitmap() {
        return this.bitmap;
    }

    protected final Integer getResource() {
        return this.resource;
    }

    protected final int getSHeight() {
        return this.sHeight;
    }

    protected final Rect getSRegion() {
        return this.sRegion;
    }

    protected final int getSWidth() {
        return this.sWidth;
    }

    protected final boolean getTile() {
        return this.tile;
    }

    protected final Uri getUri() {
        return this.uri;
    }

    protected final boolean isCached() {
        return this.cached;
    }

    @o0
    public ImageSource region(Rect rect) {
        this.sRegion = rect;
        setInvariants();
        return this;
    }

    @o0
    public ImageSource tiling(boolean z5) {
        this.tile = z5;
        return this;
    }

    @o0
    public ImageSource tilingDisabled() {
        return tiling(false);
    }

    @o0
    public ImageSource tilingEnabled() {
        return tiling(true);
    }

    private ImageSource(@o0 Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(ProtectedSandApp.s("ȼ")) && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, ProtectedSandApp.s("Ƚ")));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.bitmap = null;
        this.uri = uri;
        this.resource = null;
        this.tile = true;
    }

    @o0
    public static ImageSource uri(@o0 Uri uri) {
        if (uri != null) {
            return new ImageSource(uri);
        }
        throw new NullPointerException(ProtectedSandApp.s("ɂ"));
    }

    private ImageSource(int i5) {
        this.bitmap = null;
        this.uri = null;
        this.resource = Integer.valueOf(i5);
        this.tile = true;
    }
}
