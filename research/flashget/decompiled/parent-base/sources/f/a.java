package f;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Compatibility.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: Compatibility.java */
    @x0(15)
    /* renamed from: f.a$a, reason: collision with other inner class name */
    public static class C1018a {
        private C1018a() {
        }

        @u
        public static void a(@o0 Resources resources, int i4, int i5, @o0 TypedValue typedValue, boolean z4) {
            resources.getValueForDensity(i4, i5, typedValue, z4);
        }
    }

    /* compiled from: Compatibility.java */
    @x0(18)
    public static class b {
        private b() {
        }

        @u
        public static void a(@o0 ObjectAnimator objectAnimator, boolean z4) {
            objectAnimator.setAutoCancel(z4);
        }
    }

    /* compiled from: Compatibility.java */
    @x0(21)
    public static class c {
        private c() {
        }

        @u
        @o0
        public static Drawable a(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @u
        public static int b(@o0 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @u
        public static void c(@o0 Drawable drawable, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private a() {
    }
}
