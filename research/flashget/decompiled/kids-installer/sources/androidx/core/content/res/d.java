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
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4619d = "ComplexColorCompat";

    /* renamed from: a, reason: collision with root package name */
    private final Shader f4620a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f4621b;

    /* renamed from: c, reason: collision with root package name */
    private int f4622c;

    private d(Shader shader, ColorStateList colorStateList, @androidx.annotation.l int i5) {
        this.f4620a = shader;
        this.f4621b = colorStateList;
        this.f4622c = i5;
    }

    @o0
    private static d a(@o0 Resources resources, @androidx.annotation.n int i5, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i5);
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

    static d b(@androidx.annotation.l int i5) {
        return new d(null, null, i5);
    }

    static d c(@o0 ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(@o0 Shader shader) {
        return new d(shader, null, 0);
    }

    @q0
    public static d g(@o0 Resources resources, @androidx.annotation.n int i5, @q0 Resources.Theme theme) {
        try {
            return a(resources, i5, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @androidx.annotation.l
    public int e() {
        return this.f4622c;
    }

    @q0
    public Shader f() {
        return this.f4620a;
    }

    public boolean h() {
        return this.f4620a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f4620a == null && (colorStateList = this.f4621b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f4621b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4622c) {
                this.f4622c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.l int i5) {
        this.f4622c = i5;
    }

    public boolean l() {
        return h() || this.f4622c != 0;
    }
}
