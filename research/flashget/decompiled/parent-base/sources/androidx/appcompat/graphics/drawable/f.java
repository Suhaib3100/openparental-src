package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.widget.i0;
import androidx.core.content.res.n;
import f.a;
import f.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateListDrawableCompat.java */
/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: s, reason: collision with root package name */
    private static final String f1050s = "StateListDrawableCompat";

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f1051t = false;

    /* renamed from: q, reason: collision with root package name */
    private a f1052q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1053r;

    /* compiled from: StateListDrawableCompat.java */
    static class a extends b.d {
        int[][] J;

        a(a aVar, f fVar, Resources resources) {
            super(aVar, fVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f1012g.length][];
            }
        }

        int D(int[] iArr, Drawable drawable) {
            int a5 = a(drawable);
            this.J[a5] = iArr;
            return a5;
        }

        int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i4 = this.f1013h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                    return i5;
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
        public void r(int i4, int i5) {
            super.r(i4, i5);
            int[][] iArr = new int[i5][];
            System.arraycopy(this.J, 0, iArr, 0, i4);
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

    public f() {
        this(null, null);
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.f1052q;
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
                TypedArray s4 = n.s(resources, theme, attributeSet, b.C1019b.f73844w);
                int resourceId = s4.getResourceId(b.C1019b.f73845x, -1);
                Drawable j4 = resourceId > 0 ? i0.h().j(context, resourceId) : null;
                s4.recycle();
                int[] p4 = p(attributeSet);
                if (j4 == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    j4 = a.c.a(resources, xmlPullParser, attributeSet, theme);
                }
                aVar.D(p4, j4);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.f1052q;
        aVar.f1009d |= a.c.b(typedArray);
        aVar.f1014i = typedArray.getBoolean(b.C1019b.f73840s, aVar.f1014i);
        aVar.f1017l = typedArray.getBoolean(b.C1019b.f73841t, aVar.f1017l);
        aVar.A = typedArray.getInt(b.C1019b.f73842u, aVar.A);
        aVar.B = typedArray.getInt(b.C1019b.f73843v, aVar.B);
        aVar.f1029x = typedArray.getBoolean(b.C1019b.f73838q, aVar.f1029x);
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
        this.f1053r = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void i(@o0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f1052q = (a) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f1053r && super.mutate() == this) {
            this.f1052q.v();
            this.f1053r = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f1052q.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public a o() {
        return new a(this.f1052q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@o0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.f1052q.E(iArr);
        if (E < 0) {
            E = this.f1052q.E(StateSet.WILD_CARD);
        }
        return h(E) || onStateChange;
    }

    int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i6 = i4 + 1;
                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i4] = attributeNameResource;
                i4 = i6;
            }
        }
        return StateSet.trimStateSet(iArr, i4);
    }

    int q() {
        return this.f1052q.f1013h;
    }

    Drawable r(int i4) {
        return this.f1052q.h(i4);
    }

    int s(int[] iArr) {
        return this.f1052q.E(iArr);
    }

    a t() {
        return this.f1052q;
    }

    int[] u(int i4) {
        return this.f1052q.J[i4];
    }

    public void v(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s4 = n.s(resources, theme, attributeSet, b.C1019b.f73837p);
        setVisible(s4.getBoolean(b.C1019b.f73839r, true), true);
        x(s4);
        m(resources);
        s4.recycle();
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
