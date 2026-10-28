package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class ImageSource {
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;
    static final String FILE_SCHEME = ProtectedSandApp.s("ᓍ");
    static final String ASSET_SCHEME = ProtectedSandApp.s("ᓏ");

    private ImageSource(Bitmap bitmap, boolean z4) {
        this.bitmap = bitmap;
        this.uri = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = z4;
    }

    @o0
    public static ImageSource asset(@o0 String str) {
        if (str != null) {
            return uri(ProtectedSandApp.s("ᓏ").concat(str));
        }
        throw new NullPointerException(ProtectedSandApp.s("ᓐ"));
    }

    @o0
    public static ImageSource bitmap(@o0 Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, false);
        }
        throw new NullPointerException(ProtectedSandApp.s("ᓑ"));
    }

    @o0
    public static ImageSource cachedBitmap(@o0 Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, true);
        }
        throw new NullPointerException(ProtectedSandApp.s("ᓑ"));
    }

    @o0
    public static ImageSource resource(int i4) {
        return new ImageSource(i4);
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
            throw new NullPointerException(ProtectedSandApp.s("ᓒ"));
        }
        if (!str.contains(ProtectedSandApp.s("ᓓ"))) {
            if (str.startsWith(ProtectedSandApp.s("ᓔ"))) {
                str = str.substring(1);
            }
            str = c.a(ProtectedSandApp.s("ᓍ"), str);
        }
        return new ImageSource(Uri.parse(str));
    }

    @o0
    public ImageSource dimensions(int i4, int i5) {
        if (this.bitmap == null) {
            this.sWidth = i4;
            this.sHeight = i5;
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
    public ImageSource tiling(boolean z4) {
        this.tile = z4;
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
        if (uri2.startsWith(ProtectedSandApp.s("ᓍ")) && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, ProtectedSandApp.s("ᓎ")));
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
        throw new NullPointerException(ProtectedSandApp.s("ᓒ"));
    }

    private ImageSource(int i4) {
        this.bitmap = null;
        this.uri = null;
        this.resource = Integer.valueOf(i4);
        this.tile = true;
    }
}
