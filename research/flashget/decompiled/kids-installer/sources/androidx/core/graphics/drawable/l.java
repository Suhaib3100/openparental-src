package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0087\b¨\u0006\b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "a", "b", "Landroid/net/Uri;", "c", "", "d", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class l {
    @x0(26)
    @d5.d
    public static final Icon a(@d5.d Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        l0.p(bitmap, "<this>");
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        l0.o(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @x0(26)
    @d5.d
    public static final Icon b(@d5.d Bitmap bitmap) {
        l0.p(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        l0.o(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @x0(26)
    @d5.d
    public static final Icon c(@d5.d Uri uri) {
        l0.p(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        l0.o(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @x0(26)
    @d5.d
    public static final Icon d(@d5.d byte[] bArr) {
        l0.p(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        l0.o(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
