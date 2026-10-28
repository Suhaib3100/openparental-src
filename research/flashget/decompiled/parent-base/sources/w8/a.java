package w8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class a {
    private a() {
    }

    @o0
    public static AttributeSet a(@o0 Context context, @o1 int i4, @o0 CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i4);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException(ProtectedSandApp.s("㣌\u0001"));
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException(ProtectedSandApp.s("㣊\u0001") + ((Object) charSequence) + ProtectedSandApp.s("㣋\u0001"));
        } catch (IOException e4) {
            e = e4;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(ProtectedSandApp.s("㣍\u0001") + Integer.toHexString(i4));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e5) {
            e = e5;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(ProtectedSandApp.s("㣍\u0001") + Integer.toHexString(i4));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    @TargetApi(21)
    public static void b(@q0 RippleDrawable rippleDrawable, int i4) {
        rippleDrawable.setRadius(i4);
    }

    @q0
    public static PorterDuffColorFilter c(@o0 Drawable drawable, @q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
