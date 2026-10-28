package w0;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.collection.c3;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FontScaleConverterFactory.android.kt */
@u(parameters = 0)
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0082\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001cR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R.\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006."}, d2 = {"Lw0/b;", "", "<init>", "()V", "Lw0/a;", "start", "end", "", "interpolationPoint", "a", "(Lw0/a;Lw0/a;F)Lw0/a;", "fontScale", "", "d", "(F)I", "key", "g", "(I)F", "scaleKey", "fontScaleConverter", "Lkotlin/k2;", "i", "(FLw0/a;)V", "Landroidx/collection/c3;", "table", "j", "(Landroidx/collection/c3;FLw0/a;)V", "c", "(F)Lw0/a;", "", "h", "(F)Z", "b", "F", "SCALE_KEY_MULTIPLIER", "Landroidx/collection/c3;", "e", "()Landroidx/collection/c3;", "k", "(Landroidx/collection/c3;)V", "f", "sLookupTables", "", "[Ljava/lang/Object;", "LOOKUP_TABLES_WRITE_LOCK", "sMinScaleBeforeCurvesApplied", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f92855a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float SCALE_KEY_MULTIPLIER = 100.0f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    @c1({c1.a.LIBRARY_GROUP})
    private static volatile c3<a> sLookupTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private static final Object[] LOOKUP_TABLES_WRITE_LOCK;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static float sMinScaleBeforeCurvesApplied;

    /* renamed from: f, reason: collision with root package name */
    public static final int f92860f;

    static {
        b bVar = new b();
        f92855a = bVar;
        sLookupTables = new c3<>(0, 1, null);
        Object[] objArr = new Object[0];
        LOOKUP_TABLES_WRITE_LOCK = objArr;
        sMinScaleBeforeCurvesApplied = 1.05f;
        synchronized (objArr) {
            bVar.j(sLookupTables, 1.15f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.j(sLookupTables, 1.3f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.j(sLookupTables, 1.5f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.j(sLookupTables, 1.8f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.j(sLookupTables, 2.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            k2 k2Var = k2.f75408a;
        }
        float p4 = (sLookupTables.p(0) / 100.0f) - 0.02f;
        sMinScaleBeforeCurvesApplied = p4;
        if (p4 <= 1.0f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        f92860f = 8;
    }

    private b() {
    }

    private final a a(a start, a end, float interpolationPoint) {
        float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            fArr2[i4] = d.f92865a.b(start.b(f4), end.b(f4), interpolationPoint);
        }
        return new c(fArr, fArr2);
    }

    private final a c(float scaleKey) {
        return sLookupTables.i((int) (scaleKey * 100.0f));
    }

    private final int d(float fontScale) {
        return (int) (fontScale * 100.0f);
    }

    @m1
    public static /* synthetic */ void f() {
    }

    private final float g(int key) {
        return key / 100.0f;
    }

    private final void i(float scaleKey, a fontScaleConverter) {
        synchronized (LOOKUP_TABLES_WRITE_LOCK) {
            c3<a> clone = sLookupTables.clone();
            f92855a.j(clone, scaleKey, fontScaleConverter);
            sLookupTables = clone;
            k2 k2Var = k2.f75408a;
        }
    }

    private final void j(c3<a> table, float scaleKey, a fontScaleConverter) {
        table.q((int) (scaleKey * 100.0f), fontScaleConverter);
    }

    @androidx.annotation.d
    @m
    public final a b(float fontScale) {
        if (!h(fontScale)) {
            return null;
        }
        a c5 = f92855a.c(fontScale);
        if (c5 != null) {
            return c5;
        }
        int m4 = sLookupTables.m((int) (fontScale * 100.0f));
        if (m4 >= 0) {
            return sLookupTables.C(m4);
        }
        int i4 = -(m4 + 1);
        int i5 = i4 - 1;
        if (i5 < 0 || i4 >= sLookupTables.B()) {
            c cVar = new c(new float[]{1.0f}, new float[]{fontScale});
            i(fontScale, cVar);
            return cVar;
        }
        a a5 = a(sLookupTables.C(i5), sLookupTables.C(i4), d.f92865a.a(0.0f, 1.0f, sLookupTables.p(i5) / 100.0f, sLookupTables.p(i4) / 100.0f, fontScale));
        i(fontScale, a5);
        return a5;
    }

    @l
    public final c3<a> e() {
        return sLookupTables;
    }

    @androidx.annotation.d
    public final boolean h(float fontScale) {
        return fontScale >= sMinScaleBeforeCurvesApplied;
    }

    public final void k(@l c3<a> c3Var) {
        sLookupTables = c3Var;
    }
}
