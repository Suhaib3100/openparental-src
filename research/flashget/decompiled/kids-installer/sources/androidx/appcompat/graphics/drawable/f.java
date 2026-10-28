package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.graphics.drawable.b;
import androidx.core.content.res.p;
import e.a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateListDrawable.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes2.dex */
class f extends b {
    private static final String F = "StateListDrawable";
    private static final boolean G = false;
    private a D;
    private boolean E;

    /* compiled from: StateListDrawable.java */
    static class a extends b.d {
        int[][] J;

        a(a aVar, f fVar, Resources resources) {
            super(aVar, fVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()][];
            }
        }

        int D(int[] iArr, Drawable drawable) {
            int a6 = a(drawable);
            this.J[a6] = iArr;
            return a6;
        }

        int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i5 = i();
            for (int i6 = 0; i6 < i5; i6++) {
                if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                    return i6;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new f(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        public void r(int i5, int i6) {
            super.r(i5, i6);
            int[][] iArr = new int[i6][];
            System.arraycopy(this.J, 0, iArr, 0, i5);
            this.J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new f(this, resources);
        }
    }

    f() {
        this(null, null);
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.D;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray s5 = p.s(resources, theme, attributeSet, a.j.f22520l0);
                int resourceId = s5.getResourceId(a.j.f22522m0, -1);
                Drawable j5 = resourceId > 0 ? androidx.appcompat.widget.o0.h().j(context, resourceId) : null;
                s5.recycle();
                int[] p5 = p(attributeSet);
                if (j5 == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    j5 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                aVar.D(p5, j5);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.D;
        aVar.f491d |= typedArray.getChangingConfigurations();
        aVar.f496i = typedArray.getBoolean(a.j.f22512h0, aVar.f496i);
        aVar.f499l = typedArray.getBoolean(a.j.f22514i0, aVar.f499l);
        aVar.A = typedArray.getInt(a.j.f22516j0, aVar.A);
        aVar.B = typedArray.getInt(a.j.f22518k0, aVar.B);
        aVar.f511x = typedArray.getBoolean(a.j.f22508f0, aVar.f511x);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @x0(21)
    public void applyTheme(@o0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.E = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void i(@o0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.D = (a) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.E && super.mutate() == this) {
            this.D.v();
            this.E = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.D.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public a o() {
        return new a(this.D, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.D.E(iArr);
        if (E < 0) {
            E = this.D.E(StateSet.WILD_CARD);
        }
        return h(E) || onStateChange;
    }

    int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i5 = 0;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i6);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i7 = i5 + 1;
                if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i5] = attributeNameResource;
                i5 = i7;
            }
        }
        return StateSet.trimStateSet(iArr, i5);
    }

    int q() {
        return this.D.i();
    }

    Drawable r(int i5) {
        return this.D.h(i5);
    }

    int s(int[] iArr) {
        return this.D.E(iArr);
    }

    a t() {
        return this.D;
    }

    int[] u(int i5) {
        return this.D.J[i5];
    }

    public void v(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s5 = p.s(resources, theme, attributeSet, a.j.f22506e0);
        setVisible(s5.getBoolean(a.j.f22510g0, true), true);
        x(s5);
        m(resources);
        s5.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    f(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    f(@q0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}
