package android.view;

import android.view.t;
import androidx.annotation.o0;

/* loaded from: classes3.dex */
class FullLifecycleObserverAdapter implements w {

    /* renamed from: o, reason: collision with root package name */
    private final p f8392o;

    /* renamed from: p, reason: collision with root package name */
    private final w f8393p;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8394a;

        static {
            int[] iArr = new int[t.b.values().length];
            f8394a = iArr;
            try {
                iArr[t.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8394a[t.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8394a[t.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8394a[t.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8394a[t.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8394a[t.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8394a[t.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(p pVar, w wVar) {
        this.f8392o = pVar;
        this.f8393p = wVar;
    }

    @Override // android.view.w
    public void h(@o0 a0 a0Var, @o0 t.b bVar) {
        switch (a.f8394a[bVar.ordinal()]) {
            case 1:
                this.f8392o.b(a0Var);
                break;
            case 2:
                this.f8392o.f(a0Var);
                break;
            case 3:
                this.f8392o.a(a0Var);
                break;
            case 4:
                this.f8392o.c(a0Var);
                break;
            case 5:
                this.f8392o.d(a0Var);
                break;
            case 6:
                this.f8392o.e(a0Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        w wVar = this.f8393p;
        if (wVar != null) {
            wVar.h(a0Var, bVar);
        }
    }
}
