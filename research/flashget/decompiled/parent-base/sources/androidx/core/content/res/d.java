package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26107d = "ComplexColorCompat";

    /* renamed from: a, reason: collision with root package name */
    private final Shader f26108a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f26109b;

    /* renamed from: c, reason: collision with root package name */
    private int f26110c;

    private d(Shader shader, ColorStateList colorStateList, @androidx.annotation.l int i4) {
        this.f26108a = shader;
        this.f26109b = colorStateList;
        this.f26110c = i4;
    }

    @o0
    private static d a(@o0 Resources resources, @androidx.annotation.n int i4, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(g.c(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(@androidx.annotation.l int i4) {
        return new d(null, null, i4);
    }

    static d c(@o0 ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(@o0 Shader shader) {
        return new d(shader, null, 0);
    }

    @q0
    public static d g(@o0 Resources resources, @androidx.annotation.n int i4, @q0 Resources.Theme theme) {
        try {
            return a(resources, i4, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @androidx.annotation.l
    public int e() {
        return this.f26110c;
    }

    @q0
    public Shader f() {
        return this.f26108a;
    }

    public boolean h() {
        return this.f26108a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f26108a == null && (colorStateList = this.f26109b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f26109b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f26110c) {
                this.f26110c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.l int i4) {
        this.f26110c = i4;
    }

    public boolean l() {
        return h() || this.f26110c != 0;
    }
}
