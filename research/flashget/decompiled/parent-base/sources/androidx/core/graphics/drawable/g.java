package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "a", "(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;", "b", "Landroid/net/Uri;", "c", "(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;", "", "d", "([B)Landroid/graphics/drawable/Icon;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class g {
    @fg.l
    @x0(26)
    public static final Icon a(@fg.l Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    @fg.l
    @x0(26)
    public static final Icon b(@fg.l Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @fg.l
    @x0(26)
    public static final Icon c(@fg.l Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @fg.l
    @x0(26)
    public static final Icon d(@fg.l byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
